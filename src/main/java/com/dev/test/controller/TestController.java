package com.dev.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		int a = 10;
		int b = 33;
		return "Home Page " + a + b;
	}

}
