import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cast Sam = new Cast("Sam Worthington", "Jake Sally");
        Cast Zoe = new Cast("Zoe Saldana", "Neytiri");
        Cast Brad = new Cast("Brad Pitt", "Tristan");
        Cast Julia = new Cast("Julia Ormond", "Susannah");
        Movie avatar = new Movie("Avatar", 2009, "Fantastical movie", new Director("James", "Cameron"), new LinkedList<Cast>(Arrays.asList(Sam,Zoe)));
        Movie legends = new Movie("Legends of the Fall", 1994, "Historical drama", new Director("Edward", "Zwick"), new LinkedList<Cast>(Arrays.asList(Brad, Julia)));

        InfoGetMovie infoGetMovie = new InfoGetMovie();

        while (true) {
            System.out.println("**********");
            System.out.println("1-Все фильмы. \n2-Названия фильма. \n3-Актеры. \n4-Год выхода фильма. \n5-Режиссер фильма. \n6-Жанры фильма. \n7-В роле: \n8-Сортируем по имени: \n9-Сортируем по год выпуска: \n10-Сортируем по режиссеру: ");
            int scan = new Scanner(System.in).nextInt();
            switch (scan) {
                case 1:
                    infoGetMovie.getAllMovies(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 2:
                    infoGetMovie.findMovieByName(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 3:
                    infoGetMovie.findMovieByActorName(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 4:
                    infoGetMovie.findMovieByYear(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 5:
                    infoGetMovie.findMovieByDirector(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 6:
                    infoGetMovie.findMovieByDescription(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 7:
                    infoGetMovie.findMovieByRole(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 8:
                    infoGetMovie.sortByMovieName(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 9:
                    infoGetMovie.sortByYear(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
                case 10:
                    infoGetMovie.sortByDirector(new ArrayList<>(Arrays.asList(avatar, legends)));
                    break;
            }
        }
    }
}