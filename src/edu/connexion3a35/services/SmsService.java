package edu.connexion3a35.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsService {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACdf64d915fe8a1720a915295b78d3907c";
    public static final String AUTH_TOKEN = "ee94861c253f31351905139994d79dfe";


    public void sendSms(String phone,String code,String name) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+216"+phone),
                        new com.twilio.type.PhoneNumber("+16318835776"),
                        "Dear "+name+"\n\nPlease confirm your account by entering the following code: "+code+"\n\n AidMe Bot")
                .create();

        System.out.println(message.getSid());
    }
    public void sendSmsResetPassword(String phone , String code , String name){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+216"+phone),
                        new com.twilio.type.PhoneNumber("+16318835776"),
                        "Dear "+name.toUpperCase()+ " \n\nYour reset password code is :  "+code+"\n\n AidMe Bot")
                .create();

        System.out.println(message.getSid());
    }
    public void sendSmsBanned(String phone , String name){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+216"+phone),
                        new com.twilio.type.PhoneNumber("+16318835776"),
                        "Dear "+name.toUpperCase()+ " \n\nYour account has been banned for violating our terms of use.\n\n AidMe Bot")
                .create();

        System.out.println(message.getSid());
    }


}
