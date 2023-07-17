package com.example.dependency_injection_task_sda.commandrunner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DummyLogger {
    public void sayHello(){
        log.info("hello from DummyLogger");
    }
}
