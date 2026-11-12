package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class bdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4096a = "mico-thread-pool";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4097b = "mico_work_handler_thread";
    public final d c;
    public final d d;
    public final RejectedExecutionHandler e;
    public final f f;
    public final f g;
    public final ScheduledExecutorService h;
    public final Object i;

    @GuardedBy("WORKHANDLER_LOCK")
    public final AtomicReference<Handler> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("WORKHANDLER_LOCK")
    public final AtomicReference<Handler> f4098k;
    public final Handler l;
    public Map<Object, e> m;

    public class a implements RejectedExecutionHandler {
        public a() {
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            bdp.this.j().post(runnable);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bdp.this.h();
        }
    }

    public class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f4101a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Looper looper, long j) {
            super(looper);
            this.f4101a = j;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            Runnable callback = message.getCallback();
            if (callback != null) {
                bdp.this.g(callback, this.f4101a);
            }
            super.dispatchMessage(message);
            if (callback != null) {
                bdp.this.n(callback);
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f4106b;
    }

    public class f extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AtomicInteger f4108b;
        public Set<Object> c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f4109a;

            public a(Runnable runnable) {
                this.f4109a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(lmq.f());
                long jD = f.this.d(this.f4109a);
                this.f4109a.run();
                f.this.f(jD, this.f4109a);
            }

            public String toString() {
                return this.f4109a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        public class b<T> implements Callable<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Callable f4111a;

            public b(Callable callable) {
                this.f4111a = callable;
            }

            @Override // java.util.concurrent.Callable
            public T call() throws Exception {
                Process.setThreadPriority(lmq.f());
                long jD = 0;
                try {
                    try {
                        jD = f.this.d(this.f4111a);
                        T t = (T) this.f4111a.call();
                        f.this.f(jD, this.f4111a);
                        return t;
                    } catch (Exception e) {
                        bdp.this.k().c("PossibleFC %s", e);
                        throw e;
                    }
                } catch (Throwable th) {
                    f.this.f(jD, this.f4111a);
                    throw th;
                }
            }
        }

        public f(int i, long j, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(1, i, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
            this.f4108b = new AtomicInteger(0);
            this.c = new CopyOnWriteArraySet();
            this.f4107a = j;
        }

        public final long d(Object obj) {
            this.c.add(obj);
            this.f4108b.incrementAndGet();
            bdp.this.g(obj, this.f4107a);
            return bdp.this.o();
        }

        public final void e() {
            Iterator<Object> it = this.c.iterator();
            while (it.hasNext()) {
                bdp.this.k().a("task %s", it.next());
            }
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            super.execute(h(runnable));
        }

        public final void f(long j, Object obj) {
            this.c.remove(obj);
            bdp.this.n(obj);
            int iDecrementAndGet = this.f4108b.decrementAndGet();
            int maximumPoolSize = getMaximumPoolSize();
            if (iDecrementAndGet >= maximumPoolSize - 1) {
                bdp.this.k().b("heavy thread pool load, max thread pool size %s, pending tasks %s", Integer.valueOf(maximumPoolSize), Integer.valueOf(iDecrementAndGet));
                e();
            }
            long jO = bdp.this.o() - j;
            if (jO > this.f4107a) {
                bdp.this.k().a("task %s run time costs %s millis", obj, Long.valueOf(jO));
            }
        }

        public final <T> Callable<T> g(Callable<T> callable) {
            return new b(callable);
        }

        public final Runnable h(Runnable runnable) {
            return new a(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return super.submit(h(runnable));
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            bdp.this.k().a("submit task %s", runnable);
            return super.submit(h(runnable), t);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return super.submit(g(callable));
        }
    }

    public bdp() {
        d dVar = new d(0);
        this.c = dVar;
        d dVar2 = new d(1);
        this.d = dVar2;
        a aVar = new a();
        this.e = aVar;
        int iA = lmq.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f = new f(iA, timeUnit.toMillis(10L), dVar, aVar);
        this.g = new f(lmq.c(), timeUnit.toMillis(2L), dVar2, aVar);
        this.h = new ScheduledThreadPoolExecutor(1, new d(), aVar);
        this.i = new Object();
        this.j = new AtomicReference<>(null);
        this.f4098k = new AtomicReference<>(null);
        this.l = new Handler(Looper.getMainLooper());
        this.m = Collections.synchronizedMap(new IdentityHashMap());
        l().scheduleWithFixedDelay(new b(), 0L, (Math.min(lmq.b(), lmq.d()) / 2) + 1, TimeUnit.MILLISECONDS);
    }

    public final void g(Object obj, long j) {
        e eVar = new e();
        eVar.f4105a = o();
        eVar.f4106b = j;
        this.m.put(obj, eVar);
    }

    public final void h() {
        woe woeVarK = k();
        Set<Map.Entry<Object, e>> setEntrySet = this.m.entrySet();
        this.m.size();
        for (Map.Entry<Object, e> entry : setEntrySet) {
            if (o() - entry.getValue().f4105a >= entry.getValue().f4106b) {
                woeVarK.d("Task %s running duration exceeds threshold %s", entry.getKey(), Long.valueOf(entry.getValue().f4106b));
            }
        }
    }

    public final Handler i(AtomicReference<Handler> atomicReference, long j) {
        Handler handler = atomicReference.get();
        if (handler != null) {
            return handler;
        }
        synchronized (this.i) {
            try {
                Handler handler2 = atomicReference.get();
                if (handler2 != null) {
                    return handler2;
                }
                HandlerThread handlerThread = new HandlerThread("mico_work_handler_thread", 10);
                handlerThread.start();
                c cVar = new c(handlerThread.getLooper(), j);
                atomicReference.set(cVar);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Handler j() {
        return i(this.j, lmq.d());
    }

    public woe k() {
        return lmq.e();
    }

    public ScheduledExecutorService l() {
        return this.h;
    }

    public void m(Runnable runnable, long j) {
        this.l.postDelayed(runnable, j);
    }

    public final void n(Object obj) {
        this.m.remove(obj);
    }

    public final long o() {
        return SystemClock.uptimeMillis();
    }

    public class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AtomicInteger f4103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4104b;

        public d(int i) {
            this.f4103a = new AtomicInteger(0);
            this.f4104b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            int i = this.f4104b;
            if (i == 0 || i == 1) {
                runnable = (i == 0 ? bdp.this.f : bdp.this.g).h(runnable);
            }
            Thread thread = new Thread(runnable, "mico-thread-pool" + this.f4103a.incrementAndGet());
            thread.setPriority(5);
            return thread;
        }

        public d() {
            this.f4103a = new AtomicInteger(0);
            this.f4104b = 2;
        }
    }
}
