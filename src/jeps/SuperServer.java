package jeps;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;
import com.sun.net.httpserver.SimpleFileServer.OutputLevel;

import java.net.InetSocketAddress;
import java.nio.file.Path;

public class SuperServer {

    public static void main(String[] args) {
        Integer port = 8080;
        String pathToServe = "C:\\Users\\WA661DW\\Downloads\\java-17-practice\\src\\jeps\\staticfiles";
        OutputLevel level = OutputLevel.VERBOSE;

        HttpServer server = SimpleFileServer.createFileServer(
                new InetSocketAddress(port),
                Path.of(pathToServe),
                level
        );

        //start the server
        server.start();
    }
}
