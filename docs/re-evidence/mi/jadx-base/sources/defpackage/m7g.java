package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class m7g extends l7g {
    public final iso c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public final z73 h;
    public int i;
    public final z73 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25840k;
    public final z73 l;
    public int m;
    public final z73 n;
    public int o;
    public final z73 p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z73 f25841r;
    public int s;

    public m7g(iso isoVar, int i, int i2, int i3) {
        super(589824);
        this.c = isoVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = new z73();
        this.j = new z73();
        this.l = new z73();
        this.n = new z73();
        this.p = new z73();
        this.f25841r = new z73();
    }

    @Override // defpackage.l7g
    public void a() {
    }

    @Override // defpackage.l7g
    public void b(String str, int i, String... strArr) {
        this.j.k(this.c.B(str).f18165a).k(i);
        if (strArr == null) {
            this.j.k(0);
        } else {
            this.j.k(strArr.length);
            for (String str2 : strArr) {
                this.j.k(this.c.y(str2).f18165a);
            }
        }
        this.i++;
    }

    @Override // defpackage.l7g
    public void c(String str) {
        this.s = this.c.e(str).f18165a;
    }

    @Override // defpackage.l7g
    public void d(String str, int i, String... strArr) {
        this.l.k(this.c.B(str).f18165a).k(i);
        if (strArr == null) {
            this.l.k(0);
        } else {
            this.l.k(strArr.length);
            for (String str2 : strArr) {
                this.l.k(this.c.y(str2).f18165a);
            }
        }
        this.f25840k++;
    }

    @Override // defpackage.l7g
    public void e(String str) {
        this.f25841r.k(this.c.B(str).f18165a);
        this.q++;
    }

    @Override // defpackage.l7g
    public void f(String str, String... strArr) {
        this.p.k(this.c.e(str).f18165a);
        this.p.k(strArr.length);
        for (String str2 : strArr) {
            this.p.k(this.c.e(str2).f18165a);
        }
        this.o++;
    }

    @Override // defpackage.l7g
    public void g(String str, int i, String str2) {
        this.h.k(this.c.y(str).f18165a).k(i).k(str2 == null ? 0 : this.c.D(str2));
        this.g++;
    }

    @Override // defpackage.l7g
    public void h(String str) {
        this.n.k(this.c.e(str).f18165a);
        this.m++;
    }

    public int i() {
        this.c.D("Module");
        int i = this.h.f40971b + 22 + this.j.f40971b + this.l.f40971b + this.n.f40971b + this.p.f40971b;
        if (this.q > 0) {
            this.c.D("ModulePackages");
            i += this.f25841r.f40971b + 8;
        }
        if (this.s <= 0) {
            return i;
        }
        this.c.D("ModuleMainClass");
        return i + 8;
    }

    public int j() {
        return (this.q > 0 ? 1 : 0) + 1 + (this.s > 0 ? 1 : 0);
    }

    public void k(z73 z73Var) {
        z73 z73VarK = z73Var.k(this.c.D("Module")).i(this.h.f40971b + 16 + this.j.f40971b + this.l.f40971b + this.n.f40971b + this.p.f40971b).k(this.d).k(this.e).k(this.f).k(this.g);
        z73 z73Var2 = this.h;
        z73 z73VarK2 = z73VarK.h(z73Var2.f40970a, 0, z73Var2.f40971b).k(this.i);
        z73 z73Var3 = this.j;
        z73 z73VarK3 = z73VarK2.h(z73Var3.f40970a, 0, z73Var3.f40971b).k(this.f25840k);
        z73 z73Var4 = this.l;
        z73 z73VarK4 = z73VarK3.h(z73Var4.f40970a, 0, z73Var4.f40971b).k(this.m);
        z73 z73Var5 = this.n;
        z73 z73VarK5 = z73VarK4.h(z73Var5.f40970a, 0, z73Var5.f40971b).k(this.o);
        z73 z73Var6 = this.p;
        z73VarK5.h(z73Var6.f40970a, 0, z73Var6.f40971b);
        if (this.q > 0) {
            z73 z73VarK6 = z73Var.k(this.c.D("ModulePackages")).i(this.f25841r.f40971b + 2).k(this.q);
            z73 z73Var7 = this.f25841r;
            z73VarK6.h(z73Var7.f40970a, 0, z73Var7.f40971b);
        }
        if (this.s > 0) {
            z73Var.k(this.c.D("ModuleMainClass")).i(2).k(this.s);
        }
    }
}
