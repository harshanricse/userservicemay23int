package com.scaler.userservice.dtos;

import com.scaler.userservice.models.Role;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setUserRolesRequestDto {
    private List<Long> roleIds;

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }
}
