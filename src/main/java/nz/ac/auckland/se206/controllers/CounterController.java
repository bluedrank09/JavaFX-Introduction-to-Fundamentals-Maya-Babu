package nz.ac.auckland.se206.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import nz.ac.auckland.se206.App;

public class CounterController {
    private int counter = 0;

    @FXML
    private Button incrementButton;

    @FXML
    private Button switchToMusicButton;

    @FXML
    private Button resetButton;

    @FXML
    private Button decrementButton;

    @FXML
    private Label numberLabel;

    @FXML
    public void switchToMusic(ActionEvent event){
        Button button = (Button) event.getSource();
        Scene sceneButtonIsIn = button.getScene();

        try{
            sceneButtonIsIn.setRoot(App.loadFXML("musicplayer"));

        } catch(Exception e){
            e.printStackTrace();
        }

    }

    @FXML
    public void increment(){
        counter++;   
        numberLabel.setText(String.valueOf(counter));
    }

    @FXML
    public void decrement(){
        counter--;   
        numberLabel.setText(String.valueOf(counter));
    }

    @FXML
    public void reset(){
        counter = 0;  
        numberLabel.setText(String.valueOf(counter));
    }


    
    
}
