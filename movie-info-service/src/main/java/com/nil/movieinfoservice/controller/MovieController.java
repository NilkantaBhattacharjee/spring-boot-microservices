package com.nil.movieinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nil.movieinfoservice.models.Movie;
import com.nil.movieinfoservice.models.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieController {

	// @Value("${api.key}")
	// private String apiKey;

	// @Autowired
	// private RestTemplate restTemplate;

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") final String movieId) {
		/*
		 * final MovieSummary movieSummary = restTemplate.getForObject(
		 * "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey,
		 * MovieSummary.class);
		 */

		final MovieSummary movieSummary = new MovieSummary("1", "Interstellar",
				"Interstellar is a 2014 epic science fiction film.");

		return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());

	}

}
