package com.example.authserver.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "auth_users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String username;
    private String password;
}
