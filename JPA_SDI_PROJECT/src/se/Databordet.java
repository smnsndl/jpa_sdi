package se;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Databordet {
	
	
	@Id @GeneratedValue
	private int knnr;
	
	private String namn;
	private String url;
	private boolean dnsSecSigned;
	private boolean isRecursive;
	private boolean ipWww;
	private boolean ipDns;
	private boolean ipMail;
	//Koordinater
	private String koordinat1;
	private String koordinat2;
	
	public Databordet() {
		// TODO Auto-generated constructor stub
	}

	public int getKnnr() {
		return knnr;
	}

	public void setKnnr(int knnr) {
		this.knnr = knnr;
	}

	public String getNamn() {
		return namn;
	}

	public void setNamn(String namn) {
		this.namn = namn;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isDnsSecSigned() {
		return dnsSecSigned;
	}

	public void setDnsSecSigned(boolean dnsSecSigned) {
		this.dnsSecSigned = dnsSecSigned;
	}

	public boolean isRecursive() {
		return isRecursive;
	}

	public void setRecursive(boolean isRecursive) {
		this.isRecursive = isRecursive;
	}

	public boolean isIpWww() {
		return ipWww;
	}

	public void setIpWww(boolean ipWww) {
		this.ipWww = ipWww;
	}

	public boolean isIpDns() {
		return ipDns;
	}

	public void setIpDns(boolean ipDns) {
		this.ipDns = ipDns;
	}

	public boolean isIpMail() {
		return ipMail;
	}

	public void setIpMail(boolean ipMail) {
		this.ipMail = ipMail;
	}

	public String getKoordinat1() {
		return koordinat1;
	}

	public void setKoordinat1(String koordinat1) {
		this.koordinat1 = koordinat1;
	}

	public String getKoordinat2() {
		return koordinat2;
	}

	public void setKoordinat2(String koordinat2) {
		this.koordinat2 = koordinat2;
	}
	
	
	
	
	
	
}
