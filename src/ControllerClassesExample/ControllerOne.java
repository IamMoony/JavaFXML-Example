package ControllerClassesExample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class ControllerOne {

    public static void reactToClick() {

    }

    //name of button is the same as the fx:id
    @FXML
    private Button helloButton;

    @FXML
    private Button worldButton;

    @FXML
    private Label labelOne;

    @FXML
    private void printHello(ActionEvent e){
        System.out.println("Hello");
    }

    @FXML
    private void printWorld(ActionEvent f){
        System.out.println("World");
        labelOne.setText("new text");
    }
}

