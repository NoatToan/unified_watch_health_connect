package com.scwang.smartrefresh.layout.util;

/* JADX INFO: loaded from: classes18.dex */
public class DelayedRunable implements Runnable {
    public long delayMillis;
    public Runnable runnable;

    public DelayedRunable(Runnable runnable) {
        this.runnable = null;
        this.runnable = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.runnable;
        if (runnable != null) {
            runnable.run();
            this.runnable = null;
        }
    }

    public DelayedRunable(Runnable runnable, long j) {
        this.runnable = null;
        this.runnable = runnable;
        this.delayMillis = j;
    }
}
