package com.example.usermanagementsystem.service;
import com.example.usermanagementsystem.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    boolean deleteUser(Long id);

    User updateUser(Long id, User user);
}
