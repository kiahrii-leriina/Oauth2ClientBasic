package com.kl.SpringOauth2project.dto;


public class UserDto {
	
	private String name;
	private String email;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	public UserDto(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
