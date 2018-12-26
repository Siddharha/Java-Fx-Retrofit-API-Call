package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField tvDisplay;

    @FXML
    public void initialize() {
        tvDisplay.setText("hi This is Display!");
    }

}
