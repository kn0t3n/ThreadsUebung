package com.sabel.Threads;

public class WoerterRunnable implements Runnable{

    private String name;
    private int dauer;

    public WoerterRunnable(String name, int dauer) {
        super();
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
