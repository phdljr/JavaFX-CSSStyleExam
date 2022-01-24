package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXCSSStyleExam2 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = (VBox) FXMLLoader.load(getClass().getResource("Layout.fxml"));
			Scene scene = new Scene(root, 380, 150);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("changeBackground");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
