package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public abstract class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d5 f16194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static p f16195b;

    private static u6 a(float f, float f2, j2 j2Var) {
        float[] fArr = j2Var.m;
        if (fArr != null && fArr.length == 5) {
            float f3 = -fArr[4];
            double d = f - fArr[0];
            double d2 = f3;
            double dCos = Math.cos(d2);
            double d3 = f2 - j2Var.m[1];
            double dSin = Math.sin(d2);
            float f4 = j2Var.m[0];
            int iSin = (int) ((((double) (-(f - f4))) * Math.sin(d2)) + (((double) (f2 - j2Var.m[1])) * Math.cos(d2)) + ((double) j2Var.m[1]));
            float[] fArr2 = j2Var.m;
            return new u6((((int) (((d * dCos) + (d3 * dSin)) + ((double) f4))) - fArr2[2]) + j2Var.r, (iSin - fArr2[3]) + j2Var.s);
        }
        return new u6(f, f2);
    }

    private static int[] a(s sVar, u6[] u6VarArr, float f, float f2, float f3, int i, int[] iArr) {
        int i2;
        int iC;
        int iC2;
        int i3 = (int) f;
        int i4 = i3;
        int i5 = 0;
        while (true) {
            i2 = ((int) f2) - 1;
            if (i4 >= i2) {
                break;
            }
            int i6 = (int) f3;
            boolean zB = sVar.b(i4, i6);
            i4++;
            if (sVar.b(i4, i6) ^ zB) {
                i5++;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i3;
            int i10 = 0;
            while (i9 < i2) {
                boolean zB2 = sVar.b(i9, i8);
                i9++;
                if (zB2 ^ sVar.b(i9, i8)) {
                    i10++;
                }
            }
            float f4 = i5;
            if (i10 > 1.5f * f4) {
                i10 = 0;
            }
            if (i10 < f4 * 0.5f) {
                i10 = 0;
            }
            iArr[i8] = i10;
            if (i10 > i7) {
                i7 = i10;
            }
        }
        if (i7 > 0) {
            float[] fArr = new float[i];
            for (int i11 = 0; i11 < i; i11++) {
                fArr[i11] = iArr[i11] / i7;
            }
            float f5 = 0.0f;
            for (int i12 = 0; i12 < i; i12++) {
                f5 += fArr[i12];
            }
            float f6 = f5 / i;
            if (f6 > 1.0d) {
                f6 = 0.99f;
            }
            iC = (int) f3;
            iC2 = iC;
            while (true) {
                if (iC2 < 0) {
                    iC2 = 0;
                    break;
                }
                if (fArr[iC2] < f6) {
                    break;
                }
                iC2--;
            }
            while (true) {
                if (iC >= i) {
                    iC = 0;
                    break;
                }
                if (fArr[iC] < f6) {
                    break;
                }
                iC++;
            }
        } else {
            iC = 0;
            iC2 = 0;
        }
        if (iC2 == 0 && iC == 0) {
            iC2 = ((int) u6VarArr[0].c()) + (-10) < 0 ? 0 : ((int) u6VarArr[0].c()) - 10;
            iC = i - 1;
            if (((int) u6VarArr[0].c()) + 10 <= iC) {
                iC = ((int) u6VarArr[0].c()) + 10;
            }
        }
        return new int[]{iC2, iC};
    }

    public static void a(s sVar, s6 s6Var, float f, j2 j2Var) {
        int iC;
        int iC2;
        u6[] u6VarArrJ = s6Var.j();
        float fMin = Math.min(u6VarArrJ[0].b(), u6VarArrJ[1].b());
        float fMax = Math.max(u6VarArrJ[0].b(), u6VarArrJ[1].b());
        float fC = u6VarArrJ[0].c();
        if (fMax > sVar.d() - 1) {
            fMax = sVar.d() - 1;
        }
        float f2 = fMax;
        float fB = fC > ((float) (sVar.b() - 1)) ? sVar.b() - 1 : fC;
        int iB = sVar.b();
        try {
            int[] iArrA = a(sVar, u6VarArrJ, fMin, f2, fB, iB, new int[iB]);
            iC = iArrA[0];
            iC2 = iArrA[1];
        } catch (IndexOutOfBoundsException unused) {
            iC = (int) u6VarArrJ[0].c();
            iC2 = (int) u6VarArrJ[0].c();
        }
        float f3 = iC;
        float f4 = iC2;
        u6[] u6VarArr = {new u6(fMin, f3), new u6(f2, f3), new u6(f2, f4), new u6(fMin, f4)};
        if (j2Var != null) {
            a(u6VarArr, f, j2Var);
        }
        s6Var.a();
        s6Var.a(u6VarArr);
    }

    public static List a(boolean z, p pVar, int i, boolean z2) {
        int iE = pVar.e();
        int iC = pVar.c();
        byte[] bArrB = pVar.a().c().b();
        d5 d5Var = new d5();
        f16194a = d5Var;
        d5Var.a(z, bArrB, iC, iE, i, z2);
        return f16194a.f16044a;
    }

    public static boolean a(boolean z, p pVar, j2 j2Var) throws a {
        float fI;
        int iE = pVar.e();
        int iC = pVar.c();
        float[] fArr = {j2Var.j(), j2Var.k(), j2Var.f(), j2Var.c()};
        if (z) {
            j2Var.n = Math.max(j2Var.m(), j2Var.l());
            j2Var.o = Math.min(j2Var.m(), j2Var.l());
            fI = j2Var.i();
            if (j2Var.g() == 11.0f || j2Var.g() == 0.0f) {
                fI = 0.0f;
            }
            j2Var.v = Math.max(fArr[2], fArr[3]);
            j2Var.r = (int) Math.max(((double) fArr[0]) - (((double) fArr[2]) * 0.5d), 0.0d);
            j2Var.s = (int) Math.max(((double) fArr[1]) - (((double) fArr[3]) * 0.5d), 0.0d);
        } else {
            fI = j2Var.i();
            j2Var.v = Math.max(fArr[2], fArr[3]);
            j2Var.r = (int) j2Var.d();
            j2Var.s = (int) j2Var.e();
        }
        j2Var.p = Math.min(iE - j2Var.r, (int) fArr[2]);
        int iMin = Math.min(iC - j2Var.s, (int) fArr[3]);
        j2Var.q = iMin;
        int i = j2Var.p;
        if (i > 0 && iMin > 0) {
            p pVarA = pVar.a(j2Var.r, j2Var.s, i, iMin);
            f16195b = pVarA;
            a(pVarA, fI, j2Var, fArr);
            return true;
        }
        throw a.a("crop_w <= 0 || crop_h <= 0");
    }

    public static void a(u6[] u6VarArr, float f, j2 j2Var) {
        if (j2Var == null || u6VarArr == null) {
            return;
        }
        for (int i = 0; i < u6VarArr.length; i++) {
            u6VarArr[i] = a((u6VarArr[i].b() * f) + j2Var.t, (u6VarArr[i].c() * f) + j2Var.u, j2Var);
        }
    }

    private static void a(p pVar, float f, j2 j2Var, float[] fArr) {
        byte[] bArrB;
        float fMin;
        float fMax;
        float radians = (float) Math.toRadians(f);
        double d = radians;
        int iAbs = (int) ((((double) j2Var.p) * Math.abs(Math.sin(d))) + (((double) j2Var.q) * Math.abs(Math.cos(d))));
        int iAbs2 = (int) ((((double) j2Var.q) * Math.abs(Math.sin(d))) + (((double) j2Var.p) * Math.abs(Math.cos(d))));
        float[] fArr2 = j2Var.m;
        fArr2[0] = iAbs2 * 0.5f;
        fArr2[1] = iAbs * 0.5f;
        fArr2[2] = (iAbs2 - j2Var.p) * 0.5f;
        fArr2[3] = (iAbs - j2Var.q) * 0.5f;
        fArr2[4] = radians;
        if (!r3.f16301b) {
            bArrB = LoadOpencvJNIUtil.removeMoirePattern(pVar.a().c().b(), j2Var.q, j2Var.p);
        } else {
            bArrB = pVar.a().c().b();
        }
        byte[] bArr = bArrB;
        if (f == 0.0f) {
            j2Var.t = 0;
            j2Var.u = 0;
            int i = j2Var.p;
            int i2 = j2Var.q;
            j2Var.l = new p(new q3(new e6(bArr, i, i2, 0, 0, i, i2, false)));
            return;
        }
        p pVar2 = new p(new q3(new e6(LoadOpencvJNIUtil.imageRotate(bArr, j2Var.q, j2Var.p, iAbs, iAbs2, f, 1.0d), iAbs2, iAbs, 0, 0, iAbs2, iAbs, false)));
        if ((j2Var.g() == 3.0f || j2Var.g() == 4.0f) && pVar2.c() > pVar2.e()) {
            fMin = Math.min(fArr[2], fArr[3]);
            fMax = Math.max(fArr[2], fArr[3]);
        } else {
            fMin = Math.max(fArr[2], fArr[3]);
            fMax = Math.min(fArr[2], fArr[3]);
        }
        j2Var.t = (int) Math.max((((double) iAbs2) * 0.5d) - (((double) fMin) * 0.5d), 0.0d);
        j2Var.u = (int) Math.max((((double) iAbs) * 0.5d) - (((double) fMax) * 0.5d), 0.0d);
        j2Var.l = pVar2.a(j2Var.t, j2Var.u, Math.min(iAbs2 - j2Var.t, (int) fMin), Math.min(iAbs - j2Var.u, (int) fMax));
    }
}
