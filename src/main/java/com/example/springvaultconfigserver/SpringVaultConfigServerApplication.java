package com.example.springvaultconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringVaultConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringVaultConfigServerApplication.class, args);
	}

	@Value("${url:Default DEV}")
	private String devUrl;


	@Value("${outh_url:outh url}")
	private String outhUrl;


	@Value("${sample.message:Default Msg}")
	private String message;

	@PostConstruct
	private void postConstruct() {
		System.out.println("DEV URL:" + devUrl);
		System.out.println("IT URL:" + outhUrl);
		System.out.println("Sample Msg: " + message);
	}
}
