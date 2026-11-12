package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class svo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f34042b = System.currentTimeMillis();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final svo f34043a = new svo(1);
    }

    public svo(long j) {
        this.f34041a = j;
        g();
    }

    public static /* synthetic */ Thread d(Runnable runnable) {
        Thread thread = new Thread(runnable, "System Clock");
        thread.setDaemon(true);
        return thread;
    }

    public static long f() {
        return a.f34043a.c();
    }

    public final long c() {
        return this.f34042b;
    }

    public final /* synthetic */ void e() {
        this.f34042b = System.currentTimeMillis();
    }

    public final void g() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: qvo
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return svo.d(runnable);
            }
        });
        Runnable runnable = new Runnable() { // from class: rvo
            @Override // java.lang.Runnable
            public final void run() {
                this.f32952a.e();
            }
        };
        long j = this.f34041a;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS);
    }
}
