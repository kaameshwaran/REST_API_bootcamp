package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import com.example.demo.model.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("/student")
	public List<student> info(){
		Arrays.asList(new studentProfile(1,"Joseph","ECE"));
		return Arrays.asList(new student());
	}
}
