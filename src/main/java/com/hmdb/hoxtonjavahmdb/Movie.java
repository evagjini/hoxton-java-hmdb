package com.hmdb.hoxtonjavahmdb;

import java.util.ArrayList;

public class Movie {

    public static ArrayList<Movie> movies = new ArrayList<>();

    public static Integer currentId = 0;

    public Integer id;
    public String title;
    public String description;
    public Integer year;

    static {
        new Movie("The Irishman",
                "The Irishman (titled onscreen as I Heard You Paint Houses) is a 2019 American epic crime drama film directed and produced by Martin Scorsese and written by Steven Zaillian, based on the 2004 nonfiction book I Heard You Paint Houses by Charles Brandt.",
                2019);
        new Movie("The Devil Wears Prada",
                "The Devil Wears Prada is a 2003 novel by Lauren Weisberger about a young woman who is hired as a personal assistant to a powerful fashion magazine editor, a job that becomes nightmarish as she struggles to keep up with her boss's grueling schedule and demeaning demands",
                2003);
    }

    public Movie(String title, String description, Integer year) {

        this.id = ++Movie.currentId;
        this.title = title;
        this.description = description;
        this.year = year;

        Movie.movies.add(this);
    }
}
