package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main  {
    public static void main(String[] args){
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("FavoriteColor: " + person.getFavoriteColor());

        Person secondperson = new Person("batuhan","çınar",26,"red",123456789,"bbb");

        System.out.println("FirstName: " + secondperson.getFirstName());

        System.out.println("LastName; " + secondperson.getLastName());

        System.out.println("Age: " + secondperson.getAge());

        System.out.println("FavoriteColor:" + secondperson.getFavoriteColor());

        System.out.println("PhoneNumber" + secondperson.getPhoneNumber());

        System.out.println(("Email" + secondperson.getEmail()));
    }



    }

