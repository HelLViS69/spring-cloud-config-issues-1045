package com.test.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableAutoConfiguration(exclude = ErrorMvcAutoConfiguration.class)
public class ConfigServerApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
