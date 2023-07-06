package com.shims.core;

import com.shims.apis.FlinkDriver;

import java.net.URL;
import java.net.URLClassLoader;

public class CoreMain {

    public static void main(String[] args) throws Exception {
        String flinkVersion = "13"; // 假设需要加载 Flink 1.13

        // 构建 Flink 1.13 依赖包路径
        String flinkPath = "/Users/mengxiaopeng/Desktop/code/FlinkShimsDemo/libs/Flink"+flinkVersion+"Version-1.0-SNAPSHOT.jar";

        // 创建 URLClassLoader，指定 Flink 1.13 依赖包路径
        URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file://" + flinkPath)});

        // 动态加载 FlinkDriver com.flink12.version.Flink12Driver
        Class<?> driverClass = classLoader.loadClass("com.flink"+flinkVersion+".version.Flink"+flinkVersion+"Driver");
        FlinkDriver flinkDriver = (FlinkDriver) driverClass.getDeclaredConstructor().newInstance();

        // 加载和配置 Flink 驱动
        flinkDriver.loadDriver();
        flinkDriver.configure();
    }
}
