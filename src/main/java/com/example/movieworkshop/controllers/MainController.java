package com.example.movieworkshop.controllers;


import com.example.movieworkshop.resources.FileReader;
import com.example.movieworkshop.resources.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

@RestController
public class MainController {
    FileReader f = new FileReader();

    @GetMapping("/")
    public String index() {
        return "Welcome";
    }

    @GetMapping("/getFirst")
    public String First() throws IOException {

        return "Title of first movie is: " + f.getFirst();
    }

    @GetMapping("/getRandom")
    public String RandomMovie() throws IOException {
        return f.getRandomMovie();
    }

    @GetMapping("/getTenSortByPopularity")
    public String getTenSortedByPopularity() throws IOException {

        ArrayList<Movie> movies;
        movies = f.getTenSortByPopularity();

        return movies.toString();
    }


    @GetMapping("/howManyWonAnAward")
    public String howManyWonAnAward() throws NullPointerException, FileNotFoundException {

        return f.CountWords();
    }
}