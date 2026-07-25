package nz.ac.auckland.se206.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import nz.ac.auckland.se206.App;

public class MusicPlayerController {

    @FXML
    private Button firstSongButton;

    @FXML
    private Button switchToCounterButton;

    @FXML
    private Button secondSongButton;

    @FXML
    public void switchToCounter(ActionEvent event){
        Button button = (Button) event.getSource();
        Scene sceneButtonIsIn = button.getScene();

        try{
            sceneButtonIsIn.setRoot(App.loadFXML("counter"));

        } catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML private void initialize(){
        System.out.println("*** Initialising music player ***" + this);

    }

    @FXML private void switchToCounter(){

    }
    @FXML private void secondSong(){

    }

    @FXML private void firstSong(){

    }
    
}
