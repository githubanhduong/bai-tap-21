package com.example.buoi21.JpaUser.service;

import com.example.buoi21.JpaUser.dto.UserDTO;
import com.example.buoi21.JpaUser.entity.User;
import com.example.buoi21.JpaUser.repository.UserRepository;
import com.example.buoi21.JpaUser.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean saveUser(List<UserDTO> listUserDTO) {
        for (UserDTO userDTO : listUserDTO) {
            try {
                User user = new User();
                //
                user.setFullName(userDTO.getFullname());
                user.setEmail(userDTO.getEmail());
                user.setPassword(userDTO.getPassword());
                user.setRoleId(user.getRoleId());
                //
                userRepository.save(user);
            } catch (Exception e) {
                System.out.println("Loi trong UserServiceImp " + e);
                return false;
            }
        }
        return true;
    }

    public List<UserDTO> getUserByFullname(String fullname){
        List<UserDTO> listUserDTO = new ArrayList<>();
        for (User user : userRepository.getUsersByFullName(fullname)) {
            UserDTO userDTO = new UserDTO();

            userDTO.setEmail(user.getEmail());
            userDTO.setRoleId(user.getRoleId());


            listUserDTO.add(userDTO);
        }
        return listUserDTO;
    }
}
