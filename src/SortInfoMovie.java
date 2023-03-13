import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortInfoMovie implements Sortable{
    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(sortMovieName);
        for (Movie m : movies) {
            System.out.println(m.getName());
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        movies.sort(sortMovieYear);
        for (Movie m : movies) {
            System.out.println(m.getName() + " " + m.getYear());
        }

    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        movies.sort(sortMovieDirector);
        for (Movie m : movies) {
            System.out.println(m.getDirector().getName() + " " + m.getName());
        }

    }

    public static Comparator<Movie> sortMovieName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName()) - o2.getName().compareTo(o1.getName());
        }
    };

    public static Comparator<Movie> sortMovieYear = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear() - (o2.getYear());
        }
    };

    public static Comparator<Movie> sortMovieDirector = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };
}
