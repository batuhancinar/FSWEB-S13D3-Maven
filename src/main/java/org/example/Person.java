package org.example;
public class Person{

    String firstName;

    String lastName;

    int age;

    String favoriteColor;

    int phoneNumber;

    String email;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String favoriteColor, int phoneNumber, String email){
        this(firstName, lastName, age);
        this.favoriteColor = favoriteColor;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName(){
        return firstName;
    }


    public String getLastName(){
        return this.lastName;
    }

    public int getAge() {

        return this.age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public Boolean isTeen(){
        return  this.age > 13 && age < 19;
    }
    public String getFavoriteColor(){
        return this.favoriteColor;
    }


}



