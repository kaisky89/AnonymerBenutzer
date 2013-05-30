/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymer.benutzer.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author kaisky89
 */
public class LoginScreenController implements Initializable, ControlledScreen{
    
    ScreensController myController;
    @Override
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
