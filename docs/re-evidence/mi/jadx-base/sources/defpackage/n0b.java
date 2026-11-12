package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes5.dex */
public class n0b extends bj2 {
    public static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f27400b;
    public final int[] c;

    public n0b(awe aweVar) {
        super(aweVar);
        this.f27400b = d;
        this.c = new int[32];
    }

    public static int g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 <= length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i12 = i3 - 1;
        int i13 = -1;
        int i14 = i12;
        while (i12 > i6) {
            int i15 = i12 - i6;
            int i16 = i15 * i15 * (i3 - i12) * (i2 - iArr[i12]);
            if (i16 > i13) {
                i14 = i12;
                i13 = i16;
            }
            i12--;
        }
        return i14 << 3;
    }

    @Override // defpackage.bj2
    public bj2 a(awe aweVar) {
        return new n0b(aweVar);
    }

    @Override // defpackage.bj2
    public cp2 b() throws NotFoundException {
        awe aweVarE = e();
        int iD = aweVarE.d();
        int iA = aweVarE.a();
        cp2 cp2Var = new cp2(iD, iA);
        h(iD);
        int[] iArr = this.c;
        for (int i = 1; i < 5; i++) {
            byte[] bArrC = aweVarE.c((iA * i) / 5, this.f27400b);
            int i2 = (iD << 2) / 5;
            for (int i3 = iD / 5; i3 < i2; i3++) {
                int i4 = (bArrC[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int iG = g(iArr);
        byte[] bArrB = aweVarE.b();
        for (int i5 = 0; i5 < iA; i5++) {
            int i6 = i5 * iD;
            for (int i7 = 0; i7 < iD; i7++) {
                if ((bArrB[i6 + i7] & 255) < iG) {
                    cp2Var.n(i7, i5);
                }
            }
        }
        return cp2Var;
    }

    @Override // defpackage.bj2
    public zo2 c(int i, zo2 zo2Var) throws NotFoundException {
        awe aweVarE = e();
        int iD = aweVarE.d();
        if (zo2Var == null || zo2Var.k() < iD) {
            zo2Var = new zo2(iD);
        } else {
            zo2Var.d();
        }
        h(iD);
        byte[] bArrC = aweVarE.c(i, this.f27400b);
        int[] iArr = this.c;
        for (int i2 = 0; i2 < iD; i2++) {
            int i3 = (bArrC[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int iG = g(iArr);
        if (iD < 3) {
            for (int i4 = 0; i4 < iD; i4++) {
                if ((bArrC[i4] & 255) < iG) {
                    zo2Var.r(i4);
                }
            }
        } else {
            int i5 = 1;
            int i6 = bArrC[0] & 255;
            int i7 = bArrC[1] & 255;
            while (i5 < iD - 1) {
                int i8 = i5 + 1;
                int i9 = bArrC[i8] & 255;
                if ((((i7 << 2) - i6) - i9) / 2 < iG) {
                    zo2Var.r(i5);
                }
                i6 = i7;
                i5 = i8;
                i7 = i9;
            }
        }
        return zo2Var;
    }

    public final void h(int i) {
        if (this.f27400b.length < i) {
            this.f27400b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.c[i2] = 0;
        }
    }
}
