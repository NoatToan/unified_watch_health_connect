package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class lgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f25053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f25054b;
    public static final BigInteger c;
    public static final w0s[] d;
    public static final byte[][] e;
    public static final w0s[] f;
    public static final byte[][] g;

    static {
        BigInteger bigInteger = z77.f40976b;
        BigInteger bigIntegerNegate = bigInteger.negate();
        f25053a = bigIntegerNegate;
        f25054b = z77.c.negate();
        BigInteger bigIntegerNegate2 = z77.d.negate();
        c = bigIntegerNegate2;
        BigInteger bigInteger2 = z77.f40975a;
        d = new w0s[]{null, new w0s(bigInteger, bigInteger2), null, new w0s(bigIntegerNegate2, bigIntegerNegate), null, new w0s(bigIntegerNegate, bigIntegerNegate), null, new w0s(bigInteger, bigIntegerNegate), null};
        e = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        f = new w0s[]{null, new w0s(bigInteger, bigInteger2), null, new w0s(bigIntegerNegate2, bigInteger), null, new w0s(bigIntegerNegate, bigInteger), null, new w0s(bigInteger, bigInteger), null};
        g = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    public static fcm a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b2, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger bigIntegerMultiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b2));
        BigInteger bigIntegerAdd = bigIntegerMultiply.add(bigInteger3.multiply(bigIntegerMultiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger bigIntegerShiftRight = bigIntegerAdd.shiftRight(i4);
        if (bigIntegerAdd.testBit(i4 - 1)) {
            bigIntegerShiftRight = bigIntegerShiftRight.add(z77.f40976b);
        }
        return new fcm(bigIntegerShiftRight, i2);
    }

    public static BigInteger[] b(byte b2, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigIntegerSubtract;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        if (z) {
            bigInteger = z77.c;
            bigIntegerSubtract = BigInteger.valueOf(b2);
        } else {
            bigInteger = z77.f40975a;
            bigIntegerSubtract = z77.f40976b;
        }
        int i2 = 1;
        while (i2 < i) {
            i2++;
            BigInteger bigInteger2 = bigIntegerSubtract;
            bigIntegerSubtract = (b2 == 1 ? bigIntegerSubtract : bigIntegerSubtract.negate()).subtract(bigInteger.shiftLeft(1));
            bigInteger = bigInteger2;
        }
        return new BigInteger[]{bigInteger, bigIntegerSubtract};
    }

    public static byte c(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    public static h97.a[] d(h97.a aVar, byte b2) {
        byte[][] bArr = b2 == 0 ? e : g;
        h97.a[] aVarArr = new h97.a[(bArr.length + 1) >>> 1];
        aVarArr[0] = aVar;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            aVarArr[i >>> 1] = h(aVar, bArr[i]);
        }
        aVar.i().y(aVarArr);
        return aVarArr;
    }

    public static int e(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(z77.c)) {
                return 1;
            }
            if (bigInteger.equals(z77.e)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    public static BigInteger[] f(a87.a aVar) {
        if (!aVar.G()) {
            throw new IllegalArgumentException("si is defined for Koblitz curves only");
        }
        int iS = aVar.s();
        int iIntValue = aVar.n().t().intValue();
        byte bC = c(iIntValue);
        int iE = e(aVar.p());
        BigInteger[] bigIntegerArrB = b(bC, (iS + 3) - iIntValue, false);
        if (bC == 1) {
            bigIntegerArrB[0] = bigIntegerArrB[0].negate();
            bigIntegerArrB[1] = bigIntegerArrB[1].negate();
        }
        BigInteger bigInteger = z77.f40976b;
        return new BigInteger[]{bigInteger.add(bigIntegerArrB[1]).shiftRight(iE), bigInteger.add(bigIntegerArrB[0]).shiftRight(iE).negate()};
    }

    public static BigInteger g(byte b2, int i) {
        if (i == 4) {
            return b2 == 1 ? BigInteger.valueOf(6L) : BigInteger.valueOf(10L);
        }
        BigInteger[] bigIntegerArrB = b(b2, i, false);
        BigInteger bit = z77.f40975a.setBit(i);
        return z77.c.multiply(bigIntegerArrB[0]).multiply(bigIntegerArrB[1].modInverse(bit)).mod(bit);
    }

    public static h97.a h(h97.a aVar, byte[] bArr) {
        h97.a aVar2 = (h97.a) aVar.i().t();
        h97.a aVar3 = (h97.a) aVar.x();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b2 = bArr[length];
            if (b2 != 0) {
                aVar2 = (h97.a) aVar2.I(i).a(b2 > 0 ? aVar : aVar3);
                i = 0;
            }
        }
        return i > 0 ? aVar2.I(i) : aVar2;
    }

    public static BigInteger i(byte b2, w0s w0sVar) {
        BigInteger bigIntegerSubtract;
        BigInteger bigInteger = w0sVar.f37425a;
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger);
        BigInteger bigIntegerMultiply2 = w0sVar.f37425a.multiply(w0sVar.f37426b);
        BigInteger bigInteger2 = w0sVar.f37426b;
        BigInteger bigIntegerShiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b2 == 1) {
            bigIntegerSubtract = bigIntegerMultiply.add(bigIntegerMultiply2);
        } else {
            if (b2 != -1) {
                throw new IllegalArgumentException("mu must be 1 or -1");
            }
            bigIntegerSubtract = bigIntegerMultiply.subtract(bigIntegerMultiply2);
        }
        return bigIntegerSubtract.add(bigIntegerShiftLeft);
    }

    public static w0s j(BigInteger bigInteger, int i, byte b2, BigInteger[] bigIntegerArr, byte b3, byte b4) {
        BigInteger bigIntegerAdd = b3 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        BigInteger bigInteger2 = b(b3, i, true)[1];
        w0s w0sVarK = k(a(bigInteger, bigIntegerArr[0], bigInteger2, b2, i, b4), a(bigInteger, bigIntegerArr[1], bigInteger2, b2, i, b4), b3);
        return new w0s(bigInteger.subtract(bigIntegerAdd.multiply(w0sVarK.f37425a)).subtract(BigInteger.valueOf(2L).multiply(bigIntegerArr[1]).multiply(w0sVarK.f37426b)), bigIntegerArr[1].multiply(w0sVarK.f37425a).subtract(bigIntegerArr[0].multiply(w0sVarK.f37426b)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r5.d(r9) >= 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.w0s k(defpackage.fcm r8, defpackage.fcm r9, byte r10) {
        /*
            int r0 = r8.f()
            int r1 = r9.f()
            if (r1 != r0) goto La8
            r0 = -1
            r1 = 1
            if (r10 == r1) goto L19
            if (r10 != r0) goto L11
            goto L19
        L11:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "mu must be 1 or -1"
            r8.<init>(r9)
            throw r8
        L19:
            java.math.BigInteger r2 = r8.h()
            java.math.BigInteger r3 = r9.h()
            fcm r8 = r8.j(r2)
            fcm r9 = r9.j(r3)
            fcm r4 = r8.a(r8)
            if (r10 != r1) goto L34
            fcm r4 = r4.a(r9)
            goto L38
        L34:
            fcm r4 = r4.i(r9)
        L38:
            fcm r5 = r9.a(r9)
            fcm r5 = r5.a(r9)
            fcm r9 = r5.a(r9)
            if (r10 != r1) goto L4f
            fcm r5 = r8.i(r5)
            fcm r8 = r8.a(r9)
            goto L57
        L4f:
            fcm r5 = r8.a(r5)
            fcm r8 = r8.i(r9)
        L57:
            java.math.BigInteger r9 = defpackage.z77.f40976b
            int r6 = r4.d(r9)
            r7 = 0
            if (r6 < 0) goto L69
            java.math.BigInteger r6 = defpackage.lgp.f25053a
            int r6 = r5.d(r6)
            if (r6 >= 0) goto L75
            goto L71
        L69:
            java.math.BigInteger r1 = defpackage.z77.c
            int r1 = r8.d(r1)
            if (r1 < 0) goto L74
        L71:
            r1 = r7
            r7 = r10
            goto L75
        L74:
            r1 = r7
        L75:
            java.math.BigInteger r6 = defpackage.lgp.f25053a
            int r4 = r4.d(r6)
            if (r4 >= 0) goto L87
            int r8 = r5.d(r9)
            if (r8 < 0) goto L90
        L83:
            int r8 = -r10
            byte r7 = (byte) r8
        L85:
            r0 = r1
            goto L90
        L87:
            java.math.BigInteger r9 = defpackage.lgp.f25054b
            int r8 = r8.d(r9)
            if (r8 >= 0) goto L85
            goto L83
        L90:
            long r8 = (long) r0
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r2.add(r8)
            long r9 = (long) r7
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r9 = r3.add(r9)
            w0s r10 = new w0s
            r10.<init>(r8, r9)
            return r10
        La8:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "lambda0 and lambda1 do not have same scale"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgp.k(fcm, fcm, byte):w0s");
    }

    public static byte[] l(byte b2, w0s w0sVar, byte b3, BigInteger bigInteger, BigInteger bigInteger2, w0s[] w0sVarArr) {
        boolean z;
        if (b2 != 1 && b2 != -1) {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        int iBitLength = i(b2, w0sVar).bitLength();
        byte[] bArr = new byte[iBitLength > 30 ? iBitLength + 4 + b3 : b3 + 34];
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(1);
        BigInteger bigIntegerAdd = w0sVar.f37425a;
        BigInteger bigIntegerAdd2 = w0sVar.f37426b;
        int i = 0;
        while (true) {
            BigInteger bigInteger3 = z77.f40975a;
            if (bigIntegerAdd.equals(bigInteger3) && bigIntegerAdd2.equals(bigInteger3)) {
                return bArr;
            }
            if (bigIntegerAdd.testBit(0)) {
                BigInteger bigIntegerMod = bigIntegerAdd.add(bigIntegerAdd2.multiply(bigInteger2)).mod(bigInteger);
                if (bigIntegerMod.compareTo(bigIntegerShiftRight) >= 0) {
                    bigIntegerMod = bigIntegerMod.subtract(bigInteger);
                }
                byte bIntValue = (byte) bigIntegerMod.intValue();
                bArr[i] = bIntValue;
                if (bIntValue < 0) {
                    bIntValue = (byte) (-bIntValue);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bigIntegerAdd = bigIntegerAdd.subtract(w0sVarArr[bIntValue].f37425a);
                    bigIntegerAdd2 = bigIntegerAdd2.subtract(w0sVarArr[bIntValue].f37426b);
                } else {
                    bigIntegerAdd = bigIntegerAdd.add(w0sVarArr[bIntValue].f37425a);
                    bigIntegerAdd2 = bigIntegerAdd2.add(w0sVarArr[bIntValue].f37426b);
                }
            } else {
                bArr[i] = 0;
            }
            BigInteger bigIntegerShiftRight2 = bigIntegerAdd.shiftRight(1);
            BigInteger bigIntegerAdd3 = b2 == 1 ? bigIntegerAdd2.add(bigIntegerShiftRight2) : bigIntegerAdd2.subtract(bigIntegerShiftRight2);
            BigInteger bigIntegerNegate = bigIntegerAdd.shiftRight(1).negate();
            i++;
            bigIntegerAdd = bigIntegerAdd3;
            bigIntegerAdd2 = bigIntegerNegate;
        }
    }
}
