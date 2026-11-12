package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class s94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33426a = 0;

    public s94 a(byte b2, byte b3) {
        int i;
        if (this.f33426a != 0) {
            return this;
        }
        if (b2 < b3) {
            i = -1;
        } else {
            i = b2 > b3 ? 1 : 0;
        }
        this.f33426a = i;
        return this;
    }

    public s94 b(char c, char c2) {
        int i;
        if (this.f33426a != 0) {
            return this;
        }
        if (c < c2) {
            i = -1;
        } else {
            i = c > c2 ? 1 : 0;
        }
        this.f33426a = i;
        return this;
    }

    public s94 c(double d, double d2) {
        if (this.f33426a != 0) {
            return this;
        }
        this.f33426a = Double.compare(d, d2);
        return this;
    }

    public s94 d(float f, float f2) {
        if (this.f33426a != 0) {
            return this;
        }
        this.f33426a = Float.compare(f, f2);
        return this;
    }

    public s94 e(int i, int i2) {
        int i3;
        if (this.f33426a != 0) {
            return this;
        }
        if (i < i2) {
            i3 = -1;
        } else {
            i3 = i > i2 ? 1 : 0;
        }
        this.f33426a = i3;
        return this;
    }

    public s94 f(long j, long j2) {
        int i;
        if (this.f33426a != 0) {
            return this;
        }
        if (j < j2) {
            i = -1;
        } else {
            i = j > j2 ? 1 : 0;
        }
        this.f33426a = i;
        return this;
    }

    public s94 g(Object obj, Object obj2) {
        return h(obj, obj2, null);
    }

    public s94 h(Object obj, Object obj2, Comparator<?> comparator) {
        if (this.f33426a != 0 || obj == obj2) {
            return this;
        }
        if (obj == null) {
            this.f33426a = -1;
            return this;
        }
        if (obj2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                p((long[]) obj, (long[]) obj2);
            } else if (obj instanceof int[]) {
                o((int[]) obj, (int[]) obj2);
            } else if (obj instanceof short[]) {
                r((short[]) obj, (short[]) obj2);
            } else if (obj instanceof char[]) {
                l((char[]) obj, (char[]) obj2);
            } else if (obj instanceof byte[]) {
                k((byte[]) obj, (byte[]) obj2);
            } else if (obj instanceof double[]) {
                m((double[]) obj, (double[]) obj2);
            } else if (obj instanceof float[]) {
                n((float[]) obj, (float[]) obj2);
            } else if (obj instanceof boolean[]) {
                s((boolean[]) obj, (boolean[]) obj2);
            } else {
                q((Object[]) obj, (Object[]) obj2, comparator);
            }
        } else if (comparator == null) {
            this.f33426a = ((Comparable) obj).compareTo(obj2);
        } else {
            this.f33426a = comparator.compare(obj, obj2);
        }
        return this;
    }

    public s94 i(short s, short s2) {
        int i;
        if (this.f33426a != 0) {
            return this;
        }
        if (s < s2) {
            i = -1;
        } else {
            i = s > s2 ? 1 : 0;
        }
        this.f33426a = i;
        return this;
    }

    public s94 j(boolean z, boolean z2) {
        if (this.f33426a != 0 || z == z2) {
            return this;
        }
        if (z) {
            this.f33426a = 1;
        } else {
            this.f33426a = -1;
        }
        return this;
    }

    public s94 k(byte[] bArr, byte[] bArr2) {
        if (this.f33426a != 0 || bArr == bArr2) {
            return this;
        }
        if (bArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (bArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (bArr.length != bArr2.length) {
            this.f33426a = bArr.length >= bArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < bArr.length && this.f33426a == 0; i++) {
            a(bArr[i], bArr2[i]);
        }
        return this;
    }

    public s94 l(char[] cArr, char[] cArr2) {
        if (this.f33426a != 0 || cArr == cArr2) {
            return this;
        }
        if (cArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (cArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (cArr.length != cArr2.length) {
            this.f33426a = cArr.length >= cArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < cArr.length && this.f33426a == 0; i++) {
            b(cArr[i], cArr2[i]);
        }
        return this;
    }

    public s94 m(double[] dArr, double[] dArr2) {
        if (this.f33426a != 0 || dArr == dArr2) {
            return this;
        }
        if (dArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (dArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (dArr.length != dArr2.length) {
            this.f33426a = dArr.length >= dArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < dArr.length && this.f33426a == 0; i++) {
            c(dArr[i], dArr2[i]);
        }
        return this;
    }

    public s94 n(float[] fArr, float[] fArr2) {
        if (this.f33426a != 0 || fArr == fArr2) {
            return this;
        }
        if (fArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (fArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (fArr.length != fArr2.length) {
            this.f33426a = fArr.length >= fArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < fArr.length && this.f33426a == 0; i++) {
            d(fArr[i], fArr2[i]);
        }
        return this;
    }

    public s94 o(int[] iArr, int[] iArr2) {
        if (this.f33426a != 0 || iArr == iArr2) {
            return this;
        }
        if (iArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (iArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (iArr.length != iArr2.length) {
            this.f33426a = iArr.length >= iArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < iArr.length && this.f33426a == 0; i++) {
            e(iArr[i], iArr2[i]);
        }
        return this;
    }

    public s94 p(long[] jArr, long[] jArr2) {
        if (this.f33426a != 0 || jArr == jArr2) {
            return this;
        }
        if (jArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (jArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (jArr.length != jArr2.length) {
            this.f33426a = jArr.length >= jArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < jArr.length && this.f33426a == 0; i++) {
            f(jArr[i], jArr2[i]);
        }
        return this;
    }

    public s94 q(Object[] objArr, Object[] objArr2, Comparator<?> comparator) {
        if (this.f33426a != 0 || objArr == objArr2) {
            return this;
        }
        if (objArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (objArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (objArr.length != objArr2.length) {
            this.f33426a = objArr.length >= objArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < objArr.length && this.f33426a == 0; i++) {
            h(objArr[i], objArr2[i], comparator);
        }
        return this;
    }

    public s94 r(short[] sArr, short[] sArr2) {
        if (this.f33426a != 0 || sArr == sArr2) {
            return this;
        }
        if (sArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (sArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (sArr.length != sArr2.length) {
            this.f33426a = sArr.length >= sArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < sArr.length && this.f33426a == 0; i++) {
            i(sArr[i], sArr2[i]);
        }
        return this;
    }

    public s94 s(boolean[] zArr, boolean[] zArr2) {
        if (this.f33426a != 0 || zArr == zArr2) {
            return this;
        }
        if (zArr == null) {
            this.f33426a = -1;
            return this;
        }
        if (zArr2 == null) {
            this.f33426a = 1;
            return this;
        }
        if (zArr.length != zArr2.length) {
            this.f33426a = zArr.length >= zArr2.length ? 1 : -1;
            return this;
        }
        for (int i = 0; i < zArr.length && this.f33426a == 0; i++) {
            j(zArr[i], zArr2[i]);
        }
        return this;
    }

    public int t() {
        return this.f33426a;
    }
}
