package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class i3r extends o00 {
    public static h97.a c(h97.a aVar, byte[] bArr, i5i i5iVar) {
        h97.a[] aVarArrD;
        a87.a aVar2 = (a87.a) aVar.i();
        byte bByteValue = aVar2.n().t().byteValue();
        if (i5iVar == null || !(i5iVar instanceof j3r)) {
            aVarArrD = lgp.d(aVar, bByteValue);
            j3r j3rVar = new j3r();
            j3rVar.b(aVarArrD);
            aVar2.A(aVar, "bc_wtnaf", j3rVar);
        } else {
            aVarArrD = ((j3r) i5iVar).a();
        }
        h97.a[] aVarArr = new h97.a[aVarArrD.length];
        for (int i = 0; i < aVarArrD.length; i++) {
            aVarArr[i] = (h97.a) aVarArrD[i].x();
        }
        h97.a aVar3 = (h97.a) aVar.i().t();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b2 = bArr[length];
            if (b2 != 0) {
                aVar3 = (h97.a) aVar3.I(i2).a(b2 > 0 ? aVarArrD[b2 >>> 1] : aVarArr[(-b2) >>> 1]);
                i2 = 0;
            }
        }
        return i2 > 0 ? aVar3.I(i2) : aVar3;
    }

    @Override // defpackage.o00
    public h97 b(h97 h97Var, BigInteger bigInteger) {
        if (!(h97Var instanceof h97.a)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        h97.a aVar = (h97.a) h97Var;
        a87.a aVar2 = (a87.a) aVar.i();
        int iS = aVar2.s();
        byte bByteValue = aVar2.n().t().byteValue();
        byte bC = lgp.c(bByteValue);
        return d(aVar, lgp.j(bigInteger, iS, bByteValue, aVar2.F(), bC, (byte) 10), aVar2.w(aVar, "bc_wtnaf"), bByteValue, bC);
    }

    public final h97.a d(h97.a aVar, w0s w0sVar, i5i i5iVar, byte b2, byte b3) {
        return c(aVar, lgp.l(b3, w0sVar, (byte) 4, BigInteger.valueOf(16L), lgp.g(b3, 4), b2 == 0 ? lgp.d : lgp.f), i5iVar);
    }
}
