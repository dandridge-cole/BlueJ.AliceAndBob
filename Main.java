/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
//import java.lang.System;
public class Main {

    public static void main(String[] args ){
        Scanner myInput = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = myInput.nextLine();
        if (name.equals("Bob")|| name.equals("Alice")){
            System.out.print("Howdy, "+name+"!");
        } else{
            System.out.print("Get outta my house!");
        }
    }
}
