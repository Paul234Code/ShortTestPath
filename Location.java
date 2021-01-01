package tsp.shortestpath;
import java.util.ArrayList;


public class Location {
	private String name;      // le nom de la ville
	private double latitude;
	private double longitude;  // les coordonnes GPS de la ville
	private double distance;
	Location []neighbors = new Location[100];
	/**
	 * @param name
	 * @param latitude
	 * @param longitude
	 */
	public Location(String name, double latitude, double longitude) {
		super();     // constructeur permettant d'instancier une ville
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.distance = 100* Math.random();
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	/**
	 * 
	 */
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		
		System.out.println("la ville "+ this.name + " a pour coodonnes GPS :"+
		this.latitude + " et " + this.longitude);
		
	}
	// retourne la distance entre deux villes this et to
	
	public double distanceTo(Location to) {
		   double lat1=(this.latitude*Math.PI)/180;
		   double lat2 =(to.latitude*Math.PI)/180;
		   double long1= (this.longitude*Math.PI)/180;
		   double long2= (to.longitude*Math.PI)/180;
		   double R= 6378;
		
		   return R * (Math.PI/2 - Math.asin(Math.sin(lat2)*Math.sin(lat1)+ 
				Math.cos(long2-long1)*Math.cos(lat2) * Math.cos(lat1)));
				}
	public Location[] getNeighbors() {
		return neighbors;
	}
	public void setNeighbors(Location...neighbors) {
		this.neighbors = neighbors;
	}
	
	 

	
}
