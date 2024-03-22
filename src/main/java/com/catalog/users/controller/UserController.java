package com.catalog.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/")
	public String userName() {
		return "ThinkPad Lenovo";
	}
	
	@GetMapping("/{id}")
	public String userName(@PathVariable("id") String id) {
		return "ThinkPad Lenovo id : "+id;
	}
}
