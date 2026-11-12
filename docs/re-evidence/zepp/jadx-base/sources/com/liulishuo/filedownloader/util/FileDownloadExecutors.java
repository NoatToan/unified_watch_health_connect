package com.liulishuo.filedownloader.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
public class FileDownloadExecutors {
    private static final int a = 15;

    public static class a implements ThreadFactory {
        private static final AtomicInteger d = new AtomicInteger(1);
        private final String a;
        private final AtomicInteger c = new AtomicInteger(1);
        private final ThreadGroup b = Thread.currentThread().getThreadGroup();

        public a(String str) {
            this.a = FileDownloadUtils.getThreadPoolName(str);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.b, runnable, this.a + this.c.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public static ThreadPoolExecutor newDefaultThreadPool(int i, String str) {
        return newDefaultThreadPool(i, new LinkedBlockingQueue(), str);
    }

    public static ThreadPoolExecutor newFixedThreadPool(String str) {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new SynchronousQueue(), new a(str));
    }

    public static ThreadPoolExecutor newDefaultThreadPool(int i, LinkedBlockingQueue<Runnable> linkedBlockingQueue, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15L, TimeUnit.SECONDS, linkedBlockingQueue, new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
