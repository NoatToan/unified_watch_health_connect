package defpackage;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes5.dex */
public final class fp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f18042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cp2 f18043b;
    public final apq c;

    public fp2(cp2 cp2Var) throws FormatException {
        int iH = cp2Var.h();
        if (iH < 8 || iH > 144 || (iH & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.c = j(cp2Var);
        cp2 cp2VarA = a(cp2Var);
        this.f18042a = cp2VarA;
        this.f18043b = new cp2(cp2VarA.k(), cp2VarA.h());
    }

    public static apq j(cp2 cp2Var) throws FormatException {
        return apq.h(cp2Var.h(), cp2Var.k());
    }

    public final cp2 a(cp2 cp2Var) {
        int iF = this.c.f();
        int iE = this.c.e();
        if (cp2Var.h() != iF) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int iC = this.c.c();
        int iB = this.c.b();
        int i = iF / iC;
        int i2 = iE / iB;
        cp2 cp2Var2 = new cp2(i2 * iB, i * iC);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i3 * iC;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = i5 * iB;
                for (int i7 = 0; i7 < iC; i7++) {
                    int i8 = ((iC + 2) * i3) + 1 + i7;
                    int i9 = i4 + i7;
                    for (int i10 = 0; i10 < iB; i10++) {
                        if (cp2Var.e(((iB + 2) * i5) + 1 + i10, i8)) {
                            cp2Var2.n(i6 + i10, i9);
                        }
                    }
                }
            }
        }
        return cp2Var2;
    }

    public apq b() {
        return this.c;
    }

    public byte[] c() throws FormatException {
        byte[] bArr = new byte[this.c.g()];
        int iH = this.f18042a.h();
        int iK = this.f18042a.k();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == iH && i == 0 && !z) {
                bArr[i2] = (byte) d(iH, iK);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = iH - 2;
                if (i3 == i4 && i == 0 && (iK & 3) != 0 && !z2) {
                    bArr[i2] = (byte) e(iH, iK);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == iH + 4 && i == 2 && (iK & 7) == 0 && !z3) {
                    bArr[i2] = (byte) f(iH, iK);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (iK & 7) == 4 && !z4) {
                    bArr[i2] = (byte) g(iH, iK);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    while (true) {
                        if (i3 < iH && i >= 0 && !this.f18043b.e(i, i3)) {
                            bArr[i2] = (byte) i(i3, i, iH, iK);
                            i2++;
                        }
                        int i5 = i3 - 2;
                        int i6 = i + 2;
                        if (i5 < 0 || i6 >= iK) {
                            break;
                        }
                        i3 = i5;
                        i = i6;
                    }
                    int i7 = i3 - 1;
                    int i8 = i + 5;
                    while (true) {
                        if (i7 >= 0 && i8 < iK && !this.f18043b.e(i8, i7)) {
                            bArr[i2] = (byte) i(i7, i8, iH, iK);
                            i2++;
                        }
                        int i9 = i7 + 2;
                        int i10 = i8 - 2;
                        if (i9 >= iH || i10 < 0) {
                            break;
                        }
                        i7 = i9;
                        i8 = i10;
                    }
                    i3 = i7 + 5;
                    i = i8 - 1;
                }
            }
            if (i3 >= iH && i >= iK) {
                break;
            }
        }
        if (i2 == this.c.g()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public final int d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (h(i3, 0, i, i2) ? 1 : 0) << 1;
        if (h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    public final int e(int i, int i2) {
        int i3 = (h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    public final int f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (h(i3, 0, i, i2) ? 1 : 0) << 1;
        int i5 = i2 - 1;
        if (h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    public final int g(int i, int i2) {
        int i3 = (h(i + (-3), 0, i, i2) ? 1 : 0) << 1;
        if (h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    public final boolean h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f18043b.n(i2, i);
        return this.f18042a.e(i2, i);
    }

    public final int i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (h(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return h(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
