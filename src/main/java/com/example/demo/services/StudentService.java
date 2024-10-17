package com.example.demo.services;

import com.example.demo.dto.request.StudentDTO;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.mode.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {
    @Autowired private StudentRepository studentRepository;

    public HashMap<String, Student> getHello() {
        List<Student> students = studentRepository.findAll();

        // Create a HashMap where the key is student ID and value is the Student object
        HashMap<String, Student> studentMap = new HashMap<>();

        // Populate the HashMap
        for (Student student : students) {
            studentMap.put("payload", student);
        }

        return studentMap;
    }


    // Method to save the student
    public String createStudent(StudentDTO req) {
        // Convert DTO to Entity
        Student student = StudentMapper.toEntity(req);

        // Save the student to the repository
        studentRepository.save(student);

        // Return a success message or the saved student's ID
        return "Student created successfully";
    }
}
