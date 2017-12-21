package com.sabel.Threads;

public class Testklasse {


    public static void main(String[] args) {
//        Thread woerterRunnable1 =  new Thread( new WoerterRunnable("HIP", 1000));
//        Thread woerterRunnable2 = new Thread( new WoerterRunnable("HOP", 2000));
//        System.out.println(woerterRunnable1.getName());
//        System.out.println(woerterRunnable1.getPriority());
//        System.out.println(woerterRunnable2.getName());
//        System.out.println(woerterRunnable2.getPriority());
//        woerterRunnable1.start();
//        woerterRunnable2.start();


//        WoerterThread woerterThread1 = new WoerterThread("HIP", 1000);
//        WoerterThread woerterThread2 = new WoerterThread("HOP", 2000);
//        woerterThread1.start();
//        woerterThread2.start();

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());

    }

}
