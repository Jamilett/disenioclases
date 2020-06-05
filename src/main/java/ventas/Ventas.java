package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Ventas {

    public static void main(String[] args) {
        // Crear varios objs de tipo Producto
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);

        // Creamos un obj de tipo Orden
        Orden orden1 = new Orden();

        // Agregamos productos a la orden 1 ----> Relacionar Clases
        orden1.agregarProducto(producto1); // Argumento de tipo Producto
        orden1.agregarProducto(producto2);
        orden1.setFechaOrden(LocalDateTime.now());
        orden1.getFechaOrden();

        // Imprimimos la orden
        orden1.mostrarOrden();

//        LocalDate localdate = LocalDate.now();
//        System.out.println("LocalDate -----> " + localdate);
//
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("LocalDateTime " + localDateTime);

    }
}
