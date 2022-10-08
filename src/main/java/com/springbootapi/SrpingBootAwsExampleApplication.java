package com.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SrpingBootAwsExampleApplication {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to Spring Boot AWS Development Project :)";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SrpingBootAwsExampleApplication.class, args);
	}

}
