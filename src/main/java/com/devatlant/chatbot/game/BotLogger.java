package com.devatlant.chatbot.game;

import org.slf4j.Logger;

public class BotLogger {

    static void info(Logger logger, String message, User user){
        logger.info(message);
        System.out.println("message [" + message + "] was sent with success for user [" + user.getFirstName() + " " + user.getLastName() + "]");
    }
}
