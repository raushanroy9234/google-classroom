package com.example.urlhitcount.urlhit.service;

import com.example.urlhitcount.urlhit.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {

   private User user;
   @Autowired
   public UrlHitService(User user){
       this.user = user;
   }


   private int count = 0;
    public int getHitCount(){
        count++;
       user.setHitCount(count);
       return user.getHitCount();
    }

}
