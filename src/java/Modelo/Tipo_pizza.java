package Modelo;

public class Tipo_pizza {
    private int id;
    private String descripcion;

    public Tipo_pizza(int id, String descripcion) {
        setId(id);
        setDescripcion(descripcion);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
