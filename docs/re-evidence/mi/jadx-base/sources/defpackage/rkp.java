package defpackage;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes4.dex */
public final class rkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32646b;
    public final long c;
    public final long d;
    public final long e;
    public final Format f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final smp[] f32647k;

    public rkp(int i, int i2, long j, long j2, long j3, Format format, int i3, smp[] smpVarArr, int i4, long[] jArr, long[] jArr2) {
        this.f32645a = i;
        this.f32646b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = format;
        this.g = i3;
        this.f32647k = smpVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public smp a(int i) {
        smp[] smpVarArr = this.f32647k;
        if (smpVarArr == null) {
            return null;
        }
        return smpVarArr[i];
    }
}
