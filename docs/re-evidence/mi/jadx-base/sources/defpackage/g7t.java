package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g7t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f18699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap<f7t, Future<?>> f18700b = new ConcurrentHashMap<>();
    public f7t.a c = new a();

    public class a implements f7t.a {
        public a() {
        }

        @Override // f7t.a
        public final void a(f7t f7tVar) {
            g7t.this.d(f7tVar, true);
        }

        @Override // f7t.a
        public final void b(f7t f7tVar) {
            g7t.this.d(f7tVar, false);
        }
    }

    public final void a(long j, TimeUnit timeUnit) {
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f18699a;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.awaitTermination(j, timeUnit);
            }
        } catch (InterruptedException unused) {
        }
    }

    public final void b(f7t f7tVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (e(f7tVar) || (threadPoolExecutor = this.f18699a) == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        f7tVar.f = this.c;
        try {
            Future<?> futureSubmit = this.f18699a.submit(f7tVar);
            if (futureSubmit == null) {
                return;
            }
            c(f7tVar, futureSubmit);
        } catch (RejectedExecutionException e) {
            m2t.r(e, "TPool", "addTask");
        }
    }

    public final synchronized void c(f7t f7tVar, Future<?> future) {
        try {
            this.f18700b.put(f7tVar, future);
        } catch (Throwable th) {
            m2t.r(th, "TPool", "addQueue");
            th.printStackTrace();
        }
    }

    public final synchronized void d(f7t f7tVar, boolean z) {
        try {
            Future<?> futureRemove = this.f18700b.remove(f7tVar);
            if (z && futureRemove != null) {
                futureRemove.cancel(true);
            }
        } catch (Throwable th) {
            m2t.r(th, "TPool", "removeQueue");
            th.printStackTrace();
        }
    }

    public final synchronized boolean e(f7t f7tVar) {
        boolean zContainsKey;
        try {
            zContainsKey = this.f18700b.containsKey(f7tVar);
        } catch (Throwable th) {
            m2t.r(th, "TPool", "contain");
            th.printStackTrace();
            zContainsKey = false;
        }
        return zContainsKey;
    }

    public final Executor f() {
        return this.f18699a;
    }

    public final void g() {
        try {
            Iterator<Map.Entry<f7t, Future<?>>> it = this.f18700b.entrySet().iterator();
            while (it.hasNext()) {
                Future<?> future = this.f18700b.get(it.next().getKey());
                if (future != null) {
                    try {
                        future.cancel(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            this.f18700b.clear();
        } catch (Throwable th) {
            m2t.r(th, "TPool", "destroy");
            th.printStackTrace();
        }
        ThreadPoolExecutor threadPoolExecutor = this.f18699a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
