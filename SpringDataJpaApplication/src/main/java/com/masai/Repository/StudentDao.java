package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.Entities.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{
	
}
