package Messenger.Client;

public class Client {
    static String HOST = "localhost";
    static int PORT = 8080;

    public void start() {
        new ClientHelper(HOST, PORT);
    }
}
