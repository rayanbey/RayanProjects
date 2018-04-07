package com.connectionexample.connectionexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Students")
public class StudentsController {

   @Autowired
   userRepository usersRepository;



    @PostMapping("/addstudent")
    public List<Students> adduser(@RequestParam(value="id", defaultValue="834") int i, @RequestParam (value="name",defaultValue = "ali")String name,@RequestParam(value="CourseGrade", defaultValue="7") String j) {

        Students s = new Students(i, name,j);
        usersRepository.save(s);
        return usersRepository.findAll();
    }
    @GetMapping("/all")
    public List<Students> getAll() {

       return usersRepository.findAll();

    }



}
