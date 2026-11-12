package defpackage;

import androidx.media3.muxer.Mp4Utils;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
class amy<K> extends amt<K> {
    private transient int g;
    private transient int i;
    transient long[] j;

    amy() {
        this(3);
    }

    amy(int i) {
        this(i, 1.0f);
    }

    amy(int i, float f) {
        super(i, f);
    }

    @Override // defpackage.amt
    void e(int i, float f) {
        super.e(i, f);
        this.i = -2;
        this.g = -2;
        long[] jArr = new long[i];
        this.j = jArr;
        Arrays.fill(jArr, -1L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.amt
    public int d() {
        int i = this.i;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.amt
    public int g(int i) {
        int iL = l(i);
        if (iL == -2) {
            return -1;
        }
        return iL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.amt
    public int b(int i, int i2) {
        return i == a() ? i2 : i;
    }

    private int f(int i) {
        return (int) (this.j[i] >>> 32);
    }

    private int l(int i) {
        return (int) this.j[i];
    }

    private void d(int i, int i2) {
        long[] jArr = this.j;
        jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & Mp4Utils.UNSIGNED_INT_MAX_VALUE);
    }

    private void c(int i, int i2) {
        long[] jArr = this.j;
        jArr[i] = (jArr[i] & Mp4Utils.UNSIGNED_INT_MAX_VALUE) | (((long) i2) << 32);
    }

    private void e(int i, int i2) {
        if (i == -2) {
            this.i = i2;
        } else {
            d(i, i2);
        }
        if (i2 == -2) {
            this.g = i;
        } else {
            c(i2, i);
        }
    }

    @Override // defpackage.amt
    void a(int i, @ParametricNullness K k, int i2, int i3) {
        super.a(i, k, i2, i3);
        e(this.g, i);
        e(i, -2);
    }

    @Override // defpackage.amt
    void i(int i) {
        int iA = a() - 1;
        e(f(i), l(i));
        if (i < iA) {
            e(f(iA), i);
            e(i, l(iA));
        }
        super.i(i);
    }

    @Override // defpackage.amt
    void h(int i) {
        super.h(i);
        long[] jArr = this.j;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.j = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    @Override // defpackage.amt
    public void b() {
        super.b();
        this.i = -2;
        this.g = -2;
    }
}
