package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lj5 {
    public static h97 a(a87 a87Var, byte[] bArr) {
        g87 g87VarJ;
        g87 g87VarM = a87Var.m(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        g87 g87VarM2 = a87Var.m(new BigInteger(1, bArr));
        if (!d(g87VarM2).equals(a87Var.n())) {
            g87VarM2 = g87VarM2.b();
        }
        if (g87VarM2.i()) {
            g87VarJ = a87Var.o().n();
        } else {
            g87 g87VarC = c(a87Var, g87VarM2.o().g().j(a87Var.o()).a(a87Var.n()).a(g87VarM2));
            if (g87VarC != null) {
                if (!d(g87VarC).equals(g87VarM)) {
                    g87VarC = g87VarC.b();
                }
                g87VarJ = g87VarM2.j(g87VarC);
            } else {
                g87VarJ = null;
            }
        }
        if (g87VarJ != null) {
            return a87Var.C(g87VarM2.t(), g87VarJ.t());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static byte[] b(h97 h97Var) {
        h97 h97VarY = h97Var.y();
        g87 g87VarF = h97VarY.f();
        byte[] bArrE = g87VarF.e();
        if (!g87VarF.i()) {
            if (d(h97VarY.g().d(g87VarF)).h()) {
                int length = bArrE.length - 1;
                bArrE[length] = (byte) (bArrE[length] | 1);
            } else {
                int length2 = bArrE.length - 1;
                bArrE[length2] = (byte) (bArrE[length2] & 254);
            }
        }
        return bArrE;
    }

    public static g87 c(a87 a87Var, g87 g87Var) {
        g87 g87VarA;
        if (g87Var.i()) {
            return g87Var;
        }
        g87 g87VarM = a87Var.m(z77.f40975a);
        Random random = new Random();
        int iF = g87Var.f();
        do {
            g87 g87VarM2 = a87Var.m(new BigInteger(iF, random));
            g87 g87VarA2 = g87Var;
            g87VarA = g87VarM;
            for (int i = 1; i <= iF - 1; i++) {
                g87 g87VarO = g87VarA2.o();
                g87VarA = g87VarA.o().a(g87VarO.j(g87VarM2));
                g87VarA2 = g87VarO.a(g87Var);
            }
            if (!g87VarA2.i()) {
                return null;
            }
        } while (g87VarA.o().a(g87VarA).i());
        return g87VarA;
    }

    public static g87 d(g87 g87Var) {
        g87 g87VarA = g87Var;
        for (int i = 1; i < g87Var.f(); i++) {
            g87VarA = g87VarA.o().a(g87Var);
        }
        return g87VarA;
    }
}
