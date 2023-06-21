package com.example.urlhitcount.urlhit.controller;

import com.example.urlhitcount.urlhit.entity.User;
import com.example.urlhitcount.urlhit.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class UrlHitController {


    private UrlHitService urlHitService;
    @Autowired
    public UrlHitController(UrlHitService urlHitService){
        this.urlHitService = urlHitService;
    }

    @GetMapping("username/{yourusername}/count")
    public User getUrlHit(@PathVariable("yourusername") String username) {
        int hitCount = urlHitService.getHitCount();

        User user = new User();
        user.setUserName(username);
        user.setHitCount(hitCount);

        return user;
    }


}
