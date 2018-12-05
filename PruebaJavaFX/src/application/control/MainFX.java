package application.control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;



public class MainFX extends Application {
private AnchorPane mypane;


	
	@Override
	public void start(Stage stage) throws IOException {

		// primero cargamos la vista fxml en el FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile.fxml"));
	
		mypane = (AnchorPane) loader.load();
		
		// añade la escena al stage y la titula
		stage.setTitle("javiliebana");
		stage.setScene(new Scene(mypane));
		
		stage.show();
		
		Font.loadFont(
				getClass().getResourceAsStream(
						"assets/PoiretOne-Regular.ttf"), 20);
		
		
		
	}

	
	public static void main(String[] args) {
		launch(args);
		
	}
}
