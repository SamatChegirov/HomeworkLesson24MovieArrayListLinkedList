import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InfoGetMovie implements Findable, Sortable {

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        System.out.println("Все фильмы: ");
        for (Movie m : movies) {
            System.out.println(m);
        }
        return null;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Пишите названия фильма: ");
        String scan = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies) {
            if (m.getName().equalsIgnoreCase(scan)) {
                System.out.println("Найдено: " + m.toString());
            }
        }

    }

    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Пишите имя актера: ");
        String scan = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies) {
            for (Cast c : m.getCast()) {
                if (c.getActorFullName().toUpperCase().equals(scan)) {
                    System.out.println("Вы искали: " + m.toString());
                }
            }
        }

    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Год выхода: ");
        int scan = new Scanner(System.in).nextInt();
        for (Movie m : movies) {
            if (m.getYear() == scan) {
                System.out.println(m.toString());
            }
        }

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        System.out.println("Режиссер фильма: ");
        String scan = new Scanner(System.in).nextLine();
        for (Movie m : movies) {
            if (m.getDirector().getLastName().equalsIgnoreCase(scan)) {
                System.out.println("Вы искал: " + m.toString());
            }
            if (m.getDirector().getName().equalsIgnoreCase(scan)) {
                System.out.println("Вы искали: " + m.toString());
            }
        }
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        System.out.println("Жанры: ");
        String scan = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies) {
            if (m.getDescription().toUpperCase().equalsIgnoreCase(scan)) {
                System.out.println("Фильм: " + m.toString());
            }
        }

    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("В роле:... ");
        String scan = new Scanner(System.in).nextLine().toUpperCase();
        for (Movie m : movies) {
            for (Cast c : m.getCast()) {
                if (c.getRole().toUpperCase().equalsIgnoreCase(scan)) {
                    System.out.println("Вы искали: " + m.toString());
                }
            }
        }
    }

    @Override
    public void sortByMovieName(List<Movie> movies) {
        List<String> sortMovieNameAZ = new LinkedList<>();
        sortMovieNameAZ.add("Avatar");
        sortMovieNameAZ.add("Legends");
        System.out.print(sortMovieNameAZ);
        List<String> sortMovieNameZA = new LinkedList<>();
        sortMovieNameZA.addAll(sortMovieNameAZ);
        Collections.reverse(sortMovieNameZA);
        System.out.println("\n" + sortMovieNameZA);

    }

    @Override
    public void sortByYear(List<Movie> movies) {
        List<Integer> sortMovieYear = new LinkedList<>();
        sortMovieYear.add(1994);
        sortMovieYear.add(2009);
        System.out.println(sortMovieYear);
        List<Integer> sortMovieYears = new LinkedList<>();
        sortMovieYears.addAll(sortMovieYear);
        Collections.reverse(sortMovieYears);
        System.out.println(sortMovieYears);

    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        List<String> sortMovieDirector = new LinkedList<>();
        sortMovieDirector.add("James");
        sortMovieDirector.add("Edward");
        System.out.println(sortMovieDirector);
        List<String> sortMovieDirectors = new LinkedList<>();
        sortMovieDirectors.addAll(sortMovieDirector);
        Collections.reverse(sortMovieDirectors);
        System.out.println(sortMovieDirectors);

    }
}
