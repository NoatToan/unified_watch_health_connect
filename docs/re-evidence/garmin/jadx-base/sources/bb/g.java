package bb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f17169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f17170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f17171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f17172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17173f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17169b = iArr;
        this.f17170c = jArr;
        this.f17171d = jArr2;
        this.f17172e = jArr3;
        int length = iArr.length;
        this.f17168a = length;
        if (length > 0) {
            this.f17173f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f17173f = 0L;
        }
    }

    @Override // bb.g0
    public final long getDurationUs() {
        return this.f17173f;
    }

    @Override // bb.g0
    public final g0.a getSeekPoints(long j8) {
        long[] jArr = this.f17172e;
        int iE = fa.z.e(jArr, j8, true);
        long j14 = jArr[iE];
        long[] jArr2 = this.f17170c;
        h0 h0Var = new h0(j14, jArr2[iE]);
        if (h0Var.f17186a >= j8 || iE == this.f17168a - 1) {
            return new g0.a(h0Var);
        }
        int i14 = iE + 1;
        return new g0.a(h0Var, new h0(jArr[i14], jArr2[i14]));
    }

    @Override // bb.g0
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f17168a + ", sizes=" + Arrays.toString(this.f17169b) + ", offsets=" + Arrays.toString(this.f17170c) + ", timeUs=" + Arrays.toString(this.f17172e) + ", durationsUs=" + Arrays.toString(this.f17171d) + ")";
    }
}
