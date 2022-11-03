package com.firstprojectspring.sms.service;

import java.util.List;

import com.firstprojectspring.sms.entity.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
