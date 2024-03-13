import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterManagerTest {

    @Test
    public void testFindAll() {
        MoviePosterManager moviePosterManager = new MoviePosterManager();
        String movie1 = "A";
        String movie2 = "B";
        String movie3 = "C";

        moviePosterManager.add(movie1);
        moviePosterManager.add(movie2);
        moviePosterManager.add(movie3);
        String[] actual = moviePosterManager.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast1() {
        MoviePosterManager moviePosterManager = new MoviePosterManager(12);
        String movie1 = "A";
        String movie2 = "B";
        String movie3 = "C";

        moviePosterManager.add(movie1);
        moviePosterManager.add(movie2);
        moviePosterManager.add(movie3);
        String[] actual = moviePosterManager.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast3() {
        MoviePosterManager moviePosterManager = new MoviePosterManager();
        String movie1 = "A";
        String movie2 = "B";
        String movie3 = "C";
        String movie4 = "D";
        String movie5 = "E";
        String movie6 = "F";
        String movie7 = "G";

        moviePosterManager.add(movie1);
        moviePosterManager.add(movie2);
        moviePosterManager.add(movie3);
        moviePosterManager.add(movie4);
        moviePosterManager.add(movie5);
        moviePosterManager.add(movie6);
        moviePosterManager.add(movie7);

        String[] actual = moviePosterManager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }
}





