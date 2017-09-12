package com.springcloud.config.configServer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class InitController {
	
	@ResponseBody
	@RequestMapping("/test")
	public String hello() {
		return "Hello World!";
	}

}
