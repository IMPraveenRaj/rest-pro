package com.springheaven.restpro.restpro;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class
RestProApplication {

	public static void main(String[] args) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		Person person = objectMapper.readValue(new File("src/main/resources/student.json"), Person.class);
		System.out.println(person.toString());
		SpringApplication.run(RestProApplication.class, args);
	}

}
