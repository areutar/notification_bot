package pro.sky.telegrambot.service;

import pro.sky.telegrambot.entity.Notification;

import java.util.List;

public interface SchedulingService {

    List<Notification> getCurrentNotifications();

    void sendScheduledMessages();
}
