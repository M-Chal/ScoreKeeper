package sample;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private int matchesPlayed;
    private int matchesWon;
    private int setsWon;
    private ArrayList<Player> playerList;

    public Team(String teamName) {
        this.teamName = teamName;
        this.matchesWon = 0;
        this.matchesPlayed = 0;
        this.setsWon = 0;
        this.playerList = new ArrayList<Player>();
    }

    public String getTeamName() {
        return teamName;
    }
    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    public int getMatchesWon() {
        return matchesWon;
    }
    public int getSetsWon() {
        return setsWon;
    }
    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public void addMatchesPlayed(int matchesPlayed){
        this.matchesPlayed += matchesPlayed;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public void addMatchesWon(int matchesWon){
        this.matchesWon += matchesWon;
    }

    public void setSetsWon(int setsWon) {
        this.setsWon = setsWon;
    }

    public void addSetsWon(int setsWon){
        this.setsWon += setsWon;
    }

    public void addToPlayerList(Player player) {
        this.playerList.add(player);
    }

    public String getTeamStats(){
        return this.getTeamName() + "- Matches Played: " + this.getMatchesPlayed() + ", Matches Won: " + this.getMatchesWon() + ", Sets Won: " + this.getSetsWon();
    }
}
