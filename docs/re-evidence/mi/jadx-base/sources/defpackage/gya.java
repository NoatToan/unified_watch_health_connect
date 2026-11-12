package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class gya implements kfl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService[] f19459b = new ScheduledExecutorService[0];
    public static final ScheduledExecutorService c;
    public static final gya d;
    public static int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService[]> f19460a = new AtomicReference<>(f19459b);

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        d = new gya();
    }

    public gya() {
        b();
    }

    public static ScheduledExecutorService a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = d.f19460a.get();
        if (scheduledExecutorServiceArr == f19459b) {
            return c;
        }
        int i = e + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        e = i;
        return scheduledExecutorServiceArr[i];
    }

    public void b() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors > 4) {
            iAvailableProcessors /= 2;
        }
        if (iAvailableProcessors > 8) {
            iAvailableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[iAvailableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < iAvailableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = hya.a();
        }
        if (!d8i.a(this.f19460a, f19459b, scheduledExecutorServiceArr)) {
            while (i < iAvailableProcessors) {
                scheduledExecutorServiceArr[i].shutdownNow();
                i++;
            }
        } else {
            while (i < iAvailableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!mlg.i(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    mlg.e((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
        }
    }

    @Override // defpackage.kfl
    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f19460a.get();
            scheduledExecutorServiceArr2 = f19459b;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!d8i.a(this.f19460a, scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            mlg.b(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }
}
