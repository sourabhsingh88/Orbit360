package com.project.Appointment.Management.authService.dto;


import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
