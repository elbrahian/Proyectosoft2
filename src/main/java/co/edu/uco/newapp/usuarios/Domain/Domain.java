package co.edu.uco.newapp.usuarios.Domain;

import java.util.UUID;

public class Domain {
    private UUID id;
    protected Domain(final UUID id) {
        setId(id);
    }
    public UUID getId() {
        return id;
    }
    public void setId(final UUID id) {
        this.id = id;
    }
}
