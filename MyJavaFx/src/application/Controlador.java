package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {
	
	
	@FXML
	private void handleClose() {
		System.exit(0);
	}
	
	@FXML
	public void showHome() {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/view2.fxml"));
            AnchorPane root = fxmlLoader.load();
            Stage stage = new Stage();
            //stage.initModality(Modality.APPLICATION_MODAL);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("ABC");
            stage.setScene(new Scene(root));  
            stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
