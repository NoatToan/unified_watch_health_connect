package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class hl9 extends gl9 {
    public final iso c;
    public final int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public kd1 i;
    public kd1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public kd1 f20208k;
    public kd1 l;
    public em1 m;

    public hl9(iso isoVar, int i, String str, String str2, String str3, Object obj) {
        super(589824);
        this.c = isoVar;
        this.d = i;
        this.e = isoVar.D(str);
        this.f = isoVar.D(str2);
        if (str3 != null) {
            this.g = isoVar.D(str3);
        }
        if (obj != null) {
            this.h = isoVar.d(obj).f18165a;
        }
    }

    @Override // defpackage.gl9
    public jd1 a(String str, boolean z) {
        if (z) {
            kd1 kd1VarJ = kd1.j(this.c, str, this.i);
            this.i = kd1VarJ;
            return kd1VarJ;
        }
        kd1 kd1VarJ2 = kd1.j(this.c, str, this.j);
        this.j = kd1VarJ2;
        return kd1VarJ2;
    }

    @Override // defpackage.gl9
    public void b(em1 em1Var) {
        em1Var.c = this.m;
        this.m = em1Var;
    }

    @Override // defpackage.gl9
    public void c() {
    }

    @Override // defpackage.gl9
    public jd1 d(int i, x4q x4qVar, String str, boolean z) {
        if (z) {
            kd1 kd1VarI = kd1.i(this.c, i, x4qVar, str, this.f20208k);
            this.f20208k = kd1VarI;
            return kd1VarI;
        }
        kd1 kd1VarI2 = kd1.i(this.c, i, x4qVar, str, this.l);
        this.l = kd1VarI2;
        return kd1VarI2;
    }

    public final void e(em1.a aVar) {
        aVar.b(this.m);
    }

    public int f() {
        int i;
        if (this.h != 0) {
            this.c.D("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int iB = i + em1.b(this.c, this.d, this.g) + kd1.f(this.i, this.j, this.f20208k, this.l);
        em1 em1Var = this.m;
        return em1Var != null ? iB + em1Var.a(this.c) : iB;
    }

    public void g(z73 z73Var) {
        boolean z = this.c.R() < 49;
        z73Var.k((~(z ? 4096 : 0)) & this.d).k(this.e).k(this.f);
        int iD = this.h != 0 ? 1 : 0;
        int i = this.d;
        if ((i & 4096) != 0 && z) {
            iD++;
        }
        if (this.g != 0) {
            iD++;
        }
        if ((131072 & i) != 0) {
            iD++;
        }
        if (this.i != null) {
            iD++;
        }
        if (this.j != null) {
            iD++;
        }
        if (this.f20208k != null) {
            iD++;
        }
        if (this.l != null) {
            iD++;
        }
        em1 em1Var = this.m;
        if (em1Var != null) {
            iD += em1Var.d();
        }
        z73Var.k(iD);
        if (this.h != 0) {
            z73Var.k(this.c.D("ConstantValue")).i(2).k(this.h);
        }
        em1.f(this.c, this.d, this.g, z73Var);
        kd1.l(this.c, this.i, this.j, this.f20208k, this.l, z73Var);
        em1 em1Var2 = this.m;
        if (em1Var2 != null) {
            em1Var2.g(this.c, z73Var);
        }
    }
}
