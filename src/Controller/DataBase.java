package Controller;
import Model.Person;
import Model.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by christychoma on 6/6/2017.
 */
public class DataBase {

    public static void SignUp(User ChristY) {


        User  u = ChristY;
        String fileName = "ChristyRecord.txt";
        PrintWriter y = DataBase.fileWriter(fileName);
        y.println(u.getFirstName());
        y.println(u.getLastName());
        y.println(u.getSSN());
        y.println(u.getDob());
        y.println(u.getGender());
        y.println(u.getUserName());
        y.println(u.getEmail());
        y.println(u.getPhone());
        y.println(u.getPassword());
        y.close();

    }
    public static ArrayList SignIn() {
        User u = new User();
        String fileName = "ChristyRecord.txt";
        Scanner x = DataBase.fileReader(fileName);
        ArrayList<Person> ListOfUsers = new ArrayList<>();
        while (x.hasNextLine()) {
            String firstname = x.next();
            u.setFirstName(firstname);
            System.out.println("I got the first name");
            String lastname = x.next();
            u.setLastName((lastname));
            System.out.println("I got the last name");
            String socialsec = x.next();
            u.setSSN(socialsec);
            System.out.println("I got the social security number");
            String dob = x.nextLine();
            u.setDob(dob);
            System.out.println("I got the date of birth");
            String gender = x.nextLine();
            u.setGender(gender);
            System.out.println("I got the gender");
            String Username = x.nextLine();
            u.setUserName(Username);
            System.out.println("I got the user name");
            String email = x.nextLine();
            u.setEmail(email);
            System.out.println("I got the email");
            String password = x.nextLine();
            u.setPassword(password);
            System.out.println("I got the password");
            ListOfUsers.add(u);
        }
        x.close();
        return ListOfUsers;
    }

    private static PrintWriter fileWriter(String filepath){
        PrintWriter outPutStream=null;
        try{

        outPutStream = new PrintWriter(new FileOutputStream(filepath));

        }
            catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
            }
        return outPutStream;

    }
private static Scanner fileReader(String filepath) {
    Scanner inputStream = null;
    try {
        inputStream = new Scanner(new File(filepath));
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());

    }
    return inputStream;
}
public String toString() {
    User user = new User();
    return user.getFirstName() + " " + user.getLastName() + " " + user.getSSN() + " " + user.getDob() + " " + user.getGender() + " "
            + user.getUserName() + "  " + user.getEmail() + " " + user.getPhone() + " " + user.getPassword();
}
}


