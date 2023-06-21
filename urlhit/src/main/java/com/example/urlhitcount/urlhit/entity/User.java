package com.example.urlhitcount.urlhit.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String userName ;
    private int hitCount;

    public String getUserName() {
        return userName;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public User() {

    }
    public User(String userName, int hitCount) {
        this.userName = userName;
        this.hitCount = hitCount;
    }
}
