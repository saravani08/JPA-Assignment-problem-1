package com;
import javax.persistence.*;
import java.io.*;

public class Person implements Serializable {
	 
	 private String personName;
	 private String personEmail;
	 private long personPhone;
	 
	 
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String personName, String personEmail,long personPhone) {
		super();
		this.personName = personName;
		this.personEmail = personEmail;
		this.personPhone=personPhone;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonEmail() {
		return personEmail;
	}
	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}
	public long getPersonPhone()
	{
		return personPhone;
	}
	public void setPersonPhone(long personPhone) {
		this.personPhone = personPhone;
	}
	 
}	 
