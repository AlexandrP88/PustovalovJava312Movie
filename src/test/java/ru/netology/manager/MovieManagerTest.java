package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void addTest() {

        MovieManager manager = new MovieManager();


        Movie one = new Movie(15, "url1", "Dom", "comedy");
        Movie two = new Movie(16, "url2", "laugh", "comedy");
        Movie three = new Movie(17, "url3", "window", "comedy");


        manager.save(one);
        manager.save(two);
        manager.save(three);

        Movie[] expected = {one, two, three};
        Movie[] actual = manager.getMovies();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastFilmIfMoreThanTen() {
        MovieManager manager = new MovieManager();
        Movie eleven = new Movie(15, "url1", "Dom", "comedy");
        Movie ten = new Movie(16, "url2", "laugh", "comedy");
        Movie nine = new Movie(17, "url3", "window", "comedy");
        Movie eight = new Movie(18, "url1", "Dom", "comedy");
        Movie seven = new Movie(19, "url2", "laugh", "comedy");
        Movie six = new Movie(20, "url3", "window", "comedy");
        Movie five = new Movie(21, "url1", "Dom", "comedy");
        Movie four = new Movie(22, "url2", "laugh", "comedy");
        Movie three = new Movie(23, "url3", "window", "comedy");
        Movie two = new Movie(24, "url1", "Dom", "comedy");
        Movie one = new Movie(25, "url2", "laugh", "comedy");

        manager.save(eleven);
        manager.save(ten);
        manager.save(nine);
        manager.save(eight);
        manager.save(seven);
        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastFilmIfLessThanTen() {
        MovieManager manager = new MovieManager();

        Movie six = new Movie(17, "url3", "window", "comedy");
        Movie five = new Movie(15, "url1", "Dom", "comedy");
        Movie four = new Movie(16, "url2", "laugh", "comedy");
        Movie three = new Movie(17, "url3", "window", "comedy");
        Movie two = new Movie(15, "url1", "Dom", "comedy");
        Movie one = new Movie(16, "url2", "laugh", "comedy");

        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void getLastFilmRandomAmount() {
        MovieManager manager = new MovieManager(8);
        Movie eleven = new Movie(15, "url1", "Dom", "comedy");
        Movie ten = new Movie(16, "url2", "laugh", "comedy");
        Movie nine = new Movie(17, "url3", "window", "comedy");
        Movie eight = new Movie(18, "url1", "Dom", "comedy");
        Movie seven = new Movie(19, "url2", "laugh", "comedy");
        Movie six = new Movie(20, "url3", "window", "comedy");
        Movie five = new Movie(21, "url1", "Dom", "comedy");
        Movie four = new Movie(22, "url2", "laugh", "comedy");
        Movie three = new Movie(23, "url3", "window", "comedy");
        Movie two = new Movie(24, "url1", "Dom", "comedy");
        Movie one = new Movie(25, "url2", "laugh", "comedy");

        manager.save(eleven);
        manager.save(ten);
        manager.save(nine);
        manager.save(eight);
        manager.save(seven);
        manager.save(six);
        manager.save(five);
        manager.save(four);
        manager.save(three);
        manager.save(two);
        manager.save(one);

        Movie[] expected = {one, two, three, four, five, six, seven, eight};
        Movie[] actual = manager.getLastFilm();

        assertArrayEquals(expected, actual);

    }


}