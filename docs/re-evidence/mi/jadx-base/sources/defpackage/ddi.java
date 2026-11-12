package defpackage;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class ddi {
    public static cdi a(byte[] bArr, int i) {
        ArrayList<cdi.a> arrayListF;
        okh okhVar = new okh(bArr);
        try {
            arrayListF = c(okhVar) ? f(okhVar) : e(okhVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new cdi(arrayListF.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new cdi(arrayListF.get(0), arrayListF.get(1), i);
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static boolean c(okh okhVar) {
        okhVar.Q(4);
        int iN = okhVar.n();
        okhVar.P(0);
        return iN == 1886547818;
    }

    public static cdi.a d(okh okhVar) {
        int iN = okhVar.n();
        if (iN > 10000) {
            return null;
        }
        float[] fArr = new float[iN];
        for (int i = 0; i < iN; i++) {
            fArr[i] = okhVar.m();
        }
        int iN2 = okhVar.n();
        if (iN2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iN) * 2.0d) / dLog);
        nkh nkhVar = new nkh(okhVar.d());
        int i2 = 8;
        nkhVar.p(okhVar.e() * 8);
        float[] fArr2 = new float[iN2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < iN2) {
            int i6 = 0;
            while (i6 < i3) {
                int iB = iArr[i6] + b(nkhVar.h(iCeil));
                if (iB >= iN || iB < 0) {
                    return null;
                }
                fArr2[i5] = fArr[iB];
                iArr[i6] = iB;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        nkhVar.p((nkhVar.e() + 7) & (-8));
        int i7 = 32;
        int iH = nkhVar.h(32);
        cdi.b[] bVarArr = new cdi.b[iH];
        int i8 = 0;
        while (i8 < iH) {
            int iH2 = nkhVar.h(i2);
            int iH3 = nkhVar.h(i2);
            int iH4 = nkhVar.h(i7);
            if (iH4 > 128000) {
                return null;
            }
            int iCeil2 = (int) Math.ceil(Math.log(((double) iN2) * d) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int iB2 = 0;
            for (int i9 = 0; i9 < iH4; i9++) {
                iB2 += b(nkhVar.h(iCeil2));
                if (iB2 < 0 || iB2 >= iN2) {
                    return null;
                }
                int i10 = i9 * 3;
                int i11 = iB2 * 5;
                fArr3[i10] = fArr2[i11];
                fArr3[i10 + 1] = fArr2[i11 + 1];
                fArr3[i10 + 2] = fArr2[i11 + 2];
                int i12 = i9 * 2;
                fArr4[i12] = fArr2[i11 + 3];
                fArr4[i12 + 1] = fArr2[i11 + 4];
            }
            bVarArr[i8] = new cdi.b(iH2, fArr3, fArr4, iH3);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new cdi.a(bVarArr);
    }

    public static ArrayList<cdi.a> e(okh okhVar) {
        if (okhVar.D() != 0) {
            return null;
        }
        okhVar.Q(7);
        int iN = okhVar.n();
        if (iN == 1684433976) {
            okh okhVar2 = new okh();
            Inflater inflater = new Inflater(true);
            try {
                if (!wlq.m0(okhVar, okhVar2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                okhVar = okhVar2;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iN != 1918990112) {
            return null;
        }
        return g(okhVar);
    }

    public static ArrayList<cdi.a> f(okh okhVar) {
        int iN;
        okhVar.Q(8);
        int iE = okhVar.e();
        int iF = okhVar.f();
        while (iE < iF && (iN = okhVar.n() + iE) > iE && iN <= iF) {
            int iN2 = okhVar.n();
            if (iN2 == 2037673328 || iN2 == 1836279920) {
                okhVar.O(iN);
                return e(okhVar);
            }
            okhVar.P(iN);
            iE = iN;
        }
        return null;
    }

    public static ArrayList<cdi.a> g(okh okhVar) {
        ArrayList<cdi.a> arrayList = new ArrayList<>();
        int iE = okhVar.e();
        int iF = okhVar.f();
        while (iE < iF) {
            int iN = okhVar.n() + iE;
            if (iN <= iE || iN > iF) {
                return null;
            }
            if (okhVar.n() == 1835365224) {
                cdi.a aVarD = d(okhVar);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            okhVar.P(iN);
            iE = iN;
        }
        return arrayList;
    }
}
