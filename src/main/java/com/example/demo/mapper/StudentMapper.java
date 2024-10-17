package com.example.demo.mapper;

import com.example.demo.dto.request.StudentDTO;
import com.example.demo.mode.Student;

public class StudentMapper {
    // Convert StudentDTO to Student entity
    public static Student toEntity(StudentDTO dto) {
        Student student = new Student();
        student.setFirstName(dto.getFirstName());
        student.setLastName(dto.getLastName());
        student.setEmail(dto.getEmail());
        student.setAge(dto.getAge());
        return student;
    }

    // Optionally, you can add a method to convert back from Student entity to StudentDTO
    public static StudentDTO toDTO(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setFirstName(student.getFirstName());
        dto.setLastName(student.getLastName());
        dto.setEmail(student.getEmail());
        dto.setAge(student.getAge());
        return dto;
    }
}
