package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/")

public class MainController {
	
	@GetMapping()
	public String home(Model model) {   // Controller che gestisce homepage
		String name = "Gianluca";
		model.addAttribute("name", name);
		return "index"; // nome file che voglio restituire
	}
	
}
