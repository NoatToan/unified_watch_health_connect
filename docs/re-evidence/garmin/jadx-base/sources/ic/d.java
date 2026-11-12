package ic;

import bb.g0;
import bb.h0;
import fa.z;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f92559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f92560e;

    public d(b bVar, int i14, long j8, long j14) {
        this.f92556a = bVar;
        this.f92557b = i14;
        this.f92558c = j8;
        long j15 = (j14 - j8) / ((long) bVar.f92551d);
        this.f92559d = j15;
        this.f92560e = a(j15);
    }

    public final long a(long j8) {
        long j14 = j8 * ((long) this.f92557b);
        long j15 = this.f92556a.f92550c;
        int i14 = z.f70071a;
        return z.U(j14, 1000000L, j15, RoundingMode.DOWN);
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f92560e;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        b bVar = this.f92556a;
        long j14 = (((long) bVar.f92550c) * j8) / (((long) this.f92557b) * 1000000);
        long j15 = this.f92559d;
        long j16 = z.j(j14, 0L, j15 - 1);
        long j17 = ((long) bVar.f92551d) * j16;
        long j18 = this.f92558c;
        long jA = a(j16);
        h0 h0Var = new h0(jA, j17 + j18);
        if (jA >= j8 || j16 == j15 - 1) {
            return new g0.a(h0Var);
        }
        long j19 = j16 + 1;
        return new g0.a(h0Var, new h0(a(j19), (((long) bVar.f92551d) * j19) + j18));
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return true;
    }
}
