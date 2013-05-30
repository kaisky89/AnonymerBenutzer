/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymer.benutzer.controller;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author kaisky89
 */
public class AnonymerBenutzerMain extends Application {
    
    public static String screen1ID = "login";
    public static String screen1File = "LoginScreen.fxml";
    public static String screen2ID = "smack";
    public static String screen2File = "SmackAPI.fxml";
    
    @Override
    public void start(Stage stage) throws Exception {
        
        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(AnonymerBenutzerMain.screen1ID, AnonymerBenutzerMain.screen1File);
        mainContainer.loadScreen(AnonymerBenutzerMain.screen2ID, AnonymerBenutzerMain.screen2File);
        
        mainContainer.setScreen(AnonymerBenutzerMain.screen1ID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}