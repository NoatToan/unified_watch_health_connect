package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zf8 extends hfl {
    public static final hfl e = ofl.d();
    public final boolean c;
    public final Executor d;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f41212a;

        public a(b bVar) {
            this.f41212a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f41212a;
            bVar.f41215b.replace(zf8.this.c(bVar));
        }
    }

    public static final class b extends AtomicReference<Runnable> implements Runnable, jz6 {
        private static final long serialVersionUID = -4101336210206799084L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SequentialDisposable f41214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SequentialDisposable f41215b;

        public b(Runnable runnable) {
            super(runnable);
            this.f41214a = new SequentialDisposable();
            this.f41215b = new SequentialDisposable();
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f41214a.dispose();
                this.f41215b.dispose();
            }
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    this.f41214a.lazySet(DisposableHelper.DISPOSED);
                    SequentialDisposable sequentialDisposable = this.f41215b;
                } finally {
                    lazySet(null);
                    this.f41214a.lazySet(DisposableHelper.DISPOSED);
                    this.f41215b.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }
    }

    public static final class c extends hfl.c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f41216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f41217b;
        public volatile boolean d;
        public final AtomicInteger e = new AtomicInteger();
        public final na4 f = new na4();
        public final k9g<Runnable> c = new k9g<>();

        public static final class a extends AtomicBoolean implements Runnable, jz6 {
            private static final long serialVersionUID = -2421395018820541164L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Runnable f41218a;

            public a(Runnable runnable) {
                this.f41218a = runnable;
            }

            @Override // defpackage.jz6
            public void dispose() {
                lazySet(true);
            }

            @Override // defpackage.jz6
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f41218a.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        public static final class b extends AtomicInteger implements Runnable, jz6 {
            private static final long serialVersionUID = -3603436687413320876L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Runnable f41219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final kz6 f41220b;
            public volatile Thread c;

            public b(Runnable runnable, kz6 kz6Var) {
                this.f41219a = runnable;
                this.f41220b = kz6Var;
            }

            public void a() {
                kz6 kz6Var = this.f41220b;
                if (kz6Var != null) {
                    kz6Var.c(this);
                }
            }

            @Override // defpackage.jz6
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.c;
                        if (thread != null) {
                            thread.interrupt();
                            this.c = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            @Override // defpackage.jz6
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.c = null;
                        return;
                    }
                    try {
                        this.f41219a.run();
                        this.c = null;
                        if (compareAndSet(1, 2)) {
                        }
                    } finally {
                        this.c = null;
                        if (compareAndSet(1, 2)) {
                            a();
                        } else {
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: zf8$c$c, reason: collision with other inner class name */
        public final class RunnableC1168c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SequentialDisposable f41221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Runnable f41222b;

            public RunnableC1168c(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.f41221a = sequentialDisposable;
                this.f41222b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f41221a.replace(c.this.b(this.f41222b));
            }
        }

        public c(Executor executor, boolean z) {
            this.f41217b = executor;
            this.f41216a = z;
        }

        @Override // hfl.c
        public jz6 b(Runnable runnable) {
            jz6 aVar;
            if (this.d) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable runnableR = t5l.r(runnable);
            if (this.f41216a) {
                aVar = new b(runnableR, this.f);
                this.f.a(aVar);
            } else {
                aVar = new a(runnableR);
            }
            this.c.offer(aVar);
            if (this.e.getAndIncrement() == 0) {
                try {
                    this.f41217b.execute(this);
                } catch (RejectedExecutionException e) {
                    this.d = true;
                    this.c.clear();
                    t5l.p(e);
                    return EmptyDisposable.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // hfl.c
        public jz6 c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return b(runnable);
            }
            if (this.d) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new RunnableC1168c(sequentialDisposable2, t5l.r(runnable)), this.f);
            this.f.a(scheduledRunnable);
            Executor executor = this.f41217b;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.d = true;
                    t5l.p(e);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new oz6(zf8.e.d(scheduledRunnable, j, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.f.dispose();
            if (this.e.getAndIncrement() == 0) {
                this.c.clear();
            }
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.d;
        }

        @Override // java.lang.Runnable
        public void run() {
            k9g<Runnable> k9gVar = this.c;
            int iAddAndGet = 1;
            while (!this.d) {
                while (true) {
                    Runnable runnablePoll = k9gVar.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.d) {
                        k9gVar.clear();
                        return;
                    }
                }
                if (this.d) {
                    k9gVar.clear();
                    return;
                } else {
                    iAddAndGet = this.e.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            k9gVar.clear();
        }
    }

    public zf8(Executor executor, boolean z) {
        this.d = executor;
        this.c = z;
    }

    @Override // defpackage.hfl
    public hfl.c b() {
        return new c(this.d, this.c);
    }

    @Override // defpackage.hfl
    public jz6 c(Runnable runnable) {
        Runnable runnableR = t5l.r(runnable);
        try {
            if (this.d instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableR);
                scheduledDirectTask.setFuture(((ExecutorService) this.d).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (this.c) {
                c.b bVar = new c.b(runnableR, null);
                this.d.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(runnableR);
            this.d.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e2) {
            t5l.p(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // defpackage.hfl
    public jz6 d(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableR = t5l.r(runnable);
        if (!(this.d instanceof ScheduledExecutorService)) {
            b bVar = new b(runnableR);
            bVar.f41214a.replace(e.d(new a(bVar), j, timeUnit));
            return bVar;
        }
        try {
            ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableR);
            scheduledDirectTask.setFuture(((ScheduledExecutorService) this.d).schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            t5l.p(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // defpackage.hfl
    public jz6 e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.d instanceof ScheduledExecutorService)) {
            return super.e(runnable, j, j2, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(t5l.r(runnable));
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) this.d).scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            t5l.p(e2);
            return EmptyDisposable.INSTANCE;
        }
    }
}
