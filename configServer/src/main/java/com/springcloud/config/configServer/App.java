package com.springcloud.config.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);

//		ApplicationContext ctx = SpringApplication.run(App.class, args);
//		String[] beanNames = ctx.getBeanDefinitionNames();
//
//		System.out.println("所以beanNames个数：" + beanNames.length);
//		for (String bn : beanNames) {
//			System.out.println(bn);
//		}
	}
}
