package co.edu.uco.newapp.usuarios.Domain;

public interface DomainRule <T>{
    void validate(T data);
}
