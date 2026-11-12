package g13;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f74992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f74993d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f74994b;

    public static final class a extends q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScheduledExecutorService f74995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s03.a f74996b = new s03.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f74997c;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f74995a = scheduledExecutorService;
        }

        @Override // s03.b
        public final boolean b() {
            return this.f74997c;
        }

        @Override // q03.q.b
        public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
            if (this.f74997c) {
                return v03.d.INSTANCE;
            }
            int i14 = w03.b.f181178a;
            h hVar = new h(runnable, this.f74996b);
            this.f74996b.a(hVar);
            ScheduledExecutorService scheduledExecutorService = this.f74995a;
            try {
                hVar.a(j8 <= 0 ? scheduledExecutorService.submit((Callable) hVar) : scheduledExecutorService.schedule((Callable) hVar, j8, timeUnit));
                return hVar;
            } catch (RejectedExecutionException e4) {
                dispose();
                k13.a.b(e4);
                return v03.d.INSTANCE;
            }
        }

        @Override // s03.b
        public final void dispose() {
            if (this.f74997c) {
                return;
            }
            this.f74997c = true;
            this.f74996b.dispose();
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f74993d = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f74992c = new f("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public j(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f74994b = atomicReference;
        boolean z14 = i.f74988a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (i.f74988a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            i.f74991d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // q03.q
    public final q.b a() {
        return new a(this.f74994b.get());
    }

    @Override // q03.q
    public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        int i14 = w03.b.f181178a;
        g gVar = new g(runnable);
        AtomicReference<ScheduledExecutorService> atomicReference = this.f74994b;
        try {
            gVar.a(j8 <= 0 ? atomicReference.get().submit(gVar) : atomicReference.get().schedule(gVar, j8, timeUnit));
            return gVar;
        } catch (RejectedExecutionException e4) {
            k13.a.b(e4);
            return v03.d.INSTANCE;
        }
    }

    public j() {
        this(f74992c);
    }
}
