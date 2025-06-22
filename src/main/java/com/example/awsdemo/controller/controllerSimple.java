package com.example.awsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerSimple {
	
@GetMapping("/hello")	
public String hello() {
	return "Simple Hello world";
}
	
}
