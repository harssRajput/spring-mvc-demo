package com.harsh.springDemo.mvc;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//create a student object
		Student student = new Student();
		
		//add student object to the model
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		//log the input data
		System.out.println("student info: \nname" + student.getFirstName() + " " + student.getLastName() + 
				"\ncountry " + student.getCountry() + 
				"\nfavorite language: " + student.getFavoriteLanguage() + 
				"\noperating systems: " + Arrays.toString(student.getOperatingSystems())
				);  
		
		return "student-confirmation";
	}
}
