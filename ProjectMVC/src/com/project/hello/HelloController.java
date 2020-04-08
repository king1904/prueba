package com.project.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hello")
	public String hola(Model model) {
		
		model.addAttribute("nombre", "Youcef");
		model.addAttribute("mensaje","THIS IS MMYYYYYYYYYY FIIIINAL MEEEESSAGE!!!");
		model.addAttribute("url","http://www.openwebinars.net");
		return "hello";
		
	}

}
