package co.edu.uco.newapp.usuarios.Domain.Usuario.rules;

import co.edu.uco.newapp.usuarios.Domain.DomainRule;

import java.util.UUID;

public interface UserIdDoesNotExistRule extends DomainRule<UUID> {
}
