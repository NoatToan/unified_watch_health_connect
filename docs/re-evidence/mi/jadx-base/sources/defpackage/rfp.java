package defpackage;

import androidx.annotation.GuardedBy;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class rfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f32504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public long f32505b;

    @GuardedBy("this")
    public long c;

    @GuardedBy("this")
    public long d = -9223372036854775807L;

    public rfp(long j) {
        this.f32505b = j;
    }

    public static long f(long j) {
        return (j * FolmeCore.NANOS_TO_MS) / 90000;
    }

    public static long i(long j) {
        return (j * 90000) / FolmeCore.NANOS_TO_MS;
    }

    public static long j(long j) {
        return i(j) % 8589934592L;
    }

    public synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.d != -9223372036854775807L) {
                this.d = j;
            } else {
                long j2 = this.f32505b;
                if (j2 != Long.MAX_VALUE) {
                    this.c = j2 - j;
                }
                this.d = j;
                notifyAll();
            }
            return j + this.c;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                long jI = i(j2);
                long j3 = (4294967296L + jI) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                j += j3 * 8589934592L;
                if (Math.abs(j4 - jI) < Math.abs(j - jI)) {
                    j = j4;
                }
            }
            return a(f(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c() {
        return this.f32505b;
    }

    public synchronized long d() {
        long j;
        try {
            long j2 = this.d;
            j = -9223372036854775807L;
            if (j2 != -9223372036854775807L) {
                j = this.c + j2;
            } else {
                long j3 = this.f32505b;
                if (j3 != Long.MAX_VALUE) {
                    j = j3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public synchronized long e() {
        long j;
        if (this.f32505b == Long.MAX_VALUE) {
            j = 0;
        } else {
            j = this.d == -9223372036854775807L ? -9223372036854775807L : this.c;
        }
        return j;
    }

    public synchronized void g(long j) {
        this.f32505b = j;
        this.d = -9223372036854775807L;
        this.f32504a = false;
    }

    public synchronized void h(boolean z, long j) throws InterruptedException {
        if (z) {
            try {
                if (!this.f32504a) {
                    this.f32505b = j;
                    this.f32504a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || j != this.f32505b) {
            while (this.d == -9223372036854775807L) {
                wait();
            }
        }
    }
}
