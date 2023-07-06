package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController 
{
       @Autowired
	  private StudentService studentservice;
	  
       @RequestMapping("/student")
	  public List<Student> getAllStudent()
	  {
		  return studentservice.getAllStudent();
	  }
	   
       @RequestMapping(method = RequestMethod.POST, value="/student")
	  public void addStudent(@RequestBody Student student)
	   	{
	   		studentservice.addStudent(student); 
	   	}
       @RequestMapping(method = RequestMethod.PUT, value="/student/{Id}")
 	  public void updateStudent(@PathVariable String Id,@RequestBody Student student)
 	   	{
 	   		studentservice.updateStudent(Id,student); 
 	   	}
      public void deleteStudent(@PathVariable String id)
	      {
	    	  studentservice.deleteStudent(id);
	      }
	}
