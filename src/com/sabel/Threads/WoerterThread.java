package com.sabel.Threads;

public class WoerterThread extends Thread {

    private String name;
    private int dauer;

    public WoerterThread(String name, int dauer) {
        super(name);
        this.name = name;
        this.dauer = dauer;
    }

    @Override
    public void run() {

        for (int i = 0; i < 2; i++) {
            System.out.println(name);
            i = 0;
            try {
                Thread.sleep(dauer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
