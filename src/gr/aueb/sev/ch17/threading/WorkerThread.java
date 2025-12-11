package gr.aueb.sev.ch17.threading;

public class WorkerThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 1_000_000_000; i++){
            if (i == 1_000_000_000) {
                System.out.println("Done!");
            }
        }
    }
}
