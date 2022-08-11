package API.Handlers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class RootHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange http) throws IOException {
        String response = "<h1>WARNING!!!</h1><p>This is not the address for the application, " +
                "this is an internal address used by the server, but it should not be used to access " +
                "the website. Please find the actual website <a href='http://iren.be'>here</a></p>";
        http.sendResponseHeaders(200, response.length());
        OutputStream os = http.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
