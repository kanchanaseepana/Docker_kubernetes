package com.nagarro.sample.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.sample.entity.*;




@Service
public class StudentService {
	
	public List<Student> getStudents(){
		
		return Arrays.asList(
				new Student(1,"geetha",22),
				new Student(2,"bala",40),
				new Student(3,"namjoon",28));
	}

}
