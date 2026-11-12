package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class u77 {
    public static boolean a(b87 b87Var) {
        return b(b87Var.o());
    }

    public static boolean b(do9 do9Var) {
        return do9Var.a() > 1 && do9Var.b().equals(y77.c) && (do9Var instanceof x2i);
    }

    public static boolean c(b87 b87Var) {
        return d(b87Var.o());
    }

    public static boolean d(do9 do9Var) {
        return do9Var.a() == 1;
    }

    public static void e(h87[] h87VarArr, int i, int i2, h87 h87Var) {
        h87[] h87VarArr2 = new h87[i2];
        int i3 = 0;
        h87VarArr2[0] = h87VarArr[i];
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2) {
                break;
            }
            h87VarArr2[i4] = h87VarArr2[i3].j(h87VarArr[i + i4]);
            i3 = i4;
        }
        if (h87Var != null) {
            h87VarArr2[i3] = h87VarArr2[i3].j(h87Var);
        }
        h87 h87VarG = h87VarArr2[i3].g();
        while (i3 > 0) {
            int i5 = i3 - 1;
            int i6 = i3 + i;
            h87 h87Var2 = h87VarArr[i6];
            h87VarArr[i6] = h87VarArr2[i5].j(h87VarG);
            h87VarG = h87VarG.j(h87Var2);
            i3 = i5;
        }
        h87VarArr[i] = h87VarG;
    }

    public static i97 f(i97 i97Var, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        i97 i97VarQ = i97Var.i().q();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                i97VarQ = i97Var;
            }
            for (int i = 1; i < iBitLength; i++) {
                i97Var = i97Var.A();
                if (bigIntegerAbs.testBit(i)) {
                    i97VarQ = i97VarQ.a(i97Var);
                }
            }
        }
        return bigInteger.signum() < 0 ? i97VarQ.v() : i97VarQ;
    }
}
