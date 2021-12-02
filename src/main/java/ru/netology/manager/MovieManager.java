package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieManager {
    private Movie[] movies = new Movie[0];


    public MovieManager() {
    }

    public MovieManager(Movie[] movies) {
        this.movies = movies;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public void save(Movie newFilm) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = newFilm;
        movies = tmp;

    }

    public Movie[] getLastFilm() {
        int resultLength;
        if (movies.length > 9) {
            resultLength = 9;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = resultLength - i - 1;
            result[i] = movies[index];
        }
        return result;


    }

}
