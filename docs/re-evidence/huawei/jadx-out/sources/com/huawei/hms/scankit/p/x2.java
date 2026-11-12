package com.huawei.hms.scankit.p;

import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public abstract class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f16414a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    private static r b(r rVar, int i, int i2) {
        int iD = rVar.d() / i2;
        q6 q6Var = new q6(a(i2));
        int i3 = i / i2;
        int[] iArrA = a(rVar, i2, i3);
        q6Var.a(iArrA, i3 - iD);
        r rVar2 = new r();
        rVar2.a(0, i % i2);
        for (int i4 : iArrA) {
            rVar2.a(i4, i2);
        }
        return rVar2;
    }

    private static int[] a(r rVar, int i, int i2) {
        int[] iArr = new int[i2];
        int iD = rVar.d() / i;
        for (int i3 = 0; i3 < iD; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= rVar.b((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static void a(s sVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    sVar.c(i5, i4);
                    sVar.c(i5, i6);
                    sVar.c(i4, i5);
                    sVar.c(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        sVar.c(i7, i7);
        int i8 = i7 + 1;
        sVar.c(i8, i7);
        sVar.c(i7, i8);
        int i9 = i + i2;
        sVar.c(i9, i7);
        sVar.c(i9, i8);
        sVar.c(i9, i9 - 1);
    }

    private static void a(s sVar, boolean z, int i, r rVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (rVar.b(i3)) {
                    sVar.c(i4, i2 - 5);
                }
                if (rVar.b(i3 + 7)) {
                    sVar.c(i2 + 5, i4);
                }
                if (rVar.b(20 - i3)) {
                    sVar.c(i4, i2 + 5);
                }
                if (rVar.b(27 - i3)) {
                    sVar.c(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (rVar.b(i3)) {
                sVar.c(i5, i2 - 7);
            }
            if (rVar.b(i3 + 10)) {
                sVar.c(i2 + 7, i5);
            }
            if (rVar.b(29 - i3)) {
                sVar.c(i5, i2 + 7);
            }
            if (rVar.b(39 - i3)) {
                sVar.c(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f a(byte[] bArr, int i, int i2) {
        r rVarA;
        int i3;
        boolean z;
        int iAbs;
        int iA;
        int i4;
        r rVarA2 = new c4(bArr).a();
        int iD = ((rVarA2.d() * i) / 100) + 11;
        int iD2 = rVarA2.d();
        int i5 = 1;
        if (i2 != 0) {
            boolean z2 = i2 < 0;
            iAbs = Math.abs(i2);
            if (iAbs <= (z2 ? 4 : 32)) {
                iA = a(iAbs, z2);
                i3 = f16414a[iAbs];
                rVarA = a(rVarA2, i3);
                if (rVarA.d() + iD > iA - (iA % i3)) {
                    z = z2;
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
                if (z2) {
                    z = z2;
                    if (rVarA.d() > i3 * 64) {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    }
                }
            } else {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Illegal value %s for layers", Integer.valueOf(i2)));
            }
        } else {
            r rVarA3 = null;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i6 <= 32) {
                    boolean z3 = i6 <= 3 ? i5 : 0;
                    int i8 = z3 != 0 ? i6 + 1 : i6;
                    int iA2 = a(i8, z3);
                    if (iD2 + iD <= iA2) {
                        if (rVarA3 == null || i7 != f16414a[i8]) {
                            int i9 = f16414a[i8];
                            i7 = i9;
                            rVarA3 = a(rVarA2, i9);
                        }
                        if ((z3 == 0 || rVarA3.d() <= i7 * 64) && rVarA3.d() + iD <= iA2 - (iA2 % i7)) {
                            rVarA = rVarA3;
                            i3 = i7;
                            z = z3;
                            iAbs = i8;
                            iA = iA2;
                            break;
                        }
                    }
                    i6++;
                    i5 = i5;
                } else {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
            }
        }
        r rVarB = b(rVarA, iA, i3);
        int iD3 = rVarA.d() / i3;
        r rVarA4 = a(z, iAbs, iD3);
        int i10 = (z ? 11 : 14) + (iAbs * 4);
        int[] iArr = new int[i10];
        int i11 = 2;
        if (z) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
            i4 = i10;
        } else {
            int i13 = i10 / 2;
            i4 = i10 + 1 + (((i13 - 1) / 15) * 2);
            int i14 = i4 / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + i5;
            }
        }
        s sVar = new s(i4);
        int i17 = 0;
        int i18 = 0;
        while (i17 < iAbs) {
            int i19 = ((iAbs - i17) * 4) + (z ? 9 : 12);
            int i20 = 0;
            while (i20 < i19) {
                int i21 = i20 * 2;
                int i22 = 0;
                while (i22 < i11) {
                    if (rVarB.b(i18 + i21 + i22)) {
                        int i23 = i17 * 2;
                        sVar.c(iArr[i23 + i22], iArr[i23 + i20]);
                    }
                    if (rVarB.b((i19 * 2) + i18 + i21 + i22)) {
                        int i24 = i17 * 2;
                        sVar.c(iArr[i24 + i20], iArr[((i10 - 1) - i24) - i22]);
                    }
                    if (rVarB.b((i19 * 4) + i18 + i21 + i22)) {
                        int i25 = (i10 - 1) - (i17 * 2);
                        sVar.c(iArr[i25 - i22], iArr[i25 - i20]);
                    }
                    if (rVarB.b((i19 * 6) + i18 + i21 + i22)) {
                        int i26 = i17 * 2;
                        sVar.c(iArr[((i10 - 1) - i26) - i20], iArr[i26 + i22]);
                    }
                    i22++;
                    i11 = 2;
                }
                i20++;
                i11 = 2;
            }
            i18 += i19 * 8;
            i17++;
            i11 = 2;
        }
        a(sVar, z, i4, rVarA4);
        if (z) {
            a(sVar, i4 / 2, 5);
        } else {
            int i27 = i4 / 2;
            a(sVar, i27, 7);
            int i28 = 0;
            int i29 = 0;
            while (i29 < (i10 / 2) - 1) {
                for (int i30 = i27 & 1; i30 < i4; i30 += 2) {
                    int i31 = i27 - i28;
                    sVar.c(i31, i30);
                    int i32 = i27 + i28;
                    sVar.c(i32, i30);
                    sVar.c(i30, i31);
                    sVar.c(i30, i32);
                }
                i29 += 15;
                i28 += 16;
            }
        }
        f fVar = new f();
        fVar.a(z);
        fVar.c(i4);
        fVar.b(iAbs);
        fVar.a(iD3);
        fVar.a(sVar);
        return fVar;
    }

    static r a(boolean z, int i, int i2) {
        r rVar = new r();
        if (z) {
            rVar.a(i - 1, 2);
            rVar.a(i2 - 1, 6);
            return b(rVar, 28, 4);
        }
        rVar.a(i - 1, 5);
        rVar.a(i2 - 1, 11);
        return b(rVar, 40, 4);
    }

    private static o3 a(int i) {
        if (i == 4) {
            return o3.k;
        }
        if (i == 6) {
            return o3.j;
        }
        if (i == 8) {
            return o3.n;
        }
        if (i == 10) {
            return o3.i;
        }
        if (i == 12) {
            return o3.h;
        }
        throw new IllegalArgumentException("Unsupported word size " + i);
    }

    static r a(r rVar, int i) {
        r rVar2 = new r();
        int iD = rVar.d();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < iD) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= iD || rVar.b(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                rVar2.a(i7, i);
            } else {
                if (i7 == 0) {
                    rVar2.a(i4 | 1, i);
                } else {
                    rVar2.a(i4, i);
                }
                i3 += i;
            }
            i3--;
            i3 += i;
        }
        return rVar2;
    }
}
