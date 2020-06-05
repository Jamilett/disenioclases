package com.gm.ventas;

import java.util.Date;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private Date fechaOrden;
    private static int contadorProductos;

    // Constructor Vacío
    private Producto() {
        this.idProducto = ++contadorProductos; // Inicializa el contador en 1
    }

    // Constructor Sobrecargado 2 args
    public Producto(String nombre, double precio) {
        this(); // llama el constructor privado (vacio) de la clase para inicializar idProducto
        this.nombre = nombre;
        this.precio = precio;
    }

    // Agregamos getters y setters
    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Date getFechaOrden (){
        return this.fechaOrden;
    }
    
    public void setFechaOrden (Date date){
        this.fechaOrden = date;
    }

    public int getContadorProductos() {
        return this.contadorProductos;
    }

    @Override
    public String toString() {
        return "Producto{ " + "idProducto= #" + idProducto + ", nombre= " + nombre + ", precio= $" + precio + '}';
    }

}
