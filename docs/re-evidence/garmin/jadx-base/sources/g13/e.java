package g13;

import d13.p;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public class e extends q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f74978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f74979b;

    public e(ThreadFactory threadFactory) {
        boolean z14 = i.f74988a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (i.f74988a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            i.f74991d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f74978a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // s03.b
    public final boolean b() {
        return this.f74979b;
    }

    @Override // q03.q.b
    public final s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        return this.f74979b ? v03.d.INSTANCE : e(runnable, j8, timeUnit, null);
    }

    @Override // q03.q.b
    public final void d(p.a aVar) {
        c(aVar, 0L, null);
    }

    @Override // s03.b
    public final void dispose() {
        if (this.f74979b) {
            return;
        }
        this.f74979b = true;
        this.f74978a.shutdownNow();
    }

    public final h e(Runnable runnable, long j8, TimeUnit timeUnit, v03.b bVar) {
        int i14 = w03.b.f181178a;
        h hVar = new h(runnable, bVar);
        if (bVar != null && !bVar.a(hVar)) {
            return hVar;
        }
        ScheduledExecutorService scheduledExecutorService = this.f74978a;
        try {
            hVar.a(j8 <= 0 ? scheduledExecutorService.submit((Callable) hVar) : scheduledExecutorService.schedule((Callable) hVar, j8, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e4) {
            if (bVar != null) {
                bVar.c(hVar);
            }
            k13.a.b(e4);
            return hVar;
        }
    }
}
