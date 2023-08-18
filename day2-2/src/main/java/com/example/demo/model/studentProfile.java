package com.example.demo.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class studentProfile extends student{
	
	private int id;
	private String name;
	@JsonProperty("Stream")
	private String dept;
	
	public studentProfile(int id, String name, String dept) {
		super(id,name,dept);
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
