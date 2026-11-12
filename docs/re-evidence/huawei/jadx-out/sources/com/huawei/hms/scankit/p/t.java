package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f16320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a8 f16321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m3 f16322c;
    private boolean d;

    t(s sVar) throws a {
        int iB = sVar.b();
        if (iB >= 21 && (iB & 3) == 1) {
            this.f16320a = sVar;
            return;
        }
        throw a.a();
    }

    m3 c() throws a {
        m3 m3Var = this.f16322c;
        if (m3Var != null) {
            return m3Var;
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
        int iB = this.f16320a.b();
        for (int i3 = iB - 1; i3 >= iB - 7; i3--) {
            iA = a(8, i3, iA);
        }
        for (int i4 = iB - 8; i4 < iB; i4++) {
            iA = a(i4, 8, iA);
        }
        m3 m3VarA = m3.a(iA3, iA);
        this.f16322c = m3VarA;
        if (m3VarA != null) {
            return m3VarA;
        }
        throw a.a();
    }

    a8 d() throws a {
        a8 a8Var = this.f16321b;
        if (a8Var != null) {
            return a8Var;
        }
        int iB = this.f16320a.b();
        int i = (iB - 17) / 4;
        if (i <= 6) {
            return a8.b(i);
        }
        int i2 = iB - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i3 = 5; i3 >= 0; i3--) {
            for (int i4 = iB - 9; i4 >= i2; i4--) {
                iA2 = a(i4, i3, iA2);
            }
        }
        a8 a8VarA = a8.a(iA2);
        if (a8VarA != null && a8VarA.k() == iB) {
            this.f16321b = a8VarA;
            return a8VarA;
        }
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = iB - 9; i6 >= i2; i6--) {
                iA = a(i5, i6, iA);
            }
        }
        a8 a8VarA2 = a8.a(iA);
        if (a8VarA2 != null && a8VarA2.k() == iB) {
            this.f16321b = a8VarA2;
            return a8VarA2;
        }
        throw a.a();
    }

    private int a(int i, int i2, int i3) {
        return this.d ? this.f16320a.b(i2, i) : this.f16320a.b(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    byte[] b() throws a {
        m3 m3VarC = c();
        a8 a8VarD = d();
        f1 f1Var = f1.values()[m3VarC.b()];
        int iB = this.f16320a.b();
        f1Var.a(this.f16320a, iB);
        s sVarA = a8VarD.a();
        byte[] bArr = new byte[a8VarD.l()];
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
                        if (this.f16320a.b(i9, i7)) {
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
        if (i3 == a8VarD.l()) {
            return bArr;
        }
        throw a.a();
    }

    void e() {
        if (this.f16322c == null) {
            return;
        }
        f1.values()[this.f16322c.b()].a(this.f16320a, this.f16320a.b());
    }

    void a() throws a {
        if (this.f16320a != null) {
            int i = 0;
            while (i < this.f16320a.d()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < this.f16320a.b(); i3++) {
                    if (this.f16320a.b(i, i3) != this.f16320a.b(i3, i)) {
                        this.f16320a.a(i3, i);
                        this.f16320a.a(i, i3);
                    }
                }
                i = i2;
            }
            return;
        }
        throw a.a();
    }

    void a(boolean z) {
        this.f16321b = null;
        this.f16322c = null;
        this.d = z;
    }
}
