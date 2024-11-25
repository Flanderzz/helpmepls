package com.YipYapTimeAPI.YipYapTimeAPI.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SigninRequest {
    private String username;
    private String email;
    private String password;
}