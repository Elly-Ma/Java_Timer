package com.marily.timer;

import java.util.TimerTask;

/**
 * Created by mayl on 2018/3/27.
 */
public class MyTimerTask extends TimerTask{

    private String name;

    public MyTimerTask(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println("current thread name:"+this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
