package fa;

import java.util.Arrays;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f70035b;

    public l(int i14) {
        this.f70035b = new long[i14];
    }

    public final void a(long j8) {
        int i14 = this.f70034a;
        long[] jArr = this.f70035b;
        if (i14 == jArr.length) {
            this.f70035b = Arrays.copyOf(jArr, i14 * 2);
        }
        long[] jArr2 = this.f70035b;
        int i15 = this.f70034a;
        this.f70034a = i15 + 1;
        jArr2[i15] = j8;
    }

    public final void b(long[] jArr) {
        int length = this.f70034a + jArr.length;
        long[] jArr2 = this.f70035b;
        if (length > jArr2.length) {
            this.f70035b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f70035b, this.f70034a, jArr.length);
        this.f70034a = length;
    }

    public final long c(int i14) {
        if (i14 >= 0 && i14 < this.f70034a) {
            return this.f70035b[i14];
        }
        l2.j(this.f70034a, b71.i.i(i14, "Invalid index ", ", size is "));
        return 0L;
    }

    public l() {
        this(32);
    }
}
