package com.mulvi.springsecurityjwt.service;

import com.mulvi.springsecurityjwt.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService extends UserDetailsService {
    @Transactional
    UserDto.Response createUser(UserDto.Request request);

    UserDto.Response findById(Long id);

    UserDto.Response findByUsername(String username);

    List<UserDto.Response> findAll();

    @Transactional
    void deleteUser(Long id);
}