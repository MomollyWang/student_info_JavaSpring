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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student spongebob = new Student(
                    "SpongeBob",
                    "spongbob@gmail.com",
                    LocalDate.of(2001, Month.AUGUST, 5)
            );

            Student sailormoon = new Student(
                    "sailormoon",
                    "sailormoon@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 13)
            );

            repository.saveAll(
                    List.of(spongebob, sailormoon)
            );
        };
    }
}
