package com.cursos.crudspring.controller;

import java.util.List;

import com.cursos.crudspring.model.Course;
import com.cursos.crudspring.repository.ICourseRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private final ICourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Course> getAll() {
        return courseRepository.findAll();
    }
}