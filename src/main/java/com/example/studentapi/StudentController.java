package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();

    //REST ENDPOINTS
    //create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        //todo: logic to save the student in the database

       // System.out.println("name:" +student.name);
       // System.out.println("age:" +student.age);
       // System.out.println("tp:" +student.tp);

        repository.save(student);
    }
//retrieve a student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

//delete a student
//update a student
}
