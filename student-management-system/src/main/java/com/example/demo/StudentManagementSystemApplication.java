package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception 
	{
		
		/*Student s1=new Student("Ram charan","Bashetti","Ram@gmail.com");
		studentRepository.save(s1);
		
		Student s2=new Student("Ram","Bashetti1","Ram1@gmail.com");
		studentRepository.save(s2);
		
		Student s3=new Student("Ramesh","Sirvi","Sirvi@gmail.com");
		studentRepository.save(s3);*/
	}

}
