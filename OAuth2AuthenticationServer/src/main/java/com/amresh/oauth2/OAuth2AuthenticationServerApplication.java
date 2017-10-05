package com.amresh.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.amresh.oauth2")
public class OAuth2AuthenticationServerApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(OAuth2AuthenticationServerApplication.class, args);
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(OAuth2AuthenticationServerApplication.class);
	}
}
