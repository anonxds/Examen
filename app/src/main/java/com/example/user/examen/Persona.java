package com.example.user.examen;

public class Persona {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldido() {
        return apelldido;
    }

    public void setApelldido(String apelldido) {
        this.apelldido = apelldido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Persona(String nombre, String apelldido, String id) {
        this.nombre = nombre;
        this.apelldido = apelldido;
        this.id = id;
    }

    String nombre,apelldido;
    String id;
}
