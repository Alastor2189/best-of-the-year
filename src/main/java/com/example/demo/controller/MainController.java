package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

import com.example.demo.classes.Movie;
import com.example.demo.classes.Song;

@Controller
@RequestMapping("/")

public class MainController {
	
	@GetMapping
	public String index(Model model) {
		String name = "Gianluca";
		model.addAttribute("name", name);
		return "index";
	}

	@GetMapping("/movies")
	public String showMovies(Model m) {
		List<Movie> movies = getBestMovies();
		m.addAttribute("movies", movies);
		return "movies";
	}

	@GetMapping("/songs")
	public String showSongs(Model model) {
		List<Song> songs = getBestSongs();
		model.addAttribute("songs", songs);
		return "songs";
	}

	private List<Movie> getBestMovies() {
		List<Movie> movies = new ArrayList<>();

		Movie movie1 = new Movie(1, "Rambo");
		movies.add(movie1);
		Movie movie2 = new Movie(2, "Rambo 2 la vendetta");
		movies.add(movie2);
		Movie movie3 = new Movie(3, "Rambo 3");
		movies.add(movie3);

		return movies;
	}

	private List<Song> getBestSongs() {
		List<Song> songs = new ArrayList<>();

		Song song1 = new Song(1, "The Number of the beast");
		songs.add(song1);
		Song song2 = new Song(2, "Master of puppets");
		songs.add(song2);
		Song song3 = new Song(3, "Heaven and Hell");
		songs.add(song3);

		return songs;
	}
	
}
