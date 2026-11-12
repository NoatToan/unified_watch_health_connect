package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class a94<K, V> extends x84<K, V> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient long[] f791k;
    public transient int l;
    public transient int m;
    public final boolean n;

    public a94() {
        this(3);
    }

    public static <K, V> a94<K, V> g0() {
        return new a94<>();
    }

    public static <K, V> a94<K, V> h0(int i) {
        return new a94<>(i);
    }

    @Override // defpackage.x84
    public Map<K, V> A(int i) {
        return new LinkedHashMap(i, 1.0f, this.n);
    }

    @Override // defpackage.x84
    public int H() {
        return this.l;
    }

    @Override // defpackage.x84
    public int I(int i) {
        return ((int) j0(i)) - 1;
    }

    @Override // defpackage.x84
    public void M(int i) {
        super.M(i);
        this.l = -2;
        this.m = -2;
    }

    @Override // defpackage.x84
    public void N(int i, K k2, V v, int i2, int i3) {
        super.N(i, k2, v, i2, i3);
        n0(this.m, i);
        n0(i, -2);
    }

    @Override // defpackage.x84
    public void Q(int i, int i2) {
        int size = size() - 1;
        super.Q(i, i2);
        n0(i0(i), I(i));
        if (i < size) {
            n0(i0(size), i);
            n0(i, I(size));
        }
        l0(size, 0L);
    }

    @Override // defpackage.x84
    public void Y(int i) {
        super.Y(i);
        this.f791k = Arrays.copyOf(k0(), i);
    }

    @Override // defpackage.x84, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (S()) {
            return;
        }
        this.l = -2;
        this.m = -2;
        long[] jArr = this.f791k;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    public final int i0(int i) {
        return ((int) (j0(i) >>> 32)) - 1;
    }

    public final long j0(int i) {
        return k0()[i];
    }

    public final long[] k0() {
        long[] jArr = this.f791k;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void l0(int i, long j) {
        k0()[i] = j;
    }

    public final void m0(int i, int i2) {
        l0(i, (j0(i) & 4294967295L) | (((long) (i2 + 1)) << 32));
    }

    public final void n0(int i, int i2) {
        if (i == -2) {
            this.l = i2;
        } else {
            o0(i, i2);
        }
        if (i2 == -2) {
            this.m = i;
        } else {
            m0(i2, i);
        }
    }

    public final void o0(int i, int i2) {
        l0(i, (j0(i) & (-4294967296L)) | (((long) (i2 + 1)) & 4294967295L));
    }

    @Override // defpackage.x84
    public void t(int i) {
        if (this.n) {
            n0(i0(i), I(i));
            n0(this.m, i);
            n0(i, -2);
            K();
        }
    }

    @Override // defpackage.x84
    public int v(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // defpackage.x84
    public int w() {
        int iW = super.w();
        this.f791k = new long[iW];
        return iW;
    }

    @Override // defpackage.x84
    public Map<K, V> x() {
        Map<K, V> mapX = super.x();
        this.f791k = null;
        return mapX;
    }

    public a94(int i) {
        this(i, false);
    }

    public a94(int i, boolean z) {
        super(i);
        this.n = z;
    }
}
