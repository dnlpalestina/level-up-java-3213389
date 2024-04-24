package com.linkedin.javacodechallenges;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Ron", "Freeman", 37);
        Person p2 = new Person("Dan", "Palestina", 39);

        p1.introduceYourself();
        p2.introduceYourself();
    }
}
