package ch.ictbz.instanzenzaehler.instanzenzaehler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField instanceCountTextField;

    public void onButtonCreate() {
        try {
            C c = new C();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Cannot create new instance");
            alert.setContentText(e.getMessage());
            alert.setTitle("Error");
            alert.showAndWait();
        }
        instanceCountTextField.setText(String.valueOf(C.getCount()));
    }

    public void onButtonReset() {
        C.resetCount();
        instanceCountTextField.setText(String.valueOf(C.getCount()));
    }
}