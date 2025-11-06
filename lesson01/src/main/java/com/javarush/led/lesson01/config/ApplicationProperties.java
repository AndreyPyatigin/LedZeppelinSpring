package com.javarush.led.lesson01.config;

import lombok.SneakyThrows;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

@Slf4j
@ToString
@Component
public class ApplicationProperties extends Properties {


    public static final String HIBERNATE_CONNECTION_URL = "hibernate.connection.url";
    public static final String HIBERNATE_CONNECTION_USERNAME = "hibernate.connection.username";
    public static final String HIBERNATE_CONNECTION_PASSWORD = "hibernate.connection.password";
    public static final String HIBERNATE_CONNECTION_DRIVER_CLASS = "hibernate.connection.driver_class";
    public static final String ENV_EXPRESSION = "\\$\\{[A-Z_]+:.+}";


    public ApplicationProperties(
            String url,
            String username,
            String password,
            String driverClass
    )
    {
        this.put(HIBERNATE_CONNECTION_URL, url);
        this.put(HIBERNATE_CONNECTION_USERNAME, username);
        this.put(HIBERNATE_CONNECTION_PASSWORD, password);
        this.put(HIBERNATE_CONNECTION_DRIVER_CLASS, driverClass);
    }

    public final static Path CLASSES_ROOT = Paths.get(URI.create(
            Objects.requireNonNull(
                    ApplicationProperties.class.getResource("/")
            ).toString()));
}
