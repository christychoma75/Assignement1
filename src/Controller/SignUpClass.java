package Controller;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


/**
 * Created by christychoma on 6/6/2017.
 */
public class SignUpClass {

    private static Button signUpButton;

    public static void signUp(String s) {
        Stage window = new Stage();
        window.setMinHeight(400);
        window.setMinWidth(500);

        Label firstName = new Label("First name");
        Label Lastname = new Label("Last name");
        Label SSN = new Label("SSN");
        Label Gender = new Label("Gender");
        Label UserName = new Label("Username");
        Label Password = new Label("Password");
        Label ConfirmPass = new Label("Confirm Password");
        Label email = new Label("email adrress");
        Label Phonenumber = new Label("Phone number");

       // javafx.scene.control.TextField
        TextField FirstName = new TextField("");
        TextField LastName = new TextField("");
        TextField Ssn = new TextField("");
        TextField GenDer = new TextField("");
        TextField Username = new TextField("");
        TextField PassWord = new TextField("");
        TextField ConFPassword = new TextField("");
        TextField Email = new TextField("");
        TextField PhoneNumber = new TextField("");



        GridPane Pane = new GridPane();
        Pane.setConstraints(firstName , 0,0);
        Pane.setConstraints(Lastname,0,2);
        Pane.setConstraints(SSN,0,4);
        Pane.setConstraints(Gender,0,6);
        Pane.setConstraints(UserName,0,8);
        Pane.setConstraints(Password,0,10);
        Pane.setConstraints(ConfirmPass,0,12);
        Pane.setConstraints(email,0,14);
        Pane.setConstraints(Phonenumber,0,16);
        signUpButton = new Button();

        Pane = new GridPane();
        GridPane.setConstraints(FirstName,3,0);
        GridPane.setConstraints(LastName,3,2);
        GridPane.setConstraints(Ssn,3,4);
        GridPane.setConstraints(GenDer,3,6);
        GridPane.setConstraints(Username ,3,8);
        GridPane.setConstraints(PassWord,3,10);
        GridPane.setConstraints(ConFPassword,3,12);
        GridPane.setConstraints(Email,3,14);
        GridPane.setConstraints(PhoneNumber,3,16);
         GridPane.setConstraints(signUpButton,3,18);


        Pane.getChildren().addAll(firstName, Lastname, SSN, Gender, UserName, Password, ConfirmPass, email, Phonenumber, signUpButton);
        Pane.getChildren().addAll(FirstName, LastName, Ssn,GenDer,Username,PassWord, ConFPassword,Email, PhoneNumber);
        Scene scene= new Scene(Pane);
        // signUpButton = new Button();
        signUpButton.setText("Sign Up");
        signUpButton.setOnAction(e-> SuCcessClass.Congratulation("You've been Signed up"));

        window.setMinHeight(400);
        window.setMinWidth(500);
        window.setTitle("PLEASE FOLLOW THESE STEPS TO CREATE A NEW ACCOUNT");
        window.setScene(scene);
        window.show();




    }
}