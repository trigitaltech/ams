package com.trigital.ams.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
public class Client {
	
	@Id
	private Long id;
	private String manager;
	private String email;
	private String phoneNumber;
	private String aptName;
	private String aptAddress;
	private String aptPin;
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAptName() {
		return aptName;
	}
	public void setAptName(String aptName) {
		this.aptName = aptName;
	}
	public String getAptAddress() {
		return aptAddress;
	}
	public void setAptAddress(String aptAddress) {
		this.aptAddress = aptAddress;
	}
	public String getAptPin() {
		return aptPin;
	}
	public void setAptPin(String aptPin) {
		this.aptPin = aptPin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
