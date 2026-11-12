package defpackage;

import java.math.BigInteger;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes3.dex */
public class x97 {
    public static int[] a(int[] iArr) {
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

    public static String b(fe feVar) {
        String strD = cqr.d(feVar);
        if (strD != null) {
            return strD;
        }
        String strJ = c7l.j(feVar);
        if (strJ == null) {
            strJ = fgg.d(feVar);
        }
        if (strJ == null) {
            strJ = u1p.f(feVar);
        }
        return strJ == null ? p87.c(feVar) : strJ;
    }

    public static hqr c(fe feVar) {
        hqr hqrVarI = de5.i(feVar);
        if (hqrVarI != null) {
            return hqrVarI;
        }
        hqr hqrVarC = cqr.c(feVar);
        if (hqrVarC == null) {
            hqrVarC = c7l.i(feVar);
        }
        if (hqrVarC == null) {
            hqrVarC = fgg.c(feVar);
        }
        return hqrVarC == null ? u1p.e(feVar) : hqrVarC;
    }

    public static fe d(String str) {
        if (str.indexOf(32) > 0) {
            str = str.substring(str.indexOf(32) + 1);
        }
        try {
            return (str.charAt(0) < '0' || str.charAt(0) > '2') ? f(str) : new fe(str);
        } catch (IllegalArgumentException unused) {
            return f(str);
        }
    }

    public static int e(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        e97 e97VarA = BouncyCastleProvider.CONFIGURATION.a();
        return e97VarA == null ? bigInteger2.bitLength() : e97VarA.d().bitLength();
    }

    public static fe f(String str) {
        fe feVarE = cqr.e(str);
        if (feVarE != null) {
            return feVarE;
        }
        fe feVarK = c7l.k(str);
        if (feVarK == null) {
            feVarK = fgg.e(str);
        }
        if (feVarK == null) {
            feVarK = u1p.g(str);
        }
        if (feVarK == null) {
            feVarK = p87.d(str);
        }
        return feVarK == null ? d6.h(str) : feVarK;
    }
}
