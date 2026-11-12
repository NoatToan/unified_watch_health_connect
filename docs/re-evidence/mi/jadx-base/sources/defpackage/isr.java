package defpackage;

import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class isr implements drl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22061b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public isr(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public static isr a(long j, long j2, j9g.a aVar, okh okhVar) {
        int iH;
        int i = aVar.g;
        int i2 = aVar.d;
        int iN = okhVar.n();
        if ((iN & 1) != 1 || (iH = okhVar.H()) == 0) {
            return null;
        }
        long jH0 = wlq.H0(iH, ((long) i) * FolmeCore.NANOS_TO_MS, i2);
        if ((iN & 6) != 6) {
            return new isr(j2, aVar.c, jH0);
        }
        long jF = okhVar.F();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = okhVar.D();
        }
        if (j != -1) {
            long j3 = j2 + jF;
            if (j != j3) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j);
                sb.append(", ");
                sb.append(j3);
                toe.h("XingSeeker", sb.toString());
            }
        }
        return new isr(j2, aVar.c, jH0, jF, jArr);
    }

    public final long b(int i) {
        return (this.c * ((long) i)) / 100;
    }

    @Override // defpackage.drl
    public long c(long j) {
        long j2 = j - this.f22060a;
        if (!e() || j2 <= this.f22061b) {
            return 0L;
        }
        long[] jArr = (long[]) rk1.i(this.f);
        double d = (j2 * 256.0d) / this.d;
        int i = wlq.i(jArr, (long) d, true, true);
        long jB = b(i);
        long j3 = jArr[i];
        int i2 = i + 1;
        long jB2 = b(i2);
        long j4 = i == 99 ? 256L : jArr[i2];
        return jB + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (jB2 - jB));
    }

    @Override // defpackage.arl
    public arl.a d(long j) {
        if (!e()) {
            return new arl.a(new crl(0L, this.f22060a + ((long) this.f22061b)));
        }
        long jS = wlq.s(j, 0L, this.c);
        double d = (jS * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = (long[]) rk1.i(this.f);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        return new arl.a(new crl(jS, this.f22060a + wlq.s(Math.round((d2 / 256.0d) * this.d), this.f22061b, this.d - 1)));
    }

    @Override // defpackage.arl
    public boolean e() {
        return this.f != null;
    }

    @Override // defpackage.drl
    public long h() {
        return this.e;
    }

    @Override // defpackage.arl
    public long i() {
        return this.c;
    }

    public isr(long j, int i, long j2, long j3, long[] jArr) {
        this.f22060a = j;
        this.f22061b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }
}
