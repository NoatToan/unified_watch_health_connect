package defpackage;

import com.google.common.collect.w;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class w3h<K> extends w<K> {
    public transient long[] i;
    public transient int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient int f37513k;

    public w3h(int i) {
        this(i, 1.0f);
    }

    public final int E(int i) {
        return (int) (this.i[i] >>> 32);
    }

    public final int F(int i) {
        return (int) this.i[i];
    }

    public final void G(int i, int i2) {
        long[] jArr = this.i;
        jArr[i] = (jArr[i] & 4294967295L) | (((long) i2) << 32);
    }

    public final void H(int i, int i2) {
        if (i == -2) {
            this.j = i2;
        } else {
            I(i, i2);
        }
        if (i2 == -2) {
            this.f37513k = i;
        } else {
            G(i2, i);
        }
    }

    public final void I(int i, int i2) {
        long[] jArr = this.i;
        jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
    }

    @Override // com.google.common.collect.w
    public void a() {
        super.a();
        this.j = -2;
        this.f37513k = -2;
    }

    @Override // com.google.common.collect.w
    public int e() {
        int i = this.j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.w
    public void n(int i, float f) {
        super.n(i, f);
        this.j = -2;
        this.f37513k = -2;
        long[] jArr = new long[i];
        this.i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.w
    public void o(int i, K k2, int i2, int i3) {
        super.o(i, k2, i2, i3);
        H(this.f37513k, i);
        H(i, -2);
    }

    @Override // com.google.common.collect.w
    public void p(int i) {
        int iC = C() - 1;
        H(E(i), F(i));
        if (i < iC) {
            H(E(iC), i);
            H(i, F(iC));
        }
        super.p(i);
    }

    @Override // com.google.common.collect.w
    public int s(int i) {
        int iF = F(i);
        if (iF == -2) {
            return -1;
        }
        return iF;
    }

    @Override // com.google.common.collect.w
    public int t(int i, int i2) {
        return i == C() ? i2 : i;
    }

    @Override // com.google.common.collect.w
    public void y(int i) {
        super.y(i);
        long[] jArr = this.i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public w3h(int i, float f) {
        super(i, f);
    }
}
