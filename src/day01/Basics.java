package day01;

import java.util.regex.Pattern;

public class Basics {


    public static void main(String[] args) {

        String email = "118323A_22020304959290099@yopmail.com";

        System.out.println(Pattern.matches(".*@.*\\.com", email));
        
    }


}
