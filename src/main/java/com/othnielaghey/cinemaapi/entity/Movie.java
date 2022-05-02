package com.othnielaghey.cinemaapi.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Movie implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String title;

    @Column(length = 50)
    private String director;

    private String duration;
    private String releaseDate;

//    @ManyToOne
//    private Category category;

    @OneToMany(mappedBy = "movie")
    private Collection<ProjectionMovie> projectionMovies;

    @OneToMany(mappedBy = "movie")
    private Collection<Review> reviews;

    // constructors
    public Movie() {
    }

    public Movie(String title, String duration, String director, String description) {
        this.title = title;
        this.duration = duration;
        this.director = director;
//        this.description = description;
    }

    public Movie(String title, String director, String description, String duration, String releaseDate, String photo) {
        this.title = title;
        this.director = director;
//        this.description = description;
        this.duration = duration;
        this.releaseDate = releaseDate;
//        this.category = category;
//        this.photo = photo;
    }
    public Movie(String title, String director, String description, String duration, String releaseDate,  String photo, Collection<Review> reviews) {
        this.title = title;
        this.director = director;
//        this.description = description;
        this.duration = duration;
        this.releaseDate = releaseDate;
//        this.category = category;
//        this.photo = photo;
        this.reviews = reviews;
    }

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }

    public Collection<ProjectionMovie> getProjectionMovies() {
        return projectionMovies;
    }

    public void setProjectionMovies(Collection<ProjectionMovie> projectionMovies) {
        this.projectionMovies = projectionMovies;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Collection<Review> reviews) {
        this.reviews = reviews;
    }
}