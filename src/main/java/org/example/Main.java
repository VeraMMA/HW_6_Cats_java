package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Cats> Cat = new HashSet<>();
        Cat.add(new Cats("Casper", 8, "white", "cute"));
        Cat.add(new Cats("Sally", 9, "white", "rude"));
        Cat.add(new Cats("Casper", 8, "white", "cute"));
        Cat.add(new Cats("Sally", 9, "white", "rude"));
        Cat.add(new Cats("Casper", 8, "white", "cute"));

        for(Cats cat : Cat){
            System.out.println(cat);
        }
    }
}