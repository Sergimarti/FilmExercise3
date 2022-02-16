package com.company;

import java.util.Objects;

public class Films {

    private String filmTitle;
    private String director;
    private String category;

    public Films(String filmTitle, String director, String category ) {

        this.filmTitle = filmTitle;
        this.director = director;
        this.category = category;
    }

    public String getDirector() {
        return director;
    }


    public String getFilmTitle() {
        return filmTitle;
    }

    public String getCategory() {return category;}

    @Override
    public String toString() {
        return "Films{" +
                "filmTitle='" + filmTitle + '\'' +
                ", director='" + director + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Films films = (Films) o;
        return Objects.equals(filmTitle, films.filmTitle);
    }



    }

