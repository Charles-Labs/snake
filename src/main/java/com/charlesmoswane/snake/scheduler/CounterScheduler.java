package com.charlesmoswane.snake.scheduler;

import com.charlesmoswane.snake.handler.SecondsCounterHandler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class CounterScheduler {

    private int secondsCount = 0;

    @Scheduled(fixedRate = 1000)
    public void sendSecondsCount(){
        secondsCount++;
        SecondsCounterHandler.broadcast(String.valueOf(secondsCount));
    }
}
