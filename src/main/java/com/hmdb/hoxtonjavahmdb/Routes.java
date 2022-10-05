package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {

    @GetMapping("/actors")
    public ArrayList<Actor> getActors() {
        return Actor.actors;
    }

    @GetMapping("/actor/{id}")
    public Actor getActor(@PathVariable Integer id) {
        Actor match = null;
        for (Actor actor : Actor.actors) {
            if (actor.id == id) {
                match = actor;
            }
        }
        if (match == null)
            throw new Error("Actor not Found!");
        return match;
    }

    @PostMapping("/actors")
    public Actor createNewActor(@RequestBody Actor actor) {
        return actor;
    }

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return Movie.movies;
    }

    @GetMapping("/movie/{id}")
    public Movie getMovies(@PathVariable Integer id) {
        Movie match = null;
        for (Movie movie : Movie.movies) {
            if (movie.id == id) {
                match = movie;
            }

        }
        if (match == null)
            throw new Error("Movie not Found!");

        return match;
    }

    @PostMapping("/movies")
    public Movie createNewMovie(@RequestBody Movie movie) {
        return movie;
    }
}
