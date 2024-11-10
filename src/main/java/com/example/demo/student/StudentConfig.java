package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student manuchekhr = new Student(
                    "Manuchekhr",
                    LocalDate.of(2002, OCTOBER, 4),
                    "manu@gmail.com"
            );
            Student farrukh = new Student(
                    "Farrukh",
                    LocalDate.of(1998, AUGUST, 6),
                    "far@gmail.com"
            );

            repository.saveAll(List.of(manuchekhr, farrukh));
        };
    }

}
