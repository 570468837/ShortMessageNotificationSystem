package webservice;

import javax.xml.ws.Endpoint;
import javax.jws.WebService;

import assignment3.ShortMessageSender;
import assignment3.ShortMessageSenderFactory;

@WebService
public class Webservice {
	
	public void sendMessage(String phone, String content){
		ShortMessageSender sms = ShortMessageSenderFactory.createShortMessageSender();
		sms.sendMessage(phone, content);
	}
	
	public static void main(String []args){
		Endpoint.publish("http://localhost:9001/Service/Webservice", new Webservice());
		System.out.println("WebService Server Success!");
	}
	
}
