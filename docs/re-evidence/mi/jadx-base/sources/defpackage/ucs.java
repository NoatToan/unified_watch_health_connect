package defpackage;

import java.util.concurrent.Callable;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes11.dex */
public class ucs<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f35636b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public final long i;

    public ucs(long j, long j2) {
        this.i = j * FolmeCore.NANOS_TO_MS;
        this.f35635a = j2;
    }

    public long a() {
        return this.c;
    }

    public T b(Callable<T> callable) {
        T tCall;
        long j = this.f35636b;
        long j2 = this.i;
        if (j > j2) {
            long j3 = (j / j2) * this.f35635a;
            this.f35636b = 0L;
            if (j3 > 0) {
                try {
                    Thread.sleep(j3);
                } catch (Exception unused) {
                }
            }
        }
        long jNanoTime = System.nanoTime();
        if (this.g <= 0) {
            this.g = jNanoTime;
        }
        try {
            tCall = callable.call();
        } catch (Exception e) {
            e.printStackTrace();
            tCall = null;
        }
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        this.h = System.nanoTime();
        this.e++;
        if (this.c < jNanoTime2) {
            this.c = jNanoTime2;
        }
        if (jNanoTime2 > 0) {
            this.f += jNanoTime2;
            long j4 = this.d;
            if (j4 == 0 || j4 > jNanoTime2) {
                this.d = jNanoTime2;
            }
        }
        this.f35636b += Math.max(jNanoTime2, 0L);
        return tCall;
    }

    public long c() {
        return this.d;
    }

    public long d() {
        long j = this.f;
        if (j > 0) {
            long j2 = this.e;
            if (j2 > 0) {
                return j / j2;
            }
        }
        return 0L;
    }

    public long e() {
        long j = this.h;
        long j2 = this.g;
        if (j > j2) {
            return j - j2;
        }
        return 0L;
    }
}
