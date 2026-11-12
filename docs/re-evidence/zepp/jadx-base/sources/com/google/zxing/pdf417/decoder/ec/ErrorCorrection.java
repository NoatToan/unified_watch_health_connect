package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;

/* JADX INFO: loaded from: classes4.dex */
public final class ErrorCorrection {
    private final ModulusGF a = ModulusGF.PDF417_GF;

    private int[] a(a aVar) throws ChecksumException {
        int iE = aVar.e();
        int[] iArr = new int[iE];
        int i = 0;
        for (int i2 = 1; i2 < this.a.e() && i < iE; i2++) {
            if (aVar.b(i2) == 0) {
                iArr[i] = this.a.g(i2);
                i++;
            }
        }
        if (i == iE) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    private int[] b(a aVar, a aVar2, int[] iArr) {
        int iE = aVar2.e();
        int[] iArr2 = new int[iE];
        for (int i = 1; i <= iE; i++) {
            iArr2[iE - i] = this.a.i(i, aVar2.c(i));
        }
        a aVar3 = new a(this.a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int iG = this.a.g(iArr[i2]);
            iArr3[i2] = this.a.i(this.a.j(0, aVar.b(iG)), this.a.g(aVar3.b(iG)));
        }
        return iArr3;
    }

    private a[] c(a aVar, a aVar2, int i) throws ChecksumException {
        if (aVar.e() < aVar2.e()) {
            aVar2 = aVar;
            aVar = aVar2;
        }
        a aVarF = this.a.f();
        a aVarD = this.a.d();
        while (true) {
            a aVar3 = aVar2;
            aVar2 = aVar;
            aVar = aVar3;
            a aVar4 = aVarD;
            a aVar5 = aVarF;
            aVarF = aVar4;
            if (aVar.e() < i / 2) {
                int iC = aVarF.c(0);
                if (iC == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int iG = this.a.g(iC);
                return new a[]{aVarF.g(iG), aVar.g(iG)};
            }
            if (aVar.f()) {
                throw ChecksumException.getChecksumInstance();
            }
            a aVarF2 = this.a.f();
            int iG2 = this.a.g(aVar.c(aVar.e()));
            while (aVar2.e() >= aVar.e() && !aVar2.f()) {
                int iE = aVar2.e() - aVar.e();
                int i2 = this.a.i(aVar2.c(aVar2.e()), iG2);
                aVarF2 = aVarF2.a(this.a.b(iE, i2));
                aVar2 = aVar2.k(aVar.i(iE, i2));
            }
            aVarD = aVarF2.h(aVarF).k(aVar5).j();
        }
    }

    public int decode(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        a aVar = new a(this.a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int iB = aVar.b(this.a.c(i2));
            iArr3[i - i2] = iB;
            if (iB != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        a aVarD = this.a.d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int iC = this.a.c((iArr.length - 1) - i3);
                ModulusGF modulusGF = this.a;
                aVarD = aVarD.h(new a(modulusGF, new int[]{modulusGF.j(0, iC), 1}));
            }
        }
        a[] aVarArrC = c(this.a.b(i, 1), new a(this.a, iArr3), i);
        a aVar2 = aVarArrC[0];
        a aVar3 = aVarArrC[1];
        int[] iArrA = a(aVar2);
        int[] iArrB = b(aVar3, aVar2, iArrA);
        for (int i4 = 0; i4 < iArrA.length; i4++) {
            int length = (iArr.length - 1) - this.a.h(iArrA[i4]);
            if (length < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            iArr[length] = this.a.j(iArr[length], iArrB[i4]);
        }
        return iArrA.length;
    }
}
