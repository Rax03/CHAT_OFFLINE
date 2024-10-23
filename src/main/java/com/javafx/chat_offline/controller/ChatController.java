package com.javafx.chat_offline.controller;

import com.javafx.chat_offline.clases.Chat;
import com.javafx.chatoffline.Mensaje;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private TextArea chatArea;
    @FXML
    private TextField inputField;

    private Chat chat = new Chat();

    @FXML
    private void sendMessage() {
        String message = inputField.getText();
        if (!message.isEmpty()) {
            chat.enviarMensaje(new Mensaje("Usuario1", "Usuario2", message));
            chatArea.appendText("Yo: " + message + "\n");
            inputField.clear();
        }
    }
}
