package views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

import control.MenuController;

public class MainView extends Application {

	/**
	 * Be careful, depending on the IDE you have to use the relative
	 * or absolute path. Don't forget to add the resources folder
	 * to your java build path.
	 */
    public static String MenuViewFXML = "/fxml/Menu.fxml";
    public static String PlayFreeViewFXML = "/fxml/PlayFreeView.fxml";

    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(MenuViewFXML));
        Pane pane = loader.load();

        MenuController controller = loader.getController();
        
        controller.setPrevStage(primaryStage);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
