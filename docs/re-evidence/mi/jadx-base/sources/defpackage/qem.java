package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qem extends hfl {
    public static final RxThreadFactory e;
    public static final ScheduledExecutorService f;
    public final ThreadFactory c;
    public final AtomicReference<ScheduledExecutorService> d;

    public static final class a extends hfl.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScheduledExecutorService f31443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final na4 f31444b = new na4();
        public volatile boolean c;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f31443a = scheduledExecutorService;
        }

        @Override // hfl.c
        public jz6 c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.c) {
                return EmptyDisposable.INSTANCE;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(t5l.r(runnable), this.f31444b);
            this.f31444b.a(scheduledRunnable);
            try {
                scheduledRunnable.setFuture(j <= 0 ? this.f31443a.submit((Callable) scheduledRunnable) : this.f31443a.schedule((Callable) scheduledRunnable, j, timeUnit));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                t5l.p(e);
                return EmptyDisposable.INSTANCE;
            }
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.f31444b.dispose();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.c;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        e = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public qem() {
        this(e);
    }

    public static ScheduledExecutorService f(ThreadFactory threadFactory) {
        return lfl.a(threadFactory);
    }

    @Override // defpackage.hfl
    public hfl.c b() {
        return new a(this.d.get());
    }

    @Override // defpackage.hfl
    public jz6 d(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(t5l.r(runnable));
        try {
            scheduledDirectTask.setFuture(j <= 0 ? this.d.get().submit(scheduledDirectTask) : this.d.get().schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e2) {
            t5l.p(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    @Override // defpackage.hfl
    public jz6 e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableR = t5l.r(runnable);
        if (j2 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableR);
            try {
                scheduledDirectPeriodicTask.setFuture(this.d.get().scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e2) {
                t5l.p(e2);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.d.get();
        bcd bcdVar = new bcd(runnableR, scheduledExecutorService);
        try {
            bcdVar.b(j <= 0 ? scheduledExecutorService.submit(bcdVar) : scheduledExecutorService.schedule(bcdVar, j, timeUnit));
            return bcdVar;
        } catch (RejectedExecutionException e3) {
            t5l.p(e3);
            return EmptyDisposable.INSTANCE;
        }
    }

    public qem(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.d = atomicReference;
        this.c = threadFactory;
        atomicReference.lazySet(f(threadFactory));
    }
}
