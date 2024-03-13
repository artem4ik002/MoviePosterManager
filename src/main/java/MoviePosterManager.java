public class MoviePosterManager {

    private String[] movies = new String[0];
    private int limit;

    public MoviePosterManager() {
        this.limit = 5;
    }

    public MoviePosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String newMovies) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = newMovies;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {

        int resultLenght;
        if (limit < movies.length) {
            resultLenght = limit;
        } else {
            resultLenght = movies.length;
        }

        String[] result = new String[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
