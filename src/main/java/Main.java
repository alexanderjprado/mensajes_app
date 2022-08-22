import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner entry = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. Crear mensaje");
            System.out.println(" 2. Listar mensajes");
            System.out.println(" 3. Editar mensaje");
            System.out.println(" 4. Eliminar mensaje");
            System.out.println(" 5. Salir");
            //leemos la opcion del usuario
            opcion = entry.nextInt();

            switch (opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                default:
                    break;
            }
        }while(opcion != 5);

        /* Conexion conexion = new Conexion();
        try (Connection cnx = conexion.get_conecction()) {

        } catch (Exception e) {
            System.out.println(e);
            } */
    }
}
