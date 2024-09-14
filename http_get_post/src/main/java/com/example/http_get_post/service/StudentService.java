package com.example.http_get_post.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.http_get_post.model.Student;

@Service
public class StudentService {

	List<Student> students = Arrays.asList(new Student(101,"Tejas",89),
			new Student(102,"Shubham",90));
	
	public List<Student> getAllStudents() {
		return students;
	}

}
