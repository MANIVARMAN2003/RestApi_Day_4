package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import com.example.demo.service.studentService;

@RestController
public class studentController {
@Autowired
studentService sser;
@PostMapping("add")
public student add(@RequestBody student ss)
{
	return sser.saveinfo(ss);
}
@GetMapping("disp")
public List<student> show()
{
	return sser.showinfo();
}
}