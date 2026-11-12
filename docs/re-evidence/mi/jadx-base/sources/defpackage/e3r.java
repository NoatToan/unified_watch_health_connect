package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e3r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16236a = {13, 41, 121, 337, 897, 2305};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f16237b = new byte[0];
    public static final int[] c = new int[0];
    public static final h97[] d = new h97[0];

    public static int[] a(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return c;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i = iBitLength >> 1;
        int[] iArr = new int[i];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i2 = iBitLength - 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < i2) {
            if (bigIntegerXor.testBit(i4)) {
                iArr[i3] = i5 | ((bigInteger.testBit(i4) ? -1 : 1) << 16);
                i4++;
                i5 = 1;
                i3++;
            } else {
                i5++;
            }
            i4++;
        }
        int i6 = i3 + 1;
        iArr[i3] = 65536 | i5;
        return i > i6 ? m(iArr, i6) : iArr;
    }

    public static int[] b(int i, BigInteger bigInteger) {
        if (i == 2) {
            return a(bigInteger);
        }
        if (i < 2 || i > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return c;
        }
        int iBitLength = (bigInteger.bitLength() / i) + 1;
        int[] iArr = new int[iBitLength];
        int i2 = 1 << i;
        int i3 = i2 - 1;
        int i4 = i2 >>> 1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i5) == z) {
                i5++;
            } else {
                bigInteger = bigInteger.shiftRight(i5);
                int iIntValue = bigInteger.intValue() & i3;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i4) != 0;
                if (z) {
                    iIntValue -= i2;
                }
                if (i6 > 0) {
                    i5--;
                }
                iArr[i6] = i5 | (iIntValue << 16);
                i5 = i;
                i6++;
            }
        }
        return iBitLength > i6 ? m(iArr, i6) : iArr;
    }

    public static byte[] c(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return f16237b;
        }
        BigInteger bigIntegerAdd = bigInteger.shiftLeft(1).add(bigInteger);
        int iBitLength = bigIntegerAdd.bitLength();
        int i = iBitLength - 1;
        byte[] bArr = new byte[i];
        BigInteger bigIntegerXor = bigIntegerAdd.xor(bigInteger);
        int i2 = 1;
        while (i2 < i) {
            if (bigIntegerXor.testBit(i2)) {
                bArr[i2 - 1] = (byte) (bigInteger.testBit(i2) ? -1 : 1);
                i2++;
            }
            i2++;
        }
        bArr[iBitLength - 2] = 1;
        return bArr;
    }

    public static byte[] d(int i, BigInteger bigInteger) {
        if (i == 2) {
            return c(bigInteger);
        }
        if (i < 2 || i > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return f16237b;
        }
        int iBitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[iBitLength];
        int i2 = 1 << i;
        int i3 = i2 - 1;
        int i4 = i2 >>> 1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i5) == z) {
                i5++;
            } else {
                bigInteger = bigInteger.shiftRight(i5);
                int iIntValue = bigInteger.intValue() & i3;
                if (z) {
                    iIntValue++;
                }
                z = (iIntValue & i4) != 0;
                if (z) {
                    iIntValue -= i2;
                }
                if (i6 > 0) {
                    i5--;
                }
                int i7 = i6 + i5;
                bArr[i7] = (byte) iIntValue;
                i6 = i7 + 1;
                i5 = i;
            }
        }
        return iBitLength > i6 ? l(bArr, i6) : bArr;
    }

    public static d3r e(h97 h97Var) {
        return f(h97Var.i().w(h97Var, "bc_wnaf"));
    }

    public static d3r f(i5i i5iVar) {
        return (i5iVar == null || !(i5iVar instanceof d3r)) ? new d3r() : (d3r) i5iVar;
    }

    public static int g(int i) {
        return h(i, f16236a);
    }

    public static int h(int i, int[] iArr) {
        int i2 = 0;
        while (i2 < iArr.length && i >= iArr[i2]) {
            i2++;
        }
        return i2 + 2;
    }

    public static h97 i(h97 h97Var, int i, boolean z, k97 k97Var) {
        a87 a87VarI = h97Var.i();
        d3r d3rVarJ = j(h97Var, i, z);
        h97 h97VarA = k97Var.a(h97Var);
        d3r d3rVarF = f(a87VarI.w(h97VarA, "bc_wnaf"));
        h97 h97VarC = d3rVarJ.c();
        if (h97VarC != null) {
            d3rVarF.f(k97Var.a(h97VarC));
        }
        h97[] h97VarArrA = d3rVarJ.a();
        int length = h97VarArrA.length;
        h97[] h97VarArr = new h97[length];
        for (int i2 = 0; i2 < h97VarArrA.length; i2++) {
            h97VarArr[i2] = k97Var.a(h97VarArrA[i2]);
        }
        d3rVarF.d(h97VarArr);
        if (z) {
            h97[] h97VarArr2 = new h97[length];
            for (int i3 = 0; i3 < length; i3++) {
                h97VarArr2[i3] = h97VarArr[i3].x();
            }
            d3rVarF.e(h97VarArr2);
        }
        a87VarI.A(h97VarA, "bc_wnaf", d3rVarF);
        return h97VarA;
    }

    public static d3r j(h97 h97Var, int i, boolean z) {
        int length;
        int i2;
        int iQ;
        a87 a87VarI = h97Var.i();
        d3r d3rVarF = f(a87VarI.w(h97Var, "bc_wnaf"));
        int length2 = 0;
        int iMax = 1 << Math.max(0, i - 2);
        h97[] h97VarArrA = d3rVarF.a();
        if (h97VarArrA == null) {
            h97VarArrA = d;
            length = 0;
        } else {
            length = h97VarArrA.length;
        }
        if (length < iMax) {
            h97VarArrA = k(h97VarArrA, iMax);
            if (iMax == 1) {
                h97VarArrA[0] = h97Var.y();
            } else {
                if (length == 0) {
                    h97VarArrA[0] = h97Var;
                    i2 = 1;
                } else {
                    i2 = length;
                }
                g87 g87VarS = null;
                if (iMax == 2) {
                    h97VarArrA[1] = h97Var.E();
                } else {
                    h97 h97VarC = d3rVarF.c();
                    h97 h97VarA = h97VarArrA[i2 - 1];
                    if (h97VarC == null) {
                        h97VarC = h97VarArrA[0].G();
                        d3rVarF.f(h97VarC);
                        if (!h97VarC.t() && v77.f(a87VarI) && a87VarI.s() >= 64 && ((iQ = a87VarI.q()) == 2 || iQ == 3 || iQ == 4)) {
                            g87VarS = h97VarC.s(0);
                            h97VarC = a87VarI.f(h97VarC.q().t(), h97VarC.r().t());
                            g87 g87VarO = g87VarS.o();
                            h97VarA = h97VarA.C(g87VarO).D(g87VarO.j(g87VarS));
                            if (length == 0) {
                                h97VarArrA[0] = h97VarA;
                            }
                        }
                    }
                    while (i2 < iMax) {
                        h97VarA = h97VarA.a(h97VarC);
                        h97VarArrA[i2] = h97VarA;
                        i2++;
                    }
                }
                a87VarI.z(h97VarArrA, length, iMax - length, g87VarS);
            }
        }
        d3rVarF.d(h97VarArrA);
        if (z) {
            h97[] h97VarArrB = d3rVarF.b();
            if (h97VarArrB == null) {
                h97VarArrB = new h97[iMax];
            } else {
                length2 = h97VarArrB.length;
                if (length2 < iMax) {
                    h97VarArrB = k(h97VarArrB, iMax);
                }
            }
            while (length2 < iMax) {
                h97VarArrB[length2] = h97VarArrA[length2].x();
                length2++;
            }
            d3rVarF.e(h97VarArrB);
        }
        a87VarI.A(h97Var, "bc_wnaf", d3rVarF);
        return d3rVarF;
    }

    public static h97[] k(h97[] h97VarArr, int i) {
        h97[] h97VarArr2 = new h97[i];
        System.arraycopy(h97VarArr, 0, h97VarArr2, 0, h97VarArr.length);
        return h97VarArr2;
    }

    public static byte[] l(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    public static int[] m(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }
}
