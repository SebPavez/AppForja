package modelo;

import java.util.Date;

public class Compras_Cliente {
    private Date fechaUltimaCompra;
    private double totalCompraEfectivo;
    private double totalCompraSnacks;
    private double totalCompraCartas;
    private double totalTorneosConstruidos;
    private double totalTorneosLimitados;
    private double totalCompras;

    public Compras_Cliente() {
        this.fechaUltimaCompra = new Date();
        this.totalCompraEfectivo = 0.0;
        this.totalCompraSnacks = 0.0;
        this.totalCompraCartas = 0.0;
        this.totalTorneosConstruidos = 0.0;
        this.totalTorneosLimitados = 0.0;
        this.totalCompras = 0.0;
    }
    
    public Compras_Cliente(Date fechaUltimaCompra, double totalCompraEfectivo, double totalCompraSnacks, double totalCompraCartas, double totalTorneosConstruidos, double totalTorneosLimitados, double totalCompras) {
        this.fechaUltimaCompra = fechaUltimaCompra;
        this.totalCompraEfectivo = totalCompraEfectivo;
        this.totalCompraSnacks = totalCompraSnacks;
        this.totalCompraCartas = totalCompraCartas;
        this.totalTorneosConstruidos = totalTorneosConstruidos;
        this.totalTorneosLimitados = totalTorneosLimitados;
        this.totalCompras = totalCompras;
    }

    public Date getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    public void setFechaUltimaCompra(Date fechaUltimaCompra) {
        this.fechaUltimaCompra = fechaUltimaCompra;
    }

    public double getTotalCompraEfectivo() {
        return totalCompraEfectivo;
    }

    public void setTotalCompraEfectivo(double totalCompraEfectivo) {
        this.totalCompraEfectivo = totalCompraEfectivo;
    }

    public double getTotalCompraSnacks() {
        return totalCompraSnacks;
    }

    public void setTotalCompraSnacks(double totalCompraSnacks) {
        this.totalCompraSnacks = totalCompraSnacks;
    }

    public double getTotalCompraCartas() {
        return totalCompraCartas;
    }

    public void setTotalCompraCartas(double totalCompraCartas) {
        this.totalCompraCartas = totalCompraCartas;
    }

    public double getTotalTorneosConstruidos() {
        return totalTorneosConstruidos;
    }

    public void setTotalTorneosConstruidos(double totalTorneosConstruidos) {
        this.totalTorneosConstruidos = totalTorneosConstruidos;
    }

    public double getTotalTorneosLimitados() {
        return totalTorneosLimitados;
    }

    public void setTotalTorneosLimitados(double totalTorneosLimitados) {
        this.totalTorneosLimitados = totalTorneosLimitados;
    }

    public double getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(double totalCompras) {
        this.totalCompras = totalCompras;
    }    
    
}
