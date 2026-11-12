package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class c3r extends o00 {
    @Override // defpackage.o00
    public h97 b(h97 h97Var, BigInteger bigInteger) {
        h97 h97VarA;
        int iMax = Math.max(2, Math.min(16, c(bigInteger.bitLength())));
        d3r d3rVarJ = e3r.j(h97Var, iMax, true);
        h97[] h97VarArrA = d3rVarJ.a();
        h97[] h97VarArrB = d3rVarJ.b();
        int[] iArrB = e3r.b(iMax, bigInteger);
        h97 h97VarT = h97Var.i().t();
        int length = iArrB.length;
        if (length > 1) {
            length--;
            int i = iArrB[length];
            int i2 = i >> 16;
            int i3 = i & 65535;
            int iAbs = Math.abs(i2);
            h97[] h97VarArr = i2 < 0 ? h97VarArrB : h97VarArrA;
            if ((iAbs << 2) < (1 << iMax)) {
                byte b2 = sre.g[iAbs];
                int i4 = iMax - b2;
                h97VarA = h97VarArr[((1 << (iMax - 1)) - 1) >>> 1].a(h97VarArr[(((iAbs ^ (1 << (b2 - 1))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                h97VarA = h97VarArr[iAbs >>> 1];
            }
            h97VarT = h97VarA.F(i3);
        }
        while (length > 0) {
            length--;
            int i5 = iArrB[length];
            int i6 = i5 >> 16;
            h97VarT = h97VarT.H((i6 < 0 ? h97VarArrB : h97VarArrA)[Math.abs(i6) >>> 1]).F(i5 & 65535);
        }
        return h97VarT;
    }

    public int c(int i) {
        return e3r.g(i);
    }
}
