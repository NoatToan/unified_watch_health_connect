package com.huawei.hms.scankit.p;

import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class f2 {
    private static final int[] g = {com.huawei.hms.kit.awareness.barrier.internal.e.a.C, FitnessSleepType.HW_FITNESS_DREAM, 264, 244, 270, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE};
    private static final int[] h = {21, 25, 29, 33, 37, 41};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v6 f16085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g3 f16086c;
    private g3 d;
    private g3 e;
    private g3 f;

    public f2(s sVar) {
        this.f16084a = sVar;
    }

    protected final float a(u6 u6Var, u6 u6Var2, u6 u6Var3, s sVar) throws a {
        float fA = a((int) u6Var.b(), (int) u6Var.c(), sVar);
        float fA2 = a((int) u6Var2.b(), (int) u6Var2.c(), sVar);
        float fA3 = a((int) u6Var3.b(), (int) u6Var3.c(), sVar);
        return (((((fA + fA2) + fA3) + b((int) u6Var.c(), (int) u6Var.b(), sVar)) + b((int) u6Var2.c(), (int) u6Var2.b(), sVar)) + b((int) u6Var3.c(), (int) u6Var3.b(), sVar)) / 6.0f;
    }

    private float b(int i, int i2, s sVar) throws a {
        int iB = sVar.b();
        int[] iArr = new int[5];
        for (int i3 = 0; i3 < 5; i3++) {
            iArr[i3] = 0;
        }
        int i4 = i;
        while (i4 >= 0 && sVar.b(i2, i4)) {
            iArr[2] = iArr[2] + 1;
            i4--;
        }
        if (i4 >= 0) {
            while (i4 >= 0 && !sVar.b(i2, i4)) {
                iArr[1] = iArr[1] + 1;
                i4--;
            }
            if (i4 >= 0) {
                while (i4 >= 0 && sVar.b(i2, i4)) {
                    iArr[0] = iArr[0] + 1;
                    i4--;
                }
                int i5 = i + 1;
                while (i5 < iB && sVar.b(i2, i5)) {
                    iArr[2] = iArr[2] + 1;
                    i5++;
                }
                if (i5 != iB) {
                    while (i5 < iB && !sVar.b(i2, i5)) {
                        iArr[3] = iArr[3] + 1;
                        i5++;
                    }
                    if (i5 != iB) {
                        while (i5 < iB && sVar.b(i2, i5)) {
                            iArr[4] = iArr[4] + 1;
                            i5++;
                        }
                        return ((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4]) / 6.0f;
                    }
                    throw a.a();
                }
                throw a.a();
            }
            throw a.a();
        }
        throw a.a();
    }

    private float a(int i, int i2, s sVar) throws a {
        int iD = sVar.d();
        int[] iArr = new int[5];
        for (int i3 = 0; i3 < 5; i3++) {
            iArr[i3] = 0;
        }
        int i4 = i;
        while (i4 >= 0 && sVar.b(i4, i2)) {
            iArr[2] = iArr[2] + 1;
            i4--;
        }
        if (i4 >= 0) {
            while (i4 >= 0 && !sVar.b(i4, i2)) {
                iArr[1] = iArr[1] + 1;
                i4--;
            }
            if (i4 >= 0) {
                while (i4 >= 0 && sVar.b(i4, i2)) {
                    iArr[0] = iArr[0] + 1;
                    i4--;
                }
                int i5 = i + 1;
                while (i5 < iD && sVar.b(i5, i2)) {
                    iArr[2] = iArr[2] + 1;
                    i5++;
                }
                if (i5 != iD) {
                    while (i5 < iD && !sVar.b(i5, i2)) {
                        iArr[3] = iArr[3] + 1;
                        i5++;
                    }
                    if (i5 != iD) {
                        while (i5 < iD && sVar.b(i5, i2)) {
                            iArr[4] = iArr[4] + 1;
                            i5++;
                        }
                        return ((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4]) / 6.0f;
                    }
                    throw a.a();
                }
                throw a.a();
            }
            throw a.a();
        }
        throw a.a();
    }

    private static int a(u6 u6Var, u6 u6Var2, u6 u6Var3, float f) {
        float fA = ((u6.a(u6Var, u6Var2) / f) + (u6.a(u6Var, u6Var3) / f)) / 2.0f;
        if (fA >= 28.1f && fA <= 31.1f) {
            return 1;
        }
        if (fA >= 31.7f && fA <= 34.7f) {
            return 2;
        }
        if (fA >= 35.9f && fA <= 38.9f) {
            return 3;
        }
        if (fA >= 41.7f && fA <= 44.7f) {
            return 4;
        }
        if (fA >= 46.3f && fA <= 49.3f) {
            return 5;
        }
        if (fA < 54.4f || fA > 57.4f) {
            return Math.round((fA - 25.0f) / 4.0f);
        }
        return 6;
    }

    private static d6 a(u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4, u6 u6Var5, u6 u6Var6, u6 u6Var7, u6 u6Var8) {
        return d6.a(u6Var5.b(), u6Var5.c(), u6Var6.b(), u6Var6.c(), u6Var8.b(), u6Var8.c(), u6Var7.b(), u6Var7.c(), u6Var.b(), u6Var.c(), u6Var2.b(), u6Var2.c(), u6Var4.b(), u6Var4.c(), u6Var3.b(), u6Var3.c());
    }

    public final g3[] a(Map map) {
        v6 v6Var = map == null ? null : (v6) map.get(m1.j);
        this.f16085b = v6Var;
        return new h3(this.f16084a, v6Var).a(map);
    }

    public final k2 a(int i) throws a {
        s sVarA;
        int i2 = i - 1;
        double d = g[i2];
        float fCos = (float) ((Math.cos(0.7853981633974483d) * d) + 300.0d);
        float fCos2 = (float) (300.0d - (d * Math.cos(0.7853981633974483d)));
        s sVarA2 = a(this.f16084a, a(this.d, this.e, this.f16086c, this.f, new u6(fCos2, fCos2), new u6(fCos, fCos2), new u6(fCos2, fCos), new u6(fCos, fCos)), 600);
        int i3 = h[i2];
        s sVar = new s(i3, i3);
        switch (i) {
            case 1:
                sVarA = e8.a(sVar, sVarA2, i3, 300.0d);
                break;
            case 2:
                sVarA = h8.a(sVar, sVarA2, i3, 300.0d);
                break;
            case 3:
                sVarA = g8.a(sVar, sVarA2, i3, 300.0d);
                break;
            case 4:
                sVarA = d8.a(sVar, sVarA2, i3, 300.0d);
                break;
            case 5:
                sVarA = c8.a(sVar, sVarA2, i3, 300.0d);
                break;
            case 6:
                sVarA = f8.a(sVar, sVarA2, i3, 300.0d);
                break;
            default:
                throw a.a();
        }
        return new k2(sVarA, new u6[]{this.f16086c, this.d, this.e, this.f});
    }

    public final int a(g3[] g3VarArr, g3 g3Var) throws a {
        this.f16086c = g3VarArr[0];
        this.d = g3VarArr[1];
        g3 g3Var2 = g3VarArr[2];
        this.e = g3Var2;
        if (g3Var == null) {
            float fB = g3Var2.b();
            float fB2 = this.d.b();
            this.f = new g3((fB - fB2) + this.f16086c.b(), (this.e.c() - this.d.c()) + this.f16086c.c(), 6.0f);
        } else {
            this.f = g3Var;
        }
        float fA = a(this.d, this.e, this.f16086c, this.f16084a);
        if (fA >= 1.0f) {
            int iA = a(this.d, this.e, this.f16086c, fA);
            if (iA < 0 || iA > 7) {
                throw a.a();
            }
            return iA;
        }
        throw a.a();
    }

    private static s a(s sVar, d6 d6Var, int i) {
        return s3.a().a(sVar, i, i, d6Var, false);
    }
}
