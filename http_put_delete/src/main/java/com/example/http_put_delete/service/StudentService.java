package com.example.http_put_delete.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.http_put_delete.model.Student;


@Service
public class StudentService {

	List<Student> students = new ArrayList(Arrays.asList(new Student(101,"Tejas",89),
			new Student(102,"Shubham",90)));
	
	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudentById(int id) {
		return students.stream()
				.filter(p -> p.getId() == id)
				.findFirst().orElse(new Student());
		}

	public void addStudent(Student student) {
		students.add(student);
	}

	public Student updateStudent(int id,Student student) {
		Student s = getStudentById(id);		
		int index = students.indexOf(s);
		students.set(index, student);
		return student;
	}

	public Student deleteStudent(int id) {
		Student s = getStudentById(id);		
		int index = students.indexOf(s);
		return students.remove(index);
	}

}
