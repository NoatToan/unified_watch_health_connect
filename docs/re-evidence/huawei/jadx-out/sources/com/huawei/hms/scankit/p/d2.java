package com.huawei.hms.scankit.p;

import com.huawei.hihealth.HiDataFilter;

/* JADX INFO: loaded from: classes34.dex */
public final class d2 {
    private static final int[] g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16038c;
    private int d;
    private int e;
    private int f;

    public d2(s sVar) {
        this.f16036a = sVar;
    }

    public g a(boolean z) throws com.huawei.hms.scankit.p.a {
        u6[] u6VarArrA = a(b());
        if (z) {
            u6 u6Var = u6VarArrA[0];
            u6VarArrA[0] = u6VarArrA[2];
            u6VarArrA[2] = u6Var;
        }
        a(u6VarArrA);
        s sVar = this.f16036a;
        int i = this.f;
        return new g(a(sVar, u6VarArrA[i % 4], u6VarArrA[(i + 1) % 4], u6VarArrA[(i + 2) % 4], u6VarArrA[(i + 3) % 4]), b(u6VarArrA), this.f16037b, this.d, this.f16038c);
    }

    private int b(a aVar, a aVar2) {
        float fA = a(aVar, aVar2);
        float fA2 = (aVar2.a() - aVar.a()) / fA;
        float fB = (aVar2.b() - aVar.b()) / fA;
        float fA3 = aVar.a();
        float fB2 = aVar.b();
        boolean zB = this.f16036a.b(aVar.a(), aVar.b());
        int iCeil = (int) Math.ceil(fA);
        int i = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            fA3 += fA2;
            fB2 += fB;
            if (this.f16036a.b(s4.a(fA3), s4.a(fB2)) != zB) {
                i++;
            }
        }
        float f = i / fA;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == zB ? 1 : -1;
        }
        return 0;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f16039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f16040b;

        u6 c() {
            return new u6(this.f16039a, this.f16040b);
        }

        public String toString() {
            return HiDataFilter.DataFilterExpression.LESS_THAN + this.f16039a + ' ' + this.f16040b + '>';
        }

        a(int i, int i2) {
            this.f16039a = i;
            this.f16040b = i2;
        }

        int a() {
            return this.f16039a;
        }

        int b() {
            return this.f16040b;
        }
    }

    private static float a(a aVar, a aVar2) {
        return s4.a(aVar.a(), aVar.b(), aVar2.a(), aVar2.b());
    }

    private u6[] b(u6[] u6VarArr) {
        return a(u6VarArr, this.e * 2, a());
    }

    private static float a(u6 u6Var, u6 u6Var2) {
        return s4.a(u6Var.b(), u6Var.c(), u6Var2.b(), u6Var2.c());
    }

    private boolean b(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a(aVar.a() - 3, aVar.b() + 3);
        a aVar6 = new a(aVar2.a() - 3, aVar2.b() - 3);
        a aVar7 = new a(aVar3.a() + 3, aVar3.b() - 3);
        a aVar8 = new a(aVar4.a() + 3, aVar4.b() + 3);
        int iB = b(aVar8, aVar5);
        return iB != 0 && b(aVar5, aVar6) == iB && b(aVar6, aVar7) == iB && b(aVar7, aVar8) == iB;
    }

    private a b() {
        u6 u6VarC;
        u6 u6VarC2;
        u6 u6Var;
        u6 u6Var2;
        u6 u6VarC3;
        u6 u6VarC4;
        u6 u6Var3;
        u6 u6Var4;
        try {
            u6[] u6VarArrA = new j8(this.f16036a).a();
            u6Var2 = u6VarArrA[0];
            u6VarC = u6VarArrA[1];
            u6Var = u6VarArrA[2];
            u6VarC2 = u6VarArrA[3];
        } catch (com.huawei.hms.scankit.p.a unused) {
            int iD = this.f16036a.d() / 2;
            int iB = this.f16036a.b() / 2;
            int i = iD + 7;
            int i2 = iB - 7;
            u6 u6VarC5 = a(new a(i, i2), false, 1, -1).c();
            int i3 = iB + 7;
            u6VarC = a(new a(i, i3), false, 1, 1).c();
            int i4 = iD - 7;
            u6 u6VarC6 = a(new a(i4, i3), false, -1, 1).c();
            u6VarC2 = a(new a(i4, i2), false, -1, -1).c();
            u6Var = u6VarC6;
            u6Var2 = u6VarC5;
        }
        int iA = s4.a((((u6Var2.b() + u6VarC2.b()) + u6VarC.b()) + u6Var.b()) / 4.0f);
        int iA2 = s4.a((((u6Var2.c() + u6VarC2.c()) + u6VarC.c()) + u6Var.c()) / 4.0f);
        try {
            u6[] u6VarArrA2 = new j8(this.f16036a, 15, iA, iA2).a();
            u6VarC3 = u6VarArrA2[0];
            u6VarC4 = u6VarArrA2[1];
            u6Var3 = u6VarArrA2[2];
            u6Var4 = u6VarArrA2[3];
        } catch (com.huawei.hms.scankit.p.a unused2) {
            int i5 = iA + 7;
            int i6 = iA2 - 7;
            u6VarC3 = a(new a(i5, i6), false, 1, -1).c();
            int i7 = iA2 + 7;
            u6VarC4 = a(new a(i5, i7), false, 1, 1).c();
            int i8 = iA - 7;
            u6 u6VarC7 = a(new a(i8, i7), false, -1, 1).c();
            u6 u6VarC8 = a(new a(i8, i6), false, -1, -1).c();
            u6Var3 = u6VarC7;
            u6Var4 = u6VarC8;
        }
        return new a(s4.a((((u6VarC3.b() + u6Var4.b()) + u6VarC4.b()) + u6Var3.b()) / 4.0f), s4.a((((u6VarC3.c() + u6Var4.c()) + u6VarC4.c()) + u6Var3.c()) / 4.0f));
    }

    private static u6[] a(u6[] u6VarArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float fB = u6VarArr[0].b();
        float fB2 = u6VarArr[2].b();
        float fC = u6VarArr[0].c();
        float fC2 = u6VarArr[2].c();
        float fB3 = (u6VarArr[0].b() + u6VarArr[2].b()) / 2.0f;
        float fC3 = (u6VarArr[0].c() + u6VarArr[2].c()) / 2.0f;
        float f2 = (fB - fB2) * f;
        float f3 = (fC - fC2) * f;
        u6 u6Var = new u6(fB3 + f2, fC3 + f3);
        u6 u6Var2 = new u6(fB3 - f2, fC3 - f3);
        float fB4 = u6VarArr[1].b();
        float fB5 = u6VarArr[3].b();
        float fC4 = u6VarArr[1].c();
        float fC5 = u6VarArr[3].c();
        float fB6 = (u6VarArr[1].b() + u6VarArr[3].b()) / 2.0f;
        float fC6 = (u6VarArr[1].c() + u6VarArr[3].c()) / 2.0f;
        float f4 = (fB4 - fB5) * f;
        float f5 = f * (fC4 - fC5);
        return new u6[]{u6Var, new u6(fB6 + f4, fC6 + f5), u6Var2, new u6(fB6 - f4, fC6 - f5)};
    }

    private void a(u6[] u6VarArr) throws com.huawei.hms.scankit.p.a {
        long j;
        long j2;
        if (a(u6VarArr[0]) && a(u6VarArr[1]) && a(u6VarArr[2]) && a(u6VarArr[3])) {
            int i = this.e * 2;
            int[] iArr = {a(u6VarArr[0], u6VarArr[1], i), a(u6VarArr[1], u6VarArr[2], i), a(u6VarArr[2], u6VarArr[3], i), a(u6VarArr[3], u6VarArr[0], i)};
            this.f = a(iArr, i);
            long j3 = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = iArr[(this.f + i2) % 4];
                if (this.f16037b) {
                    j = j3 << 7;
                    j2 = (i3 >> 1) & 127;
                } else {
                    j = j3 << 10;
                    j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
                }
                j3 = j + j2;
            }
            int iA = a(j3, this.f16037b);
            if (this.f16037b) {
                this.f16038c = (iA >> 6) + 1;
                this.d = (iA & 63) + 1;
                return;
            } else {
                this.f16038c = (iA >> 11) + 1;
                this.d = (iA & 2047) + 1;
                return;
            }
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u6[] a(a aVar) throws com.huawei.hms.scankit.p.a {
        int i;
        int i2;
        int i3 = 1;
        this.e = 1;
        a aVar2 = aVar;
        a aVar3 = aVar2;
        a aVar4 = aVar3;
        a aVar5 = aVar4;
        boolean z = true;
        while (true) {
            if (this.e >= 9) {
                i = i3;
                break;
            }
            a aVarA = a(aVar2, z, i3, -1);
            a aVarA2 = a(aVar3, z, i3, i3);
            a aVarA3 = a(aVar4, z, -1, i3);
            a aVarA4 = a(aVar5, z, -1, -1);
            if (this.e > 2) {
                double dA = (a(aVarA4, aVarA) * this.e) / (a(aVar5, aVar2) * (this.e + 2));
                if (dA < 0.75d || dA > 1.25d || !a(aVarA, aVarA2, aVarA3, aVarA4) || (!b(aVarA, aVarA2, aVarA3, aVarA4) && ((i2 = this.e) == 5 || i2 == 7))) {
                    i = 1;
                    break;
                }
            }
            z = !z;
            this.e++;
            aVar5 = aVarA4;
            aVar2 = aVarA;
            aVar3 = aVarA2;
            aVar4 = aVarA3;
            i3 = 1;
        }
        int i4 = this.e;
        if (i4 != 5 && i4 != 7) {
            throw com.huawei.hms.scankit.p.a.a();
        }
        this.f16037b = i4 == 5 ? i : 0;
        u6[] u6VarArr = {new u6(aVar2.a() + 0.5f, aVar2.b() - 0.5f), new u6(aVar3.a() + 0.5f, aVar3.b() + 0.5f), new u6(aVar4.a() - 0.5f, aVar4.b() + 0.5f), new u6(aVar5.a() - 0.5f, aVar5.b() - 0.5f)};
        int i5 = this.e * 2;
        return a(u6VarArr, i5 - 3, i5);
    }

    private static int a(long j, boolean z) throws com.huawei.hms.scankit.p.a {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int[] iArr = new int[i];
        for (int i3 = i - 1; i3 >= 0; i3--) {
            iArr[i3] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new p6(o3.k).a(iArr, i - i2);
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                i4 = (i4 << 4) + iArr[i5];
            }
            return i4;
        } catch (com.huawei.hms.scankit.p.a unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private int a() {
        if (this.f16037b) {
            return (this.f16038c * 4) + 11;
        }
        int i = this.f16038c;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    private a a(a aVar, boolean z, int i, int i2) {
        int iA = aVar.a() + i;
        int iB = aVar.b();
        while (true) {
            iB += i2;
            if (!a(iA, iB) || this.f16036a.b(iA, iB) != z) {
                break;
            }
            iA += i;
        }
        int i3 = iA - i;
        int i4 = iB - i2;
        while (a(i3, i4) && this.f16036a.b(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (a(i5, i4) && this.f16036a.b(i5, i4) == z) {
            i4 += i2;
        }
        return new a(i5, i4 - i2);
    }

    private static int a(int[] iArr, int i) throws com.huawei.hms.scankit.p.a {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if (Integer.bitCount(g[i4] ^ (((i2 & 1) << 11) + (i2 >> 1))) <= 2) {
                return i4;
            }
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    private boolean a(a aVar, a aVar2, a aVar3, a aVar4) {
        a aVar5 = new a((int) Math.ceil((((aVar.f16039a + aVar2.f16039a) + aVar3.f16039a) + aVar4.f16039a) / 4.0f), (int) Math.ceil((((aVar.f16040b + aVar2.f16040b) + aVar3.f16040b) + aVar4.f16040b) / 4.0f));
        float fA = a(aVar5, aVar);
        float fA2 = a(aVar5, aVar2);
        float fA3 = a(aVar5, aVar3);
        float fA4 = a(aVar5, aVar4);
        double d = fA / fA2;
        if (d <= 0.75d || d >= 1.25d) {
            return false;
        }
        double d2 = fA / fA3;
        if (d2 <= 0.75d || d2 >= 1.25d) {
            return false;
        }
        double d3 = fA / fA4;
        return d3 > 0.75d && d3 < 1.25d;
    }

    private boolean a(int i, int i2) {
        return i >= 0 && i < this.f16036a.d() && i2 > 0 && i2 < this.f16036a.b();
    }

    private boolean a(u6 u6Var) {
        return a(s4.a(u6Var.b()), s4.a(u6Var.c()));
    }

    private int a(u6 u6Var, u6 u6Var2, int i) {
        float fA = a(u6Var, u6Var2);
        float f = fA / i;
        float fB = u6Var.b();
        float fC = u6Var.c();
        float fB2 = ((u6Var2.b() - u6Var.b()) * f) / fA;
        float fC2 = (f * (u6Var2.c() - u6Var.c())) / fA;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.f16036a.b(s4.a((f2 * fB2) + fB), s4.a((f2 * fC2) + fC))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    private s a(s sVar, u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4) {
        s3 s3VarA = s3.a();
        int iA = a();
        float f = iA / 2.0f;
        float f2 = this.e;
        float f3 = f - f2;
        float f4 = f + f2;
        return s3VarA.a(sVar, iA, iA, f3, f3, f4, f3, f4, f4, f3, f4, u6Var.b(), u6Var.c(), u6Var2.b(), u6Var2.c(), u6Var3.b(), u6Var3.c(), u6Var4.b(), u6Var4.c());
    }
}
