package com.example.demo.mode;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student")
@Setter
@Getter
//@Data                   // Generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor       // Generates a no-args constructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;  // UUID for the primary key

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "age")
    private int age;

    @Column(name="last_name" ,nullable = false)
    private String lastName;
}
