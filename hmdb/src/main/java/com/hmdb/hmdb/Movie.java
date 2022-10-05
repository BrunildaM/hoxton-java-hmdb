package com.hmdb.hmdb;

import java.util.ArrayList;

public class Movie {
    public static ArrayList<Movie> movies= new ArrayList<>();

    
      public Integer id;
      public String title;
      public String description;
      public Integer  year;
  
      static{
          new Movie(1, "News of the world", "Five years after the end of the Civil War, Captain Jefferson Kyle Kidd (Tom Hanks), a veteran of three wars, now moves from town to town as a non-fiction storyteller, sharing the news of presidents and queens, glorious feuds, devastating catastrophes, and gripping adventures from the far reaches of the globe.", 2020);
          new Movie(2, "The little things", "Set in early 1990s Los Angeles, the film follows two detectives (Denzel Washington and Rami Malek) who investigate a string of murders, which lead them to a strange loner who may be the culprit (Jared Leto).", 2021);
      }
     
      public Movie(Integer id,  String title, String description, Integer  year){
          this.id = id;
          this.title=title;
          this.description=description;
          this.year =year;
  
          Movie.movies.add(this);
          
      }
  
      public ArrayList<Actor> getAllActors() {
          ArrayList<Actor> movieActors = new ArrayList<>();
     
          for (Actor actor : Actor.actors) {
              if (actor.movieId == this.id) {
                  movieActors.add(actor);    
              }
          }
           
          return movieActors;
      }
    
}
