package com.example.demo.repository;
import org.springframework.web.bind.annotation.*;
import org.springframework data.Jpa.repository;
import org.springframework.stereotype.repository;
@repository
public interface StudentRepo extends Jparepository<StudentEntity,Integer{
  
}
