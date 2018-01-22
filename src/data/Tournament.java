/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.TreeSet;

/**
 *
 * @author schueler
 */
public class Tournament {
    private String location;
    private double price;
    private TreeSet<Player> participants;
    private TreeSet<Match> matches;
    private String lol = "lol";


    public Tournament(String location, double price, TreeSet<Player> participants) {
        this.location = location;
        this.price = price;
        this.participants = participants;
    }
    
    public TreeSet<Match> getMatches() {
        return matches;
    }

    public void setMatches(TreeSet<Match> matches) {
        this.matches = matches;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TreeSet<Player> getParticipants() {
        return participants;
    }

    @Override
    public String toString() {
        return "Tournament{" + "location=" + location + ", price=" + price + ", participants=" + participants + '}';
    }
    
    
}
