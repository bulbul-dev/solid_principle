package com.bulbul.solid.dip.refactored.services.sms;

public interface SmsProvider {
    void sendSms(String phoneNumber, String text);
}
