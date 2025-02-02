// Clase que representa un celular
public class celular {

    private String nombre; // Nombre del celular
    private notificacion noti; // Dependencia de notificación

    // Constructor de la clase celular con inyección de dependencias
    public celular(String nombre, notificacion noti) {
        this.nombre = nombre;
        this.noti = noti;
    }

    // Método que muestra el servicio de notificación
    void servicioNoti() {
        System.out.println(nombre + " recibió notificación");
        noti.recibirNot(); // Llamar al método de notificación
    }

    // Setter para la dependencia de notificación
    public void setNoti(notificacion noti) { 
        this.noti = noti;
    }

    // Getter para la dependencia de notificación
    public notificacion getNoti() {
        return noti;
    }

}