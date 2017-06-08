package Controller;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
/**
 * Created by christychoma on 6/6/2017.
 */
public class SigninPage {
    private static Button signInButton;

    public static void signIn(String s) {
        Stage window = new Stage();
        window.setMinHeight(400);
        window.setMinWidth(500);

        Label Username = new Label("Username");
        Label Password = new Label("Password");


        TextField UserName = new TextField("");
        TextField PassWord = new TextField("");


        GridPane Pane = new GridPane();
        Pane.setConstraints(Username,2 ,1);
        Pane.setConstraints(Password,2,2);


        signInButton = new Button();

        Pane = new GridPane();
        GridPane.setConstraints(UserName,5,1);
        GridPane.setConstraints(PassWord,5,2);

            GridPane.setConstraints(signInButton,3,6);

            Pane.getChildren().addAll(Username,Password, signInButton);
            Pane.getChildren().addAll(UserName, PassWord);
        Scene scene= new Scene(Pane);

        signInButton.setText("Log in");
        signInButton.setOnAction(e-> YouAreInClass.Navigate("You've been successfully been logged in"));

        window.setMinHeight(400);
        window.setMinWidth(500);
        window.setTitle("HEADS UP");
        window.setScene(scene);
        window.show();

}
}
