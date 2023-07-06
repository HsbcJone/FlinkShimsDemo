package com.flink13.version;

import com.shims.apis.FlinkDriver;

public class Flink13Driver implements FlinkDriver {
    @Override
    public void loadDriver() {
        System.out.println("Iam Flink13 Driver");
    }

    @Override
    public void configure() {
        System.out.println("Iam Flink13 configure");

    }
}
