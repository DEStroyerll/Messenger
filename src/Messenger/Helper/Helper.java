package Messenger.Helper;

import Messenger.Client.Client;
import Messenger.Server.Server;

import java.io.IOException;
import java.util.Scanner;

public class Helper {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        Client client = new Client();

        System.out.println("First, start the server and press 1, then start the client and press 2");
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        if(value == 1) {
            server.start();
        } else if(value == 2) {
            client.start();
        } else {
            System.out.println("You entered wrong number!");
        }
    }
}
