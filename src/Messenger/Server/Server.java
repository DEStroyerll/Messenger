package Messenger.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class Server {
    static final int PORT = 8080;
    //Список всех пользователей
    static List<ServerHelper> clientList = new LinkedList<>();

    public void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Messenger.Server started!");
        try {
            while (true) {
                //Метод accept ждет пока его дернут
                Socket socket = serverSocket.accept();
                try {
                    clientList.add(new ServerHelper(socket));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            serverSocket.close();
        }
    }
}
