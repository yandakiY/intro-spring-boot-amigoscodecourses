package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Michel",
                        "michel@gmail.fr",
                        23,
                        LocalDate.of(2000 , Month.JANUARY ,5)
                ),
                new Student(
                        2L,
                        "Yandaki",
                        "yandaki@gmail.fr",
                        23,
                        LocalDate.of(2000 , Month.FEBRUARY ,5)
                )
        ) ;
    }
}
