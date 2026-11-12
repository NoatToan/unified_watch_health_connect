package vb;

import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f176825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f176826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f176827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f176828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f176829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f176830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f176831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f176832h;

    public r(o oVar, long[] jArr, int[] iArr, int i14, long[] jArr2, int[] iArr2, long j8) {
        fa.a.a(iArr.length == jArr2.length);
        fa.a.a(jArr.length == jArr2.length);
        fa.a.a(iArr2.length == jArr2.length);
        this.f176825a = oVar;
        this.f176827c = jArr;
        this.f176828d = iArr;
        this.f176829e = i14;
        this.f176830f = jArr2;
        this.f176831g = iArr2;
        this.f176832h = j8;
        this.f176826b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j8) {
        long[] jArr = this.f176830f;
        for (int iA = z.a(jArr, j8, true); iA < jArr.length; iA++) {
            if ((this.f176831g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
