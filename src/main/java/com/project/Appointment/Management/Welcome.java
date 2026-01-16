package com.project.Appointment.Management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public  String welCome() {
        return "Welcome to Appointment Management System 4000"  ;
    }
}
