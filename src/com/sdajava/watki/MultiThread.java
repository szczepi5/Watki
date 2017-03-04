package com.sdajava.watki;

/**
 * Created by RENT on 2017-03-01.
 */
public class MultiThread extends Thread {

    public int id;
    public int number;

    public MultiThread(int id, int number){
        this.number = number;
        this.id = id;
    }


    @Override
    public void run(){

        for(int i=0; i<number; i++){}
        try {
            Thread.sleep(number);
        }catch (InterruptedException e) {}
        System.out.println("Thread is running..... " + id);
    }


}