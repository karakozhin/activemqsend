package kz.ivc.jms;

import org.apache.activemq.Message;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;

import javax.jms.JMSException;

public class Receiver {
    @Autowired
    Logger logger;

    @JmsListener(destination = "kz.ivc.test.receiver")
    public void receiver(Message message) throws JMSException{
        try{
            int id = message.getIntProperty("id");
            int age = message.getIntProperty("age");
            String name = message.getStringProperty("name");
            String surname = message.getStringProperty("surname");
            String gender = message.getStringProperty("gender");

            System.out.println("JMS message:");
            System.out.println("ID" + id);
            System.out.println("Age" + age);
            System.out.println("Name" + name);
            System.out.println("Surname" + surname);
            System.out.println("Gender" + gender);
        } catch (JMSException e){
            logger.error("class: Receiver; method: receiver: exception: JMSException" + e);
        }
    }
}
