package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.Collection;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: loaded from: classes34.dex */
public abstract class k7 {
    public static double a(u6 u6Var, u6 u6Var2) {
        return Math.atan2(u6Var2.c() - u6Var.c(), u6Var2.b() - u6Var.b());
    }

    private static byte[] a(u6[] u6VarArr, p pVar, int[] iArr, float f, double[] dArr) throws a {
        float fB = u6VarArr[0].b();
        float fB2 = u6VarArr[1].b();
        float fB3 = u6VarArr[2].b();
        float fC = u6VarArr[0].c();
        float fC2 = u6VarArr[1].c();
        float fC3 = u6VarArr[2].c();
        if (fB >= 0.0f && fB2 >= 0.0f && fB3 >= 0.0f && fC >= 0.0f && fC2 >= 0.0f && fC3 >= 0.0f && fB <= pVar.e() && fB2 <= pVar.e() && fB3 <= pVar.e() && fC <= pVar.c() && fC2 <= pVar.c() && fC3 <= pVar.c()) {
            int i = ((int) (fC + fC3)) / 2;
            int i2 = (int) ((((int) (fB + fB3)) / 2) - f);
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = (int) (i - f);
            if (i3 < 0) {
                i3 = 0;
            }
            int iC = ((int) f) * 2;
            int iE = i2 + iC <= pVar.e() ? iC : pVar.e() - i2;
            if (i3 + iC > pVar.c()) {
                iC = pVar.c() - i3;
            }
            p pVarA = pVar.a(i2, i3, iE, iC);
            double degrees = dArr[0] + Math.toDegrees(a(u6VarArr[0], u6VarArr[1])) + 90.0d;
            dArr[0] = degrees;
            dArr[1] = i2;
            dArr[2] = i3;
            double d = iE;
            dArr[3] = d;
            double d2 = iC;
            dArr[4] = d2;
            double radians = Math.toRadians(degrees);
            int iAbs = (int) (((Math.abs(Math.sin(radians)) * d) + (Math.abs(Math.cos(radians)) * d2)) * dArr[5]);
            int iAbs2 = (int) (((d2 * Math.abs(Math.sin(radians))) + (d * Math.abs(Math.cos(radians)))) * dArr[5]);
            iArr[0] = iAbs2;
            iArr[1] = iAbs;
            byte[] bArrImageRotate = LoadOpencvJNIUtil.imageRotate(pVarA.d(), pVarA.c(), pVarA.e(), iAbs, iAbs2, (float) dArr[0], dArr[5]);
            if (bArrImageRotate != null) {
                return bArrImageRotate;
            }
            iArr[0] = pVar.e();
            iArr[1] = pVar.c();
            return pVar.d();
        }
        iArr[0] = pVar.e();
        iArr[1] = pVar.c();
        throw a.a();
    }

    private static byte[] a(p pVar, u6[] u6VarArr, double[] dArr, int[] iArr) {
        if (u6VarArr == null) {
            iArr[0] = pVar.e();
            iArr[1] = pVar.c();
            return pVar.d();
        }
        int iE = pVar.e();
        int iB = iE;
        int iC = pVar.c();
        int iB2 = 0;
        int iC2 = 0;
        for (u6 u6Var : u6VarArr) {
            if (u6Var != null) {
                if (((int) u6Var.b()) < iB) {
                    iB = (int) u6Var.b();
                }
                if (((int) u6Var.c()) < iC) {
                    iC = (int) u6Var.c();
                }
                if (((int) u6Var.b()) > iB2) {
                    iB2 = (int) u6Var.b();
                }
                if (((int) u6Var.c()) > iC2) {
                    iC2 = (int) u6Var.c();
                }
            }
        }
        return a(u6VarArr, pVar, iArr, Math.max(iB2 - iB, iC2 - iC), dArr);
    }

    public static u6[] a(u6[] u6VarArr, int i, int i2, double[] dArr) {
        u6[] u6VarArr2;
        int i3;
        u6 u6Var = null;
        if (u6VarArr == null) {
            return null;
        }
        double d = dArr[3];
        int i4 = d != 0.0d ? (int) d : i;
        double d2 = dArr[4];
        int i5 = d2 != 0.0d ? (int) d2 : i2;
        double d3 = dArr[5];
        u6[] u6VarArr3 = new u6[u6VarArr.length];
        int i6 = 0;
        double radians = Math.toRadians(dArr[0]);
        double dCos = Math.cos(radians) * d3;
        double dSin = Math.sin(radians) * d3;
        double d4 = i5;
        double d5 = i4;
        double dAbs = (((Math.abs(dSin) - dSin) * d4) + ((Math.abs(dCos) - dCos) * d5)) / 2.0d;
        double d6 = -dSin;
        double dAbs2 = ((d4 * (Math.abs(dCos) - dCos)) + ((Math.abs(dSin) + dSin) * d5)) / 2.0d;
        while (i6 < u6VarArr.length) {
            u6 u6Var2 = u6VarArr[i6];
            if (u6Var2 != null) {
                u6VarArr2 = u6VarArr3;
                i3 = i6;
                double dB = (((((double) u6Var2.b()) - dAbs) * dCos) + ((dAbs2 - ((double) u6Var2.c())) * dSin)) / ((dCos * dCos) - (dSin * d6));
                u6VarArr2[i3] = new u6(Math.round(dB) + ((long) ((int) dArr[1])), Math.round(dSin == 0.0d ? (((double) u6Var2.c()) - dAbs2) / dCos : ((((double) u6Var2.b()) - dAbs) - (dCos * dB)) / dSin) + ((long) ((int) dArr[2])));
                u6Var = null;
            } else {
                u6VarArr2 = u6VarArr3;
                i3 = i6;
                u6VarArr2[i3] = u6Var;
            }
            i6 = i3 + 1;
            d6 = d6;
            u6VarArr3 = u6VarArr2;
        }
        return u6VarArr3;
    }

    public static byte[] a(p pVar, Map map, s6 s6Var, int[] iArr, double[] dArr) {
        if (pVar == null) {
            return null;
        }
        Collection collection = map != null ? (Collection) map.get(m1.f16208c) : null;
        if ((collection == null || collection.contains(BarcodeFormat.QR_CODE) || collection.contains(BarcodeFormat.PDF_417)) && s6Var != null && s6Var.k() == null) {
            if (collection != null) {
                collection.clear();
                m1 m1Var = m1.f16208c;
                map.remove(m1Var);
                collection.add(s6Var.c());
                map.put(m1Var, collection);
            } else if (map != null) {
                m1 m1Var2 = m1.f16208c;
                map.remove(m1Var2);
                Vector vector = new Vector();
                vector.add(s6Var.c());
                map.put(m1Var2, vector);
            }
            float f = 3.0f / r3.i;
            if (f < 1.0f) {
                f = 1.0f;
            }
            dArr[5] = f;
            return a(pVar, s6Var.j(), dArr, iArr);
        }
        iArr[0] = pVar.e();
        iArr[1] = pVar.c();
        return pVar.d();
    }
}
