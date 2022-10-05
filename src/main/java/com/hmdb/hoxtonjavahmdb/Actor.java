package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();

    public static Integer currentId = 0;

    public Integer id;
    public String name;
    public String lastName;
    public Integer yearOfBirth;
    public Integer movieId;

    static {
        new Actor("Robert", "De Niro", 1943, 1);
        new Actor("Meryl ", "Streep", 1949, 2);
        new Actor("Tom", "Hanks", 1960, 1);
    }

    public Actor(String name, String lastName, Integer yearOfBirth, Integer movieId) {

        this.id = ++Actor.currentId;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.movieId = movieId;

        Actor.actors.add(this);
    }

}
