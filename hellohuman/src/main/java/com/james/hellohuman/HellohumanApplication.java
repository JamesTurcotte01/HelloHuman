package com.james.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class HellohumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
	}
	@RestController
	public class nameController{
		@RequestMapping("/")
		public String name(@RequestParam(defaultValue="human", value="name", required=false) String firstname) { 
				return "Hello " + firstname + "! " +  "Welcome to Spring Bot";
		}
	}
}
