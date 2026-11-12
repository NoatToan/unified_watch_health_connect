package com.amap.api.col.p0003sl;

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

/* JADX INFO: loaded from: classes4.dex */
public final class jv extends js implements Thread.UncaughtExceptionHandler {
    private static ExecutorService e;
    private static WeakReference<Context> g;
    private Context d;
    private static Set<Integer> f = Collections.synchronizedSet(new HashSet());
    private static final ThreadFactory h = new ThreadFactory() { // from class: com.amap.api.col.3sl.jv.2

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f2923a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.f2923a.getAndIncrement()) { // from class: com.amap.api.col.3sl.jv.2.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        super.run();
                    } catch (Throwable unused) {
                    }
                }
            };
        }
    };

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            g = new WeakReference<>(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    public static jv a(Context context, ix ixVar) throws ik {
        synchronized (jv.class) {
            if (ixVar == null) {
                throw new ik("sdk info is null");
            }
            if (ixVar.a() == null || "".equals(ixVar.a())) {
                throw new ik("sdk name is invalid");
            }
            try {
                if (!f.add(Integer.valueOf(ixVar.hashCode()))) {
                    return (jv) js.f2911a;
                }
                if (js.f2911a == null) {
                    js.f2911a = new jv(context);
                } else {
                    js.f2911a.f2913c = false;
                }
                js.f2911a.a(ixVar, js.f2911a.f2913c);
                return (jv) js.f2911a;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void b() {
        synchronized (jv.class) {
            try {
                ExecutorService executorService = e;
                if (executorService != null) {
                    executorService.shutdown();
                }
                kq.a();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (js.f2911a != null && Thread.getDefaultUncaughtExceptionHandler() == js.f2911a && js.f2911a.f2912b != null) {
                    Thread.setDefaultUncaughtExceptionHandler(js.f2911a.f2912b);
                }
                js.f2911a = null;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    @Override // com.amap.api.col.p0003sl.js
    protected final void a(ix ixVar, String str, String str2) {
        jw.a(ixVar, this.d, str2, str);
    }

    @Override // com.amap.api.col.p0003sl.js
    protected final void a(Throwable th, int i, String str, String str2) {
        jw.a(this.d, th, i, str, str2);
    }

    public static void a(Context context, ix ixVar, String str, String str2, String str3) {
        jw.a(context, ixVar, str, 0, str2, str3);
    }

    public static void b(Context context, ix ixVar, String str, String str2, String str3) {
        jw.a(context, ixVar, str, 1, str2, str3);
    }

    @Override // com.amap.api.col.p0003sl.js
    protected final void a() {
        jt.a(this.d);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        a(th, 0, null, null);
        if (this.f2912b != null) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(this.f2912b);
            } catch (Throwable unused) {
            }
            this.f2912b.uncaughtException(thread, th);
        }
    }

    @Override // com.amap.api.col.p0003sl.js
    protected final void a(final ix ixVar, final boolean z) {
        try {
            ma.a().a(new mb() { // from class: com.amap.api.col.3sl.jv.1
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    try {
                        synchronized (Looper.getMainLooper()) {
                            jt.a(ixVar);
                        }
                        if (z) {
                            jw.a(jv.this.d);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void b(Throwable th, String str, String str2) {
        if (th == null) {
            return;
        }
        try {
            a(th, 1, str, str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private jv(Context context) {
        this.d = context;
        try {
            this.f2912b = Thread.getDefaultUncaughtExceptionHandler();
            if (this.f2912b == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f2913c = true;
                return;
            }
            String string = this.f2912b.toString();
            if (!string.startsWith("com.amap.apis.utils.core.dynamiccore") && (string.indexOf("com.amap.api") != -1 || string.indexOf("com.loc") != -1)) {
                this.f2913c = false;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f2913c = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c() {
        WeakReference<Context> weakReference = g;
        if (weakReference != null && weakReference.get() != null) {
            jt.a(g.get());
        } else if (js.f2911a != null) {
            js.f2911a.a();
        }
    }

    public static void c(Throwable th, String str, String str2) {
        try {
            if (js.f2911a != null) {
                js.f2911a.a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(ix ixVar, String str, String str2, String str3, String str4) {
        a(ixVar, str, str2, str3, "", str4);
    }

    public static void a(ix ixVar, String str, String str2, String str3, String str4, String str5) {
        try {
            if (js.f2911a != null) {
                js.f2911a.a(ixVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",csid:" + str4 + ",code:" + str5, "networkError");
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(ix ixVar, String str, String str2) {
        try {
            if (js.f2911a != null) {
                js.f2911a.a(ixVar, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(ix ixVar, String str, ik ikVar) {
        if (ikVar != null) {
            a(ixVar, str, ikVar.c(), ikVar.d(), ikVar.e(), ikVar.b());
        }
    }

    @Deprecated
    public static ExecutorService d() {
        ExecutorService executorService;
        synchronized (jv.class) {
            try {
                ExecutorService executorService2 = e;
                if (executorService2 == null || executorService2.isShutdown()) {
                    e = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), h);
                }
            } catch (Throwable unused) {
            }
            executorService = e;
        }
        return executorService;
    }

    public static jv e() {
        jv jvVar;
        synchronized (jv.class) {
            jvVar = (jv) js.f2911a;
        }
        return jvVar;
    }
}
