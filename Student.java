package com;
import java.io.Serializable;
public class Student implements Serializable {	
	
		private String studentName;		
		private int marks;
		private int semester;
		
		public Student()
		{
		  super();	
		}
		public Student(String studentName,int marks,int semester)
		{
			super();
			this.studentName=studentName;
			this.marks=marks;
			this.semester=semester;		
		}

		public String getStudentName() {
			return studentName ;
		}

		public void setStudentName(String studentName) {
			this.studentName= studentName;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks)
		{
		this.marks=marks;
		}
		public int getSemester()

		{
			return semester;
		}
		public void setSemester(int semester)
		{
			this.semester=semester;
			
		}	
}
