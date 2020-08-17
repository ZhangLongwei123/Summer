package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot 打包并运行项目  (windows和linux命令一样)
 * 1.加入需要的jar
 * 2.在build的plugin的configuration里配置启动类位置
 * 3.执行Lifecycle下的clean,再执行install  (将项目打成jar包)
 * 4. 命令行执行: java -jar E:\Springboot_jar-1.0-SNAPSHOT.jar
 */
@SpringBootApplication
public class SysApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysApplication.class,args);
    }
}
