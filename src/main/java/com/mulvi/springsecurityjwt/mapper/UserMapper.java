package com.mulvi.springsecurityjwt.mapper;

import com.mulvi.springsecurityjwt.dto.UserDto;
import com.mulvi.springsecurityjwt.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDto.Response toResponse(User user) {
        return UserDto.Response.builder()
                .id(user.getId())
                .username(user.getUsername())
                .role(user.getRole())
                .build();
    }

    public User toEntity(UserDto.Request request) {
        return User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .role(request.getRole())
                .build();
    }
}