package me.gaolei.web.controller;

import me.gaolei.exception.GenericException;

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
		throw new GenericException("Oppss...System error, please visit it later");
	}
}
