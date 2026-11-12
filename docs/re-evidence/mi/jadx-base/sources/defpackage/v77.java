package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class v77 {
    public static h97 a(h97 h97Var, BigInteger bigInteger, h97 h97Var2, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, e3r.g(bigIntegerAbs.bitLength())));
        int iMax2 = Math.max(2, Math.min(16, e3r.g(bigIntegerAbs2.bitLength())));
        d3r d3rVarJ = e3r.j(h97Var, iMax, true);
        d3r d3rVarJ2 = e3r.j(h97Var2, iMax2, true);
        return c(z ? d3rVarJ.b() : d3rVarJ.a(), z ? d3rVarJ.a() : d3rVarJ.b(), e3r.d(iMax, bigIntegerAbs), z2 ? d3rVarJ2.b() : d3rVarJ2.a(), z2 ? d3rVarJ2.a() : d3rVarJ2.b(), e3r.d(iMax2, bigIntegerAbs2));
    }

    public static h97 b(h97 h97Var, BigInteger bigInteger, k97 k97Var, BigInteger bigInteger2) {
        boolean z = bigInteger.signum() < 0;
        boolean z2 = bigInteger2.signum() < 0;
        BigInteger bigIntegerAbs = bigInteger.abs();
        BigInteger bigIntegerAbs2 = bigInteger2.abs();
        int iMax = Math.max(2, Math.min(16, e3r.g(Math.max(bigIntegerAbs.bitLength(), bigIntegerAbs2.bitLength()))));
        h97 h97VarI = e3r.i(h97Var, iMax, true, k97Var);
        d3r d3rVarE = e3r.e(h97Var);
        d3r d3rVarE2 = e3r.e(h97VarI);
        return c(z ? d3rVarE.b() : d3rVarE.a(), z ? d3rVarE.a() : d3rVarE.b(), e3r.d(iMax, bigIntegerAbs), z2 ? d3rVarE2.b() : d3rVarE2.a(), z2 ? d3rVarE2.a() : d3rVarE2.b(), e3r.d(iMax, bigIntegerAbs2));
    }

    public static h97 c(h97[] h97VarArr, h97[] h97VarArr2, byte[] bArr, h97[] h97VarArr3, h97[] h97VarArr4, byte[] bArr2) {
        h97 h97VarA;
        int iMax = Math.max(bArr.length, bArr2.length);
        h97 h97VarT = h97VarArr[0].i().t();
        int i = iMax - 1;
        int i2 = 0;
        h97 h97VarH = h97VarT;
        while (i >= 0) {
            byte b2 = i < bArr.length ? bArr[i] : (byte) 0;
            byte b3 = i < bArr2.length ? bArr2[i] : (byte) 0;
            if ((b2 | b3) == 0) {
                i2++;
            } else {
                if (b2 != 0) {
                    h97VarA = h97VarT.a((b2 < 0 ? h97VarArr2 : h97VarArr)[Math.abs((int) b2) >>> 1]);
                } else {
                    h97VarA = h97VarT;
                }
                if (b3 != 0) {
                    h97VarA = h97VarA.a((b3 < 0 ? h97VarArr4 : h97VarArr3)[Math.abs((int) b3) >>> 1]);
                }
                if (i2 > 0) {
                    h97VarH = h97VarH.F(i2);
                    i2 = 0;
                }
                h97VarH = h97VarH.H(h97VarA);
            }
            i--;
        }
        return i2 > 0 ? h97VarH.F(i2) : h97VarH;
    }

    public static boolean d(a87 a87Var) {
        return e(a87Var.r());
    }

    public static boolean e(eo9 eo9Var) {
        return eo9Var.a() > 1 && eo9Var.b().equals(z77.c) && (eo9Var instanceof y2i);
    }

    public static boolean f(a87 a87Var) {
        return g(a87Var.r());
    }

    public static boolean g(eo9 eo9Var) {
        return eo9Var.a() == 1;
    }

    public static void h(g87[] g87VarArr, int i, int i2, g87 g87Var) {
        g87[] g87VarArr2 = new g87[i2];
        int i3 = 0;
        g87VarArr2[0] = g87VarArr[i];
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2) {
                break;
            }
            g87VarArr2[i4] = g87VarArr2[i3].j(g87VarArr[i + i4]);
            i3 = i4;
        }
        if (g87Var != null) {
            g87VarArr2[i3] = g87VarArr2[i3].j(g87Var);
        }
        g87 g87VarG = g87VarArr2[i3].g();
        while (i3 > 0) {
            int i5 = i3 - 1;
            int i6 = i3 + i;
            g87 g87Var2 = g87VarArr[i6];
            g87VarArr[i6] = g87VarArr2[i5].j(g87VarG);
            g87VarG = g87VarG.j(g87Var2);
            i3 = i5;
        }
        g87VarArr[i] = g87VarG;
    }

    public static h97 i(h97 h97Var, BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        h97 h97VarT = h97Var.i().t();
        int iBitLength = bigIntegerAbs.bitLength();
        if (iBitLength > 0) {
            if (bigIntegerAbs.testBit(0)) {
                h97VarT = h97Var;
            }
            for (int i = 1; i < iBitLength; i++) {
                h97Var = h97Var.G();
                if (bigIntegerAbs.testBit(i)) {
                    h97VarT = h97VarT.a(h97Var);
                }
            }
        }
        return bigInteger.signum() < 0 ? h97VarT.x() : h97VarT;
    }

    public static h97 j(h97 h97Var) {
        if (h97Var.v()) {
            return h97Var;
        }
        throw new IllegalArgumentException("Invalid point");
    }
}
