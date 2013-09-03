package me.gaolei.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

	@RequestMapping("/")
	public String index() {
		return "redirect:home";
	}

	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "This is home";
	}
}
