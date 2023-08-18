package com.example.demo.model;

public class student {
	private int id;
	private String name;
	private String dept;
	public student(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public student() {
		// TODO Auto-generated constructor stub
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
