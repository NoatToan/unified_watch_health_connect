package o53;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo53/g0;", "Lo53/z0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "Ljava/lang/Thread;", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 extends z0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g0 f129339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f129340i;

    static {
        Long l14;
        g0 g0Var = new g0();
        f129339h = g0Var;
        g0Var.U(false);
        try {
            l14 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l14 = 1000L;
        }
        f129340i = TimeUnit.MILLISECONDS.toNanos(l14.longValue());
    }

    private g0() {
    }

    @Override // o53.a1
    /* JADX INFO: renamed from: X */
    public final Thread getF129338h() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f129339h.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // o53.a1
    public final void Y(long j8, z0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // o53.z0
    public final void Z(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.Z(runnable);
    }

    @Override // o53.z0, o53.k0
    public final u0 j(long j8, Runnable runnable, t13.g gVar) {
        u53.x xVar = b1.f129307a;
        long j14 = 0;
        if (j8 > 0) {
            j14 = j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8;
        }
        if (j14 >= 4611686018427387903L) {
            return w1.f129420a;
        }
        long jNanoTime = System.nanoTime();
        z0.b bVar = new z0.b(j14 + jNanoTime, runnable);
        f0(jNanoTime, bVar);
        return bVar;
    }

    public final synchronized void j0() {
        int i14 = debugStatus;
        if (i14 == 2 || i14 == 3) {
            debugStatus = 3;
            z0.f129426e.set(this, null);
            z0.f129427f.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        g2.f129341a.getClass();
        g2.f129342b.set(this);
        try {
            synchronized (this) {
                int i14 = debugStatus;
                if (i14 == 2 || i14 == 3) {
                    _thread = null;
                    j0();
                    if (d0()) {
                        return;
                    }
                    getF129338h();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j8 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jV = V();
                    if (jV == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j8 == Long.MAX_VALUE) {
                            j8 = f129340i + jNanoTime;
                        }
                        long j14 = j8 - jNanoTime;
                        if (j14 <= 0) {
                            _thread = null;
                            j0();
                            if (d0()) {
                                return;
                            }
                            getF129338h();
                            return;
                        }
                        if (jV > j14) {
                            jV = j14;
                        }
                    } else {
                        j8 = Long.MAX_VALUE;
                    }
                    if (jV > 0) {
                        int i15 = debugStatus;
                        if (i15 == 2 || i15 == 3) {
                            _thread = null;
                            j0();
                            if (d0()) {
                                return;
                            }
                            getF129338h();
                            return;
                        }
                        LockSupport.parkNanos(this, jV);
                    }
                }
            }
        } catch (Throwable th3) {
            _thread = null;
            j0();
            if (!d0()) {
                getF129338h();
            }
            throw th3;
        }
    }

    @Override // o53.z0, o53.y0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        return "DefaultExecutor";
    }
}
