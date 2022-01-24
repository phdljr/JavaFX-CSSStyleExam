package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class MyController implements Initializable{
	
	@FXML private ToggleGroup group;
	@FXML private Button button;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		group.selectedToggleProperty().addListener(e->{
			if(group.getSelectedToggle() != null) {
				RadioButton rb = (RadioButton)group.getSelectedToggle();
				button.setStyle("-fx-background-color: " + rb.getText());
			}
		});
	}

}
