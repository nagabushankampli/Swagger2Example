package com.example.Swagger.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ApplicationConfig {
	
	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				   .apiInfo(getApiInfo())
				   .select().apis(RequestHandlerSelectors.basePackage("com.example.Swagger"))
				   .paths(PathSelectors.any())
				   .build();
	}
	
	
	private ApiInfo getApiInfo() {
		
		return new ApiInfo("Bushan Swagger API", "API Desc", "1.0", "Terms of service", new Contact("Nagabushan Kampli", "www.NagabushanKampli.com", "Nagabushan@Kampli.com"), "License of Api" , "API license URL",Collections.emptyList());
	}

}
