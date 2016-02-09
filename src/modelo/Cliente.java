package modelo;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dci;
    private String mail;
    private String comuna;
    private String tipoCliente;

    public Cliente() {
        this.nombre = "";
        this.apellido = "";
        this.dci = "";
        this.mail = "";
        this.comuna = "";
        this.tipoCliente = "";
    }
    
    public Cliente(String nombre, String apellido, String dci, String mail, String comuna, String tipoCliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dci = dci;
        this.mail = mail;
        this.comuna = comuna;
        this.tipoCliente = tipoCliente;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDci() {
        return dci;
    }

    public void setDci(String dci) {
        this.dci = dci;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }    
    
}
