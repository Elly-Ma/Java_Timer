java 定时任务调度工具详解之Timer篇
一、介绍
1、什么是定时任务调度
    基于给定的时间点、给定的时间间隔或给定的执行次数自动执行的任务
2、在java中的定时调度工具
   Timer：小弟，能实现日常60%以上的定时任务
   Quartz:大哥
3、Timer与Quartz的区别
    1）出身不同：timer由jdk提供，调用方式简单粗暴，不需要引入其它jar包
                 quartz是OpenSymphony开源组织在Job scheduling领域又一个开源项目，需要引入jar包
    2）能力区别：timer只能实现简单的定时任务
                 quartz时间控制功能比timer强大和完善
    3）底层机制：timer只有一个后台线程执行定时任务
                 quartz拥有后台执行线程池，能使用多个线程执行定时任务
    注意：timer能实现的功能，尽量不用quartz，因为timer更轻量级

二、Timer简介
1、Timer纸上谈兵
1）定义：一种工具，线程用其安排以后在后台线程中执行的任务，可安排任务执行一次，或者定期重复执行。
      简化:有且仅有一个后台线程对多个业务线程进行定时定频率的调度
2）主要构件
    Timer---（定时调用）---->TimerTask
    后台线程                 业务线程
3）Timer工具类详解
    加号（+）表示public；减号（-）表示private；井号(#)表示protected；

    *Timer
       -queue:TaskQueue
       -thread:TimerThread                                  TimerThread
        ---------------------------                 ---->       +run()
       +Timer(isDaemon:boolean):void                           -mainLoop():void
       +Timer(name:String):void
       +Schedule(task:TimerTask,time:Date):void(无返回值)

                    |
                    |
           TaskQueue                                          *TimerTask
                -queue:TimerTask[]                   ---->            +run():void
2、Timer实战演练
    通过程序com.marily.timer包

三、Timer的定时调度函数
1、schedule的四种用法
   1)schedule(task,time)
      参数：task--所要安排的任务
            time--执行任务的时间
      作用：在时间等于或超过time的时候执行且仅执行一次task

2、scheduleAtFixedRate
