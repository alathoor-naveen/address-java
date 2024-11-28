package com.jhc.lms.movie_service.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhc.lms.movie_service.model.Movie;
import com.jhc.lms.movie_service.repiostry.MovieService;

@RestController
@RequestMapping("api/v1/lms/movie")
public class MovieController {
	@Autowired
	private MovieService service;
	
	@PostMapping("/add/movie")
	public ResponseEntity<Movie>addMovie(@RequestBody Movie movie){
		Movie movie1=service.addMovie(movie);
		return ResponseEntity.ok(movie1);
	}
	
	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovies(){
		List<Movie>movie=service.getAllMovies();
		return ResponseEntity.ok (movie);
	}
	@PutMapping("/update/movie")
	public ResponseEntity<Movie>updateMovie(@RequestBody Movie movie){
		Movie movie1=service.updateMovie(movie);
		return ResponseEntity.ok(movie1);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Movie> deleteById(@PathVariable("id")Long id){
		Movie movie=service.deleteById(id);
		return ResponseEntity.ok(movie);
	}

}
