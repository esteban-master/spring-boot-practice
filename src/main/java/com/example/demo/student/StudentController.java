package com.example.demo.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
	private final StudentService studentService; 

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("")
	List<Student> all() {
		return this.studentService.all();
	}
	
	@GetMapping("/{id}")
	Optional<Student> studentById(@PathVariable String id) {
		return Optional.of(new Student(Long.parseLong(id), "Esteban", 43));
	}
	
	@PostMapping("")
	Student create(@RequestBody Student student) {
		return this.studentService.create(student);
	}
	
	@DeleteMapping("/{id}")
	void delete(@PathVariable String id){
		this.studentService.delete(id);
	}
}