package com.javarush.led.lesson01.repository;

import com.javarush.led.lesson01.config.SessionCreator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserRepository {
    private final SessionCreator sessionCreator;
}
