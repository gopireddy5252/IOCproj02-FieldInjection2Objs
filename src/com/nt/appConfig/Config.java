package com.nt.appConfig;

import java.time.LocalDate;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class Config {
	
	@Bean(name="ldate")
	public LocalDate generateDate()
	{
		System.out.println("generateDate()");
		return LocalDate.now();
	}
	
	@Bean(name="ltime")
	public LocalTime generateTime()
	{
		return LocalTime.now();
	}

}
