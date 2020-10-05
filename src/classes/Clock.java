package classes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Clock implements Runnable{

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");


    @Override
    public void run() {

        while(!Thread.currentThread().isInterrupted()) {
            System.out.println(LocalTime.now().format(dateTimeFormatter));

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Me despiertan y termino.");
                break;
            }
        }


        // Bloque para hacer esperar al hilo principal, y comprobar la función join.
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println("No debí fallar, pero algo mu' chungo tuvo que pasar.");
            return;
        }

        System.out.println("He terminado mi función.");
    }
}
