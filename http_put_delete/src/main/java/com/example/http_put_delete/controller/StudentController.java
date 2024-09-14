package com.example.http_put_delete.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.http_put_delete.model.Student;
import com.example.http_put_delete.service.StudentService;


@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping("/")
	public String home() {
		return "This is a Home Page of our Project";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		service.addStudent(student);
	}
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
		return service.updateStudent(id,student);
	}
	
}
