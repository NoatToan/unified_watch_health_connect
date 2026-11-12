package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b8 f16343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l3 f16344c;
    private boolean d;

    u(s sVar) throws a {
        int iB = sVar.b();
        if (iB >= 21 && (iB & 3) == 1) {
            this.f16342a = sVar;
            return;
        }
        throw a.a();
    }

    l3 c() throws a {
        l3 l3Var = this.f16344c;
        if (l3Var != null) {
            return l3Var;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i = 0; i < 6; i++) {
            iA2 = a(i, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iA3 = a(8, i2, iA3);
        }
        int iB = this.f16342a.b();
        for (int i3 = iB - 1; i3 >= iB - 7; i3--) {
            iA = a(8, i3, iA);
        }
        for (int i4 = iB - 8; i4 < iB; i4++) {
            iA = a(i4, 8, iA);
        }
        l3 l3VarA = l3.a(iA3, iA);
        this.f16344c = l3VarA;
        if (l3VarA != null) {
            return l3VarA;
        }
        throw a.a();
    }

    b8 d() throws a {
        b8 b8Var = this.f16343b;
        if (b8Var != null) {
            return b8Var;
        }
        int iB = this.f16342a.b();
        int i = (iB - 17) / 4;
        if (i <= 6) {
            return b8.c(i);
        }
        int i2 = iB - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = iB - 9; i4 >= i2; i4--) {
                iA2 = a(i4, i3, iA2);
            }
        }
        b8 b8VarA = b8.a(iA2);
        if (b8VarA != null && b8VarA.d() == iB) {
            this.f16343b = b8VarA;
            return b8VarA;
        }
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = iB - 9; i6 >= i2; i6--) {
                iA = a(i5, i6, iA);
            }
        }
        b8 b8VarA2 = b8.a(iA);
        if (b8VarA2 != null && b8VarA2.d() == iB) {
            this.f16343b = b8VarA2;
            return b8VarA2;
        }
        throw a.a();
    }

    private int a(int i, int i2, int i3) {
        return this.d ? this.f16342a.b(i2, i) : this.f16342a.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    byte[] b() throws a {
        l3 l3VarC = c();
        b8 b8VarD = d();
        g1 g1Var = g1.values()[l3VarC.a()];
        int iB = this.f16342a.b();
        g1Var.a(this.f16342a, iB);
        s sVarA = b8VarD.a();
        byte[] bArr = new byte[b8VarD.e()];
        int i = iB - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < iB; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!sVarA.b(i9, i7)) {
                        i5++;
                        i4 <<= 1;
                        if (this.f16342a.b(i9, i7)) {
                            i4 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i3] = (byte) i4;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == b8VarD.e()) {
            return bArr;
        }
        throw a.a();
    }

    void e() {
        if (this.f16344c == null) {
            return;
        }
        g1.values()[this.f16344c.a()].a(this.f16342a, this.f16342a.b());
    }

    void a() {
        int i = 0;
        while (i < this.f16342a.d()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f16342a.b(); i3++) {
                if (this.f16342a.b(i, i3) != this.f16342a.b(i3, i)) {
                    this.f16342a.a(i3, i);
                    this.f16342a.a(i, i3);
                }
            }
            i = i2;
        }
    }

    void a(boolean z) {
        this.f16343b = null;
        this.f16344c = null;
        this.d = z;
    }
}
