/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Console;
import java.util.List;

/**
 *
 * @author evans
 */
public class App {

    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Enter a number:");
        String stringUserNumber = myConsole.readLine();
        int intUserNumber = Integer.parseInt(stringUserNumber);
        PingPong pingPong = new PingPong();
        List<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
        System.out.println(pingPongResult);
    }

}
