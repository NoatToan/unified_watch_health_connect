package g13;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f74958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f74959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f74960e = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1513c f74961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f74962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f74963h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<a> f74964b;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f74965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentLinkedQueue<C1513c> f74966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s03.a f74967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ScheduledExecutorService f74968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledFuture f74969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ThreadFactory f74970f;

        public a(long j8, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j8) : 0L;
            this.f74965a = nanos;
            this.f74966b = new ConcurrentLinkedQueue<>();
            this.f74967c = new s03.a();
            this.f74970f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, c.f74959d);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f74968d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f74969e = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<C1513c> concurrentLinkedQueue = this.f74966b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (C1513c c1513c : concurrentLinkedQueue) {
                if (c1513c.f74975c > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(c1513c)) {
                    this.f74967c.c(c1513c);
                }
            }
        }
    }

    public static final class b extends q.b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f74972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1513c f74973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f74974d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s03.a f74971a = new s03.a();

        public b(a aVar) {
            C1513c c1513c;
            C1513c c1513c2;
            this.f74972b = aVar;
            if (aVar.f74967c.f155449b) {
                c1513c2 = c.f74961f;
            } else {
                do {
                    if (aVar.f74966b.isEmpty()) {
                        c1513c = new C1513c(aVar.f74970f);
                        aVar.f74967c.a(c1513c);
                        break;
                    }
                    c1513c = aVar.f74966b.poll();
                } while (c1513c == null);
                c1513c2 = c1513c;
            }
            this.f74973c = c1513c2;
        }

        @Override // s03.b
        public final boolean b() {
            return this.f74974d.get();
        }

        @Override // q03.q.b
        public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
            return this.f74971a.f155449b ? v03.d.INSTANCE : this.f74973c.e(runnable, j8, timeUnit, this.f74971a);
        }

        @Override // s03.b
        public final void dispose() {
            if (this.f74974d.compareAndSet(false, true)) {
                this.f74971a.dispose();
                if (c.f74962g) {
                    this.f74973c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                    return;
                }
                a aVar = this.f74972b;
                aVar.getClass();
                long jNanoTime = System.nanoTime() + aVar.f74965a;
                C1513c c1513c = this.f74973c;
                c1513c.f74975c = jNanoTime;
                aVar.f74966b.offer(c1513c);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = this.f74972b;
            aVar.getClass();
            long jNanoTime = System.nanoTime() + aVar.f74965a;
            C1513c c1513c = this.f74973c;
            c1513c.f74975c = jNanoTime;
            aVar.f74966b.offer(c1513c);
        }
    }

    /* JADX INFO: renamed from: g13.c$c, reason: collision with other inner class name */
    public static final class C1513c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f74975c;

        public C1513c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f74975c = 0L;
        }
    }

    static {
        C1513c c1513c = new C1513c(new f("RxCachedThreadSchedulerShutdown"));
        f74961f = c1513c;
        c1513c.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f fVar = new f("RxCachedThreadScheduler", iMax);
        f74958c = fVar;
        f74959d = new f("RxCachedWorkerPoolEvictor", iMax);
        f74962g = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, fVar);
        f74963h = aVar;
        aVar.f74967c.dispose();
        ScheduledFuture scheduledFuture = aVar.f74969e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f74968d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public c(ThreadFactory threadFactory) {
        a aVar = f74963h;
        AtomicReference<a> atomicReference = new AtomicReference<>(aVar);
        this.f74964b = atomicReference;
        a aVar2 = new a(f74960e, TimeUnit.SECONDS, threadFactory);
        while (!atomicReference.compareAndSet(aVar, aVar2)) {
            if (atomicReference.get() != aVar) {
                aVar2.f74967c.dispose();
                ScheduledFuture scheduledFuture = aVar2.f74969e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = aVar2.f74968d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // q03.q
    public final q.b a() {
        return new b(this.f74964b.get());
    }

    public c() {
        this(f74958c);
    }
}
