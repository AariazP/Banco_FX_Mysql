/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Objects;

/**
 *
 * @author Chandan Das
 */
public class BankManagement extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/views/BankMain.fxml")));
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
