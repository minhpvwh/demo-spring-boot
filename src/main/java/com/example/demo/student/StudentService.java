package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Minh",
                        "bfhasjbf@gmal.com",
                        LocalDate.of(2021, Month.APRIL, 4),
                        21
                )
        );
    }
}
