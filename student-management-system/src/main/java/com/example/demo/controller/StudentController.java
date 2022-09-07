package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

//To make this class as Spring MVC to handle all the requests

@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Handler method to handle list students and return model and view
	@GetMapping({"/","/students"})
	public String listStudents(Model model)
	
	{
		//Below is the model which is having students data
		model.addAttribute("students",studentService.getAllStudents());
		//Below is view which we are sending to html file under tempalte
		return "students";
	}
	
	@GetMapping("/students/new")
public String createStudentForm(Model model)
	
	{
		//create student object to hold student form data
		
		Student s1=new Student();
		model.addAttribute("student",s1);
		return "create_student";
		
	}
	
	
	@GetMapping("/students/new")
	public String createStudentForm1(Model model)
		
		{
			//create student object to hold student form data
			
			Student s1=new Student();
			model.addAttribute("student",s1);
			return "create_student";
			
		}
		
	
	

}
