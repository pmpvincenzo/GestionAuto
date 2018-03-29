package com.vaannila.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/homePage")
	public String redirect()
	{
		return "homePage";
	}
}
