package defpackage;

import com.google.zxing.ChecksumException;

/* JADX INFO: loaded from: classes5.dex */
public final class ed8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7g f16521a = o7g.f;

    public int a(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        p7g p7gVar = new p7g(this.f16521a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int iB = p7gVar.b(this.f16521a.c(i2));
            iArr3[i - i2] = iB;
            if (iB != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        p7g p7gVarD = this.f16521a.d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int iC = this.f16521a.c((iArr.length - 1) - i3);
                o7g o7gVar = this.f16521a;
                p7gVarD = p7gVarD.g(new p7g(o7gVar, new int[]{o7gVar.j(0, iC), 1}));
            }
        }
        p7g[] p7gVarArrD = d(this.f16521a.b(i, 1), new p7g(this.f16521a, iArr3), i);
        p7g p7gVar2 = p7gVarArrD[0];
        p7g p7gVar3 = p7gVarArrD[1];
        int[] iArrB = b(p7gVar2);
        int[] iArrC = c(p7gVar3, p7gVar2, iArrB);
        for (int i4 = 0; i4 < iArrB.length; i4++) {
            int length = (iArr.length - 1) - this.f16521a.h(iArrB[i4]);
            if (length < 0) {
                throw ChecksumException.getChecksumInstance();
            }
            iArr[length] = this.f16521a.j(iArr[length], iArrC[i4]);
        }
        return iArrB.length;
    }

    public final int[] b(p7g p7gVar) throws ChecksumException {
        int iD = p7gVar.d();
        int[] iArr = new int[iD];
        int i = 0;
        for (int i2 = 1; i2 < this.f16521a.e() && i < iD; i2++) {
            if (p7gVar.b(i2) == 0) {
                iArr[i] = this.f16521a.g(i2);
                i++;
            }
        }
        if (i == iD) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    public final int[] c(p7g p7gVar, p7g p7gVar2, int[] iArr) {
        int iD = p7gVar2.d();
        int[] iArr2 = new int[iD];
        for (int i = 1; i <= iD; i++) {
            iArr2[iD - i] = this.f16521a.i(i, p7gVar2.c(i));
        }
        p7g p7gVar3 = new p7g(this.f16521a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int iG = this.f16521a.g(iArr[i2]);
            iArr3[i2] = this.f16521a.i(this.f16521a.j(0, p7gVar.b(iG)), this.f16521a.g(p7gVar3.b(iG)));
        }
        return iArr3;
    }

    public final p7g[] d(p7g p7gVar, p7g p7gVar2, int i) throws ChecksumException {
        if (p7gVar.d() < p7gVar2.d()) {
            p7gVar2 = p7gVar;
            p7gVar = p7gVar2;
        }
        p7g p7gVarF = this.f16521a.f();
        p7g p7gVarD = this.f16521a.d();
        while (true) {
            p7g p7gVar3 = p7gVar2;
            p7gVar2 = p7gVar;
            p7gVar = p7gVar3;
            p7g p7gVar4 = p7gVarD;
            p7g p7gVar5 = p7gVarF;
            p7gVarF = p7gVar4;
            if (p7gVar.d() < i / 2) {
                int iC = p7gVarF.c(0);
                if (iC == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                int iG = this.f16521a.g(iC);
                return new p7g[]{p7gVarF.f(iG), p7gVar.f(iG)};
            }
            if (p7gVar.e()) {
                throw ChecksumException.getChecksumInstance();
            }
            p7g p7gVarF2 = this.f16521a.f();
            int iG2 = this.f16521a.g(p7gVar.c(p7gVar.d()));
            while (p7gVar2.d() >= p7gVar.d() && !p7gVar2.e()) {
                int iD = p7gVar2.d() - p7gVar.d();
                int i2 = this.f16521a.i(p7gVar2.c(p7gVar2.d()), iG2);
                p7gVarF2 = p7gVarF2.a(this.f16521a.b(iD, i2));
                p7gVar2 = p7gVar2.j(p7gVar.h(iD, i2));
            }
            p7gVarD = p7gVarF2.g(p7gVarF).j(p7gVar5).i();
        }
    }
}
