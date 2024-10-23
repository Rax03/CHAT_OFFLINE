package com.javafx.chat_offline;

import com.javafx.chat_offline.clases.Chat;

import java.util.stream.Collectors;

public class Resumenes {

    public static String generarResumenPorUsuario(Chat chat, String usuarioId) {
        return chat.getMensajes().stream()
                .filter(mensaje -> mensaje.getDe().equals(usuarioId) || mensaje.getPara().equals(usuarioId))
                .map(mensaje -> String.format("De: %s, Para: %s, Fecha: %s, Mensaje: %s",
                        mensaje.getDe(), mensaje.getPara(), mensaje.getFecha().toString(), mensaje.getContenido()))
                .collect(Collectors.joining("\n"));
    }

    public static String generarResumenCompleto(Chat chat) {
        return chat.getMensajes().stream()
                .map(mensaje -> String.format("De: %s, Para: %s, Fecha: %s, Mensaje: %s",
                        mensaje.getDe(), mensaje.getPara(), mensaje.getFecha().toString(), mensaje.getContenido()))
                .collect(Collectors.joining("\n"));
    }
}

