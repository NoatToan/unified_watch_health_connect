package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v6 f16109b;

    public h2(s sVar) {
        this.f16108a = sVar;
    }

    protected final float a(u6 u6Var, u6 u6Var2, u6 u6Var3) {
        return (a(u6Var, u6Var2) + a(u6Var, u6Var3)) / 2.0f;
    }

    private float b(int i, int i2, int i3, int i4) {
        float fD;
        float fB;
        float fA = a(i, i2, i3, i4);
        int iD = i - (i3 - i);
        if (i == iD) {
            return Float.NaN;
        }
        int iB = 0;
        if (iD < 0) {
            fD = i / (i - iD);
            iD = 0;
        } else if (iD >= this.f16108a.d()) {
            fD = ((this.f16108a.d() - 1) - i) / (iD - i);
            iD = this.f16108a.d() - 1;
        } else {
            fD = 1.0f;
        }
        float f = i2;
        int i5 = (int) (f - ((i4 - i2) * fD));
        if (i2 == i5) {
            return Float.NaN;
        }
        if (i5 < 0) {
            fB = f / (i2 - i5);
        } else if (i5 >= this.f16108a.b()) {
            fB = ((this.f16108a.b() - 1) - i2) / (i5 - i2);
            iB = this.f16108a.b() - 1;
        } else {
            iB = i5;
            fB = 1.0f;
        }
        float fA2 = a(i, i2, (int) (i + ((iD - i) * fB)), iB);
        if (Math.max(fA, fA2) > ((double) Math.min(fA, fA2)) * 1.5d) {
            return Float.NaN;
        }
        return (fA + fA2) - 1.0f;
    }

    private float a(u6 u6Var, u6 u6Var2) {
        float fB = b((int) u6Var.b(), (int) u6Var.c(), (int) u6Var2.b(), (int) u6Var2.c());
        float fB2 = b((int) u6Var2.b(), (int) u6Var2.c(), (int) u6Var.b(), (int) u6Var.c());
        if (Float.isNaN(fB)) {
            return fB2 / 7.0f;
        }
        return Float.isNaN(fB2) ? fB / 7.0f : (fB + fB2) / 14.0f;
    }

    private u6 a(u6 u6Var) {
        float fB = u6Var.b();
        float fC = u6Var.c();
        int iD = this.f16108a.d();
        int iB = this.f16108a.b();
        if (fB < 0.0f) {
            fB = 0.0f;
        }
        float f = iD - 1;
        if (fB > f) {
            fB = f;
        }
        if (fC < 0.0f) {
            fC = 0.0f;
        }
        float f2 = iB - 1;
        if (fC > f2) {
            fC = f2;
        }
        return new u6(fB, fC, u6Var.d());
    }

    private static int a(u6 u6Var, u6 u6Var2, u6 u6Var3, float f) {
        try {
            int iA = (s4.a(u6.a(u6Var, u6Var2) / f) + s4.a(u6.a(u6Var, u6Var3) / f)) / 2;
            int i = iA + 7;
            int i2 = i & 3;
            if (i2 == 0) {
                return iA + 8;
            }
            if (i2 == 2) {
                return iA + 6;
            }
            if (i2 != 3) {
                return i;
            }
            throw a.a();
        } catch (a unused) {
            int iA2 = (((int) (u6.a(u6Var, u6Var2) / f)) + ((int) (u6.a(u6Var, u6Var3) / f))) / 2;
            int i3 = iA2 + 7;
            int i4 = i3 & 3;
            if (i4 == 0) {
                return iA2 + 8;
            }
            if (i4 != 2) {
                return i4 != 3 ? i3 : iA2 + 9;
            }
            return iA2 + 6;
        }
    }

    private static d6 a(u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4, u6 u6Var5, int i) {
        float fB;
        float fC;
        float fB2;
        float fC2;
        float f = i - 3.5f;
        if (u6Var4 != null) {
            float fB3 = u6Var4.b();
            fB = fB3;
            fC = u6Var4.c();
            fB2 = u6Var5.b();
            fC2 = u6Var5.c();
        } else {
            fB = (u6Var2.b() - u6Var.b()) + u6Var3.b();
            fC = (u6Var2.c() - u6Var.c()) + u6Var3.c();
            fB2 = f;
            fC2 = fB2;
        }
        return d6.a(3.5f, 3.5f, f, 3.5f, fB2, fC2, 3.5f, f, u6Var.b(), u6Var.c(), u6Var2.b(), u6Var2.c(), fB, fC, u6Var3.b(), u6Var3.c());
    }

    public final k2 a(Map map) {
        this.f16109b = map == null ? null : (v6) map.get(m1.j);
        return a(new i3(this.f16108a, this.f16109b).b());
    }

    private int a(e3 e3Var, e3 e3Var2, e3 e3Var3, float f, int i, b8 b8Var, d[] dVarArr, d[] dVarArr2, int i2, int i3, d[] dVarArr3) {
        int i4;
        int i5;
        float fB = e3Var2.b();
        float fB2 = e3Var.b();
        float fB3 = e3Var3.b();
        float fC = e3Var2.c();
        float fC2 = e3Var.c();
        float fC3 = e3Var3.c();
        float f2 = i3;
        float f3 = 3.0f / f2;
        float f4 = 1.0f - f3;
        int iB = (int) (e3Var.b() + ((((fB - fB2) + fB3) - e3Var.b()) * f4));
        int iC = (int) (e3Var.c() + (f4 * (((fC - fC2) + fC3) - e3Var.c())));
        if (r3.v[0] && i3 == 22) {
            i5 = 8;
            i4 = 2;
        } else {
            i4 = 4;
            i5 = 16;
        }
        for (int i6 = i4; i6 <= i5; i6 <<= 1) {
            try {
                dVarArr3[0] = a(f, iB, iC, i6);
                break;
            } catch (a unused) {
            }
        }
        float f5 = i - 6.5f;
        dVarArr3[1] = new d(f5, f5, e3Var3.e());
        d dVar = dVarArr3[0];
        if (dVar != null && s4.a(iB, iC, dVar.b(), dVarArr3[0].c()) > f * 4.0f) {
            dVarArr3[0] = null;
        }
        if (dVarArr3[0] == null && i2 > 2) {
            int i7 = i2 - 2;
            dVarArr3[1] = new d(b8Var.c()[i7] + 0.5f, f5, e3Var3.e());
            int iC2 = (int) (e3Var3.c() - (f3 * (e3Var3.c() - e3Var.c())));
            int iB2 = (int) ((((b8Var.c()[i7] - 3.0f) / f2) * (e3Var2.b() - e3Var.b())) + e3Var3.b());
            while (i4 <= i5) {
                try {
                    dVarArr3[0] = a(f, iB2, iC2, i4);
                    break;
                } catch (a unused2) {
                    i4 <<= 1;
                }
            }
            d dVar2 = dVarArr3[0];
            if (dVar2 != null && s4.a(iB2, iC2, dVar2.b(), dVarArr3[0].c()) > f * 4.0f) {
                dVarArr3[0] = null;
            }
        }
        if (r3.p && r3.m) {
            return a(b8Var, i3, e3Var2, e3Var, e3Var3, f, i2, 0, dVarArr, dVarArr2);
        }
        return 0;
    }

    protected final d a(float f, int i, int i2, float f2) throws a {
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        int iMin = Math.min(this.f16108a.d() - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin >= f3) {
            int iMax2 = Math.max(0, i2 - i3);
            int iMin2 = Math.min(this.f16108a.b() - 1, i2 + i3) - iMax2;
            if (iMin2 >= f3) {
                return new e(this.f16108a, iMax, iMax2, iMin, iMin2, f, this.f16109b).a();
            }
            throw a.a();
        }
        throw a.a();
    }

    private k2 a(e3 e3Var, e3 e3Var2, e3 e3Var3, float f, int i) {
        s sVar = new s(i, i);
        float f2 = i;
        float fB = this.f16108a.b() / f2;
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                double d = ((double) fB) * 0.5d;
                int i4 = (int) (((double) (i3 * fB)) + d);
                int i5 = (int) (((double) (i2 * fB)) + d);
                if (i4 >= -1 && i4 <= this.f16108a.d() && i5 >= -1 && i5 <= this.f16108a.b()) {
                    if (this.f16108a.b(i4, i5)) {
                        sVar.c(i3, i2);
                    }
                } else {
                    sVar.c(i3, i2);
                }
            }
        }
        u6[] u6VarArr = {e3Var3, e3Var, e3Var2};
        float[] fArr = {0.0f, 0.0f, f2, 0.0f, f2, f2, 0.0f, f2};
        a(e3Var, e3Var2, e3Var3, null, null, i).a(fArr);
        return new k2(sVar, u6VarArr, new u6[]{a(new u6(fArr[6], fArr[7])), a(new u6(fArr[0], fArr[1])), a(new u6(fArr[2], fArr[3])), a(new u6(fArr[4], fArr[5]))}, f);
    }

    private k2 a(e3 e3Var, e3 e3Var2, e3 e3Var3, float f) throws a {
        d[] dVarArr;
        int iA;
        u6[] u6VarArr;
        int iA2 = a((u6) e3Var, (u6) e3Var2, (u6) e3Var3, f);
        r3.w.push(Integer.valueOf(iA2));
        b8 b8VarB = b8.b(iA2);
        if (r3.s && r3.f16302c) {
            return a(e3Var, e3Var2, e3Var3, f, iA2);
        }
        int iD = b8VarB.d();
        int length = b8VarB.c().length;
        int i = length * length;
        d[] dVarArr2 = new d[i];
        d[] dVarArr3 = new d[i];
        d[] dVarArr4 = new d[2];
        if (b8VarB.c().length > 0) {
            dVarArr = dVarArr4;
            iA = a(e3Var, e3Var2, e3Var3, f, iA2, b8VarB, dVarArr2, dVarArr3, length, iD - 7, dVarArr);
        } else {
            dVarArr = dVarArr4;
            iA = 0;
        }
        d dVar = dVarArr[0];
        d6 d6VarA = a(e3Var, e3Var2, e3Var3, dVar, dVarArr[1], iA2);
        if (r3.p && r3.m) {
            a(d6VarA, length, iA2, e3Var, e3Var2, e3Var3, dVarArr2, iA, dVarArr3);
        }
        s sVarA = a(this.f16108a, d6VarA, iA2);
        if (dVar == null) {
            u6VarArr = new u6[]{e3Var3, e3Var, e3Var2};
        } else {
            u6VarArr = new u6[]{e3Var3, e3Var, e3Var2, dVar};
        }
        float f2 = iA2;
        float[] fArr = {0.0f, 0.0f, f2, 0.0f, f2, f2, 0.0f, f2};
        d6VarA.a(fArr);
        return new k2(sVarA, u6VarArr, new u6[]{a(new u6(fArr[6], fArr[7])), a(new u6(fArr[0], fArr[1], e3Var.d())), a(new u6(fArr[r10], fArr[3], e3Var2.d())), a(new u6(fArr[4], fArr[5], e3Var3.d()))}, f);
    }

    protected final k2 a(k3 k3Var) throws a {
        e3 e3VarB = k3Var.b();
        e3 e3VarC = k3Var.c();
        e3 e3VarA = k3Var.a();
        try {
            float fA = a(e3VarB, e3VarC, e3VarA);
            if (fA >= 1.0f) {
                return a(e3VarB, e3VarC, e3VarA, fA);
            }
            throw a.a();
        } catch (a unused) {
            float fE = ((e3VarB.e() + e3VarC.e()) + e3VarA.e()) / 3.0f;
            if (fE >= 1.0f) {
                return a(e3VarB, e3VarC, e3VarA, fE);
            }
            throw a.a();
        }
    }

    private void a(d6 d6Var, int i, int i2, e3 e3Var, e3 e3Var2, e3 e3Var3, d[] dVarArr, int i3, d[] dVarArr2) {
        int i4 = i3 + 3;
        int i5 = i4 * 2;
        float[] fArr = new float[i5];
        float[] fArr2 = new float[i5];
        fArr[0] = e3Var.b();
        fArr[1] = e3Var.c();
        fArr[2] = e3Var2.b();
        fArr[3] = e3Var2.c();
        fArr[4] = e3Var3.b();
        fArr[5] = e3Var3.c();
        fArr2[0] = 3.5f;
        fArr2[1] = 3.5f;
        float f = i2 - 3.5f;
        fArr2[2] = f;
        fArr2[3] = 3.5f;
        fArr2[4] = 3.5f;
        fArr2[5] = f;
        int i6 = 6;
        int i7 = 6;
        for (int i8 = 0; i8 < i * i; i8++) {
            d dVar = dVarArr[i8];
            if (dVar != null) {
                fArr[i7] = dVar.b();
                fArr[i7 + 1] = dVarArr[i8].c();
                fArr2[i6] = dVarArr2[i8].b();
                fArr2[i6 + 1] = dVarArr2[i8].c();
                i6 += 2;
                i7 += 2;
            }
        }
        float[] fArrQuadFitting = LoadOpencvJNIUtil.QuadFitting(fArr2, i4, fArr);
        if (fArrQuadFitting.length != 0) {
            d6Var.a(fArrQuadFitting[0], fArrQuadFitting[1], fArrQuadFitting[2], fArrQuadFitting[3], fArrQuadFitting[4], fArrQuadFitting[5], fArrQuadFitting[6], fArrQuadFitting[7], fArrQuadFitting[8], fArrQuadFitting[9], fArrQuadFitting[10], fArrQuadFitting[11], fArrQuadFitting[12], fArrQuadFitting[13]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[RETURN] */
    private float a(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int iAbs = Math.abs(i7 - i5);
        int iAbs2 = Math.abs(i8 - i6);
        int i11 = 2;
        int i12 = (-iAbs) / 2;
        int i13 = i5 < i7 ? 1 : -1;
        int i14 = i6 < i8 ? 1 : -1;
        int i15 = i7 + i13;
        int i16 = i5;
        int i17 = i6;
        int i18 = 0;
        while (i16 != i15) {
            if ((i18 == i10 ? i10 : 0) == this.f16108a.b(z ? i17 : i16, z ? i16 : i17)) {
                if (i18 == 2) {
                    return s4.a(i16, i17, i5, i6);
                }
                i18++;
            }
            i12 += iAbs2;
            if (i12 > 0) {
                if (i17 == i8) {
                    i9 = 2;
                    if (i18 == i9) {
                        return s4.a(i15, i8, i5, i6);
                    }
                    return Float.NaN;
                }
                i17 += i14;
                i12 -= iAbs;
            }
            i16 += i13;
            i15 = i15;
            z = z;
            i10 = 1;
            i11 = 2;
        }
        i15 = i15;
        i9 = i11;
        if (i18 == i9) {
            return s4.a(i15, i8, i5, i6);
        }
        return Float.NaN;
    }

    private int a(b8 b8Var, int i, e3 e3Var, e3 e3Var2, e3 e3Var3, float f, int i2, int i3, d[] dVarArr, d[] dVarArr2) {
        int i4;
        int i5;
        int i6;
        float f2;
        int i7 = i3;
        int i8 = 0;
        while (i8 < i2) {
            if (i8 == 0) {
                i4 = i2 - 1;
                i5 = 1;
            } else {
                i4 = i2;
                i5 = 0;
            }
            int i9 = i8 != i2 + (-1) ? i5 : 1;
            float f3 = i;
            float f4 = 3.0f;
            float fB = ((b8Var.c()[i8] - 3.0f) * (e3Var.b() - e3Var2.b())) / f3;
            float fB2 = e3Var2.b();
            float fC = ((b8Var.c()[i8] - 3.0f) * (e3Var.c() - e3Var2.c())) / f3;
            float fC2 = e3Var2.c();
            while (i9 < i4) {
                int iC = (int) ((fC + fC2) - (((b8Var.c()[i9] - f4) * (e3Var2.c() - e3Var3.c())) / f3));
                int iB = (int) ((fB + fB2) - (((b8Var.c()[i9] - f4) * (e3Var2.b() - e3Var3.b())) / f3));
                int i10 = 4;
                int i11 = 4;
                while (true) {
                    if (i11 > i10) {
                        i6 = i4;
                        f2 = fB;
                        break;
                    }
                    int i12 = (i8 * i2) + i9;
                    try {
                        dVarArr[i12] = a(f, iB, iC, i11);
                        i6 = i4;
                        try {
                            f2 = fB;
                            try {
                                dVarArr2[i12] = new d(b8Var.c()[i8] + 0.5f, b8Var.c()[i9] + 0.5f, e3Var3.e());
                                i7++;
                                break;
                            } catch (a unused) {
                                continue;
                                i11 <<= 1;
                                i2 = i2;
                                fB = f2;
                                i4 = i6;
                                i10 = 4;
                            }
                        } catch (a unused2) {
                            f2 = fB;
                        }
                    } catch (a unused3) {
                        i6 = i4;
                    }
                    i11 <<= 1;
                    i2 = i2;
                    fB = f2;
                    i4 = i6;
                    i10 = 4;
                }
                i9++;
                i2 = i2;
                fB = f2;
                i4 = i6;
                f4 = 3.0f;
            }
            i8++;
        }
        return i7;
    }

    private static s a(s sVar, d6 d6Var, int i) {
        return s3.a().a(sVar, i, i, d6Var, true);
    }
}
