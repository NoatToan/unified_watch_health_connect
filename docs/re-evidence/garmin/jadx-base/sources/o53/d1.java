package o53;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo53/d1;", "Lo53/c1;", "Lo53/k0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 extends c1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f129329a;

    public d1(Executor executor) {
        Method method;
        this.f129329a = executor;
        Method method2 = u53.a.f168715a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = u53.a.f168715a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // o53.k0
    public final void C(long j8, k kVar) {
        Executor executor = this.f129329a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            b2 b2Var = new b2(this, kVar);
            t13.g gVar = kVar.f129362e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(b2Var, j8, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                g8.i.p(gVar, gl1.d.a("The task was rejected", e4));
            }
        }
        if (scheduledFutureSchedule != null) {
            kVar.t(new h(scheduledFutureSchedule));
        } else {
            g0.f129339h.C(j8, kVar);
        }
    }

    @Override // o53.c1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f129329a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        try {
            this.f129329a.execute(runnable);
        } catch (RejectedExecutionException e4) {
            g8.i.p(gVar, gl1.d.a("The task was rejected", e4));
            x53.c cVar = s0.f129406a;
            x53.b.f189152a.dispatch(gVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d1) && ((d1) obj).f129329a == this.f129329a;
    }

    @Override // o53.c1
    /* JADX INFO: renamed from: getExecutor, reason: from getter */
    public final Executor getF129329a() {
        return this.f129329a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f129329a);
    }

    @Override // o53.k0
    public final u0 j(long j8, Runnable runnable, t13.g gVar) {
        Executor executor = this.f129329a;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j8, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e4) {
                g8.i.p(gVar, gl1.d.a("The task was rejected", e4));
            }
        }
        return scheduledFutureSchedule != null ? new t0(scheduledFutureSchedule) : g0.f129339h.j(j8, runnable, gVar);
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        return this.f129329a.toString();
    }
}
