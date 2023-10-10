package com.milon.sheik.hibernate1.entity;

import jakarta.persistence.*;


@Entity
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String city;

	public Student() {
		super();
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return this.id +" : "+this.name +" : "+this.city;
	}

}
