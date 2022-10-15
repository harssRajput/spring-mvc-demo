package com.harsh.springDemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-form";
	}
	
	@RequestMapping("/processFormV2")
	public String letsShoutDude(@RequestParam("studentName") String name, Model model) {
		
		//read the request param from HTML form
//		String name = request.getParameter("studentName");
		
		//covert to all caps
		name = name.toUpperCase();
		
		//create the message
		String result = "Yo! " + name;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "process-form";
	}
}
