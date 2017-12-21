package com.sabel.Threads;

import java.util.Scanner;

public class Threadverwalter implements Runnable {

    private Thread thread;
    private int counter;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabe;
        boolean fertig = false;
        Threadverwalter threadverwalter = new Threadverwalter();
        while (!fertig) {
            eingabe = scanner.nextLine();
            switch (eingabe) {
                case "s":
                    threadverwalter.start();
                    break;
                case "b":
                    threadverwalter.stop();
                    break;
                case "q":
                    threadverwalter.stop();
                    fertig = true;
                    break;
            }
        }
    }


    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
        System.out.println("Run beendet");
    }

    public void start() {
        if (this.thread == null) {
            this.thread = new Thread(this, "Threadnummer: " + counter++);
            this.thread.start();
        }
    }

    public void stop() {
        if (this.thread != null) {
            this.thread.interrupt();
        }
        this.thread = null;
    }
}
