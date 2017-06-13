package CaesarCipher;/**
 * Created by Łukasz on 2017-06-12.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CaesarCipher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/CaesarCipher/CaesarCipherGUI.fxml"));
        loader.setController(new Controller());
        Scene scene = new Scene(loader.load());

        primaryStage.setTitle("Caesar Cipher Encryption/Decryption");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
