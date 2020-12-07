package com.controller.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Habilidade 1")
public class ExercícioController {
	@GetMapping
	public String Habilidade1() {
		return "Habilidade: Orientação ao detalhe";
	}
	@GetMapping("/Habilidade 2")
	public String Habilidade2() {
		return "Habilidade: Proatividade";
	}
	@GetMapping("/Mentalidade 1")
	public String Habilidade3() {
		return "Metalidade: Crescimento";
	}
	@GetMapping("/Mentalidade 2")
	public String Habilidade4() {
		return "Mentalidade: Esforço";
	}
}

