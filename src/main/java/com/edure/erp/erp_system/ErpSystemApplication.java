package com.edure.erp.erp_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpSystemApplication {

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8011);
		SpringApplication.run(ErpSystemApplication.class, args);
		
	}

}
