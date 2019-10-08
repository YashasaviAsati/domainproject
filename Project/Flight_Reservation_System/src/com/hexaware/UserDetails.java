package com.hexaware;

import java.time.LocalDate;

//mport javax.persistence.Entity;


public class UserDetails {

	private int id;
	private String password;
	private String name;
	private String phn_no;
	private String email;
	private LocalDate dob;
	private String gender;
	public UserDetails(int id, String password, String name, String phn_no, String email, LocalDate dob,
			String gender) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phn_no = phn_no;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhn_no() {
		return phn_no;
	}
	public void setPhn_no(String phn_no) {
		this.phn_no = phn_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", password=" + password + ", name=" + name + ", phn_no=" + phn_no + ", email="
				+ email + ", dob=" + dob + ", gender=" + gender + "]";
	}
	
	
	
}
