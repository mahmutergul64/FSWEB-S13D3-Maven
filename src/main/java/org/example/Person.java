package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    boolean isRemote;
    String hobby;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary, boolean isRemote, String hobby) {
        this(firstName, lastName, age);
        this.salary = salary;
        this.isRemote = isRemote;
        this.hobby = hobby;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }
}