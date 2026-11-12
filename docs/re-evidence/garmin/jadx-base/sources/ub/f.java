package ub;

import bb.c0;
import bb.g0;
import bb.h0;
import ds.e0;
import fa.k;
import fa.r;
import fa.z;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f169695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f169696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f169697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f169698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f169699e;

    private f(long[] jArr, long[] jArr2, long j8, long j14, int i14) {
        this.f169695a = jArr;
        this.f169696b = jArr2;
        this.f169697c = j8;
        this.f169698d = j14;
        this.f169699e = i14;
    }

    public static f a(long j8, long j14, c0.a aVar, r rVar) {
        char c14;
        int iU;
        r rVar2 = rVar;
        rVar2.H(6);
        long jG = j14 + ((long) aVar.f17127c) + ((long) rVar2.g());
        int iG = rVar2.g();
        if (iG <= 0) {
            return null;
        }
        int i14 = aVar.f17128d;
        long j15 = iG;
        int i15 = i14 >= 32000 ? 1152 : 576;
        int i16 = z.f70071a;
        long jU = z.U(j15, ((long) i15) * 1000000, i14, RoundingMode.DOWN);
        int iA = rVar2.A();
        int iA2 = rVar2.A();
        int iA3 = rVar2.A();
        rVar2.H(2);
        long j16 = j14 + ((long) aVar.f17127c);
        long[] jArr = new long[iA];
        long[] jArr2 = new long[iA];
        int i17 = 0;
        while (i17 < iA) {
            long j17 = j16;
            jArr[i17] = (((long) i17) * jU) / ((long) iA);
            jArr2[i17] = j17;
            if (iA3 != 1) {
                c14 = 2;
                if (iA3 == 2) {
                    iU = rVar2.A();
                } else if (iA3 == 3) {
                    iU = rVar2.x();
                } else {
                    if (iA3 != 4) {
                        return null;
                    }
                    iU = rVar2.y();
                }
            } else {
                c14 = 2;
                iU = rVar2.u();
            }
            i17++;
            iA = iA;
            j16 = (((long) iU) * ((long) iA2)) + j17;
            rVar2 = rVar;
        }
        long j18 = j16;
        if (j8 != -1 && j8 != jG) {
            StringBuilder sbK = e0.k(j8, "VBRI data size mismatch: ", ", ");
            sbK.append(jG);
            k.g(sbK.toString());
        }
        if (jG != j18) {
            StringBuilder sbK2 = e0.k(jG, "VBRI bytes and ToC mismatch (using max): ", ", ");
            sbK2.append(j18);
            sbK2.append("\nSeeking will be inaccurate.");
            k.g(sbK2.toString());
            jG = Math.max(jG, j18);
        }
        return new f(jArr, jArr2, jU, jG, aVar.f17130f);
    }

    @Override // ub.e
    public final int f() {
        return this.f169699e;
    }

    @Override // ub.e
    public final long getDataEndPosition() {
        return this.f169698d;
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f169697c;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        long[] jArr = this.f169695a;
        int iE = z.e(jArr, j8, true);
        long j14 = jArr[iE];
        long[] jArr2 = this.f169696b;
        h0 h0Var = new h0(j14, jArr2[iE]);
        if (h0Var.f17186a >= j8 || iE == jArr.length - 1) {
            return new g0.a(h0Var);
        }
        int i14 = iE + 1;
        return new g0.a(h0Var, new h0(jArr[i14], jArr2[i14]));
    }

    @Override // ub.e
    public final long getTimeUs(long j8) {
        return this.f169695a[z.e(this.f169696b, j8, true)];
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return true;
    }
}
