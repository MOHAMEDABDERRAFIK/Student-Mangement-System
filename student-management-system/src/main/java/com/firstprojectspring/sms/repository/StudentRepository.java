package com.firstprojectspring.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstprojectspring.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
