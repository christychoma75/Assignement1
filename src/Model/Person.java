package Model;
import Controller.SignUpClass;
import Controller.SigninPage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;


/**
 * Created by christychoma on 6/5/2017.
 */
public  class Person extends Application {

    private String firstName;
    private String lastName;
    private String SSN;
    private String dob;
    private String gender;


    Button signInButton, signUpButton;
    Stage window;
    Scene sceneFrontPage, sceneTologin, sceneToSignUp;

    public static void main(String[] args) {
        launch(args);
    }


    public Person() {
    }


    public Person(String name, String firstName, String lastName, String SSN, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.SSN = SSN;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {return SSN;}
    public void setSSN(String ssn){this.SSN = ssn;}

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;
     Label frontPageLabel = new Label("WELCOME TO HEADS UP ");
     Label newUserGuide = new Label(" Have an account?");
     Label Regularcustomer = new Label("Create new Account");

     signInButton = new Button();
     signInButton.setText("Log in");

     signUpButton = new Button();
     signUpButton.setText("Sign Up");
     signInButton.setOnAction(e-> SigninPage.signIn("Click here to login"));
    signUpButton.setOnAction(e-> SignUpClass.signUp("Sign up page"));
     // HBox layout1= new HBox(100);
     // layout1.getChildren().addAll(frontPageLabel);
     // sceneFrontPage = new Scene(layout1,400,400);
     // VBox layout2 = new VBox(20);
     // layout2.getChildren().addAll(newUserGuide,signInButton,Regularcustomer,signUpButton );
     // sceneFrontPage = new Scene(layout2,150,150);

     GridPane firstPage = new GridPane();
     firstPage.setPadding(new Insets(30,30,30,30));
     firstPage.setVgap(15);
     firstPage.setHgap(15);
     GridPane.setConstraints(frontPageLabel,2,2);
     GridPane.setConstraints(newUserGuide,1,8);
     GridPane.setConstraints(Regularcustomer, 3,8);
     GridPane.setConstraints(signInButton ,1,10);
     GridPane.setConstraints(signUpButton,3,10);
     firstPage.getChildren().addAll(frontPageLabel,newUserGuide, Regularcustomer,signInButton,signUpButton);
     Scene scene= new Scene(firstPage,500,500);
     window.setMinHeight(500);
     window.setMinWidth(600);
     window.setTitle("HEADS UP");
     window.setScene(scene);
     window.show();


    }


}
