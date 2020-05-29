package _05_netflix;

public class NedFlex {
public static void main(String[] args) {
	NetflixQueue n = new NetflixQueue();
	Movie m1 = new Movie("Astartes",9);
	Movie m2 = new Movie("Joker",8);
	Movie m3 = new Movie("Avatar the Last Airbender: Live Action",4);
	Movie m4 = new Movie("Stranger Things",8);
	Movie m5 = new Movie("1917",8);
n.addMovie(m1);
n.addMovie(m2);
n.addMovie(m3);
n.addMovie(m4);
n.addMovie(m5);
System.out.println("The best Movie is "+ n.getBestMovie());
n.sortMoviesByRating();
System.out.println("The second best movie is "+n.getMovie(2));


}
}
