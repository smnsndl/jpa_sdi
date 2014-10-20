package se;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
	private static final String PERSISTENCE_UNIT_NAME = "test";
	private static EntityManagerFactory factory;
	private static EntityManager em;

	public static void main(String[] args) {

		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
		
		Scanner scan = new Scanner(System.in);
		boolean isRunning = true;
		
		while(isRunning) {
			System.out.println("Välj 1 för lägg till en Todo, eller 2 för lista alla Todos. 3 för avsluta.");
			int val = Integer.parseInt(scan.nextLine());
			System.out.println();
			
			switch(val) {
			case 1:
				System.out.println("Skriv en todo text.");
				String summary = scan.nextLine();
				System.out.println("Skriv beskrivning");
				String desc = scan.nextLine();
				addTodo(summary, desc);
				System.out.println("Todo tillagd i postgres.");
				break;
			case 2:
				System.out.println();
				printFromDb();
				System.out.println();
				break;
			case 3:
				isRunning = false;
				em.close();
				break;
				
			}
			
		}
		
	}
	

	private static void printFromDb() {
		// read the existing entries and write to console
		Query q = em.createQuery("select t from Todo t");
		List<Todo> todoList = q.getResultList();
		for (Todo todo : todoList) {
			System.out.println(todo);
		}
		System.out.println("Size: " + todoList.size());
		
	}
	
	private static void addTodo(String summary, String desc) {
		// create new todo
		em.getTransaction().begin();
		Todo todo = new Todo();
		todo.setSummary(summary);
		todo.setDescription(desc);
		em.persist(todo);
		em.getTransaction().commit();
		
	}

}
