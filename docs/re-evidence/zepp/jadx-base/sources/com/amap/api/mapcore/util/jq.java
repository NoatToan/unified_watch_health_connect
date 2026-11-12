package com.amap.api.mapcore.util;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class jq {
    private static jq a;
    private ExecutorService b;
    private ConcurrentHashMap<jr, Future<?>> c = new ConcurrentHashMap<>();
    private jr.a d = new jr.a() { // from class: com.amap.api.mapcore.util.jq.1
        @Override // com.amap.api.mapcore.util.jr.a
        public final void a(jr jrVar) {
            jq.this.a(jrVar, false);
        }

        @Override // com.amap.api.mapcore.util.jr.a
        public final void b(jr jrVar) {
            jq.this.a(jrVar, true);
        }
    };

    private jq(int i) {
        try {
            this.b = new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256));
        } catch (Throwable th) {
            hn.c(th, "TPool", "ThreadPool");
            th.printStackTrace();
        }
    }

    public static jq b() {
        return new jq(5);
    }

    public static synchronized void c() {
        try {
            jq jqVar = a;
            if (jqVar != null) {
                try {
                    Iterator<Map.Entry<jr, Future<?>>> it2 = jqVar.c.entrySet().iterator();
                    while (it2.hasNext()) {
                        Future<?> future = jqVar.c.get(it2.next().getKey());
                        if (future != null) {
                            try {
                                future.cancel(true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    jqVar.c.clear();
                    jqVar.b.shutdown();
                } catch (Throwable th) {
                    hn.c(th, "TPool", "destroy");
                    th.printStackTrace();
                }
                a = null;
            }
        } catch (Throwable th2) {
            hn.c(th2, "TPool", "onDestroy");
            th2.printStackTrace();
        }
    }

    public static synchronized jq a() {
        if (a == null) {
            a = new jq(1);
        }
        return a;
    }

    private synchronized boolean b(jr jrVar) {
        boolean zContainsKey;
        try {
            zContainsKey = this.c.containsKey(jrVar);
        } catch (Throwable th) {
            hn.c(th, "TPool", "contain");
            th.printStackTrace();
            zContainsKey = false;
        }
        return zContainsKey;
    }

    public final void a(jr jrVar) throws gi {
        ExecutorService executorService;
        try {
            if (!b(jrVar) && (executorService = this.b) != null && !executorService.isShutdown()) {
                jrVar.e = this.d;
                try {
                    Future<?> futureSubmit = this.b.submit(jrVar);
                    if (futureSubmit == null) {
                        return;
                    }
                    a(jrVar, futureSubmit);
                } catch (RejectedExecutionException unused) {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            hn.c(th, "TPool", "addTask");
            throw new gi("thread pool has exception");
        }
    }

    private synchronized void a(jr jrVar, Future<?> future) {
        try {
            this.c.put(jrVar, future);
        } catch (Throwable th) {
            hn.c(th, "TPool", "addQueue");
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(jr jrVar, boolean z) {
        try {
            Future<?> futureRemove = this.c.remove(jrVar);
            if (z && futureRemove != null) {
                futureRemove.cancel(true);
            }
        } catch (Throwable th) {
            hn.c(th, "TPool", "removeQueue");
            th.printStackTrace();
        }
    }
}
