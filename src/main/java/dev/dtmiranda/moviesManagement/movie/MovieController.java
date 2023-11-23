package dev.dtmiranda.moviesManagement.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

  @Autowired
  private MovieService movieService;
  @GetMapping
  public ResponseEntity<List<Movie>> getAllMovies(){
    return new ResponseEntity<List<Movie>>(movieService.allMovie(), HttpStatus.OK);
  }

  @GetMapping(path = "{imdbId}")
  public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable("imdbId") String movieImdbId){
    return  new ResponseEntity<Optional<Movie>>(movieService.movieByImdbId(movieImdbId), HttpStatus.OK);

  }

}
