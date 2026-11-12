package q83;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import v83.s;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService[] f143404b = new ScheduledExecutorService[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f143405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f143406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f143407e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService[]> f143408a = new AtomicReference<>(f143404b);

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f143405c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f143406d = new e();
    }

    private e() {
        start();
    }

    @Override // q83.k
    public final void shutdown() {
        while (true) {
            AtomicReference<ScheduledExecutorService[]> atomicReference = this.f143408a;
            ScheduledExecutorService[] scheduledExecutorServiceArr = atomicReference.get();
            ScheduledExecutorService[] scheduledExecutorServiceArr2 = f143404b;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
            do {
                if (atomicReference.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2)) {
                    for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
                        i.f143416e.remove(scheduledExecutorService);
                        scheduledExecutorService.shutdownNow();
                    }
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorServiceArr);
        }
    }

    @Override // q83.k
    public final void start() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        if (iAvailableProcessors > 4) {
            iAvailableProcessors /= 2;
        }
        if (iAvailableProcessors > 8) {
            iAvailableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[iAvailableProcessors];
        int i14 = 0;
        for (int i15 = 0; i15 < iAvailableProcessors; i15++) {
            s83.d dVar = f.f143409a;
            v83.j jVar = s.f176256a;
            scheduledExecutorServiceArr[i15] = Executors.newScheduledThreadPool(1, f.f143409a);
        }
        AtomicReference<ScheduledExecutorService[]> atomicReference = this.f143408a;
        ScheduledExecutorService[] scheduledExecutorServiceArr2 = f143404b;
        while (!atomicReference.compareAndSet(scheduledExecutorServiceArr2, scheduledExecutorServiceArr)) {
            if (atomicReference.get() != scheduledExecutorServiceArr2) {
                while (i14 < iAvailableProcessors) {
                    scheduledExecutorServiceArr[i14].shutdownNow();
                    i14++;
                }
                return;
            }
        }
        while (i14 < iAvailableProcessors) {
            ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i14];
            if (!i.h(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                i.c((ScheduledThreadPoolExecutor) scheduledExecutorService);
            }
            i14++;
        }
    }
}
