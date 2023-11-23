package dev.dtmiranda.moviesManagement.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

  @Autowired
  private MovieRepository movieRepository;
  public List<Movie> allMovie(){
    return movieRepository.findAll();
  }

  public Optional<Movie> movieById(ObjectId movieId){
    return movieRepository.findById(movieId);
  }
}
