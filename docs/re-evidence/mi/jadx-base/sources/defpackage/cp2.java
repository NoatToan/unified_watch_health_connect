package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class cp2 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14580b;
    public final int c;
    public final int[] d;

    public cp2(int i) {
        this(i, i);
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f14580b * (this.f14579a + 1));
        for (int i = 0; i < this.f14580b; i++) {
            for (int i2 = 0; i2 < this.f14579a; i2++) {
                sb.append(e(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void b() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            this.d[i] = 0;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public cp2 clone() {
        return new cp2(this.f14579a, this.f14580b, this.c, (int[]) this.d.clone());
    }

    public void d(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean e(int i, int i2) {
        return ((this.d[(i2 * this.c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cp2)) {
            return false;
        }
        cp2 cp2Var = (cp2) obj;
        return this.f14579a == cp2Var.f14579a && this.f14580b == cp2Var.f14580b && this.c == cp2Var.c && Arrays.equals(this.d, cp2Var.d);
    }

    public int[] f() {
        int length = this.d.length - 1;
        while (length >= 0 && this.d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.d[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public int[] g() {
        int i = this.f14579a;
        int i2 = this.f14580b;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.f14580b; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.c;
                if (i6 < i7) {
                    int i8 = this.d[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 << 5;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public int h() {
        return this.f14580b;
    }

    public int hashCode() {
        int i = this.f14579a;
        return (((((((i * 31) + i) * 31) + this.f14580b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public zo2 i(int i, zo2 zo2Var) {
        if (zo2Var == null || zo2Var.k() < this.f14579a) {
            zo2Var = new zo2(this.f14579a);
        } else {
            zo2Var.d();
        }
        int i2 = i * this.c;
        for (int i3 = 0; i3 < this.c; i3++) {
            zo2Var.s(i3 << 5, this.d[i2 + i3]);
        }
        return zo2Var;
    }

    public int[] j() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.d;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.c;
        int i4 = i2 / i3;
        int i5 = (i2 % i3) << 5;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{i5 + i, i4};
    }

    public int k() {
        return this.f14579a;
    }

    public void l() {
        int iK = k();
        int iH = h();
        zo2 zo2Var = new zo2(iK);
        zo2 zo2Var2 = new zo2(iK);
        for (int i = 0; i < (iH + 1) / 2; i++) {
            zo2Var = i(i, zo2Var);
            int i2 = (iH - 1) - i;
            zo2Var2 = i(i2, zo2Var2);
            zo2Var.q();
            zo2Var2.q();
            q(i, zo2Var2);
            q(i2, zo2Var);
        }
    }

    public void n(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void p(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f14580b || i5 > this.f14579a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.d;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public void q(int i, zo2 zo2Var) {
        int[] iArrH = zo2Var.h();
        int[] iArr = this.d;
        int i2 = this.c;
        System.arraycopy(iArrH, 0, iArr, i * i2, i2);
    }

    public String r(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return r("X ", "  ");
    }

    public cp2(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f14579a = i;
        this.f14580b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[i3 * i2];
    }

    public cp2(int i, int i2, int i3, int[] iArr) {
        this.f14579a = i;
        this.f14580b = i2;
        this.c = i3;
        this.d = iArr;
    }
}
