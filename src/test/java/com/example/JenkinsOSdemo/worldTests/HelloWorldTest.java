package com.example.JenkinsOSdemo.worldTests;

import com.example.JenkinsOSdemo.world.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldTest {

    @Autowired
    HelloWorld helloWorld;

    @Test
    public void HelloWorldMethodTest() {
        assertThat(helloWorld.helloWorld()).isEqualToIgnoringCase("hello world!");
    }
}
