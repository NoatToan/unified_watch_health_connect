package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class y97 {
    public static h97 a(BigInteger bigInteger, f97 f97Var) {
        return f97Var.b().w(bigInteger).y();
    }

    public static int[] b(int[] iArr) {
        int i;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else {
            if (iArr.length != 3) {
                throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
            }
            int i2 = iArr[0];
            int i3 = iArr[1];
            if (i2 >= i3 || i2 >= (i = iArr[2])) {
                int i4 = iArr[2];
                if (i3 < i4) {
                    iArr2[0] = i3;
                    int i5 = iArr[0];
                    if (i5 < i4) {
                        iArr2[1] = i5;
                        iArr2[2] = i4;
                    } else {
                        iArr2[1] = i4;
                        iArr2[2] = i5;
                    }
                } else {
                    iArr2[0] = i4;
                    int i6 = iArr[0];
                    if (i6 < i3) {
                        iArr2[1] = i6;
                        iArr2[2] = iArr[1];
                    } else {
                        iArr2[1] = i3;
                        iArr2[2] = i6;
                    }
                }
            } else {
                iArr2[0] = i2;
                if (i3 < i) {
                    iArr2[1] = i3;
                    iArr2[2] = i;
                } else {
                    iArr2[1] = i;
                    iArr2[2] = iArr[1];
                }
            }
        }
        return iArr2;
    }

    public static String c(h97 h97Var, f97 f97Var) {
        a87 a87VarA = f97Var.a();
        return a87VarA != null ? new bo9(vj1.l(h97Var.l(false), a87VarA.n().e(), a87VarA.o().e(), f97Var.b().l(false))).toString() : new bo9(h97Var.l(false)).toString();
    }

    public static String d(ee eeVar) {
        return c97.d(eeVar);
    }

    public static d87 e(fei feiVar, f97 f97Var) {
        if (f97Var instanceof y87) {
            y87 y87Var = (y87) f97Var;
            return new d97(h(y87Var.f()), y87Var.a(), y87Var.b(), y87Var.d(), y87Var.c(), y87Var.e());
        }
        if (f97Var != null) {
            return new d87(f97Var.a(), f97Var.b(), f97Var.d(), f97Var.c(), f97Var.e());
        }
        f97 f97VarA = feiVar.a();
        return new d87(f97VarA.a(), f97VarA.b(), f97VarA.d(), f97VarA.c(), f97VarA.e());
    }

    public static d87 f(fei feiVar, eqr eqrVar) {
        d87 d87Var;
        if (eqrVar.j()) {
            ee eeVarW = ee.w(eqrVar.h());
            iqr iqrVarG = g(eeVarW);
            if (iqrVarG == null) {
                iqrVarG = (iqr) feiVar.c().get(eeVarW);
            }
            return new d97(eeVarW, iqrVarG.g(), iqrVarG.h(), iqrVarG.k(), iqrVarG.i(), iqrVarG.l());
        }
        if (eqrVar.i()) {
            f97 f97VarA = feiVar.a();
            d87Var = new d87(f97VarA.a(), f97VarA.b(), f97VarA.d(), f97VarA.c(), f97VarA.e());
        } else {
            iqr iqrVarJ = iqr.j(eqrVar.h());
            d87Var = new d87(iqrVarJ.g(), iqrVarJ.h(), iqrVarJ.k(), iqrVarJ.i(), iqrVarJ.l());
        }
        return d87Var;
    }

    public static iqr g(ee eeVar) {
        iqr iqrVarI = ce5.i(eeVar);
        return iqrVarI == null ? c97.c(eeVar) : iqrVarI;
    }

    public static ee h(String str) {
        int iIndexOf = str.indexOf(32);
        if (iIndexOf > 0) {
            str = str.substring(iIndexOf + 1);
        }
        try {
            if (str.charAt(0) >= '0' && str.charAt(0) <= '2') {
                return new ee(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        return c97.e(str);
    }

    public static int i(fei feiVar, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        f97 f97VarA = feiVar.a();
        return f97VarA == null ? bigInteger2.bitLength() : f97VarA.d().bitLength();
    }

    public static String j(String str, BigInteger bigInteger, f97 f97Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = olo.d();
        h97 h97VarA = a(bigInteger, f97Var);
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(c(h97VarA, f97Var));
        stringBuffer.append("]");
        stringBuffer.append(strD);
        stringBuffer.append("            X: ");
        stringBuffer.append(h97VarA.f().t().toString(16));
        stringBuffer.append(strD);
        stringBuffer.append("            Y: ");
        stringBuffer.append(h97VarA.g().t().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }

    public static String k(String str, h97 h97Var, f97 f97Var) {
        StringBuffer stringBuffer = new StringBuffer();
        String strD = olo.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(c(h97Var, f97Var));
        stringBuffer.append("]");
        stringBuffer.append(strD);
        stringBuffer.append("            X: ");
        stringBuffer.append(h97Var.f().t().toString(16));
        stringBuffer.append(strD);
        stringBuffer.append("            Y: ");
        stringBuffer.append(h97Var.g().t().toString(16));
        stringBuffer.append(strD);
        return stringBuffer.toString();
    }
}
