package tsp.shortestpath;

import java.util.ArrayList;

public class LocationSet {
	private  int nbLocations;
	private Location[] locations = new  Location[nbLocations];
	public LocationSet() {
		this.nbLocations= 0;
		this.locations= new Location[100];
	}
	//ajoute une location dans le tableau dynamique
	public void add(Location location) {
		
		locations[nbLocations++]=location;
	}
	// recherche la location de distance minmale et le renvoie en sortie et le supprime de la liste
	public Location removeMin() {
		
		if (this.nbLocations==0)
			return null;
		else
		{
		 double distanceMin = this.locations[0].getDistance();
		 int indice=0;
		 while (indice< this.locations.length && distanceMin > this.locations[indice].getDistance())
			 indice++;
		}

	
	}
	

}
