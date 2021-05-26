/**
 * Sample Skeleton for 'Untitled' Controller Class
 */

package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AuthController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="loginField"
    private TextField loginField; // Value injected by FXMLLoader

    @FXML // fx:id="signButton"
    private Button signButton; // Value injected by FXMLLoader

    @FXML // fx:id="regButton"
    private Button regButton; // Value injected by FXMLLoader

    @FXML // fx:id="passwordField"
    private PasswordField passwordField; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'Untitled'.";
        assert signButton != null : "fx:id=\"signButton\" was not injected: check your FXML file 'Untitled'.";
        assert regButton != null : "fx:id=\"regButton\" was not injected: check your FXML file 'Untitled'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'Untitled'.";
        loginField.setOnMouseClicked(actionEvent -> {
            loginField.setStyle("-fx-border-color: none");
        });
        passwordField.setOnMouseClicked(actionEvent -> {
            passwordField.setStyle("-fx-border-color: none");
        });


        signButton.setOnAction(actionEvent -> {
            Boolean checkFields = true;

            if(loginField.getText().trim().length() == 0) {
                checkFields = false;
                loginField.setStyle("-fx-border-color: red");
            }
            if(passwordField.getText().trim().length() == 0) {
                checkFields = false;
                passwordField.setStyle("-fx-border-color: red");
            }


            if(checkFields) {
                try {
                    Boolean checkLoginUser = loginUser();

                    if(!checkLoginUser) {
                        System.out.println("Login or password doesnt exist!");
                    }

                    System.out.println(checkLoginUser);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

        regButton.setOnAction(actionEvent -> {
            System.out.println(actionEvent);
        });

    }

    private boolean loginUser() throws IOException {


        return false;
    }
}
