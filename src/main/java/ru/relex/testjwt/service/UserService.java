package ru.relex.testjwt.service;

import ru.relex.testjwt.domain.Role;
import ru.relex.testjwt.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();

}
