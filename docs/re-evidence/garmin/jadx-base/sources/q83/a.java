package q83;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends j83.h implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f143365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f143366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2700a f143367e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f143368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<C2700a> f143369b = new AtomicReference<>(f143367e);

    /* JADX INFO: renamed from: q83.a$a, reason: collision with other inner class name */
    public static final class C2700a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadFactory f143370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f143371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f143372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y83.b f143373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f143374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ScheduledFuture f143375f;

        /* JADX INFO: renamed from: q83.a$a$a, reason: collision with other inner class name */
        public class ThreadFactoryC2701a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ThreadFactory f143376a;

            public ThreadFactoryC2701a(C2700a c2700a, ThreadFactory threadFactory) {
                this.f143376a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.f143376a.newThread(runnable);
                threadNewThread.setName(threadNewThread.getName() + " (Evictor)");
                return threadNewThread;
            }
        }

        /* JADX INFO: renamed from: q83.a$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2700a c2700a = C2700a.this;
                ConcurrentLinkedQueue<c> concurrentLinkedQueue = c2700a.f143372c;
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                }
                long jNanoTime = System.nanoTime();
                for (c cVar : concurrentLinkedQueue) {
                    if (cVar.f143382i > jNanoTime) {
                        return;
                    }
                    if (concurrentLinkedQueue.remove(cVar)) {
                        c2700a.f143373d.b(cVar);
                    }
                }
            }
        }

        public C2700a(ThreadFactory threadFactory, long j8, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            this.f143370a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j8) : 0L;
            this.f143371b = nanos;
            this.f143372c = new ConcurrentLinkedQueue<>();
            this.f143373d = new y83.b();
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC2701a(this, threadFactory));
                i.h(scheduledExecutorServiceNewScheduledThreadPool);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f143374e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f143375f = scheduledFutureScheduleWithFixedDelay;
        }

        public final void a() {
            y83.b bVar = this.f143373d;
            try {
                ScheduledFuture scheduledFuture = this.f143375f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f143374e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
            } finally {
                bVar.f();
            }
        }
    }

    public static final class b extends j83.h.a implements n83.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C2700a f143379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f143380c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y83.b f143378a = new y83.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f143381d = new AtomicBoolean();

        public b(C2700a c2700a) {
            c cVar;
            c cVar2;
            this.f143379b = c2700a;
            if (c2700a.f143373d.f195247b) {
                cVar2 = a.f143366d;
            } else {
                do {
                    if (c2700a.f143372c.isEmpty()) {
                        cVar = new c(c2700a.f143370a);
                        c2700a.f143373d.a(cVar);
                        break;
                    }
                    cVar = c2700a.f143372c.poll();
                } while (cVar == null);
                cVar2 = cVar;
            }
            this.f143380c = cVar2;
        }

        @Override // j83.h.a
        public final j83.o a(n83.a aVar) {
            if (this.f143378a.f195247b) {
                return y83.d.f195249a;
            }
            j jVarG = this.f143380c.g(new q83.b(this, aVar), 0L, null);
            this.f143378a.a(jVarG);
            jVarG.f143422a.a(new j.c(jVarG, this.f143378a));
            return jVarG;
        }

        @Override // n83.a
        public final void d() {
            C2700a c2700a = this.f143379b;
            c2700a.getClass();
            long jNanoTime = System.nanoTime() + c2700a.f143371b;
            c cVar = this.f143380c;
            cVar.f143382i = jNanoTime;
            c2700a.f143372c.offer(cVar);
        }

        @Override // j83.o
        public final boolean e() {
            return this.f143378a.f195247b;
        }

        @Override // j83.o
        public final void f() {
            if (this.f143381d.compareAndSet(false, true)) {
                this.f143380c.a(this);
            }
            this.f143378a.f();
        }
    }

    public static final class c extends i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f143382i;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f143382i = 0L;
        }
    }

    static {
        c cVar = new c(s83.d.f157958b);
        f143366d = cVar;
        cVar.f();
        C2700a c2700a = new C2700a(null, 0L, null);
        f143367e = c2700a;
        c2700a.a();
        f143365c = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public a(ThreadFactory threadFactory) {
        this.f143368a = threadFactory;
        start();
    }

    @Override // j83.h
    public final j83.h.a createWorker() {
        return new b(this.f143369b.get());
    }

    @Override // q83.k
    public final void shutdown() {
        while (true) {
            AtomicReference<C2700a> atomicReference = this.f143369b;
            C2700a c2700a = atomicReference.get();
            C2700a c2700a2 = f143367e;
            if (c2700a == c2700a2) {
                return;
            }
            do {
                if (atomicReference.compareAndSet(c2700a, c2700a2)) {
                    c2700a.a();
                    return;
                }
            } while (atomicReference.get() == c2700a);
        }
    }

    @Override // q83.k
    public final void start() {
        AtomicReference<C2700a> atomicReference;
        C2700a c2700a;
        C2700a c2700a2 = new C2700a(this.f143368a, f143365c, TimeUnit.SECONDS);
        do {
            atomicReference = this.f143369b;
            c2700a = f143367e;
            if (atomicReference.compareAndSet(c2700a, c2700a2)) {
                return;
            }
        } while (atomicReference.get() == c2700a);
        c2700a2.a();
    }
}
