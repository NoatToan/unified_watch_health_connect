package fa;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.math.RoundingMode;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f70067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f70068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f70069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal<Long> f70070d = new ThreadLocal<>();

    public w(long j8) {
        f(j8);
    }

    public final synchronized long a(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            if (!e()) {
                long jLongValue = this.f70067a;
                if (jLongValue == TimestampAdjuster.MODE_SHARED) {
                    Long l14 = this.f70070d.get();
                    l14.getClass();
                    jLongValue = l14.longValue();
                }
                this.f70068b = jLongValue - j8;
                notifyAll();
            }
            this.f70069c = j8;
            return j8 + this.f70068b;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized long b(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j14 = this.f70069c;
            if (j14 != C.TIME_UNSET) {
                int i14 = z.f70071a;
                long jU = z.U(j14, 90000L, 1000000L, RoundingMode.DOWN);
                long j15 = (4294967296L + jU) / 8589934592L;
                long j16 = ((j15 - 1) * 8589934592L) + j8;
                long j17 = (j15 * 8589934592L) + j8;
                j8 = Math.abs(j16 - jU) < Math.abs(j17 - jU) ? j16 : j17;
            }
            long j18 = j8;
            int i15 = z.f70071a;
            return a(z.U(j18, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized long c(long j8) {
        if (j8 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        try {
            long j14 = this.f70069c;
            if (j14 != C.TIME_UNSET) {
                int i14 = z.f70071a;
                long jU = z.U(j14, 90000L, 1000000L, RoundingMode.DOWN);
                long j15 = jU / 8589934592L;
                long j16 = (j15 * 8589934592L) + j8;
                j8 = j16 >= jU ? j16 : ((j15 + 1) * 8589934592L) + j8;
            }
            long j17 = j8;
            int i15 = z.f70071a;
            return a(z.U(j17, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized long d() {
        long j8;
        j8 = this.f70067a;
        if (j8 == Long.MAX_VALUE || j8 == TimestampAdjuster.MODE_SHARED) {
            j8 = C.TIME_UNSET;
        }
        return j8;
    }

    public final synchronized boolean e() {
        return this.f70068b != C.TIME_UNSET;
    }

    public final synchronized void f(long j8) {
        this.f70067a = j8;
        this.f70068b = j8 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f70069c = C.TIME_UNSET;
    }

    public final synchronized void g(long j8, long j14, boolean z14) {
        try {
            a.d(this.f70067a == TimestampAdjuster.MODE_SHARED);
            if (e()) {
                return;
            }
            if (z14) {
                this.f70070d.set(Long.valueOf(j8));
            } else {
                long jElapsedRealtime = 0;
                long j15 = j14;
                while (!e()) {
                    if (j14 == 0) {
                        wait();
                    } else {
                        a.d(j15 > 0);
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        wait(j15);
                        jElapsedRealtime += SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        if (jElapsedRealtime >= j14 && !e()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j14 + " milliseconds");
                        }
                        j15 = j14 - jElapsedRealtime;
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
