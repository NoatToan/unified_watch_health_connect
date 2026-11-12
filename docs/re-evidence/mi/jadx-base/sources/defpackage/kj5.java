package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kj5 {
    public static i97 a(b87 b87Var, byte[] bArr) {
        h87 h87VarJ;
        h87 h87VarJ2 = b87Var.j(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        h87 h87VarJ3 = b87Var.j(new BigInteger(1, bArr));
        if (!d(h87VarJ3).equals(b87Var.k())) {
            h87VarJ3 = h87VarJ3.b();
        }
        if (h87VarJ3.i()) {
            h87VarJ = b87Var.l().n();
        } else {
            h87 h87VarC = c(b87Var, h87VarJ3.o().g().j(b87Var.l()).a(b87Var.k()).a(h87VarJ3));
            if (h87VarC != null) {
                if (!d(h87VarC).equals(h87VarJ2)) {
                    h87VarC = h87VarC.b();
                }
                h87VarJ = h87VarJ3.j(h87VarC);
            } else {
                h87VarJ = null;
            }
        }
        if (h87VarJ != null) {
            return b87Var.d(h87VarJ3.s(), h87VarJ.s());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static byte[] b(i97 i97Var) {
        i97 i97VarW = i97Var.w();
        h87 h87VarF = i97VarW.f();
        byte[] bArrE = h87VarF.e();
        if (!h87VarF.i()) {
            if (d(i97VarW.g().d(h87VarF)).h()) {
                int length = bArrE.length - 1;
                bArrE[length] = (byte) (bArrE[length] | 1);
            } else {
                int length2 = bArrE.length - 1;
                bArrE[length2] = (byte) (bArrE[length2] & 254);
            }
        }
        return bArrE;
    }

    public static h87 c(b87 b87Var, h87 h87Var) {
        h87 h87VarA;
        if (h87Var.i()) {
            return h87Var;
        }
        h87 h87VarJ = b87Var.j(y77.f39883a);
        Random random = new Random();
        int iF = h87Var.f();
        do {
            h87 h87VarJ2 = b87Var.j(new BigInteger(iF, random));
            h87 h87VarA2 = h87Var;
            h87VarA = h87VarJ;
            for (int i = 1; i <= iF - 1; i++) {
                h87 h87VarO = h87VarA2.o();
                h87VarA = h87VarA.o().a(h87VarO.j(h87VarJ2));
                h87VarA2 = h87VarO.a(h87Var);
            }
            if (!h87VarA2.i()) {
                return null;
            }
        } while (h87VarA.o().a(h87VarA).i());
        return h87VarA;
    }

    public static h87 d(h87 h87Var) {
        h87 h87VarA = h87Var;
        for (int i = 1; i < h87Var.f(); i++) {
            h87VarA = h87VarA.o().a(h87Var);
        }
        return h87VarA;
    }
}
