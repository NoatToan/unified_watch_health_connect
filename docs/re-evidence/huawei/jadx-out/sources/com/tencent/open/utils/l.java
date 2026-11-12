package com.tencent.open.utils;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes20.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f31117c;
    private static HandlerThread d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f31116b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f31115a = c();

    private static Executor c() {
        return new ThreadPoolExecutor(0, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static void a(Runnable runnable) {
        try {
            f31115a.execute(runnable);
        } catch (RejectedExecutionException unused) {
        }
    }

    public static Handler a() {
        if (f31117c == null) {
            synchronized (l.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                d = handlerThread;
                handlerThread.start();
                f31117c = new Handler(d.getLooper());
            }
        }
        return f31117c;
    }

    public static void b(Runnable runnable) {
        a().post(runnable);
    }

    public static Executor b() {
        return new a();
    }

    static class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Queue<Runnable> f31118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f31119b;

        private a() {
            this.f31118a = new LinkedList();
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this) {
                this.f31118a.offer(new Runnable() { // from class: com.tencent.open.utils.l.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            runnable.run();
                        } finally {
                            a.this.a();
                        }
                    }
                });
                if (this.f31119b == null) {
                    a();
                }
            }
        }

        protected void a() {
            synchronized (this) {
                Runnable runnablePoll = this.f31118a.poll();
                this.f31119b = runnablePoll;
                if (runnablePoll != null) {
                    l.f31115a.execute(this.f31119b);
                }
            }
        }
    }
}
