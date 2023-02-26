package com.example.buoi21.JpaUser.service.imp;

import com.example.buoi21.JpaUser.dto.UserDTO;
import com.example.buoi21.JpaUser.entity.User;

import java.util.List;

public interface UserService {
    boolean saveUser(List<UserDTO> listUserDTO);

    List<UserDTO> getUserByFullname(String fullname);
}
