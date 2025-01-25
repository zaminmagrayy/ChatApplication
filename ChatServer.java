import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is waiting for a connection...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            Thread receiveThread = new Thread(() -> {
                try {
                    String clientMessage;
                    while ((clientMessage = in.readLine()) != null) {
                        System.out.println("Client: " + clientMessage);
                    }
                } catch (IOException e) {
                    System.err.println("Connection closed!");
                }
            });

            receiveThread.start();

            String serverMessage;
            while ((serverMessage = consoleReader.readLine()) != null) {
                out.println(serverMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
