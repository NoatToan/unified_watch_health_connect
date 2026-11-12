package com.huawei.hms.scankit.p;

/* JADX INFO: loaded from: classes34.dex */
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f15958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u6 f15959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u6 f15960c;
    private final u6 d;
    private final u6 e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    a0(s sVar, u6 u6Var, u6 u6Var2, u6 u6Var3, u6 u6Var4) throws a {
        boolean z = u6Var == null || u6Var2 == null;
        boolean z2 = u6Var3 == null || u6Var4 == null;
        if (z && z2) {
            throw a.a();
        }
        if (z) {
            u6Var = new u6(0.0f, u6Var3.c());
            u6Var2 = new u6(0.0f, u6Var4.c());
        } else if (z2) {
            u6Var3 = new u6(sVar.d() - 1, u6Var.c());
            u6Var4 = new u6(sVar.d() - 1, u6Var2.c());
        }
        this.f15958a = sVar;
        this.f15959b = u6Var;
        this.f15960c = u6Var2;
        this.d = u6Var3;
        this.e = u6Var4;
        this.f = (int) Math.min(u6Var.b(), u6Var2.b());
        this.g = (int) Math.max(u6Var3.b(), u6Var4.b());
        this.h = (int) Math.min(u6Var.c(), u6Var3.c());
        this.i = (int) Math.max(u6Var2.c(), u6Var4.c());
    }

    a0 a(int i, int i2, boolean z) {
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        u6 u6Var4;
        u6 u6Var5 = this.f15959b;
        u6 u6Var6 = this.f15960c;
        u6 u6Var7 = this.d;
        u6 u6Var8 = this.e;
        if (i <= 0) {
            u6Var = u6Var5;
            u6Var2 = u6Var7;
        } else {
            u6 u6Var9 = z ? u6Var5 : u6Var7;
            int iC = ((int) u6Var9.c()) - i;
            if (iC < 0) {
                iC = 0;
            }
            u6 u6Var10 = new u6(u6Var9.b(), iC);
            if (z) {
                u6Var5 = u6Var10;
                u6Var = u6Var5;
                u6Var2 = u6Var7;
            } else {
                u6Var2 = u6Var10;
                u6Var = u6Var5;
            }
        }
        if (i2 <= 0) {
            u6Var3 = u6Var6;
            u6Var4 = u6Var8;
        } else {
            u6 u6Var11 = z ? this.f15960c : this.e;
            int iC2 = ((int) u6Var11.c()) + i2;
            if (iC2 >= this.f15958a.b()) {
                iC2 = this.f15958a.b() - 1;
            }
            u6 u6Var12 = new u6(u6Var11.b(), iC2);
            if (z) {
                u6Var6 = u6Var12;
                u6Var3 = u6Var6;
                u6Var4 = u6Var8;
            } else {
                u6Var4 = u6Var12;
                u6Var3 = u6Var6;
            }
        }
        return new a0(this.f15958a, u6Var, u6Var3, u6Var2, u6Var4);
    }

    int e() {
        return this.f;
    }

    int c() {
        return this.g;
    }

    int f() {
        return this.h;
    }

    a0(a0 a0Var) {
        this.f15958a = a0Var.f15958a;
        this.f15959b = a0Var.g();
        this.f15960c = a0Var.a();
        this.d = a0Var.h();
        this.e = a0Var.b();
        this.f = a0Var.e();
        this.g = a0Var.c();
        this.h = a0Var.f();
        this.i = a0Var.d();
    }

    int d() {
        return this.i;
    }

    u6 g() {
        return this.f15959b;
    }

    u6 h() {
        return this.d;
    }

    u6 b() {
        return this.e;
    }

    u6 a() {
        return this.f15960c;
    }

    static a0 a(a0 a0Var, a0 a0Var2) {
        if (a0Var == null) {
            return a0Var2;
        }
        return a0Var2 == null ? a0Var : new a0(a0Var.f15958a, a0Var.f15959b, a0Var.f15960c, a0Var2.d, a0Var2.e);
    }
}
