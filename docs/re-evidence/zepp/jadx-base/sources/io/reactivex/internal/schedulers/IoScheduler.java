package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class IoScheduler extends Scheduler {
    public static final long KEEP_ALIVE_TIME_DEFAULT = 60;
    private static final String d = "RxCachedThreadScheduler";
    public static final RxThreadFactory e;
    private static final String f = "RxCachedWorkerPoolEvictor";
    public static final RxThreadFactory g;
    public static final c k;
    private static final String l = "rx2.io-priority";
    public static final a m;
    public final ThreadFactory b;
    public final AtomicReference<a> c;
    private static final TimeUnit j = TimeUnit.SECONDS;
    private static final String h = "rx2.io-keep-alive-time";
    private static final long i = Long.getLong(h, 60).longValue();

    public static final class a implements Runnable {
        private final long a;
        private final ConcurrentLinkedQueue<c> b;
        public final CompositeDisposable c;
        private final ScheduledExecutorService d;
        private final Future<?> e;
        private final ThreadFactory f;

        public a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.a = nanos;
            this.b = new ConcurrentLinkedQueue<>();
            this.c = new CompositeDisposable();
            this.f = threadFactory;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, IoScheduler.g);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.d = scheduledExecutorServiceNewScheduledThreadPool;
            this.e = scheduledFutureScheduleWithFixedDelay;
        }

        public void a() {
            if (this.b.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : this.b) {
                if (cVar.a() > jC) {
                    return;
                }
                if (this.b.remove(cVar)) {
                    this.c.remove(cVar);
                }
            }
        }

        public c b() {
            if (this.c.isDisposed()) {
                return IoScheduler.k;
            }
            while (!this.b.isEmpty()) {
                c cVarPoll = this.b.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f);
            this.c.add(cVar);
            return cVar;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(c cVar) {
            cVar.b(c() + this.a);
            this.b.offer(cVar);
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

    public static final class b extends Scheduler.Worker {
        private final a b;
        private final c c;
        public final AtomicBoolean d = new AtomicBoolean();
        private final CompositeDisposable a = new CompositeDisposable();

        public b(a aVar) {
            this.b = aVar;
            this.c = aVar.b();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.d.compareAndSet(false, true)) {
                this.a.dispose();
                this.b.d(this.c);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.d.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            return this.a.isDisposed() ? EmptyDisposable.INSTANCE : this.c.scheduleActual(runnable, j, timeUnit, this.a);
        }
    }

    public static final class c extends NewThreadWorker {
        private long c;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.c = 0L;
        }

        public long a() {
            return this.c;
        }

        public void b(long j) {
            this.c = j;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        k = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger(l, 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory(d, iMax);
        e = rxThreadFactory;
        g = new RxThreadFactory(f, iMax);
        a aVar = new a(0L, null, rxThreadFactory);
        m = aVar;
        aVar.e();
    }

    public IoScheduler() {
        this(e);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new b(this.c.get());
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        a aVar;
        a aVar2;
        do {
            aVar = this.c.get();
            aVar2 = m;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.c.compareAndSet(aVar, aVar2));
        aVar.e();
    }

    public int size() {
        return this.c.get().c.size();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        a aVar = new a(i, j, this.b);
        if (this.c.compareAndSet(m, aVar)) {
            return;
        }
        aVar.e();
    }

    public IoScheduler(ThreadFactory threadFactory) {
        this.b = threadFactory;
        this.c = new AtomicReference<>(m);
        start();
    }
}
