package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
// @CrossOrigin allows your frontend website to talk to your backend if they are hosted on different servers
@CrossOrigin(origins = "*")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// This creates an endpoint at http://localhost:8080/api/hello
	@GetMapping("/api/hello")
	public String sayHello() {
		return "Hello World from the Java Backend!";
	}
}