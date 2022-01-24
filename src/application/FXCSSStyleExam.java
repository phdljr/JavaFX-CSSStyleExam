package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class FXCSSStyleExam extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox colorbox = new HBox(10);
			colorbox.setAlignment(Pos.CENTER);
			ToggleGroup group = new ToggleGroup();
			String[] strColor = {"red", "yellow", "green", "lightgray", "violet"};
			
			for(String color : strColor) {
				RadioButton rb = new RadioButton(color);
				rb.setToggleGroup(group);
				colorbox.getChildren().add(rb);
			}
			
			Button btn = new Button("button");
			btn.setId("bigButton");
			
			group.selectedToggleProperty().addListener((observable)->{
				if(group.getSelectedToggle() != null) {
					RadioButton selected = (RadioButton)group.getSelectedToggle();
					btn.setStyle("-fx-background-color: " + selected.getText());
				}
			});
			
			VBox root = new VBox(20, colorbox, btn);
			root.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(root, 380, 150);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("changeBackground");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
