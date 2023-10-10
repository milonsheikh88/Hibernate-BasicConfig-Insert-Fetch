package com.milon.sheik.hibernate1;

import java.util.List;

import com.milon.sheik.hibernate1.dao.StudentDao;
import com.milon.sheik.hibernate1.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		StudentDao studentDao = new StudentDao();

		Student student1 = new Student("John", "NYK");
		studentDao.saveStudent(student1);
		System.out.println("Insert Done...");
		
		     List < Student > students = studentDao.getStudents();
	         students.forEach(st -> System.out.println(st.getName()+" >==> "+st.getCity()));
	         
	         System.out.println("Get Done...");

	}
}
