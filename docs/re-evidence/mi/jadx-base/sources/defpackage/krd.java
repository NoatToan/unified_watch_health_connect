package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class krd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f24214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f24215b;
    public final int e;
    public final Runnable c = new a();
    public final Runnable d = new b();
    public o98 f = null;
    public int g = 0;
    public f h = f.IDLE;
    public long i = 0;
    public long j = 0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            krd.this.d();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            krd.this.j();
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24218a;

        static {
            int[] iArr = new int[f.values().length];
            f24218a = iArr;
            try {
                iArr[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24218a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24218a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24218a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface d {
        void a(o98 o98Var, int i);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static ScheduledExecutorService f24219a;

        public static ScheduledExecutorService a() {
            if (f24219a == null) {
                f24219a = Executors.newSingleThreadScheduledExecutor();
            }
            return f24219a;
        }
    }

    public enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public krd(Executor executor, d dVar, int i) {
        this.f24214a = executor;
        this.f24215b = dVar;
        this.e = i;
    }

    public static boolean i(o98 o98Var, int i) {
        return e52.d(i) || e52.m(i, 4) || o98.O(o98Var);
    }

    public void c() {
        o98 o98Var;
        synchronized (this) {
            o98Var = this.f;
            this.f = null;
            this.g = 0;
        }
        o98.c(o98Var);
    }

    public final void d() {
        o98 o98Var;
        int i;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            o98Var = this.f;
            i = this.g;
            this.f = null;
            this.g = 0;
            this.h = f.RUNNING;
            this.j = jUptimeMillis;
        }
        try {
            if (i(o98Var, i)) {
                this.f24215b.a(o98Var, i);
            }
        } finally {
            o98.c(o98Var);
            g();
        }
    }

    public final void e(long j) {
        if (j > 0) {
            e.a().schedule(this.d, j, TimeUnit.MILLISECONDS);
        } else {
            this.d.run();
        }
    }

    public synchronized long f() {
        return this.j - this.i;
    }

    public final void g() {
        long jMax;
        boolean z;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.h == f.RUNNING_AND_PENDING) {
                    jMax = Math.max(this.j + ((long) this.e), jUptimeMillis);
                    this.i = jUptimeMillis;
                    this.h = f.QUEUED;
                    z = true;
                } else {
                    this.h = f.IDLE;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e(jMax - jUptimeMillis);
        }
    }

    public boolean h() {
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                boolean z = false;
                if (!i(this.f, this.g)) {
                    return false;
                }
                int i = c.f24218a[this.h.ordinal()];
                if (i != 1) {
                    if (i == 3) {
                        this.h = f.RUNNING_AND_PENDING;
                    }
                    jMax = 0;
                } else {
                    jMax = Math.max(this.j + ((long) this.e), jUptimeMillis);
                    this.i = jUptimeMillis;
                    this.h = f.QUEUED;
                    z = true;
                }
                if (z) {
                    e(jMax - jUptimeMillis);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        this.f24214a.execute(this.c);
    }

    public boolean k(o98 o98Var, int i) {
        o98 o98Var2;
        if (!i(o98Var, i)) {
            return false;
        }
        synchronized (this) {
            o98Var2 = this.f;
            this.f = o98.b(o98Var);
            this.g = i;
        }
        o98.c(o98Var2);
        return true;
    }
}
