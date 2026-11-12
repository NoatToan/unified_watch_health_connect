package defpackage;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lfl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f25016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f25017b;
    public static final AtomicReference<ScheduledExecutorService> c = new AtomicReference<>();
    public static final Map<ScheduledThreadPoolExecutor, Object> d = new ConcurrentHashMap();

    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(lfl.d.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    lfl.d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    public static final class b implements bua<String, String> {
        @Override // defpackage.bua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        b bVar = new b();
        boolean zB = b(true, "rx2.purge-enabled", true, true, bVar);
        f25016a = zB;
        f25017b = c(zB, "rx2.purge-period-seconds", 1, 1, bVar);
        d();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        e(f25016a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static boolean b(boolean z, String str, boolean z2, boolean z3, bua<String, String> buaVar) {
        if (!z) {
            return z3;
        }
        try {
            String strApply = buaVar.apply(str);
            return strApply == null ? z2 : "true".equals(strApply);
        } catch (Throwable unused) {
            return z2;
        }
    }

    public static int c(boolean z, String str, int i, int i2, bua<String, String> buaVar) {
        if (!z) {
            return i2;
        }
        try {
            String strApply = buaVar.apply(str);
            return strApply == null ? i : Integer.parseInt(strApply);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static void d() {
        f(f25016a);
    }

    public static void e(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static void f(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
            if (d8i.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                a aVar = new a();
                int i = f25017b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, i, i, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
