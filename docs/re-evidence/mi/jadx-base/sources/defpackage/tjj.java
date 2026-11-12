package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class tjj extends sjj {
    public final iso c;
    public final int d;
    public final int e;
    public int f;
    public kd1 g;
    public kd1 h;
    public kd1 i;
    public kd1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public em1 f34767k;

    public tjj(iso isoVar, String str, String str2, String str3) {
        super(589824);
        this.c = isoVar;
        this.d = isoVar.D(str);
        this.e = isoVar.D(str2);
        if (str3 != null) {
            this.f = isoVar.D(str3);
        }
    }

    @Override // defpackage.sjj
    public jd1 a(String str, boolean z) {
        if (z) {
            kd1 kd1VarJ = kd1.j(this.c, str, this.g);
            this.g = kd1VarJ;
            return kd1VarJ;
        }
        kd1 kd1VarJ2 = kd1.j(this.c, str, this.h);
        this.h = kd1VarJ2;
        return kd1VarJ2;
    }

    @Override // defpackage.sjj
    public void b(em1 em1Var) {
        em1Var.c = this.f34767k;
        this.f34767k = em1Var;
    }

    @Override // defpackage.sjj
    public void c() {
    }

    @Override // defpackage.sjj
    public jd1 d(int i, x4q x4qVar, String str, boolean z) {
        if (z) {
            kd1 kd1VarI = kd1.i(this.c, i, x4qVar, str, this.i);
            this.i = kd1VarI;
            return kd1VarI;
        }
        kd1 kd1VarI2 = kd1.i(this.c, i, x4qVar, str, this.j);
        this.j = kd1VarI2;
        return kd1VarI2;
    }

    public final void e(em1.a aVar) {
        aVar.b(this.f34767k);
    }

    public int f() {
        int iB = em1.b(this.c, 0, this.f) + 6 + kd1.f(this.g, this.h, this.i, this.j);
        em1 em1Var = this.f34767k;
        return em1Var != null ? iB + em1Var.a(this.c) : iB;
    }

    public void g(z73 z73Var) {
        z73Var.k(this.d).k(this.e);
        int iD = this.f != 0 ? 1 : 0;
        if (this.g != null) {
            iD++;
        }
        if (this.h != null) {
            iD++;
        }
        if (this.i != null) {
            iD++;
        }
        if (this.j != null) {
            iD++;
        }
        em1 em1Var = this.f34767k;
        if (em1Var != null) {
            iD += em1Var.d();
        }
        z73Var.k(iD);
        em1.f(this.c, 0, this.f, z73Var);
        kd1.l(this.c, this.g, this.h, this.i, this.j, z73Var);
        em1 em1Var2 = this.f34767k;
        if (em1Var2 != null) {
            em1Var2.g(this.c, z73Var);
        }
    }
}
