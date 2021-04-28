/*
 * You are the software developer put in charge of helping an online streaming website to organize
its film collection. Once you take a look at their software you realize that they have not used
object-oriented programming. The software they have is very difficult to reuse and update. You
decide that you will have to create a new design for the software and start completely from
scratch.
The development of this project must be done using object-oriented programming. All film
objects should contain the name of the film, the name of the director, and the year of release.
There should be non-static methods to access and mutate all the information stored as private
instance variables. You can assume that no films were released before 1890.

Finally, demonstrate a prototype of this program by allowing the user to create up to ten films
stored as an array of films. Provide the user with a menu of options to add a film, to look at all
the films, or to end the program. Once a film is created it should be stored so that it can be
accessed again. There should be an option to display all the information for all films entered so
far. 
 */
import java.util.Scanner;
public class FilmDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Film [] filmArray = new Film [10]; //array of objects
		int numberOfFilms = 0;
		int option;
		do {
			System.out.println("Press 1 to add a film.");
			System.out.println("Press 2 to look at all the films");
			System.out.println("Press 3 to end the program.");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				System.out.println("Enter the name of the film.");
				String name = keyboard.nextLine();
				System.out.println("Enter the name of the director.");
				String director = keyboard.nextLine();
				System.out.println("Enter the year when the film was released");
				int year = keyboard.nextInt();
				
				Film currentFilm = new Film();
				
				currentFilm.setFilmName(name);
				currentFilm.setDirectorName(director);
				currentFilm.setYearReleased(year);
				
				if(numberOfFilms < filmArray.length) {
					filmArray[numberOfFilms] = currentFilm;
					numberOfFilms++;
				}
				else {
					System.out.println("There are no more room for additional films!");
				}
			}
			else if(option == 2) {
				for(int index = 0; index < filmArray.length; index++) {
					System.out.println("Name of Film: " + filmArray[index].getFilmName());
					System.out.println("Name of the Director: " + filmArray[index].getDirectorName());
					System.out.println("Year Film was Released: " + filmArray[index].getYearReleased());
				}
			}
			else if(option == 3) {
				System.out.println("GoodBye! Thank you for using my program!");
			}
		}while(option != 3);
		
	}

}
