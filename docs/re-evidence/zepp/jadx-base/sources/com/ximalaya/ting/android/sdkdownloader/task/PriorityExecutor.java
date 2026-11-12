package com.ximalaya.ting.android.sdkdownloader.task;

import java.util.Comparator;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes22.dex */
public class PriorityExecutor implements Executor {
    private static final int b = 3;
    private static final int c = 500;
    private static final int d = 1;
    private static final AtomicLong e = new AtomicLong(Long.MAX_VALUE);
    private static final ThreadFactory f = new a();
    private static final Comparator<Runnable> g = new b();
    private static final Comparator<Runnable> h = new c();
    private final ThreadPoolExecutor a;

    public static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "xTID#" + this.a.getAndIncrement());
        }
    }

    public static class b implements Comparator<Runnable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            if (!(runnable instanceof com.ximalaya.ting.android.sdkdownloader.task.a) || !(runnable2 instanceof com.ximalaya.ting.android.sdkdownloader.task.a)) {
                return 0;
            }
            com.ximalaya.ting.android.sdkdownloader.task.a aVar = (com.ximalaya.ting.android.sdkdownloader.task.a) runnable;
            com.ximalaya.ting.android.sdkdownloader.task.a aVar2 = (com.ximalaya.ting.android.sdkdownloader.task.a) runnable2;
            int iOrdinal = aVar.b.ordinal() - aVar2.b.ordinal();
            return iOrdinal == 0 ? (int) (aVar.a - aVar2.a) : iOrdinal;
        }
    }

    public static class c implements Comparator<Runnable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Runnable runnable, Runnable runnable2) {
            if (!(runnable instanceof com.ximalaya.ting.android.sdkdownloader.task.a) || !(runnable2 instanceof com.ximalaya.ting.android.sdkdownloader.task.a)) {
                return 0;
            }
            com.ximalaya.ting.android.sdkdownloader.task.a aVar = (com.ximalaya.ting.android.sdkdownloader.task.a) runnable;
            com.ximalaya.ting.android.sdkdownloader.task.a aVar2 = (com.ximalaya.ting.android.sdkdownloader.task.a) runnable2;
            int iOrdinal = aVar.b.ordinal() - aVar2.b.ordinal();
            return iOrdinal == 0 ? (int) (aVar2.a - aVar.a) : iOrdinal;
        }
    }

    public PriorityExecutor(boolean z) {
        this(3, z);
    }

    public void clean() {
        ThreadPoolExecutor threadPoolExecutor = this.a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.getQueue().clear();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable instanceof com.ximalaya.ting.android.sdkdownloader.task.a) {
            ((com.ximalaya.ting.android.sdkdownloader.task.a) runnable).a = e.getAndDecrement();
        }
        this.a.execute(runnable);
    }

    public int getPoolSize() {
        return this.a.getCorePoolSize();
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.a;
    }

    public boolean isBusy() {
        return this.a.getActiveCount() >= this.a.getCorePoolSize();
    }

    public boolean remove(Runnable runnable) {
        return this.a.remove(runnable);
    }

    public void setPoolSize(int i) {
        if (i > 0) {
            this.a.setCorePoolSize(i);
        }
    }

    public PriorityExecutor(int i, boolean z) {
        this.a = new ThreadPoolExecutor(i, 500, 1L, TimeUnit.SECONDS, new PriorityBlockingQueue(50, z ? g : h), f);
    }
}
