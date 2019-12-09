package be.ehb.admin;

import be.ehb.admin.exceptions.ResourceNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication
public class StudentAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentAdminApplication.class, args);
    }

}
