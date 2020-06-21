package com.helper.webdeveloperhelper.service;

import com.helper.webdeveloperhelper.model.User;
import com.helper.webdeveloperhelper.web.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}