package com.amap.api.mapcore.util;

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

/* JADX INFO: loaded from: classes2.dex */
public final class hn extends hk implements Thread.UncaughtExceptionHandler {
    private static ExecutorService e;
    private static WeakReference<Context> g;
    private Context d;
    private static Set<Integer> f = Collections.synchronizedSet(new HashSet());
    private static final ThreadFactory h = new ThreadFactory() { // from class: com.amap.api.mapcore.util.hn.2
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.a.getAndIncrement()) { // from class: com.amap.api.mapcore.util.hn.2.1
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

    private hn(Context context) {
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

    public static synchronized void b() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            ExecutorService executorService = e;
            if (executorService != null) {
                executorService.shutdown();
            }
            ih.a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            if (hk.a != null) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                hk hkVar = hk.a;
                if (defaultUncaughtExceptionHandler == hkVar && (uncaughtExceptionHandler = hkVar.b) != null) {
                    Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
            }
            hk.a = null;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void c() {
        WeakReference<Context> weakReference = g;
        if (weakReference != null && weakReference.get() != null) {
            hl.a(g.get());
            return;
        }
        hk hkVar = hk.a;
        if (hkVar != null) {
            hkVar.a();
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

    public static synchronized hn e() {
        return (hn) hk.a;
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

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            g = new WeakReference<>(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    public static synchronized hn a(Context context, gt gtVar) throws gi {
        try {
            if (gtVar != null) {
                if (gtVar.a() != null && !"".equals(gtVar.a())) {
                    try {
                        if (!f.add(Integer.valueOf(gtVar.hashCode()))) {
                            return (hn) hk.a;
                        }
                        hk hkVar = hk.a;
                        if (hkVar == null) {
                            hk.a = new hn(context);
                        } else {
                            hkVar.c = false;
                        }
                        hk hkVar2 = hk.a;
                        hkVar2.a(gtVar, hkVar2.c);
                        return (hn) hk.a;
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else {
                    throw new gi("sdk name is invalid");
                }
            } else {
                throw new gi("sdk info is null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void c(Throwable th, String str, String str2) {
        try {
            hk hkVar = hk.a;
            if (hkVar != null) {
                hkVar.a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(Context context, gt gtVar, String str, String str2, String str3) {
        ho.a(context, gtVar, str, 1, str2, str3);
    }

    @Override // com.amap.api.mapcore.util.hk
    public final void a(gt gtVar, String str, String str2) {
        ho.a(gtVar, this.d, str2, str);
    }

    public final void b(Throwable th, String str, String str2) {
        try {
            a(th, 1, str, str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // com.amap.api.mapcore.util.hk
    public final void a(Throwable th, int i, String str, String str2) {
        ho.a(this.d, th, i, str, str2);
    }

    public static void a(Context context, gt gtVar, String str, String str2, String str3) {
        ho.a(context, gtVar, str, 0, str2, str3);
    }

    public static void b(gt gtVar, String str, String str2) {
        try {
            hk hkVar = hk.a;
            if (hkVar != null) {
                hkVar.a(gtVar, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.mapcore.util.hk
    public final void a() {
        hl.a(this.d);
    }

    @Override // com.amap.api.mapcore.util.hk
    public final void a(final gt gtVar, final boolean z) {
        try {
            ExecutorService executorServiceD = d();
            if (executorServiceD != null && !executorServiceD.isShutdown()) {
                executorServiceD.submit(new Runnable() { // from class: com.amap.api.mapcore.util.hn.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            synchronized (Looper.getMainLooper()) {
                                hl.a(gtVar);
                            }
                            if (z) {
                                ho.a(hn.this.d);
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

    public static void a(gt gtVar, String str, String str2, String str3, String str4, String str5) {
        try {
            if (hk.a != null) {
                hk.a.a(gtVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",csid:" + str4 + ",code:" + str5, "networkError");
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(gt gtVar, String str, gi giVar) {
        a(gtVar, str, giVar.c(), giVar.d(), giVar.e(), giVar.b());
    }
}
