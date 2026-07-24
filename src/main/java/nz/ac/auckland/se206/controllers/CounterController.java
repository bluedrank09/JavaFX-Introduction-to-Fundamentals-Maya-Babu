package nz.ac.auckland.se206.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    public void switchToMusic(){

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
