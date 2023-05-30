package com.dev.service;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.dev.dto.UserRegistrationDto;
import com.dev.model.User;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto registrationDto);

	List<User> getAll();
}
