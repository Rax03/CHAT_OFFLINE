package com.javafx.chat_offline.clases;

import com.javafx.chat_offline.XMLHandler;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private List<com.javafx.chatoffline.Usuario> usuarios = new ArrayList<>();
    private List<com.javafx.chatoffline.Mensaje> mensajes = new ArrayList<>();

    public void registrarUsuario(com.javafx.chatoffline.Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<com.javafx.chatoffline.Usuario> getUsuarios() {
        return usuarios;
    }

    public void enviarMensaje(com.javafx.chatoffline.Mensaje mensaje) {
        mensajes.add(mensaje);
        XMLHandler.guardarMensajes(mensajes);
    }

    public List<com.javafx.chatoffline.Mensaje> getMensajes() {
        return mensajes;
    }


    public String generarResumen() {
        StringBuilder resumen = new StringBuilder();
        for (com.javafx.chatoffline.Mensaje mensaje : mensajes) {
            resumen.append(String.format("De: %s, Para: %s, Fecha: %s, Mensaje: %s\n",
                    mensaje.getDe(), mensaje.getPara(), mensaje.getFecha().toString(), mensaje.getContenido()));
        }
        return resumen.toString();

    }

}
