package com.spot.spoteurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpoteurekaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpoteurekaserviceApplication.class, args);
	}
}
