package com.li.springfullstack.Service;

import com.li.springfullstack.entity.User;

public interface UserService {
    User loadUserByEmail(String email);

    User createUser(String email, String password);

    void assignRoleToUser(String email, String roleName);
}
