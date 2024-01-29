package com.tech;

public class Student {
	
	private int id;
	
	private String name;
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Student(String name) {
		super();
		this.name = name;
	}


	public Student(int id) {
		super();
		this.id = id;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
