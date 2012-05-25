/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelcalifornia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author PC-DE-FRANK
 */
public class Hotelcalifornia extends Application {
    
    public static void main(String[] args) {
        Application.launch(Hotelcalifornia.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
        
        stage.setScene(new Scene(root));
        stage.show();
    }
}
