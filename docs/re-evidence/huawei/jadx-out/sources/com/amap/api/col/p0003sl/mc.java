package com.amap.api.col.p0003sl;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ThreadPoolExecutor f3183a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<mb, Future<?>> f3185c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected mb.a f3184b = new mb.a() { // from class: com.amap.api.col.3sl.mc.1
        @Override // com.amap.api.col.3sl.mb.a
        public final void a(mb mbVar) {
            mc.this.a(mbVar, false);
        }

        @Override // com.amap.api.col.3sl.mb.a
        public final void b(mb mbVar) {
            mc.this.a(mbVar, true);
        }
    };

    private boolean b(mb mbVar) {
        boolean zContainsKey;
        synchronized (this) {
            try {
                zContainsKey = this.f3185c.containsKey(mbVar);
            } catch (Throwable th) {
                jv.c(th, "TPool", "contain");
                th.printStackTrace();
                zContainsKey = false;
            }
        }
        return zContainsKey;
    }

    private void a(mb mbVar, Future<?> future) {
        synchronized (this) {
            try {
                this.f3185c.put(mbVar, future);
            } catch (Throwable th) {
                jv.c(th, "TPool", "addQueue");
                th.printStackTrace();
            }
        }
    }

    protected final void a(mb mbVar, boolean z) {
        synchronized (this) {
            try {
                Future<?> futureRemove = this.f3185c.remove(mbVar);
                if (z && futureRemove != null) {
                    futureRemove.cancel(true);
                }
            } catch (Throwable th) {
                jv.c(th, "TPool", "removeQueue");
                th.printStackTrace();
            }
        }
    }

    public final void a(mb mbVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (b(mbVar) || (threadPoolExecutor = this.f3183a) == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        mbVar.f = this.f3184b;
        try {
            Future<?> futureSubmit = this.f3183a.submit(mbVar);
            if (futureSubmit == null) {
                return;
            }
            a(mbVar, futureSubmit);
        } catch (RejectedExecutionException e) {
            jv.c(e, "TPool", "addTask");
        }
    }

    public final Executor d() {
        return this.f3183a;
    }

    public final void a(long j, TimeUnit timeUnit) {
        try {
            ThreadPoolExecutor threadPoolExecutor = this.f3183a;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.awaitTermination(j, timeUnit);
            }
        } catch (InterruptedException unused) {
        }
    }

    public final void e() {
        try {
            Iterator<Map.Entry<mb, Future<?>>> it = this.f3185c.entrySet().iterator();
            while (it.hasNext()) {
                Future<?> future = this.f3185c.get(it.next().getKey());
                if (future != null) {
                    try {
                        future.cancel(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            this.f3185c.clear();
        } catch (Throwable th) {
            jv.c(th, "TPool", "destroy");
            th.printStackTrace();
        }
        ThreadPoolExecutor threadPoolExecutor = this.f3183a;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }
}
