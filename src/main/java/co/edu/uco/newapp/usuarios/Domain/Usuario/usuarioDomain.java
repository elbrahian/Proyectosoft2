package co.edu.uco.newapp.usuarios.Domain.Usuario;

import co.edu.uco.newapp.usuarios.Domain.Domain;

import java.util.UUID;

public class usuarioDomain extends Domain {
    private String nombre;
    private String apellido;
    private String correo;
    private String password;

    public usuarioDomain(final UUID id,final String nombre,final String apellido,final String correo,final String password) {
        super(id);
        setNombre(nombre);
        setApellido(apellido);
        setCorreo(correo);
        setPassword(password);
    }

    public String getNombre() {
        return nombre;
    }
    private void setNombre(final String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    private void setApellido(final String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    private void setCorreo(final String correo) {
        this.correo = correo;
    }
    public String getPassword() {
        return password;
    }
    private void setPassword(final String password) {
        this.password = password;
    }
}
