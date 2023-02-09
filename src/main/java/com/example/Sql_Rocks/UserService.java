package com.example.Sql_Rocks;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public String createUser (User user) {
        userRepository.save(user);

        return "User added successfully";
    }

    public User getUser(int id) {

        User user = userRepository.findById(id).get(); // it will help you find the Entity by primary key

        return user;
    }

}
