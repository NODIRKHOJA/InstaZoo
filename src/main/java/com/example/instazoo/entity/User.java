package com.example.instazoo.entity;

import com.example.instazoo.entity.enums.ERole;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private Long id;
    private String name;
    private String username;
    private String lastname;
    private String email;
    private String bio;
    private String password;

    private Set<ERole> role = new HashSet<>();         //Set - коллекция имеет уникальные элементы
    private List<Post> posts = new ArrayList<>();
    private LocalDateTime createdDate;          // для отслеживания когда был создан тот или иной объект

    @PrePersist                             // для указания метода, который должен быть выполнен перед сохранением сущности в базу данных.
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }

}
