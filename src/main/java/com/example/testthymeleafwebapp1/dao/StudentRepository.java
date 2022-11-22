package com.example.testthymeleafwebapp1.dao;

import com.example.testthymeleafwebapp1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Long> {
}
