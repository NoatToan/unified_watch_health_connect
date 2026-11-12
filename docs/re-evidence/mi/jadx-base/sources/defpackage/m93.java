package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class m93 extends ifl implements kfl {
    public static final long c;
    public static final TimeUnit d = TimeUnit.SECONDS;
    public static final c e;
    public static final a f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f25897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<a> f25898b = new AtomicReference<>(f);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadFactory f25899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25900b;
        public final ConcurrentLinkedQueue<c> c;
        public final sa4 d;
        public final ScheduledExecutorService e;
        public final Future<?> f;

        /* JADX INFO: renamed from: m93$a$a, reason: collision with other inner class name */
        public class ThreadFactoryC1015a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ThreadFactory f25901a;

            public ThreadFactoryC1015a(ThreadFactory threadFactory) {
                this.f25901a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.f25901a.newThread(runnable);
                threadNewThread.setName(threadNewThread.getName() + " (Evictor)");
                return threadNewThread;
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a();
            }
        }

        public a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            this.f25899a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f25900b = nanos;
            this.c = new ConcurrentLinkedQueue<>();
            this.d = new sa4();
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC1015a(threadFactory));
                mlg.i(scheduledExecutorServiceNewScheduledThreadPool);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f = scheduledFutureScheduleWithFixedDelay;
        }

        public void a() {
            if (this.c.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : this.c) {
                if (cVar.j() > jC) {
                    return;
                }
                if (this.c.remove(cVar)) {
                    this.d.b(cVar);
                }
            }
        }

        public c b() {
            if (this.d.isUnsubscribed()) {
                return m93.e;
            }
            while (!this.c.isEmpty()) {
                c cVarPoll = this.c.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f25899a);
            this.d.a(cVar);
            return cVar;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(c cVar) {
            cVar.k(c() + this.f25900b);
            this.c.offer(cVar);
        }

        public void e() {
            try {
                Future<?> future = this.f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                this.d.unsubscribe();
            }
        }
    }

    public static final class b extends ifl.a implements sc0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f25905b;
        public final c c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sa4 f25904a = new sa4();
        public final AtomicBoolean d = new AtomicBoolean();

        public class a implements sc0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ sc0 f25906a;

            public a(sc0 sc0Var) {
                this.f25906a = sc0Var;
            }

            @Override // defpackage.sc0
            public void call() {
                if (b.this.isUnsubscribed()) {
                    return;
                }
                this.f25906a.call();
            }
        }

        public b(a aVar) {
            this.f25905b = aVar;
            this.c = aVar.b();
        }

        @Override // ifl.a
        public koo a(sc0 sc0Var) {
            return b(sc0Var, 0L, null);
        }

        public koo b(sc0 sc0Var, long j, TimeUnit timeUnit) {
            if (this.f25904a.isUnsubscribed()) {
                return noo.b();
            }
            ScheduledAction scheduledActionG = this.c.g(new a(sc0Var), j, timeUnit);
            this.f25904a.a(scheduledActionG);
            scheduledActionG.addParent(this.f25904a);
            return scheduledActionG;
        }

        @Override // defpackage.sc0
        public void call() {
            this.f25905b.d(this.c);
        }

        @Override // defpackage.koo
        public boolean isUnsubscribed() {
            return this.f25904a.isUnsubscribed();
        }

        @Override // defpackage.koo
        public void unsubscribe() {
            if (this.d.compareAndSet(false, true)) {
                this.c.a(this);
            }
            this.f25904a.unsubscribe();
        }
    }

    public static final class c extends mlg {
        public long i;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.i = 0L;
        }

        public long j() {
            return this.i;
        }

        public void k(long j) {
            this.i = j;
        }
    }

    static {
        c cVar = new c(RxThreadFactory.NONE);
        e = cVar;
        cVar.unsubscribe();
        a aVar = new a(null, 0L, null);
        f = aVar;
        aVar.e();
        c = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public m93(ThreadFactory threadFactory) {
        this.f25897a = threadFactory;
        c();
    }

    @Override // defpackage.ifl
    public ifl.a a() {
        return new b(this.f25898b.get());
    }

    public void c() {
        a aVar = new a(this.f25897a, c, d);
        if (d8i.a(this.f25898b, f, aVar)) {
            return;
        }
        aVar.e();
    }

    @Override // defpackage.kfl
    public void shutdown() {
        a aVar;
        a aVar2;
        do {
            aVar = this.f25898b.get();
            aVar2 = f;
            if (aVar == aVar2) {
                return;
            }
        } while (!d8i.a(this.f25898b, aVar, aVar2));
        aVar.e();
    }
}
