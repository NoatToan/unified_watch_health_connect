package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
public final class c4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4925b;
    public boolean c;
    public int d;
    public boolean e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4926k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v7p f4927r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public c4q A(String str) {
        this.l = str;
        return this;
    }

    public c4q B(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public c4q C(boolean z) {
        this.f = z ? 1 : 0;
        return this;
    }

    public c4q D(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public c4q E(int i) {
        this.n = i;
        return this;
    }

    public c4q F(int i) {
        this.m = i;
        return this;
    }

    public c4q G(float f) {
        this.s = f;
        return this;
    }

    public c4q H(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public c4q I(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public c4q J(v7p v7pVar) {
        this.f4927r = v7pVar;
        return this;
    }

    public c4q K(boolean z) {
        this.g = z ? 1 : 0;
        return this;
    }

    public c4q a(c4q c4qVar) {
        return r(c4qVar, true);
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.f4925b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f4924a;
    }

    public float e() {
        return this.f4926k;
    }

    public int f() {
        return this.j;
    }

    public String g() {
        return this.l;
    }

    public Layout.Alignment h() {
        return this.p;
    }

    public int i() {
        return this.n;
    }

    public int j() {
        return this.m;
    }

    public float k() {
        return this.s;
    }

    public int l() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.o;
    }

    public boolean n() {
        return this.q == 1;
    }

    public v7p o() {
        return this.f4927r;
    }

    public boolean p() {
        return this.e;
    }

    public boolean q() {
        return this.c;
    }

    public final c4q r(c4q c4qVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c4qVar != null) {
            if (!this.c && c4qVar.c) {
                w(c4qVar.f4925b);
            }
            if (this.h == -1) {
                this.h = c4qVar.h;
            }
            if (this.i == -1) {
                this.i = c4qVar.i;
            }
            if (this.f4924a == null && (str = c4qVar.f4924a) != null) {
                this.f4924a = str;
            }
            if (this.f == -1) {
                this.f = c4qVar.f;
            }
            if (this.g == -1) {
                this.g = c4qVar.g;
            }
            if (this.n == -1) {
                this.n = c4qVar.n;
            }
            if (this.o == null && (alignment2 = c4qVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = c4qVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = c4qVar.q;
            }
            if (this.j == -1) {
                this.j = c4qVar.j;
                this.f4926k = c4qVar.f4926k;
            }
            if (this.f4927r == null) {
                this.f4927r = c4qVar.f4927r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = c4qVar.s;
            }
            if (z && !this.e && c4qVar.e) {
                u(c4qVar.d);
            }
            if (z && this.m == -1 && (i = c4qVar.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public boolean s() {
        return this.f == 1;
    }

    public boolean t() {
        return this.g == 1;
    }

    public c4q u(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public c4q v(boolean z) {
        this.h = z ? 1 : 0;
        return this;
    }

    public c4q w(int i) {
        this.f4925b = i;
        this.c = true;
        return this;
    }

    public c4q x(String str) {
        this.f4924a = str;
        return this;
    }

    public c4q y(float f) {
        this.f4926k = f;
        return this;
    }

    public c4q z(int i) {
        this.j = i;
        return this;
    }
}
