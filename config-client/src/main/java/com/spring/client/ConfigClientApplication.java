package com.spring.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.client.EmailServiceProperties.Property;

@SpringBootApplication
@EnableConfigurationProperties(EmailServiceProperties.class)
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	
	@RestController
	class MessageRestController {
	 
		@Autowired private EmailServiceProperties emailServiceProperties;
	    
	    @GetMapping("/msg")
	    public String getMsg() {
	    	Property property = emailServiceProperties.getProperties().get("consumer1");;
	        return property.toString();
	    }
	}

}
