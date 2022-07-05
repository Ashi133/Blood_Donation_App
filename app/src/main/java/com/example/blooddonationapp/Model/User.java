package com.example.blooddonationapp.Model;

public class User {
    String name, bloodGroup, id, email, phoneNumber, profileimagepocture, search , type;

    public User() {
    }

    public User(String name, String bloodGroup, String id, String email,
                String phoneNumber, String profileimagepocture, String search, String type) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profileimagepocture = profileimagepocture;
        this.search = search;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfileimagepocture() {
        return profileimagepocture;
    }

    public void setProfileimagepocture(String profileimagepocture) {
        this.profileimagepocture = profileimagepocture;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
