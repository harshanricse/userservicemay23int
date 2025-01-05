package com.scaler.userservice.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Role extends BaseModel {
 private String role;

 public String getRole() {
  return role;
 }

 public void setRole(String role) {
  this.role = role;
 }
}
