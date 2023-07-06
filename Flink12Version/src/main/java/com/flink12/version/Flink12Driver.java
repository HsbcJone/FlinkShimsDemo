package com.flink12.version;

import com.shims.apis.FlinkDriver;

public class Flink12Driver implements FlinkDriver {
    @Override
    public void loadDriver() {
        System.out.println("Iam loading Flink12 Driver");
    }

    @Override
    public void configure() {
        System.out.println("Iam loading Flink12 configure");
    }
}
