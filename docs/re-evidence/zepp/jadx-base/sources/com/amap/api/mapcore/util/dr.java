package com.amap.api.mapcore.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dr<Params, Progress, Result> {
    public static final Executor a;
    public static final Executor b;
    public static final Executor c;
    private static final ThreadFactory d;
    private static final BlockingQueue<Runnable> e;
    private static final c f;
    private static volatile Executor g;
    private final a<Params, Result> h;
    private final FutureTask<Result> i;
    private volatile int j = e.a;
    private final AtomicBoolean k = new AtomicBoolean();
    private final AtomicBoolean l = new AtomicBoolean();

    /* JADX INFO: renamed from: com.amap.api.mapcore.util.dr$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.a().length];
            a = iArr;
            try {
                iArr[e.b - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.c - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class a<Params, Result> implements Callable<Result> {
        public Params[] b;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static class b<Data> {
        public final dr a;
        public final Data[] b;

        public b(dr drVar, Data... dataArr) {
            this.a = drVar;
            this.b = dataArr;
        }
    }

    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object obj = message.obj;
            if (obj == null || !(obj instanceof b)) {
                return;
            }
            b bVar = (b) obj;
            if (message.what != 1) {
                return;
            }
            dr.c(bVar.a, bVar.b[0]);
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.amap.api.mapcore.util.dr.1
            private final AtomicInteger a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "AbstractAsyncTask #" + this.a.getAndIncrement());
            }
        };
        d = threadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        e = linkedBlockingQueue;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = new ThreadPoolExecutor(5, 128, 1L, timeUnit, linkedBlockingQueue, threadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());
        Executor dVar = er.d() ? new d((byte) 0) : new ThreadPoolExecutor(1, 2, 1L, timeUnit, new LinkedBlockingQueue(), new ee("AMapSERIAL_EXECUTOR"), new ThreadPoolExecutor.AbortPolicy());
        b = dVar;
        c = new ThreadPoolExecutor(2, 2, 1L, timeUnit, new LinkedBlockingQueue(), new ee("AMapDUAL_THREAD_EXECUTOR"), new ThreadPoolExecutor.AbortPolicy());
        f = new c(Looper.getMainLooper());
        g = dVar;
    }

    public dr() {
        a<Params, Result> aVar = new a<Params, Result>() { // from class: com.amap.api.mapcore.util.dr.2
            @Override // java.util.concurrent.Callable
            public final Result call() throws Exception {
                dr.this.l.set(true);
                dr drVar = dr.this;
                return (Result) drVar.c(drVar.a((Object[]) this.b));
            }
        };
        this.h = aVar;
        this.i = new FutureTask<Result>(aVar) { // from class: com.amap.api.mapcore.util.dr.3
            @Override // java.util.concurrent.FutureTask
            public final void done() {
                try {
                    dr drVar = dr.this;
                    dr.b(drVar, drVar.i.get());
                } catch (InterruptedException e2) {
                    Log.w("AbstractAsyncTask", e2);
                } catch (CancellationException unused) {
                    dr.b(dr.this, null);
                } catch (ExecutionException e3) {
                    throw new RuntimeException("An error occured while executing doInBackground()", e3.getCause());
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Result c(Result result) {
        f.obtainMessage(1, new b(this, result)).sendToTarget();
        return result;
    }

    public abstract Result a(Params... paramsArr);

    public void a(Result result) {
    }

    public void b(Result result) {
    }

    public static class d implements Executor {
        public final ArrayDeque<Runnable> a;
        public Runnable b;

        private d() {
            this.a = new ArrayDeque<>();
        }

        public final synchronized void a() {
            Runnable runnablePoll = this.a.poll();
            this.b = runnablePoll;
            if (runnablePoll != null) {
                dr.a.execute(runnablePoll);
            }
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(final Runnable runnable) {
            this.a.offer(new Runnable() { // from class: com.amap.api.mapcore.util.dr.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        d.this.a();
                    }
                }
            });
            if (this.b == null) {
                a();
            }
        }

        public /* synthetic */ d(byte b) {
            this();
        }
    }

    public final boolean b() {
        return this.k.get();
    }

    public final int a() {
        return this.j;
    }

    public final dr<Params, Progress, Result> b(Params... paramsArr) {
        return a(g, paramsArr);
    }

    public final boolean c() {
        this.k.set(true);
        return this.i.cancel(true);
    }

    public static /* synthetic */ void b(dr drVar, Object obj) {
        if (drVar.l.get()) {
            return;
        }
        drVar.c(obj);
    }

    public final dr<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.j != e.a) {
            int i = AnonymousClass4.a[this.j - 1];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.j = e.b;
        this.h.b = paramsArr;
        executor.execute(this.i);
        return this;
    }

    public static /* synthetic */ void c(dr drVar, Object obj) {
        if (drVar.k.get()) {
            drVar.b(obj);
        } else {
            drVar.a(obj);
        }
        drVar.j = e.c;
    }
}
