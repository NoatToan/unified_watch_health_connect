package q03;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f142050a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    public static final class a implements s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f142051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f142052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Thread f142053c;

        public a(Runnable runnable, b bVar) {
            this.f142051a = runnable;
            this.f142052b = bVar;
        }

        @Override // s03.b
        public final boolean b() {
            return this.f142052b.b();
        }

        @Override // s03.b
        public final void dispose() {
            if (this.f142053c == Thread.currentThread()) {
                b bVar = this.f142052b;
                if (bVar instanceof g13.e) {
                    g13.e eVar = (g13.e) bVar;
                    if (eVar.f74979b) {
                        return;
                    }
                    eVar.f74979b = true;
                    eVar.f74978a.shutdown();
                    return;
                }
            }
            this.f142052b.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f142053c = Thread.currentThread();
            try {
                this.f142051a.run();
            } finally {
                dispose();
                this.f142053c = null;
            }
        }
    }

    public static abstract class b implements s03.b {
        public static long a() {
            return !q.f142050a ? System.currentTimeMillis() : System.nanoTime() / 1000000;
        }

        public abstract s03.b c(Runnable runnable, long j8, TimeUnit timeUnit);

        public void d(d13.p.a aVar) {
            c(aVar, 0L, TimeUnit.NANOSECONDS);
        }
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract b a();

    public s03.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public s03.b c(Runnable runnable, long j8, TimeUnit timeUnit) {
        b bVarA = a();
        int i14 = w03.b.f181178a;
        a aVar = new a(runnable, bVarA);
        bVarA.c(aVar, j8, timeUnit);
        return aVar;
    }
}
