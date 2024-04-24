package com.ooadproject.model;

import java.io.Serializable;
import java.util.List;


public class UserBuilder {
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private Long phone;
    private String address;
    private List<UserRole> roles;

    public UserBuilder(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder phone(Long phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder roles(List<UserRole> roles) {
        this.roles = roles;
        return this;
    }

    public User build() {
        User user = new User();
        user.setEmailId(emailId);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhone(phone);
        user.setAddress(address);
        user.setRoles(roles);
        return user;
    }
}
