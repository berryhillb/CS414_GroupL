package controller;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HttpServer sever = HttpServer.create(new InetSocketAddress(8000),8000);
	}

}
