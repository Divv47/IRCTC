package org.example.services;

import java.io.File;
import java.util.List;

import org.example.entities.User;

import com.fasterxml.jackson.databind.ObjectMapper;

import jdk.internal.org.objectweb.asm.TypeReference;

public class userBookingService {



    private User user;
    
    private List<User> userList ;
    private static final String USERS_PATH = "../localDB/users.json";

    private ObjectMapper objectMapper = new ObjectMapper();
    
    public userBookingService(User user1){
        this.user = user1;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>(){});
    }
}
