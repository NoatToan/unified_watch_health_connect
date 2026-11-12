package g13;

import d13.p;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1512b f74945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f74946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f74947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f74948f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<C1512b> f74949b;

    public static final class a extends q.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v03.e f74950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s03.a f74951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v03.e f74952c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f74953d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f74954e;

        public a(c cVar) {
            this.f74953d = cVar;
            v03.e eVar = new v03.e();
            this.f74950a = eVar;
            s03.a aVar = new s03.a();
            this.f74951b = aVar;
            v03.e eVar2 = new v03.e();
            this.f74952c = eVar2;
            eVar2.a(eVar);
            eVar2.a(aVar);
        }

        @Override // s03.b
        public final boolean b() {
            return this.f74954e;
        }

        @Override // q03.q.b
        public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
            return this.f74954e ? v03.d.INSTANCE : this.f74953d.e(runnable, j8, timeUnit, this.f74951b);
        }

        @Override // q03.q.b
        public final void d(p.a aVar) {
            if (this.f74954e) {
                v03.d dVar = v03.d.INSTANCE;
            } else {
                this.f74953d.e(aVar, 0L, TimeUnit.MILLISECONDS, this.f74950a);
            }
        }

        @Override // s03.b
        public final void dispose() {
            if (this.f74954e) {
                return;
            }
            this.f74954e = true;
            this.f74952c.dispose();
        }
    }

    /* JADX INFO: renamed from: g13.b$b, reason: collision with other inner class name */
    public static final class C1512b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f74955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f74956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f74957c;

        public C1512b(int i14, ThreadFactory threadFactory) {
            this.f74955a = i14;
            this.f74956b = new c[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                this.f74956b[i15] = new c(threadFactory);
            }
        }
    }

    public static final class c extends e {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f74947e = iAvailableProcessors;
        c cVar = new c(new f("RxComputationShutdown"));
        f74948f = cVar;
        cVar.dispose();
        f fVar = new f("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f74946d = fVar;
        C1512b c1512b = new C1512b(0, fVar);
        f74945c = c1512b;
        for (c cVar2 : c1512b.f74956b) {
            cVar2.dispose();
        }
    }

    public b(ThreadFactory threadFactory) {
        C1512b c1512b = f74945c;
        AtomicReference<C1512b> atomicReference = new AtomicReference<>(c1512b);
        this.f74949b = atomicReference;
        C1512b c1512b2 = new C1512b(f74947e, threadFactory);
        while (!atomicReference.compareAndSet(c1512b, c1512b2)) {
            if (atomicReference.get() != c1512b) {
                for (c cVar : c1512b2.f74956b) {
                    cVar.dispose();
                }
                return;
            }
        }
    }

    @Override // q03.q
    public final q.b a() {
        c cVar;
        C1512b c1512b = this.f74949b.get();
        int i14 = c1512b.f74955a;
        if (i14 == 0) {
            cVar = f74948f;
        } else {
            c[] cVarArr = c1512b.f74956b;
            long j8 = c1512b.f74957c;
            c1512b.f74957c = 1 + j8;
            cVar = cVarArr[(int) (j8 % ((long) i14))];
        }
        return new a(cVar);
    }

    @Override // q03.q
    public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        c cVar;
        C1512b c1512b = this.f74949b.get();
        int i14 = c1512b.f74955a;
        if (i14 == 0) {
            cVar = f74948f;
        } else {
            c[] cVarArr = c1512b.f74956b;
            long j14 = c1512b.f74957c;
            c1512b.f74957c = 1 + j14;
            cVar = cVarArr[(int) (j14 % ((long) i14))];
        }
        cVar.getClass();
        int i15 = w03.b.f181178a;
        g gVar = new g(runnable);
        ScheduledExecutorService scheduledExecutorService = cVar.f74978a;
        try {
            gVar.a(j8 <= 0 ? scheduledExecutorService.submit(gVar) : scheduledExecutorService.schedule(gVar, j8, timeUnit));
            return gVar;
        } catch (RejectedExecutionException e4) {
            k13.a.b(e4);
            return v03.d.INSTANCE;
        }
    }

    public b() {
        this(f74946d);
    }
}
