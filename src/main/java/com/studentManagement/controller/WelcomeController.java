package com.studentManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping(value ="/welcome")
	public String getMsg() {
		
		return "Welcome to Student Management";
		
		
		
	}
}
