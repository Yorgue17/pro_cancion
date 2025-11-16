
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        usuario usuarioActual = null;

        System.out.println("🎶 Bienvenido al Sistema de Canciones 🎶");
        System.out.println("1. Login");
        System.out.println("2. Registrar");
        System.out.print("Seleccione opción: ");
        int opcion = sc.nextInt(); sc.nextLine();

        if (opcion == 1) {
            System.out.print("Usuario: ");
            String nombre = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();
            usuarioActual = gestorUsuarios.login(nombre, pass);
            if (usuarioActual == null) {
                System.out.println("❌ Usuario o contraseña incorrectos.");
                return;
            }
        } else if (opcion == 2) {
            System.out.print("Nuevo usuario: ");
            String nombre = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();
            usuarioActual = gestorUsuarios.registrar(nombre, pass);
            System.out.println("✅ Usuario registrado con éxito.");
        }

       
    }
}

