package com.example.buoi21.JpaUser.repository;

import com.example.buoi21.JpaUser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> getUsersByFullName(String fullname);
}
