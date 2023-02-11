package com.example.demo.student;

public class Student {
	private Long id;
	private String name;
	private Integer age;
	
	public Student(Long id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	
}
