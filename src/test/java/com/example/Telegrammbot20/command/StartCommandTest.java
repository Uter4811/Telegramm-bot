package com.example.Telegrammbot20.command;

import static com.example.Telegrammbot20.command.CommandName.START;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Unit-level testing for StartCommand")
class StartCommandTest extends AbstractCommandTest {

    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
