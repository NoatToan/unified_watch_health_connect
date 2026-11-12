package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class r98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f32330a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static int[] a(zo2 zo2Var, int i, int i2) {
        int[] iArr = new int[i2];
        int iK = zo2Var.k() / i;
        for (int i3 = 0; i3 < iK; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= zo2Var.g((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    public static void b(cp2 cp2Var, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    cp2Var.n(i5, i4);
                    cp2Var.n(i5, i6);
                    cp2Var.n(i4, i5);
                    cp2Var.n(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        cp2Var.n(i7, i7);
        int i8 = i7 + 1;
        cp2Var.n(i8, i7);
        cp2Var.n(i7, i8);
        int i9 = i + i2;
        cp2Var.n(i9, i7);
        cp2Var.n(i9, i8);
        cp2Var.n(i9, i9 - 1);
    }

    public static void c(cp2 cp2Var, boolean z, int i, zo2 zo2Var) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (zo2Var.g(i3)) {
                    cp2Var.n(i4, i2 - 5);
                }
                if (zo2Var.g(i3 + 7)) {
                    cp2Var.n(i2 + 5, i4);
                }
                if (zo2Var.g(20 - i3)) {
                    cp2Var.n(i4, i2 + 5);
                }
                if (zo2Var.g(27 - i3)) {
                    cp2Var.n(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (zo2Var.g(i3)) {
                cp2Var.n(i5, i2 - 7);
            }
            if (zo2Var.g(i3 + 10)) {
                cp2Var.n(i2 + 7, i5);
            }
            if (zo2Var.g(29 - i3)) {
                cp2Var.n(i5, i2 + 7);
            }
            if (zo2Var.g(39 - i3)) {
                cp2Var.n(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ht1 d(byte[] bArr, int i, int i2) {
        zo2 zo2VarH;
        int i3;
        boolean z;
        int iAbs;
        int i4;
        int i5;
        zo2 zo2VarA = new o7c(bArr).a();
        int iK = ((zo2VarA.k() * i) / 100) + 11;
        int iK2 = zo2VarA.k() + iK;
        int i6 = 1;
        if (i2 != 0) {
            boolean z2 = i2 < 0;
            iAbs = Math.abs(i2);
            if (iAbs > (z2 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
            i4 = i(iAbs, z2);
            i3 = f32330a[iAbs];
            int i7 = i4 - (i4 % i3);
            zo2VarH = h(zo2VarA, i3);
            if (zo2VarH.k() + iK > i7) {
                z = z2;
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z2) {
                z = z2;
                if (zo2VarH.k() > (i3 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
        } else {
            zo2 zo2VarH2 = null;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                if (i8 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z3 = i8 <= 3 ? i6 : 0;
                int i10 = z3 != 0 ? i8 + 1 : i8;
                int i11 = i(i10, z3);
                if (iK2 <= i11) {
                    if (zo2VarH2 == null || i9 != f32330a[i10]) {
                        int i12 = f32330a[i10];
                        i9 = i12;
                        zo2VarH2 = h(zo2VarA, i12);
                    }
                    int i13 = i11 - (i11 % i9);
                    if ((z3 == 0 || zo2VarH2.k() <= (i9 << 6)) && zo2VarH2.k() + iK <= i13) {
                        zo2VarH = zo2VarH2;
                        i3 = i9;
                        z = z3;
                        iAbs = i10;
                        i4 = i11;
                        break;
                    }
                }
                i8++;
                i6 = i6;
            }
        }
        zo2 zo2VarE = e(zo2VarH, i4, i3);
        int iK3 = zo2VarH.k() / i3;
        zo2 zo2VarF = f(z, iAbs, iK3);
        int i14 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i14];
        int i15 = 2;
        if (z) {
            for (int i16 = 0; i16 < i14; i16++) {
                iArr[i16] = i16;
            }
            i5 = i14;
        } else {
            int i17 = i14 / 2;
            i5 = i14 + 1 + (((i17 - 1) / 15) * 2);
            int i18 = i5 / 2;
            for (int i19 = 0; i19 < i17; i19++) {
                int i20 = (i19 / 15) + i19;
                iArr[(i17 - i19) - i6] = (i18 - i20) - 1;
                iArr[i17 + i19] = i20 + i18 + i6;
            }
        }
        cp2 cp2Var = new cp2(i5);
        int i21 = 0;
        int i22 = 0;
        while (i21 < iAbs) {
            int i23 = ((iAbs - i21) << i15) + (z ? 9 : 12);
            int i24 = 0;
            while (i24 < i23) {
                int i25 = i24 << 1;
                int i26 = 0;
                while (i26 < i15) {
                    if (zo2VarE.g(i22 + i25 + i26)) {
                        int i27 = i21 << 1;
                        cp2Var.n(iArr[i27 + i26], iArr[i27 + i24]);
                    }
                    if (zo2VarE.g((i23 << 1) + i22 + i25 + i26)) {
                        int i28 = i21 << 1;
                        cp2Var.n(iArr[i28 + i24], iArr[((i14 - 1) - i28) - i26]);
                    }
                    if (zo2VarE.g((i23 << 2) + i22 + i25 + i26)) {
                        int i29 = (i14 - 1) - (i21 << 1);
                        cp2Var.n(iArr[i29 - i26], iArr[i29 - i24]);
                    }
                    if (zo2VarE.g((i23 * 6) + i22 + i25 + i26)) {
                        int i30 = i21 << 1;
                        cp2Var.n(iArr[((i14 - 1) - i30) - i24], iArr[i30 + i26]);
                    }
                    i26++;
                    i15 = 2;
                }
                i24++;
                i15 = 2;
            }
            i22 += i23 << 3;
            i21++;
            i15 = 2;
        }
        c(cp2Var, z, i5, zo2VarF);
        if (z) {
            b(cp2Var, i5 / 2, 5);
        } else {
            int i31 = i5 / 2;
            b(cp2Var, i31, 7);
            int i32 = 0;
            int i33 = 0;
            while (i33 < (i14 / 2) - 1) {
                for (int i34 = i31 & 1; i34 < i5; i34 += 2) {
                    int i35 = i31 - i32;
                    cp2Var.n(i35, i34);
                    int i36 = i31 + i32;
                    cp2Var.n(i36, i34);
                    cp2Var.n(i34, i35);
                    cp2Var.n(i34, i36);
                }
                i33 += 15;
                i32 += 16;
            }
        }
        ht1 ht1Var = new ht1();
        ht1Var.c(z);
        ht1Var.f(i5);
        ht1Var.d(iAbs);
        ht1Var.b(iK3);
        ht1Var.e(cp2Var);
        return ht1Var;
    }

    public static zo2 e(zo2 zo2Var, int i, int i2) {
        int iK = zo2Var.k() / i2;
        vak vakVar = new vak(g(i2));
        int i3 = i / i2;
        int[] iArrA = a(zo2Var, i2, i3);
        vakVar.b(iArrA, i3 - iK);
        zo2 zo2Var2 = new zo2();
        zo2Var2.c(0, i % i2);
        for (int i4 : iArrA) {
            zo2Var2.c(i4, i2);
        }
        return zo2Var2;
    }

    public static zo2 f(boolean z, int i, int i2) {
        zo2 zo2Var = new zo2();
        if (z) {
            zo2Var.c(i - 1, 2);
            zo2Var.c(i2 - 1, 6);
            return e(zo2Var, 28, 4);
        }
        zo2Var.c(i - 1, 5);
        zo2Var.c(i2 - 1, 11);
        return e(zo2Var, 40, 4);
    }

    public static cya g(int i) {
        if (i == 4) {
            return cya.f14857k;
        }
        if (i == 6) {
            return cya.j;
        }
        if (i == 8) {
            return cya.n;
        }
        if (i == 10) {
            return cya.i;
        }
        if (i == 12) {
            return cya.h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    public static zo2 h(zo2 zo2Var, int i) {
        zo2 zo2Var2 = new zo2();
        int iK = zo2Var.k();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < iK) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= iK || zo2Var.g(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                zo2Var2.c(i7, i);
            } else {
                if (i7 == 0) {
                    zo2Var2.c(i4 | 1, i);
                } else {
                    zo2Var2.c(i4, i);
                }
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return zo2Var2;
    }

    public static int i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
