package com.example.anydeskapi.services.interfaces;

import com.example.anydeskapi.dtos.UserRequestDto;
import com.example.anydeskapi.dtos.UserResponseDto;
import org.springframework.data.domain.Page;


public interface UserService {
    UserResponseDto createUser(UserRequestDto requestDto);

    Page<UserResponseDto> getAllUsers(int page, int size, String username, String email);

    UserResponseDto getUserById(Long id);

    UserResponseDto updateUser(Long id, UserRequestDto requestDto);

    void deleteUser(Long id);

    void assignTaskToUser(Long userId, Long taskId);

    void removeTaskFromUser(Long userId, Long taskId);
}
