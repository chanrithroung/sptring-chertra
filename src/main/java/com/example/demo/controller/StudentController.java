package com.example.demo.controller;

import com.example.demo.dto.request.StudentDTO;
import com.example.demo.mode.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public HashMap<String, Student> getData() {
        return studentService.getHello();
    }

    @PostMapping
    public String postStudent(@RequestBody StudentDTO req) {
        return studentService.createStudent(req);
    }
}
