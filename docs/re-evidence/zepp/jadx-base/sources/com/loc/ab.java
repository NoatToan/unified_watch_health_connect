package com.loc;

import android.content.Context;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes18.dex */
public final class ab extends y implements Thread.UncaughtExceptionHandler {
    private static ExecutorService e;
    private static WeakReference<Context> g;
    private Context d;
    private static Set<Integer> f = Collections.synchronizedSet(new HashSet());
    private static final ThreadFactory h = new ThreadFactory() { // from class: com.loc.ab.2
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.a.getAndIncrement());
        }
    };

    private ab(Context context) {
        this.d = context;
        try {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            this.b = defaultUncaughtExceptionHandler;
            if (defaultUncaughtExceptionHandler == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.c = true;
                return;
            }
            String string = defaultUncaughtExceptionHandler.toString();
            if (!string.startsWith("com.amap.apis.utils.core.dynamiccore") && (string.indexOf("com.amap.api") != -1 || string.indexOf("com.loc") != -1)) {
                this.c = false;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.c = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized ab a(Context context, t tVar) throws j {
        try {
            if (tVar == null) {
                throw new j("sdk info is null");
            }
            if (tVar.a() == null || "".equals(tVar.a())) {
                throw new j("sdk name is invalid");
            }
            try {
                if (!f.add(Integer.valueOf(tVar.hashCode()))) {
                    return (ab) y.a;
                }
                y yVar = y.a;
                if (yVar == null) {
                    y.a = new ab(context);
                } else {
                    yVar.c = false;
                }
                y yVar2 = y.a;
                yVar2.a(tVar, yVar2.c);
                return (ab) y.a;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void a(t tVar, String str, j jVar) {
        if (jVar != null) {
            a(tVar, str, jVar.c(), jVar.d(), jVar.e(), jVar.b());
        }
    }

    public static void a(t tVar, String str, String str2, String str3, String str4) {
        a(tVar, str, str2, str3, "", str4);
    }

    public static void a(t tVar, String str, String str2, String str3, String str4, String str5) {
        try {
            if (y.a != null) {
                y.a.a(tVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",csid:" + str4 + ",code:" + str5, "networkError");
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void b() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            ExecutorService executorService = e;
            if (executorService != null) {
                executorService.shutdown();
            }
            ao.a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            if (y.a != null) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                y yVar = y.a;
                if (defaultUncaughtExceptionHandler == yVar && (uncaughtExceptionHandler = yVar.b) != null) {
                    Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
            }
            y.a = null;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void b(t tVar, String str, String str2) {
        try {
            y yVar = y.a;
            if (yVar != null) {
                yVar.a(tVar, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Throwable th, String str, String str2) {
        try {
            y yVar = y.a;
            if (yVar != null) {
                yVar.a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void c() {
        WeakReference<Context> weakReference = g;
        if (weakReference != null && weakReference.get() != null) {
            z.a(g.get());
            return;
        }
        y yVar = y.a;
        if (yVar != null) {
            yVar.a();
        }
    }

    public static synchronized ExecutorService d() {
        try {
            ExecutorService executorService = e;
            if (executorService == null || executorService.isShutdown()) {
                e = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), h);
            }
        } catch (Throwable unused) {
        }
        return e;
    }

    @Override // com.loc.y
    public final void a() {
        z.a(this.d);
    }

    @Override // com.loc.y
    public final void a(t tVar, String str, String str2) {
        ac.a(tVar, this.d, str2, str);
    }

    @Override // com.loc.y
    public final void a(final t tVar, final boolean z) {
        try {
            ExecutorService executorServiceD = d();
            if (executorServiceD != null && !executorServiceD.isShutdown()) {
                executorServiceD.submit(new Runnable() { // from class: com.loc.ab.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            synchronized (Looper.getMainLooper()) {
                                z.a(tVar);
                            }
                            if (z) {
                                ac.a(ab.this.d);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
        } catch (RejectedExecutionException unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.loc.y
    public final void a(Throwable th, int i, String str, String str2) {
        ac.a(this.d, th, i, str, str2);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        a(th, 0, null, null);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            } catch (Throwable unused) {
            }
            this.b.uncaughtException(thread, th);
        }
    }
}
