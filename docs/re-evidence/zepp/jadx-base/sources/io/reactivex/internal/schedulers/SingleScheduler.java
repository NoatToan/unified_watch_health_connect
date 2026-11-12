package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleScheduler extends Scheduler {
    private static final String d = "rx2.single-priority";
    private static final String e = "RxSingleScheduler";
    public static final RxThreadFactory f;
    public static final ScheduledExecutorService g;
    public final ThreadFactory b;
    public final AtomicReference<ScheduledExecutorService> c;

    public static final class a extends Scheduler.Worker {
        public final ScheduledExecutorService a;
        public final CompositeDisposable b = new CompositeDisposable();
        public volatile boolean c;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.a = scheduledExecutorService;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.c;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), this.b);
            this.b.add(scheduledRunnable);
            try {
                scheduledRunnable.setFuture(j <= 0 ? this.a.submit((Callable) scheduledRunnable) : this.a.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        g = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f = new RxThreadFactory(e, Math.max(1, Math.min(10, Integer.getInteger(d, 5).intValue())), true);
    }

    public SingleScheduler() {
        this(f);
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        return SchedulerPoolFactory.create(threadFactory);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new a(this.c.get());
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        try {
            scheduledDirectTask.setFuture(j <= 0 ? this.c.get().submit(scheduledDirectTask) : this.c.get().schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onError(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j2 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableOnSchedule);
            try {
                scheduledDirectPeriodicTask.setFuture(this.c.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e2) {
                RxJavaPlugins.onError(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.c.get();
        c cVar = new c(runnableOnSchedule, scheduledExecutorService);
        try {
            cVar.b(j <= 0 ? scheduledExecutorService.submit(cVar) : scheduledExecutorService.schedule(cVar, j, timeUnit));
            return cVar;
        } catch (RejectedExecutionException e3) {
            RxJavaPlugins.onError(e3);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.c.get();
        ScheduledExecutorService scheduledExecutorService2 = g;
        if (scheduledExecutorService == scheduledExecutorService2 || (andSet = this.c.getAndSet(scheduledExecutorService2)) == scheduledExecutorService2) {
            return;
        }
        andSet.shutdownNow();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceA = null;
        do {
            scheduledExecutorService = this.c.get();
            if (scheduledExecutorService != g) {
                if (scheduledExecutorServiceA != null) {
                    scheduledExecutorServiceA.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceA == null) {
                scheduledExecutorServiceA = a(this.b);
            }
        } while (!this.c.compareAndSet(scheduledExecutorService, scheduledExecutorServiceA));
    }

    public SingleScheduler(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.c = atomicReference;
        this.b = threadFactory;
        atomicReference.lazySet(a(threadFactory));
    }
}
