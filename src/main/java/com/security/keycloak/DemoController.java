package com.security.keycloak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
	
	@GetMapping
	public String hello() {
		
		System.out.println("Inside first hello method");
		return "Hello from Spring & Keycloak";
	}
	
	@GetMapping("/hello-2")
	public String hello_2() {
		return "Hello from Spring & Keycloak - ADMIN";
	}
	
	
}
