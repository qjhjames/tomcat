package com.qianlikange.first.simple.tomcat;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.Request;


public class HttpServer {
   public static final String WEB_ROOT=System.getProperty("user.dir")+File.separator+"webroot";
   //shutdown command
   private static final String SHUTDOWN_COMMAND="/SHUTDOWN";
   //the shutdown command received
   private boolean shutdown=false;
	public static void main(String[] args) {
   HttpServer server=new HttpServer();
   server.await();
	}
    public void await(){
    	ServerSocket serverSocket=null;
    	int port=8888;
    	try{
    		serverSocket=new ServerSocket(port,1,InetAddress.getByName("127.0.0.1"));
    	}catch(IOException e){
    		e.printStackTrace();
    		System.exit(1);
    	}
    	//Loop waiting for a  request
    	while(!shutdown){
    		Socket socket=null;
    		InputStream input=null;
    		OutputStream output=null;
    		try{
    			socket=serverSocket.accept();
    			input=socket.getInputStream();
    			output=socket.getOutputStream();
    			//create Request object and parse
    			
    		}
    	}
    }
}
