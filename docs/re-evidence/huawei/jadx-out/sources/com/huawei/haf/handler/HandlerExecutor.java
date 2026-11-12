package com.huawei.haf.handler;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerExecutor implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Handler f5953c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f5954a;

    public HandlerExecutor() {
        this(f5953c);
    }

    public HandlerExecutor(Handler handler) {
        this.f5954a = handler == null ? f5953c : handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (this.f5954a.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f5954a + " is shutting down");
    }

    public static Handler a() {
        return f5953c;
    }

    public static void b(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            c(runnable, 0L);
        }
    }

    public static void c(Runnable runnable) {
        c(runnable, 0L);
    }

    public static void d(Runnable runnable) {
        f5953c.postAtFrontOfQueue(runnable);
    }

    public static void c(Runnable runnable, long j) {
        f5953c.postDelayed(runnable, j);
    }

    public static boolean d() {
        return c();
    }

    public static boolean c() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static <T> T c(Callable<T> callable) throws Exception {
        if (d()) {
            return callable.call();
        }
        FutureTask futureTask = new FutureTask(callable);
        c(futureTask);
        return (T) futureTask.get();
    }
}
