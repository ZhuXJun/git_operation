package com.git.git_operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StopWatch;

@SpringBootApplication
public class GitOperationApplication {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch("耗时监控");
        stopWatch.start();
        ConfigurableApplicationContext run = SpringApplication.run(GitOperationApplication.class, args);
        stopWatch.stop();
        System.out.println("项目启动：" + run.getId());
        System.out.println(stopWatch.prettyPrint());
    }

}
