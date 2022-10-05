package com.hmdb.hmdb;

import java.util.ArrayList;

public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();

    public Integer id;
    public String name;
    public String lastname;
    public Integer birthYear;
    public Integer movieId;

    static{
        new Actor(1, "Tom", "Hanks", 1956, 1);
        new Actor(2, "Denzel", "Washington", 1954, 2);
        new Actor(3, "Natalie", "Morales", 1985, 2);
        new Actor(4, "Helena", "Zengel", 2008, 1);
        new Actor(5, "Truman", "Hanks", 1995, 1);
        
    }

    public Actor(Integer id,String name,String lastname,Integer birthYear, Integer movieId){
        this.id = id;
        this.name=name;
        this.lastname=lastname;
        this.birthYear=birthYear;
        this.movieId=movieId;

        Actor.actors.add(this);

    }
    
}
