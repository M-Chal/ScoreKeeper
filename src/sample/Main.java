package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<Team> teamsList = new ArrayList<Team>();
    public static ArrayList<Player> playerList = new ArrayList<Player>();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Team findTeamFromName(String teamName){
        for(int i = 0; i < teamsList.size(); i++){
            if(teamsList.get(i).getTeamName() == teamName){
                return teamsList.get(i);
            }
        }
        return null;
    }

}
