package com.example.Swagger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swagger")
public class SwaggerController {
	
	   @RequestMapping("/")
	    public String welcome() {
	        return "Welcome to Swagger Example.";
	    }

	    @RequestMapping("/hello/{name}")
	    public SwaggerGreeting message(@PathVariable String name) {

	      	SwaggerGreeting  msg = new SwaggerGreeting(name, "Hello " + name);
	        return msg;
	    }

}
