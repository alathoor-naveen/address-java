package com.jhc.lms.movie_service.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhc.lms.movie_service.model.Movie;

public interface MovieRepoistory extends JpaRepository<Movie,Long>{

	
}
