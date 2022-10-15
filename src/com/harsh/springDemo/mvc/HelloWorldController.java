package com.harsh.springDemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request param from HTML form
		String name = request.getParameter("studentName");
		
		//covert to all caps
		name = name.toUpperCase();
		
		//create the message
		String result = "Yo! " + name;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "process-form";
	}
}
