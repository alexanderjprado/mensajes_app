import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        Conexion conexion = new Conexion();
        try (Connection cnx = conexion.get_conecction()) {

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
