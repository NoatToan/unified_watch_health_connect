package com.xiaomi.hm.health.jobcenter.manager;

import com.xiaomi.hm.health.devicex.proxy.ThreadJob;

/* JADX INFO: loaded from: classes21.dex */
public class ThreadJobObject implements Runnable, ThreadJob {
    private int a;
    private String b = null;

    public ThreadJobObject(int threadPoolType, String threadTaskName) {
        b(threadPoolType, threadTaskName);
    }

    private void b(int threadPoolType, String threadTaskName) {
        this.a = threadPoolType;
        String strName = a.b(threadPoolType).name();
        if (threadTaskName != null) {
            strName = strName + "_" + threadTaskName;
        }
        setTaskName(strName);
    }

    public int a() {
        return this.a;
    }

    public void cancel() {
        ThreadPoolManager.getInstance().removeTask(this);
    }

    @Override // com.xiaomi.hm.health.devicex.proxy.ThreadJob
    public String getTaskName() {
        return this.b;
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void setTaskName(String taskName) {
        this.b = taskName;
    }

    public void start() {
        ThreadPoolManager.getInstance().addTask(this);
    }

    public ThreadJobObject(int threadPoolType) {
        b(threadPoolType, toString());
    }

    public ThreadJobObject() {
        b(4, toString());
    }
}
