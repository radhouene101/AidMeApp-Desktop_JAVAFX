package edu.connexion3a35.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsService {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACc25b3bf1090ca38a808cdb2cc20dba09";
    public static final String AUTH_TOKEN = "521eedf69e57a3850160cadde7379439";


    public void sendSms(String phone,String code,String name) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+216"+phone),
                        new com.twilio.type.PhoneNumber("+16315294030"),
                        "Dear "+name.toUpperCase()+"\n\nPlease confirm your account by entering the following code: "+code+"\n\n AidMe Bot")
                .create();

        System.out.println(message.getSid());
    }
    public void sendSmsResetPassword(String phone , String code , String name){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+216"+phone),
                        new com.twilio.type.PhoneNumber("+16315294030"),
                        "Dear "+name.toUpperCase()+ " \n\nYour reset password code is :  "+code+"\n\n AidMe Bot")
                .create();

        System.out.println(message.getSid());
    }
}
