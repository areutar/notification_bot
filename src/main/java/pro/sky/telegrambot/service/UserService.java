package pro.sky.telegrambot.service;

import com.pengrad.telegrambot.model.Update;
import pro.sky.telegrambot.entity.TelegramUser;

public interface UserService {
    TelegramUser create(Long chatId, String name);

    void updateUserName(Update update);

    TelegramUser getUser(Update update);
}
