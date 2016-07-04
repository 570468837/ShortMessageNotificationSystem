package webservice;

import javax.xml.ws.Endpoint;

import assignment3.*;

public class WebService {
	
	public void sendMessage(String phone, String content){
		ShortMessageSender sms = ShortMessageSenderFactory.createShortMessageSender();
		sms.sendMessage(phone, content);
	}
	
	public static void main(String []args){
		Endpoint.publish("http://localhost:9001/Service/WebService", new WebService());
		System.out.println("WebService Server Success!");
	}
	
}
