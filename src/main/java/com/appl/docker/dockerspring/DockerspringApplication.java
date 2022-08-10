package com.appl.docker.dockerspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@SpringBootApplication
public class DockerspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerspringApplication.class, args);
	}


	@Autowired
	WebClient webClient;

	@GetMapping(path = "/get")
	public String getData() {

		System.out.println("GET image");
		return new String(getImage());
	}


	private byte[] getImage() {
		byte[] image = webClient
				.get()
				.uri(("https://greatatmosphere.files.wordpress.com/2013/02/great-atmosphere-149-tenaya-lake-yosemite-national-park-2.jpg"))
				.accept(MediaType.IMAGE_JPEG)
				.retrieve()
				.bodyToMono(byte[].class)
				.block();
		System.out.println(" image = " + image);

		return image;
	}

}
