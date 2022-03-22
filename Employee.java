package com;
import javax.persistence.*;
import java.io.*;

public class Employee  implements Serializable {
		 
		 private String employeeName;
		 private String employeeDepartment ;
		 private String employeeDesignation ;
		 
		 
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(String employeeName, String employeeDepartment,String employeeDesignation) {
			super();
			this.employeeName= employeeName;
			this.employeeDepartment = employeeDepartment;
			this.employeeDesignation=employeeDesignation;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName= employeeName;
		}
		public String getEmployeeDepartment() {
			return employeeDepartment;
		}
		public void setEmployeeDepartment(String employeeDepartment) {
			this.employeeDepartment=employeeDepartment;
		}
		public String getEmployeeDesignation()
		{
			return employeeDesignation ;
		}
		public void setEmployeeDesignation(String employeeDesignation)
		{
			this.employeeDesignation=employeeDesignation;
		}
		 
	}	 
