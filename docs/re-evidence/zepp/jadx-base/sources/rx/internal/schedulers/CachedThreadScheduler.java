package rx.internal.schedulers;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Scheduler;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.util.RxThreadFactory;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class CachedThreadScheduler extends Scheduler implements SchedulerLifecycle {
    private static final long c;
    private static final TimeUnit d = TimeUnit.SECONDS;
    public static final c e;
    public static final a f;
    public final ThreadFactory a;
    public final AtomicReference<a> b = new AtomicReference<>(f);

    public static final class a {
        private final ThreadFactory a;
        private final long b;
        private final ConcurrentLinkedQueue<c> c;
        private final CompositeSubscription d;
        private final ScheduledExecutorService e;
        private final Future<?> f;

        /* JADX INFO: renamed from: rx.internal.schedulers.CachedThreadScheduler$a$a, reason: collision with other inner class name */
        public class ThreadFactoryC1262a implements ThreadFactory {
            public final /* synthetic */ ThreadFactory a;

            public ThreadFactoryC1262a(ThreadFactory threadFactory) {
                this.a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.a.newThread(runnable);
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
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            this.a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.b = nanos;
            this.c = new ConcurrentLinkedQueue<>();
            this.d = new CompositeSubscription();
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC1262a(threadFactory));
                NewThreadWorker.tryEnableCancelPolicy(scheduledExecutorServiceNewScheduledThreadPool);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
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
                if (cVar.c() > jC) {
                    return;
                }
                if (this.c.remove(cVar)) {
                    this.d.remove(cVar);
                }
            }
        }

        public c b() {
            if (this.d.isUnsubscribed()) {
                return CachedThreadScheduler.e;
            }
            while (!this.c.isEmpty()) {
                c cVarPoll = this.c.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.a);
            this.d.add(cVar);
            return cVar;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(c cVar) {
            cVar.d(c() + this.b);
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

    public static final class b extends Scheduler.Worker implements Action0 {
        private final a b;
        private final c c;
        private final CompositeSubscription a = new CompositeSubscription();
        public final AtomicBoolean d = new AtomicBoolean();

        public class a implements Action0 {
            public final /* synthetic */ Action0 a;

            public a(Action0 action0) {
                this.a = action0;
            }

            @Override // rx.functions.Action0
            public void call() {
                if (b.this.isUnsubscribed()) {
                    return;
                }
                this.a.call();
            }
        }

        public b(a aVar) {
            this.b = aVar;
            this.c = aVar.b();
        }

        @Override // rx.functions.Action0
        public void call() {
            this.b.d(this.c);
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return schedule(action0, 0L, null);
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (this.d.compareAndSet(false, true)) {
                this.c.schedule(this);
            }
            this.a.unsubscribe();
        }

        @Override // rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (this.a.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            ScheduledAction scheduledActionScheduleActual = this.c.scheduleActual(new a(action0), j, timeUnit);
            this.a.add(scheduledActionScheduleActual);
            scheduledActionScheduleActual.addParent(this.a);
            return scheduledActionScheduleActual;
        }
    }

    public static final class c extends NewThreadWorker {
        private long k;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.k = 0L;
        }

        public long c() {
            return this.k;
        }

        public void d(long j) {
            this.k = j;
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

    public CachedThreadScheduler(ThreadFactory threadFactory) {
        this.a = threadFactory;
        start();
    }

    @Override // rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new b(this.b.get());
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        a aVar;
        a aVar2;
        do {
            aVar = this.b.get();
            aVar2 = f;
            if (aVar == aVar2) {
                return;
            }
        } while (!this.b.compareAndSet(aVar, aVar2));
        aVar.e();
    }

    @Override // rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        a aVar = new a(this.a, c, d);
        if (this.b.compareAndSet(f, aVar)) {
            return;
        }
        aVar.e();
    }
}
