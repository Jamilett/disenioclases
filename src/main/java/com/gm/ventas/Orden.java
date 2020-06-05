package com.gm.ventas;

import java.time.LocalDateTime;

public class Orden {

    private int idOrden;
    private LocalDateTime date;
    private Producto productos[]; // Creamos la variable con arreglo simple de tipo Producto
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10; // Definimos constante con el maximo de productos

    // Constructor Vacío
    public Orden() {
        this.idOrden = ++contadorOrdenes; // idOrden iniciará en 1, pre incremento
        // Instanciamos el arreglo
        productos = new Producto[MAX_PRODUCTOS]; // El valor del arreglo será 10
    }

    public LocalDateTime getFechaOrden() {
        return this.date;
    }

    public void setFechaOrden(LocalDateTime date) {
        this.date = date;
    }

    // Metodo agregarProducto: interactuará con el arreglo productos
    public void agregarProducto(Producto producto) { // Recibirá un valor de tipo Producto

        // Inicializamos el arreglo usando el contador para ir moviendo el índice de cada elemento agregado
        // El contador iniciará en 0 y se post incrementará en cada uso, se le asignará el valor de tipo Producto
        // en el índice (posición) correspondiente 
        if (this.contadorProductos < MAX_PRODUCTOS) { // Se valida que estemos dentro del rango maximo
            productos[this.contadorProductos++] = producto; // Se le asigna el nombre del producto ingresado al infice
        } else {
            System.out.println("Se ha superado el máximo de productos " + MAX_PRODUCTOS);
        }
    }

    // Metodo para calcular el total: Suma del precio de todos los productos agregados
    public double calcularTotal() { // Iteraremos el arreglo de productos

        double total = 0; // Declaramos una variable inicial temporal 

        // Se agrega ciclo for pero no recorreremos la length de todo el arreglo, sino solamente los productos agregados
        //contadorProductos nos ayudará a saber cuantos elementos se agrega a nuestro arreglo, ya que se incrementa cada que se agrega un elemento
        for (int i = 0; i < this.contadorProductos; i++) {
            // Declaramos una variable temporal para acceder al producto del índice del arreglo que recorremos
            Producto producto = this.productos[i];
            // Usamos variable total para acceder, sumar y asignar los valores del precio que recorremos, mediante getPrecio
            total += producto.getPrecio(); // total = total + producto.getPrecio
        }
        return total; // regresamos el total (double)
    }

    // Metodo mostrar orden: Muestra cada uno de los elementos del arreglo que hemos agregado
    // Imprimirá el nombre del producto y su precio
    public void mostrarOrden() {
        System.out.println("Orden: #" + this.idOrden); // Accede al idOrden que comenzó en 1 y se incrementó
        System.out.println("Fecha: " + this.date);
        System.out.println("Total de la orden: $" + this.calcularTotal()); // Accede al método calcular total que regresa la suma de precios
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) { // Iteramos ciclo for para acceder al valor de cada producto agregado y no a length
            System.out.println(productos[i]); // Imprimimos el valor de la posición del indice en el que se encuentra
        }
    }

}
