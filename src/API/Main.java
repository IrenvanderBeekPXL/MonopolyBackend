package API;

import API.Handlers.RootHandler;
import com.sun.net.httpserver.HttpsServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpsServer server = HttpsServer.create(new InetSocketAddress(48620), Integer.MAX_VALUE);
        server.createContext("/", new RootHandler());
        server.start();
        System.out.println("Server sucessfully started");
    }
}
