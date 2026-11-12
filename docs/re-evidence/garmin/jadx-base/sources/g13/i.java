package g13;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f74988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f74989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f74990c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f74991d = new ConcurrentHashMap();

    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(i.f74991d.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    i.f74991d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    public static final class b implements u03.f<String, String> {
        @Override // u03.f
        /* JADX INFO: renamed from: apply */
        public final Object mo330apply(Object obj) {
            return System.getProperty((String) obj);
        }
    }

    static {
        boolean zEquals;
        int i14;
        new b();
        try {
            String property = System.getProperty("rx2.purge-enabled");
            zEquals = property == null ? true : BooleanUtils.TRUE.equals(property);
        } catch (Throwable unused) {
        }
        f74988a = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx2.purge-period-seconds");
                i14 = property2 == null ? 1 : Integer.parseInt(property2);
            } catch (Throwable unused2) {
            }
        }
        f74989b = i14;
        if (!f74988a) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f74990c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new f("RxSchedulerPurge"));
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                    a aVar = new a();
                    long j8 = f74989b;
                    scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(aVar, j8, j8, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    private i() {
        throw new IllegalStateException("No instances!");
    }
}
