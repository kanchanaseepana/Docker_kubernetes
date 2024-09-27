package com.nagarro.sample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.sample.entity.Student;
import com.nagarro.sample.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getStudents();
    }
	
}
