package dev.dtmiranda.moviesManagement.movie;

import dev.dtmiranda.moviesManagement.reviews.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data //Take care of Getters an Setters
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
  @Id
  private Object id;
  private String imdbId;
  private String title;
  private String releaseDate;
  private String trailerLink;
  private String Poster;
  private List<String> genres;
  private List <String> backdrops;
  private List<Review> reviewIds;


}
