package com.google.zxing.common.reedsolomon;

/* JADX INFO: loaded from: classes4.dex */
public final class ReedSolomonDecoder {
    private final GenericGF a;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.a = genericGF;
    }

    private int[] a(a aVar) throws ReedSolomonException {
        int iF = aVar.f();
        int i = 0;
        if (iF == 1) {
            return new int[]{aVar.d(1)};
        }
        int[] iArr = new int[iF];
        for (int i2 = 1; i2 < this.a.getSize() && i < iF; i2++) {
            if (aVar.c(i2) == 0) {
                iArr[i] = this.a.f(i2);
                i++;
            }
        }
        if (i == iF) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] b(a aVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int iF = this.a.f(iArr[i]);
            int iH = 1;
            for (int i2 = 0; i2 < length; i2++) {
                if (i != i2) {
                    int iH2 = this.a.h(iArr[i2], iF);
                    iH = this.a.h(iH, (iH2 & 1) == 0 ? iH2 | 1 : iH2 & (-2));
                }
            }
            iArr2[i] = this.a.h(aVar.c(iF), this.a.f(iH));
            if (this.a.getGeneratorBase() != 0) {
                iArr2[i] = this.a.h(iArr2[i], iF);
            }
        }
        return iArr2;
    }

    private a[] c(a aVar, a aVar2, int i) throws ReedSolomonException {
        if (aVar.f() < aVar2.f()) {
            aVar2 = aVar;
            aVar = aVar2;
        }
        a aVarE = this.a.e();
        a aVarD = this.a.d();
        do {
            a aVar3 = aVar2;
            aVar2 = aVar;
            aVar = aVar3;
            a aVar4 = aVarD;
            a aVar5 = aVarE;
            aVarE = aVar4;
            if (aVar.f() < i / 2) {
                int iD = aVarE.d(0);
                if (iD == 0) {
                    throw new ReedSolomonException("sigmaTilde(0) was zero");
                }
                int iF = this.a.f(iD);
                return new a[]{aVarE.h(iF), aVar.h(iF)};
            }
            if (aVar.g()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            a aVarE2 = this.a.e();
            int iF2 = this.a.f(aVar.d(aVar.f()));
            while (aVar2.f() >= aVar.f() && !aVar2.g()) {
                int iF3 = aVar2.f() - aVar.f();
                int iH = this.a.h(aVar2.d(aVar2.f()), iF2);
                aVarE2 = aVarE2.a(this.a.b(iF3, iH));
                aVar2 = aVar2.a(aVar.j(iF3, iH));
            }
            aVarD = aVarE2.i(aVarE).a(aVar5);
        } while (aVar2.f() < aVar.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void decode(int[] iArr, int i) throws ReedSolomonException {
        a aVar = new a(this.a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            GenericGF genericGF = this.a;
            int iC = aVar.c(genericGF.c(genericGF.getGeneratorBase() + i2));
            iArr2[(i - 1) - i2] = iC;
            if (iC != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        a[] aVarArrC = c(this.a.b(i, 1), new a(this.a, iArr2), i);
        a aVar2 = aVarArrC[0];
        a aVar3 = aVarArrC[1];
        int[] iArrA = a(aVar2);
        int[] iArrB = b(aVar3, iArrA);
        for (int i3 = 0; i3 < iArrA.length; i3++) {
            int length = (iArr.length - 1) - this.a.g(iArrA[i3]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = GenericGF.a(iArr[length], iArrB[i3]);
        }
    }
}
