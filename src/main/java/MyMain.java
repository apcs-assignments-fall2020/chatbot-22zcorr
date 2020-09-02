import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello, " + name + "! It's nice to meet you!");
        System.out.println("What is your favorite color?");
        String color = scan.next();
        System.out.println("Oh I like " + color + " too!");
       
        scan.close();
    }
}
