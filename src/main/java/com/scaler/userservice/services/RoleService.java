package com.scaler.userservice.services;

import com.scaler.userservice.models.Role;
import com.scaler.userservice.repositories.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private RoleRepository roleRepository;
    public RoleService(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }
    public Role createRole(String name){
        System.out.println("RoleName"+ name);
        Role role = new Role();
        role.setRole(name);
        return roleRepository.save(role);
    }
}
