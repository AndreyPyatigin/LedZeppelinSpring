package com.javarush.led.lesson01;

import com.javarush.led.lesson01.config.ApplicationProperties;
import com.javarush.led.lesson01.config.SessionCreator;
import com.javarush.led.lesson01.repository.UserRepository;
import com.javarush.led.lesson01.service.UserService;

public class App {
    public static void main(String[] args) {
        ApplicationProperties applicationProperties = new ApplicationProperties();
        SessionCreator sessionCreator = new SessionCreator(applicationProperties);
        UserRepository userRepository = new UserRepository(sessionCreator);
        UserService userService = new UserService(userRepository);
        System.out.println(userService);
    }
}
