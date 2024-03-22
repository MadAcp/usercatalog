package com.catalog.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
	@GetMapping("/")
	public String ping() {
		return "Hi from user catalog user controller ping";
	}
}
