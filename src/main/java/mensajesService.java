import java.util.Scanner;

public class mensajesService {
    public static void crearMensaje(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = entry.nextLine();

        System.out.println("tu nombre");
        String nombre = entry.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes(){

    }
    public static void borrarMensaje(){

    }

    public static void editarMensaje(){

    }
}
