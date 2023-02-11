package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<>();
	private final AtomicLong counter = new AtomicLong();
	
	public List<Student> all() {
		return this.students;
	}
	
	public Student create(Student student) {
		Student newStudent = new Student(counter.incrementAndGet(), student.getName(), student.getAge());
		this.students.add(newStudent);
		return newStudent;
	}
	
	public void delete(String id) {
		this.students.removeIf(s -> s.getId().equals(Long.parseLong(id)) );
	}
}
