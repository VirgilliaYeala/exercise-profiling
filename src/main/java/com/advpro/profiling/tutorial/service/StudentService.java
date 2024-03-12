package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAllStudentsWithCourses() {
        return studentCourseRepository.findAll();
    }

    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findStudentWithHighestGpa();
    }

    public String joinStudentNames() {
        List<Student> students = studentRepository.findAll();
        StringBuilder builder = new StringBuilder();
        for (Student student : students) {
            builder.append(student.getName()).append(", ");
        }
        if(!builder.isEmpty()){
            builder.delete(builder.length()-2, builder.length());
        }

        return builder.toString();
    }
}

