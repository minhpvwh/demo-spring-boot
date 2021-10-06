package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student std1 = new Student(
                    "Mariam",
                    "minhpv123@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 4)
            );
            Student std2 = new Student(
                    "Mariam",
                    "minhp789v@gmail.com",
                    LocalDate.of(2002, Month.APRIL, 4)
            );

            repository.saveAll(List.of(std1, std2));
        };
    }
}
