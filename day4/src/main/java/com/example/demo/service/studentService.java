package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.student;
import com.example.demo.repository.studentRepo;

@Service
public class studentService {
@Autowired
studentRepo sr;
public student saveinfo(student ss)
{
	return sr.save(ss);
}
public List<student> showinfo()
{
	return sr.findAll();
}
}