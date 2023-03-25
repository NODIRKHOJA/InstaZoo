package com.example.instazoo.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Post {

    private Long id;
    private String title;
    private String cation;
    private String location;
    private String likes;

    private Set<String> likedUsers = new HashSet<>();
    private User user;
    private List<Comment> comments = new ArrayList<>();
    private LocalDateTime createdDate;

    protected void onCreate(){

        this.createdDate = LocalDateTime.now();
    }
}
