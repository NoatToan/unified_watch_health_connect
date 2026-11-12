package defpackage;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public final class ync extends n0b {
    public cp2 e;

    public ync(awe aweVar) {
        super(aweVar);
    }

    public static int[][] i(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 8;
        int i6 = i4 - 8;
        int i7 = i3 - 8;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2, i);
        int i8 = 0;
        while (i8 < i2) {
            int i9 = i8 << 3;
            if (i9 > i6) {
                i9 = i6;
            }
            int i10 = 0;
            while (i10 < i) {
                int i11 = i10 << 3;
                if (i11 > i7) {
                    i11 = i7;
                }
                int i12 = (i9 * i3) + i11;
                int i13 = 255;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i14 < i5) {
                    int i17 = 0;
                    while (i17 < i5) {
                        int i18 = bArr[i12 + i17] & 255;
                        i15 += i18;
                        if (i18 < i13) {
                            i13 = i18;
                        }
                        if (i18 > i16) {
                            i16 = i18;
                        }
                        i17++;
                        i5 = 8;
                    }
                    if (i16 - i13 > 24) {
                        while (true) {
                            i14++;
                            i12 += i3;
                            if (i14 < 8) {
                                int i19 = 0;
                                for (int i20 = 8; i19 < i20; i20 = 8) {
                                    i15 += bArr[i12 + i19] & 255;
                                    i19++;
                                }
                            }
                        }
                    }
                    i14++;
                    i12 += i3;
                    i5 = 8;
                }
                int i21 = i15 >> 6;
                if (i16 - i13 <= 24) {
                    i21 = i13 / 2;
                    if (i8 > 0 && i10 > 0) {
                        int[] iArr2 = iArr[i8 - 1];
                        int i22 = i10 - 1;
                        int i23 = ((iArr2[i10] + (iArr[i8][i22] * 2)) + iArr2[i22]) / 4;
                        if (i13 < i23) {
                            i21 = i23;
                        }
                    }
                }
                iArr[i8][i10] = i21;
                i10++;
                i5 = 8;
            }
            i8++;
            i5 = 8;
        }
        return iArr;
    }

    public static void j(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, cp2 cp2Var) {
        int i5 = i4 - 8;
        int i6 = i3 - 8;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = i7 << 3;
            int i9 = i8 > i5 ? i5 : i8;
            int iK = k(i7, 2, i2 - 3);
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 << 3;
                int i12 = i11 > i6 ? i6 : i11;
                int iK2 = k(i10, 2, i - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[iK + i14];
                    i13 += iArr2[iK2 - 2] + iArr2[iK2 - 1] + iArr2[iK2] + iArr2[iK2 + 1] + iArr2[iK2 + 2];
                }
                l(bArr, i12, i9, i13 / 25, i3, cp2Var);
            }
        }
    }

    public static int k(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static void l(byte[] bArr, int i, int i2, int i3, int i4, cp2 cp2Var) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    cp2Var.n(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    @Override // defpackage.n0b, defpackage.bj2
    public bj2 a(awe aweVar) {
        return new ync(aweVar);
    }

    @Override // defpackage.n0b, defpackage.bj2
    public cp2 b() throws NotFoundException {
        cp2 cp2Var = this.e;
        if (cp2Var != null) {
            return cp2Var;
        }
        awe aweVarE = e();
        int iD = aweVarE.d();
        int iA = aweVarE.a();
        if (iD < 40 || iA < 40) {
            this.e = super.b();
        } else {
            byte[] bArrB = aweVarE.b();
            int i = iD >> 3;
            if ((iD & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = iA >> 3;
            if ((iA & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] iArrI = i(bArrB, i2, i4, iD, iA);
            cp2 cp2Var2 = new cp2(iD, iA);
            j(bArrB, i2, i4, iD, iA, iArrI, cp2Var2);
            this.e = cp2Var2;
        }
        return this.e;
    }
}
