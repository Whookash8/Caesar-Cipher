package CaesarCipher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Created by Łukasz on 2017-06-12.
 */
public class Controller {
    String input;
    String output;

    @FXML private TextField inputField;
    @FXML private TextField outputField;
    @FXML private Button encryptButton;
    @FXML private Button decryptButton;

    @FXML void initialize(){

        encryptButton.setOnAction((ActionEvent event) -> {
            input = inputField.getText();

            output = String.valueOf(Controller.encrypt(input));
            outputField.setText(output.toString());
        });

        decryptButton.setOnAction((ActionEvent event) -> {
            input = inputField.getText();

            output = String.valueOf(Controller.decrypt(input));
            outputField.setText(output.toString());
        });
    }

    static String encrypt(String msg){
        String s = "";
        int len = msg.length();
        msg = msg.toLowerCase();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) + 3);
            if (c > 'z')
                s += (char)(msg.charAt(x) - (26-3));
            else
                s += (char)(msg.charAt(x) + 3);
        }
        return s;
    }

    static String decrypt(String msg){
        String s = "";
        int len = msg.length();
        msg = msg.toLowerCase();
        for(int x = 0; x < len; x++){
            char c = (char)(msg.charAt(x) - 3);
            if (c < 'a')
                s += (char)(msg.charAt(x) + (26-3));
            else
                s += (char)(msg.charAt(x) - 3);
        }
        return s;
    }
}
