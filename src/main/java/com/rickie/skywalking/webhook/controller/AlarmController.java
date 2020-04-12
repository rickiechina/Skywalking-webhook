package com.rickie.skywalking.webhook.controller;

import lombok.Data;
import lombok.ToString;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alarm")
public class AlarmController {
    @PostMapping("/email")
    public void emailAlarm(@RequestBody List<AlarmMessageDto> alarmMessageList) {
        System.out.println(alarmMessageList.toArray());
        alarmMessageList.forEach(item-> System.out.println(item.toString()));
        // 具体处理告警信息

    }

    @PostMapping("/test")
    public void testAlarm(@RequestBody String alarmSourceMessage) {
        System.out.println(alarmSourceMessage);
    }

    //实体类
    @Data
    @ToString
    public static class AlarmMessageDto {
        private int scopeId;
        private String name;
        private int id0;
        private int id1;
        private String alarmMessage;
        private long startTime;
    }
}
