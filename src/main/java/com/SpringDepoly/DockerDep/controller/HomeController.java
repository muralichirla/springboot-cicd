package com.SpringDepoly.DockerDep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping
	public String getmessage() {
		return "hello world";
	}

}
