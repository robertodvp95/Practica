package com.example.practica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Api {
	@GetMapping("/health")
	public String health() {
		return "OK";
	}

}
