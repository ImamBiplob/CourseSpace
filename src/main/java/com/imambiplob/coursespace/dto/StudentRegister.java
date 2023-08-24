package com.imambiplob.coursespace.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentRegister {
    private String name;
    private String email;
    private String password;
    private LocalDate dob;
    private String phone;
}
