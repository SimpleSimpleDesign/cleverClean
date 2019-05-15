package com.store.cleverclean;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.store.cleverclean.dao") //修改成自己的dao地址
public class ClevercleanApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClevercleanApplication.class, args);
    }

}
