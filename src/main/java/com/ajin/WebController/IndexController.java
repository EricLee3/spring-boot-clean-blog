package com.ajin.WebController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class IndexController {
	@GetMapping("/testThymeLeaf")
	public String testThymeLeaf(Model model)  {
		model.addAttribute("message", "hello world!!!");
		return "index";
	}

}
