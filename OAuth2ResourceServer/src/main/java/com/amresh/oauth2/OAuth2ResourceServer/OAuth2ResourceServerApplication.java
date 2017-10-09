package com.amresh.oauth2.OAuth2ResourceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.amresh.oauth2")
public class OAuth2ResourceServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2ResourceServerApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OAuth2ResourceServerApplication.class);
	}
}
