package acs.boundary.boundaryUtils;

public class UserId {

	private String domain;
	private String email;
	
	public UserId() {
		
	}
	public UserId(String domain, String email) {
		
		this.email = email;
		this.domain = domain;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
}
