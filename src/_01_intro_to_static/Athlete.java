package _01_intro_to_static;

import java.util.Random;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

static String name1 = ("Reilly Griffin");
static String name2 = ("Alonzo Price");

    String name;
    int speed;
    int bibNumber;
static Random r = new Random();
    Athlete (String name, int speed, int bibNumber){
        this.name = name;
        this.speed = speed;
        this.bibNumber = bibNumber;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
   for (int i = 0; i < 100; i++) {
	if (r.nextInt(2)==1) {
		Athlete a = new Athlete(name1,r.nextInt(20),i);
	}
	else if (r.nextInt(2) == 0) {
		Athlete b = new Athlete(name2,r.nextInt(20),i);
	}
}
   
   
    }
}
