package com.jhc.lms.movie_service.repiostry;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhc.lms.movie_service.model.Movie;
import com.jhc.lms.movie_service.service.MovieRepoistory;


@Service
public class MovieService {
	
	@Autowired
	private MovieRepoistory repoistory;

	public Movie addMovie(Movie movie) {
		return repoistory.save(movie);
	}

	public List<Movie> getAllMovies() {
        List<Movie> movie = (List<Movie>)repoistory .findAll();
        return movie;
    }

	public Movie updateMovie(Movie movie) {
		return repoistory.save(movie);
	}

	public Movie deleteById(Long id) {
		 repoistory.deleteById(id);
		return null;
	}
	

}
