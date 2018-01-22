/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author schueler
 */
public class Player implements Comparable<Player>{
    private String name;
    private String sponsor;
    private int rank;
    private String goodness = "not good";

    public Player(String name, String sponsor, int rank) {
        this.name = name;
        this.sponsor = sponsor;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", sponsor=" + sponsor + ", rank=" + rank + '}';
    }

    @Override
    public int compareTo(Player o) {
        return this.getRank() - o.getRank();
    }
    
    
}
