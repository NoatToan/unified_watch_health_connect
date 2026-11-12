package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wnp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rkp f38180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38181b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public wnp(rkp rkpVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        rk1.a(iArr.length == jArr2.length);
        rk1.a(jArr.length == jArr2.length);
        rk1.a(iArr2.length == jArr2.length);
        this.f38180a = rkpVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.f38181b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int i = wlq.i(this.f, j, true, false); i >= 0; i--) {
            if ((this.g[i] & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int iE = wlq.e(this.f, j, true, false); iE < this.f.length; iE++) {
            if ((this.g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }
}
