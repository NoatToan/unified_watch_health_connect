package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class k8t {
    public static /* synthetic */ Thread a(final String str, int i, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(i);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: i8t
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread2, Throwable th) {
                t5t.d(str, "uncaughtException:" + th.getMessage());
            }
        });
        return thread;
    }

    public static ExecutorService b(String str) {
        return c(str, 5);
    }

    public static ExecutorService c(String str, int i) {
        return new ThreadPoolExecutor(5, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f(str, i));
    }

    public static ExecutorService d(String str, RejectedExecutionHandler rejectedExecutionHandler) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f(str, 5), rejectedExecutionHandler);
    }

    public static ThreadFactory f(final String str, final int i) {
        return new ThreadFactory() { // from class: h8t
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return k8t.a(str, i, runnable);
            }
        };
    }

    public static ExecutorService g(String str, int i) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f(str, i));
    }
}
