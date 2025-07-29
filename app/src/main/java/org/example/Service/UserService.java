package org.example.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class UserService {
    @Getter
    @Setter
    @AllArgsConstructor
    public class User {
        private String name;
        private int age;
        private String address;
    }
    private User user;
    public UserService() {
        user = new User("Kshitij", 25, "123 Main St");
    }
    public void Login(){
        System.out.println("logging user in.");
    }
    public void Logout(){
        System.out.println("User logged out.");

    }

}
