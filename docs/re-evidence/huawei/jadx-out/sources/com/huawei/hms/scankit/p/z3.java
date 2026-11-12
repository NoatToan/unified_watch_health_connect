package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class z3 implements o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f16452a = new EnumMap(m1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v1 f16453b = new v1();

    private s6 a(int i, int i2, g3[] g3VarArr, f2 f2Var, Map map) throws a {
        char c2;
        char c3 = 0;
        int i3 = 0;
        while (i3 <= i - 2) {
            int i4 = i3 + 1;
            int i5 = i4;
            while (i5 <= i - 1) {
                int i6 = i5 + 1;
                for (int i7 = i6; i7 <= i; i7++) {
                    int i8 = i;
                    while (i8 < i2) {
                        g3[] g3VarArr2 = {g3VarArr[i3], g3VarArr[i5], g3VarArr[i7]};
                        u6.a(g3VarArr2);
                        g3 g3Var = g3VarArr[i8];
                        try {
                            float fB = g3VarArr2[2].b();
                            float fB2 = g3VarArr2[1].b();
                            float fB3 = g3VarArr2[c3].b();
                            float fC = g3VarArr2[2].c();
                            float fC2 = g3VarArr2[1].c();
                            float fC3 = g3VarArr2[c3].c();
                            try {
                                float fMax = Math.max(Math.abs(g3VarArr2[1].b() - g3VarArr2[c3].b()), Math.abs(g3VarArr2[1].b() - g3VarArr2[2].b()));
                                c2 = 0;
                                try {
                                    float fMax2 = Math.max(Math.abs(g3VarArr2[1].c() - g3VarArr2[0].c()), Math.abs(g3VarArr2[1].c() - g3VarArr2[2].c()));
                                    if (Math.abs(((fB - fB2) + fB3) - g3Var.b()) < fMax / 2.0f && Math.abs(((fC - fC2) + fC3) - g3Var.c()) < fMax2 / 2.0f) {
                                        try {
                                            s6 s6VarA = a(f2Var.a(g3VarArr2, g3Var), f2Var, map);
                                            if (s6VarA != null) {
                                                return s6VarA;
                                            }
                                        } catch (a unused) {
                                            continue;
                                        }
                                    }
                                } catch (a unused2) {
                                }
                            } catch (a unused3) {
                                c2 = 0;
                            }
                        } catch (a unused4) {
                            c2 = c3;
                        }
                        i8++;
                        c3 = c2;
                    }
                }
                i5 = i6;
            }
            i3 = i4;
        }
        throw a.a();
    }

    private s6 a(int i, f2 f2Var, Map map) {
        int i2 = 1;
        int iMax = Math.max(1, i - 2);
        int iMin = Math.min(6, i + 2);
        int iMax2 = Math.max(Math.abs(i - iMax), Math.abs(i - iMin));
        int i3 = 0;
        k2 k2VarA = null;
        while (i3 <= iMax2 * 2) {
            i += i3 * i2;
            if (i >= iMax && i <= iMin) {
                try {
                    k2VarA = f2Var.a(i);
                    x1 x1VarA = this.f16453b.a(k2VarA.a(), map);
                    if (x1VarA.d() != null) {
                        return new s6(x1VarA.d(), x1VarA.c(), k2VarA.d(), BarcodeFormat.HARMONY_CODE);
                    }
                    continue;
                } catch (a unused) {
                    continue;
                }
            }
            i3++;
            i2 *= -1;
        }
        if (k2VarA == null || k2VarA.d().length <= 3) {
            return null;
        }
        return new s6(null, null, k2VarA.d(), BarcodeFormat.HARMONY_CODE);
    }

    @Override // com.huawei.hms.scankit.p.o6
    public s6 a(p pVar, Map map) throws a {
        f2 f2Var = new f2(pVar.b());
        g3[] g3VarArrA = f2Var.a(map);
        int length = g3VarArrA.length;
        if (length == 3) {
            u6.a(g3VarArrA);
            s6 s6VarA = a(f2Var.a(g3VarArrA, null), f2Var, map);
            if (s6VarA != null) {
                return s6VarA;
            }
        } else {
            if (length == 4) {
                g3[] g3VarArr = new g3[3];
                for (int i = 0; i < 3; i++) {
                    g3VarArr[i] = g3VarArrA[i];
                }
                u6.a(g3VarArr);
                s6 s6VarA2 = a(f2Var.a(g3VarArr, g3VarArrA[3]), f2Var, map);
                if (s6VarA2 != null) {
                    return s6VarA2;
                }
            } else {
                float fE = ((g3VarArrA[0].e() + g3VarArrA[1].e()) + g3VarArrA[2].e()) / 3.0f;
                float fE2 = g3VarArrA[length - 1].e();
                int i2 = length - 2;
                while (i2 > 2 && Math.abs(g3VarArrA[i2].e() - fE) >= Math.abs(g3VarArrA[i2].e() - fE2)) {
                    int i3 = length - i2;
                    fE2 = (((i3 - 1) * fE2) + g3VarArrA[i2].e()) / i3;
                    i2--;
                }
                return a(i2, length, g3VarArrA, f2Var, map);
            }
        }
        throw a.a();
    }
}
