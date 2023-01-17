package com.li.springfullstack.Service;

import com.li.springfullstack.entity.Role;

public interface RoleService {

    Role loadRoleByName(String roleName);

    Role createRole(String roleName);
}
