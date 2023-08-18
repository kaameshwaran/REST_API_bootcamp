package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myDay2 {
	
	@Value("Das")
	private String name;
	
	@GetMapping("/name")
	public String display() {
		return "Harold "+name+" Antony "+name+" "+name+" & co";
	}
}
