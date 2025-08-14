package com.example.demo.controller;

import com.example.demo.services.StudentProfileService;
import com.example.demo.studentprofile.StudentProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentProfileController {

    private StudentProfileService studentProfileService;
    @Autowired
    public StudentProfileController(StudentProfileService studentProfileService) {
        this.studentProfileService = studentProfileService;
    }

    @PostMapping("/studentprofile/create")
    public String create(@RequestBody StudentProfile studentProfile) {
        studentProfileService.createStudentProfile(studentProfile);
        return "Student profile is successfully stored";
    }
    //path variable
    @GetMapping("/studentprofile/{studentId}")
    public StudentProfile get(@PathVariable Long studentId) {
        return studentProfileService.getStudentProfileById(studentId);
    }
    @DeleteMapping("/studentprofile/delete")
    public String delete(@RequestBody StudentProfile studentProfile){
        studentProfileService.delete(StudentProfile);
        return "Student profile is successfully deleted";
    }
    @PutMapping("/studentprofile/update")
    public String update(@RequestBody StudentProfile studentProfile){
        studentProfileService.update(studentId);

    }

}