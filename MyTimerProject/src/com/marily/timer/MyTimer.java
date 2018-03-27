package com.marily.timer;

import java.util.Timer;

/**
 * Created by mayl on 2018/3/27.
 */
public class MyTimer extends Timer{
    public static void main(String[] args) {
        //1、创建timer实力
        Timer timer=new Timer();
        //2、创建MyTimerTask实力
        MyTimerTask myTimerTask=new MyTimerTask("No.1");
        //3、通过timer定时定频率调用mytimertask的业务逻辑
        //即第一次执行时在当前时间的两秒后，之后每隔一秒钟执行一次
        timer.schedule(myTimerTask,2000,1000);
    }
}
