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
public class Film {
	private String filmName;
	private String directorName;
	private int yearReleased;
	
	public Film() {
		filmName = "";
		directorName = "";
		yearReleased = 0;
		
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String newFilmName) {
		filmName = newFilmName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String newDirectorName) {
		directorName = newDirectorName;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int newYearReleased) {
		if(newYearReleased >= 1890 && yearReleased <= 2021) {
			yearReleased = newYearReleased;
		}

	}

}
