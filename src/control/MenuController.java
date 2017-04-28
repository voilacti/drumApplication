package control;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import views.MainView;

public class MenuController implements Initializable, ControlledScreen {
	
	@FXML
	private Button playMidi;
	@FXML
	private Button playFree;
	private ViewsController myController;
	private Stage prevStage;
	
	public MenuController() {
		System.out.println("MenuController Controller initialized.");
	}

	public void setPrevStage(Stage stage){
		this.prevStage = stage;
	}

	@Override
	public void initialize(URL location, ResourceBundle rb) {
		/*actiontarget.setText("");
		signIn.disableProperty().bind(
				username.textProperty().isEmpty().or(
						passwordField.textProperty().isEmpty().or(
								port.textProperty().isEmpty()
								)));*/
	}

	@Override
	public void setScreenParent(ViewsController screenParent){
		myController = screenParent;
	}
	
	public ViewsController getController(){
		return myController;
	}
	
	@FXML
	public void onPlayFree(){
		
	}
	
	@FXML
	public void onPlayMidi(){
		
	}
}
