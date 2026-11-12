package com.sogou.map.loc;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
final class s0 implements Executor {
    private int a = 3;
    private int b = 12;
    private long c = 30000;
    public String d = "SimpleThreadPool";
    private ThreadPoolExecutor e;

    private synchronized void b() {
        if (this.e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.a, this.b, this.c, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(1024), new ThreadPoolExecutor.DiscardOldestPolicy());
            this.e = threadPoolExecutor;
            threadPoolExecutor.setThreadFactory(new t0(this));
        }
    }

    public final void a() {
        ThreadPoolExecutor threadPoolExecutor = this.e;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.e == null) {
            b();
        }
        this.e.execute(runnable);
    }
}
