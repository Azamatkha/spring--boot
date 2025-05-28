package com.epam.edu.springbootappconfiguration.service;

import org.springframework.stereotype.Service;

@Service
public class ConfigurationDetailsProvider {

    private static final String APP_NAME_FORMAT = "%s-%s";

    private String baseName;
    private String environment;

    public String getAppName() {
        return String.format(APP_NAME_FORMAT, baseName, environment);
    }
}
