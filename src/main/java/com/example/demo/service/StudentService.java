package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	public StudentRepository studentRepo;
	public List<Student> getAllStudent()
	{
		List<Student> student=new ArrayList<>();
		studentRepo.findAll().forEach(student::add);
		return student;
	}
	public void addStudent(Student student) {
		studentRepo.save(student);
		
	}
	public void updateStudent(String id, Student student) {
		studentRepo.save(student);
		
	}
	public void deleteStudent(String id) {
		studentRepo.deleteById(id);
		
	}
	
	
}
