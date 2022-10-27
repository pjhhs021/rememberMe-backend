package com.yjh.rememberme.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDTO {
    @Email
    private String email;
    private String password;
    private String username;
}
