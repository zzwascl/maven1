package com.bw.maven1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maven1Controller {
	@RequestMapping("hello")
	public String hello() {
		return "list";
	}

}
