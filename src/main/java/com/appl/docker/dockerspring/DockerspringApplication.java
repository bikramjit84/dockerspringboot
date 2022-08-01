package com.appl.docker.dockerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerspringApplication.class, args);
	}


	@GetMapping(path = "/get")
	public String getData() {

		return "Docker spring example";
	}

}
