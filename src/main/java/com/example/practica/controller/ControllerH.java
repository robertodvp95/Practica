package com.example.practica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


// Controlador principal para realizar redirección.

@Controller
public class ControllerH {
	@GetMapping("/")
	public String redirectToIndex() {
		return "redirect:/index";
	}

	// Cargara el HTML index definido
	
	@GetMapping("/index")
	public String index() {
		return "index.html"; // Nombre de la plantilla HTML
	}
}
