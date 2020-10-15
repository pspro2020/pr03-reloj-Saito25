import classes.Clock;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread threadClock = new Thread(new Clock());

        threadClock.start(); // Iniciamos el hilo.

       TimeUnit.SECONDS.sleep(12); // Nos echamos a dormir.

        threadClock.interrupt(); // Interrumpimos al hilo.

        threadClock.join(); // Somos 'huena ente' y esperamos a que termine el hilo.

        System.out.println("Eah, po' ya etamo akí. Fin del programa");

    }
}
