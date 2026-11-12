package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class r2b {
    public static wua a(ava avaVar, a3i a3iVar) {
        int iD = avaVar.d();
        int i = 1 << iD;
        int iG = a3iVar.g();
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, iG, i);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) cls, iG, i);
        for (int i2 = 0; i2 < i; i2++) {
            iArr2[0][i2] = avaVar.f(a3iVar.e(i2));
        }
        for (int i3 = 1; i3 < iG; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i3][i4] = avaVar.h(iArr2[i3 - 1][i4], i4);
            }
        }
        for (int i5 = 0; i5 < iG; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 <= i5; i7++) {
                    int[] iArr3 = iArr[i5];
                    iArr3[i6] = avaVar.a(iArr3[i6], avaVar.h(iArr2[i7][i6], a3iVar.f((iG + i7) - i5)));
                }
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iG * iD, (i + 31) >>> 5);
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 >>> 5;
            int i10 = 1 << (i8 & 31);
            for (int i11 = 0; i11 < iG; i11++) {
                int i12 = iArr[i11][i8];
                for (int i13 = 0; i13 < iD; i13++) {
                    if (((i12 >>> i13) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i11 + 1) * iD) - i13) - 1];
                        iArr5[i9] = iArr5[i9] ^ i10;
                    }
                }
            }
        }
        return new wua(i, iArr4);
    }
}
