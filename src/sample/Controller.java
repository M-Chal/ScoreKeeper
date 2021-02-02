package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

import java.util.Collections;
import java.util.Comparator;

public class Controller {

    void addTextToScreen(String text){
        viewText.appendText(text + "\n");
    }

    void clrScreen() {
        viewText.clear();
    }
    void sortTeams(){
        Main.teamsList.sort(Comparator.comparing(Team::getSetsWon));
        Collections.reverse(Main.teamsList);
    }

    void showTeams(){
        for (Team team : Main.teamsList) {
            addTextToScreen(team.getTeamStats());
        }
    }

    @FXML
    private Button genFixtures;

    @FXML
    private Button genStats;

    @FXML
    private Button teamReg;

    @FXML
    private TextField tfTeamName;

    @FXML
    private TextField tfPlayerName;

    @FXML
    private Button playerReg;

    @FXML
    private ChoiceBox<String> cbTeamSelect;

    @FXML
    private TextArea viewText;

    @FXML
    private ChoiceBox<String> homeTeam;

    @FXML
    private ChoiceBox<String> awayTeam;

    @FXML
    private Button frChart;

    @FXML
    private Button teamStats;

    @FXML
    private Button matchScores;

    @FXML
    private Button teamRanking;

    @FXML
    private ChoiceBox<String> hmTeam;

    @FXML
    private ChoiceBox<String> awTeam;

    @FXML
    private ChoiceBox<String> awPlayerTwo;

    @FXML
    private TextField gm1;

    @FXML
    private TextField gm2;

    @FXML
    private TextField gm3;

    @FXML
    private ChoiceBox<String> awPlayerOne;

    @FXML
    private ChoiceBox<String> hmPlayerOne;

    @FXML
    private TextField gm4;

    @FXML
    private TextField gm5;

    @FXML
    private TextField gm6;

    @FXML
    private ChoiceBox<String> hmPlayerTwo;

    @FXML
    private TextField gm7;

    @FXML
    private TextField gm8;

    @FXML
    private TextField gm9;

    @FXML
    private TextField gm10;

    @FXML
    private TextField gm11;

    @FXML
    private TextField gm12;

    @FXML
    private TextField ds1;

    @FXML
    private TextField ds2;

    @FXML
    private TextField ds3;

    @FXML
    private TextField finalScore;

    @FXML
    private Button calc;

    @FXML
    void calculateAndSubmitScores(ActionEvent event) {

    }

    @FXML
    void registerTeam(ActionEvent event) {
        Team newTeam = new Team(tfTeamName.getText());
        Main.teamsList.add(newTeam);
        tfTeamName.clear();
        cbTeamSelect.getItems().add(newTeam.getTeamName());


        homeTeam.getItems().add(newTeam.getTeamName());
        awayTeam.getItems().add(newTeam.getTeamName());
        hmTeam.getItems().add(newTeam.getTeamName());
        awTeam.getItems().add(newTeam.getTeamName());
    }

    @FXML
    void registerPlayer(ActionEvent event) {
        Player newPlayer = new Player(tfPlayerName.getText());
        Main.playerList.add(newPlayer);
        Team playerTeam = Main.findTeamFromName(cbTeamSelect.getValue());
        newPlayer.setPlayerTeam(playerTeam);
        playerTeam.addToPlayerList(newPlayer);
        tfPlayerName.clear();
    }

    @FXML
    void viewFRChart(ActionEvent event) {
        clrScreen();
    }

    @FXML
    void viewMatchScores(ActionEvent event) {
        clrScreen();
    }

    @FXML
    void viewTeamRanking(ActionEvent event) {
        clrScreen();
        sortTeams();
        showTeams();
    }

    @FXML
    void viewTeamStats(ActionEvent event) {
        clrScreen();
        showTeams();
    }

    @FXML
    void generateFixtures(ActionEvent event) {

    }

    @FXML
    void generateStats(ActionEvent event) {
        clrScreen();
        showTeams();
    }

    @FXML
    void updateHomePlayers(ActionEvent event){
        hmPlayerOne.getItems().clear();
        hmPlayerTwo.getItems().clear();

        Team homeTeam = Main.findTeamFromName(hmTeam.getValue());
        for (Player player : homeTeam.getPlayerList()) {
            hmPlayerOne.getItems().add(player.getPlayerName());
            hmPlayerTwo.getItems().add(player.getPlayerName());
        }
    }

    @FXML
    void updateAwayPlayers(ActionEvent event){
        awPlayerOne.getItems().clear();
        awPlayerTwo.getItems().clear();

        Team awayTeam = Main.findTeamFromName(awTeam.getValue());
        for (Player player : awayTeam.getPlayerList()) {
            awPlayerOne.getItems().add(player.getPlayerName());
            awPlayerTwo.getItems().add(player.getPlayerName());
        }
    }
}