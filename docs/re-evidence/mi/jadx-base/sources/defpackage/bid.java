package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class bid extends hfl {
    public static final RxThreadFactory e;
    public static final RxThreadFactory f;
    public static final c i;
    public static boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f4245k;
    public final ThreadFactory c;
    public final AtomicReference<a> d;
    public static final TimeUnit h = TimeUnit.SECONDS;
    public static final long g = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f4247b;
        public final na4 c;
        public final ScheduledExecutorService d;
        public final Future<?> e;
        public final ThreadFactory f;

        public a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f4246a = nanos;
            this.f4247b = new ConcurrentLinkedQueue<>();
            this.c = new na4();
            this.f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, bid.f);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.d = scheduledExecutorServiceNewScheduledThreadPool;
            this.e = scheduledFutureScheduleWithFixedDelay;
        }

        public void a() {
            if (this.f4247b.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : this.f4247b) {
                if (cVar.i() > jC) {
                    return;
                }
                if (this.f4247b.remove(cVar)) {
                    this.c.b(cVar);
                }
            }
        }

        public c b() {
            if (this.c.isDisposed()) {
                return bid.i;
            }
            while (!this.f4247b.isEmpty()) {
                c cVarPoll = this.f4247b.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f);
            this.c.a(cVar);
            return cVar;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(c cVar) {
            cVar.j(c() + this.f4246a);
            this.f4247b.offer(cVar);
        }

        public void e() {
            this.c.dispose();
            Future<?> future = this.e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    public static final class b extends hfl.c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f4249b;
        public final c c;
        public final AtomicBoolean d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final na4 f4248a = new na4();

        public b(a aVar) {
            this.f4249b = aVar;
            this.c = aVar.b();
        }

        @Override // hfl.c
        public jz6 c(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f4248a.isDisposed() ? EmptyDisposable.INSTANCE : this.c.e(runnable, j, timeUnit, this.f4248a);
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (this.d.compareAndSet(false, true)) {
                this.f4248a.dispose();
                if (bid.j) {
                    this.c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f4249b.d(this.c);
                }
            }
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4249b.d(this.c);
        }
    }

    public static final class c extends nlg {
        public long c;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.c = 0L;
        }

        public long i() {
            return this.c;
        }

        public void j(long j) {
            this.c = j;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        i = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        e = rxThreadFactory;
        f = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        j = Boolean.getBoolean("rx2.io-scheduled-release");
        a aVar = new a(0L, null, rxThreadFactory);
        f4245k = aVar;
        aVar.e();
    }

    public bid() {
        this(e);
    }

    @Override // defpackage.hfl
    public hfl.c b() {
        return new b(this.d.get());
    }

    public void f() {
        a aVar = new a(g, h, this.c);
        if (d8i.a(this.d, f4245k, aVar)) {
            return;
        }
        aVar.e();
    }

    public bid(ThreadFactory threadFactory) {
        this.c = threadFactory;
        this.d = new AtomicReference<>(f4245k);
        f();
    }
}
