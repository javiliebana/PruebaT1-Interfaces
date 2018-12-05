package application.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ControlFX2 {
	@FXML
	public Button closeButton;
	@FXML
	private void closeStage() {
		Stage stage = (Stage) closeButton.getScene().getWindow();
	    stage.close();
	}
}
