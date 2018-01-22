/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.time.LocalDate;

/**
 *
 * @author schueler
 */
public class Match implements Comparable<Match>{
    private Player player1;
    private Player player2;
    private LocalDate date;
    private String result;

    public Match(Player player1, Player player2, LocalDate date) {
        this.player1 = player1;
        this.player2 = player2;
        this.date = date;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Match{" + "player1=" + player1 + ", player2=" + player2 + ", date=" + date + ", result=" + result + '}';
    }

    @Override
    public int compareTo(Match o) {
        int res = 0;
        res = this.getDate().compareTo(o.getDate());
        if(res == 0)
            res = this.getPlayer1().compareTo(o.getPlayer1());
        if(res == 0)
            res = this.getPlayer2().compareTo(o.getPlayer2());
        return res;
    }
    
}
