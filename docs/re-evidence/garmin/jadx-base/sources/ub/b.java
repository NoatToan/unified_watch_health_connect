package ub;

import bb.b0;
import bb.g0;
import com.garmin.device.ble.BleCommunicationException;
import com.google.android.exoplayer2.C;
import fa.l;
import fa.z;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f169667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f169668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f169669c;

    public b(long j8, long j14, long j15) {
        this.f169669c = new b0(new long[]{j14}, new long[]{0}, j8);
        this.f169667a = j15;
        int i14 = BleCommunicationException.UNSPECIFIED_FAILURE;
        if (j8 == C.TIME_UNSET) {
            this.f169668b = BleCommunicationException.UNSPECIFIED_FAILURE;
            return;
        }
        long jU = z.U(j14 - j15, 8L, j8, RoundingMode.HALF_UP);
        if (jU > 0 && jU <= 2147483647L) {
            i14 = (int) jU;
        }
        this.f169668b = i14;
    }

    @Override // ub.e
    public final int f() {
        return this.f169668b;
    }

    @Override // ub.e
    public final long getDataEndPosition() {
        return this.f169667a;
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f169669c.f17106c;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        return this.f169669c.getSeekPoints(j8);
    }

    @Override // ub.e
    public final long getTimeUs(long j8) {
        b0 b0Var = this.f169669c;
        l lVar = b0Var.f17105b;
        return lVar.f70034a == 0 ? C.TIME_UNSET : lVar.c(z.b(b0Var.f17104a, j8));
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return this.f169669c.isSeekable();
    }
}
