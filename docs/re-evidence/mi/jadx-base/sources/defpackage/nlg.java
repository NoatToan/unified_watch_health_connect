package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask;
import io.reactivex.internal.schedulers.ScheduledDirectTask;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class nlg extends hfl.c implements jz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f28041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f28042b;

    public nlg(ThreadFactory threadFactory) {
        this.f28041a = lfl.a(threadFactory);
    }

    @Override // hfl.c
    public jz6 b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // hfl.c
    public jz6 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f28042b ? EmptyDisposable.INSTANCE : e(runnable, j, timeUnit, null);
    }

    @Override // defpackage.jz6
    public void dispose() {
        if (this.f28042b) {
            return;
        }
        this.f28042b = true;
        this.f28041a.shutdownNow();
    }

    public ScheduledRunnable e(Runnable runnable, long j, TimeUnit timeUnit, kz6 kz6Var) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(t5l.r(runnable), kz6Var);
        if (kz6Var != null && !kz6Var.a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.setFuture(j <= 0 ? this.f28041a.submit((Callable) scheduledRunnable) : this.f28041a.schedule((Callable) scheduledRunnable, j, timeUnit));
        } catch (RejectedExecutionException e) {
            if (kz6Var != null) {
                kz6Var.b(scheduledRunnable);
            }
            t5l.p(e);
        }
        return scheduledRunnable;
    }

    public jz6 f(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(t5l.r(runnable));
        try {
            scheduledDirectTask.setFuture(j <= 0 ? this.f28041a.submit(scheduledDirectTask) : this.f28041a.schedule(scheduledDirectTask, j, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            t5l.p(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public jz6 g(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableR = t5l.r(runnable);
        if (j2 <= 0) {
            bcd bcdVar = new bcd(runnableR, this.f28041a);
            try {
                bcdVar.b(j <= 0 ? this.f28041a.submit(bcdVar) : this.f28041a.schedule(bcdVar, j, timeUnit));
                return bcdVar;
            } catch (RejectedExecutionException e) {
                t5l.p(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableR);
        try {
            scheduledDirectPeriodicTask.setFuture(this.f28041a.scheduleAtFixedRate(scheduledDirectPeriodicTask, j, j2, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e2) {
            t5l.p(e2);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void h() {
        if (this.f28042b) {
            return;
        }
        this.f28042b = true;
        this.f28041a.shutdown();
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.f28042b;
    }
}
