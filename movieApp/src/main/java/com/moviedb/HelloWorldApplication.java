package com.moviedb;

import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import javafx.application.Application;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main (String[] args) throws Exception {

        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {

    }

    @Override
    public void run(HelloWorldConfiguration configuration, Environment environment) {

    }
}
