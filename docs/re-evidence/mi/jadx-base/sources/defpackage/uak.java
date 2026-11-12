package defpackage;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: loaded from: classes5.dex */
public final class uak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cya f35575a;

    public uak(cya cyaVar) {
        this.f35575a = cyaVar;
    }

    public void a(int[] iArr, int i) throws ReedSolomonException {
        dya dyaVar = new dya(this.f35575a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            cya cyaVar = this.f35575a;
            int iC = dyaVar.c(cyaVar.c(cyaVar.d() + i2));
            iArr2[(i - 1) - i2] = iC;
            if (iC != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        dya[] dyaVarArrD = d(this.f35575a.b(i, 1), new dya(this.f35575a, iArr2), i);
        dya dyaVar2 = dyaVarArrD[0];
        dya dyaVar3 = dyaVarArrD[1];
        int[] iArrB = b(dyaVar2);
        int[] iArrC = c(dyaVar3, iArrB);
        for (int i3 = 0; i3 < iArrB.length; i3++) {
            int length = (iArr.length - 1) - this.f35575a.i(iArrB[i3]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = cya.a(iArr[length], iArrC[i3]);
        }
    }

    public final int[] b(dya dyaVar) throws ReedSolomonException {
        int iF = dyaVar.f();
        if (iF == 1) {
            return new int[]{dyaVar.d(1)};
        }
        int[] iArr = new int[iF];
        int i = 0;
        for (int i2 = 1; i2 < this.f35575a.f() && i < iF; i2++) {
            if (dyaVar.c(i2) == 0) {
                iArr[i] = this.f35575a.h(i2);
                i++;
            }
        }
        if (i == iF) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    public final int[] c(dya dyaVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int iH = this.f35575a.h(iArr[i]);
            int iJ = 1;
            for (int i2 = 0; i2 < length; i2++) {
                if (i != i2) {
                    int iJ2 = this.f35575a.j(iArr[i2], iH);
                    iJ = this.f35575a.j(iJ, (iJ2 & 1) == 0 ? iJ2 | 1 : iJ2 & (-2));
                }
            }
            iArr2[i] = this.f35575a.j(dyaVar.c(iH), this.f35575a.h(iJ));
            if (this.f35575a.d() != 0) {
                iArr2[i] = this.f35575a.j(iArr2[i], iH);
            }
        }
        return iArr2;
    }

    public final dya[] d(dya dyaVar, dya dyaVar2, int i) throws ReedSolomonException {
        if (dyaVar.f() < dyaVar2.f()) {
            dyaVar2 = dyaVar;
            dyaVar = dyaVar2;
        }
        dya dyaVarG = this.f35575a.g();
        dya dyaVarE = this.f35575a.e();
        do {
            dya dyaVar3 = dyaVar2;
            dyaVar2 = dyaVar;
            dyaVar = dyaVar3;
            dya dyaVar4 = dyaVarE;
            dya dyaVar5 = dyaVarG;
            dyaVarG = dyaVar4;
            if (dyaVar.f() < i / 2) {
                int iD = dyaVarG.d(0);
                if (iD == 0) {
                    throw new ReedSolomonException("sigmaTilde(0) was zero");
                }
                int iH = this.f35575a.h(iD);
                return new dya[]{dyaVarG.h(iH), dyaVar.h(iH)};
            }
            if (dyaVar.g()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            dya dyaVarG2 = this.f35575a.g();
            int iH2 = this.f35575a.h(dyaVar.d(dyaVar.f()));
            while (dyaVar2.f() >= dyaVar.f() && !dyaVar2.g()) {
                int iF = dyaVar2.f() - dyaVar.f();
                int iJ = this.f35575a.j(dyaVar2.d(dyaVar2.f()), iH2);
                dyaVarG2 = dyaVarG2.a(this.f35575a.b(iF, iJ));
                dyaVar2 = dyaVar2.a(dyaVar.j(iF, iJ));
            }
            dyaVarE = dyaVarG2.i(dyaVarG).a(dyaVar5);
        } while (dyaVar2.f() < dyaVar.f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }
}
