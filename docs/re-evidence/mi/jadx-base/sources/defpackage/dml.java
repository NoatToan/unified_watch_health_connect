package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class dml extends i97.a {
    public dml(b87 b87Var, h87 h87Var, h87 h87Var2) {
        this(b87Var, h87Var, h87Var2, false);
    }

    @Override // defpackage.i97
    public i97 A() {
        if (s()) {
            return this;
        }
        b87 b87VarI = i();
        h87 h87VarJ = this.f20903b;
        if (h87VarJ.i()) {
            return b87VarI.q();
        }
        h87 h87Var = this.c;
        h87 h87Var2 = this.d[0];
        boolean zH = h87Var2.h();
        h87 h87VarJ2 = zH ? h87Var : h87Var.j(h87Var2);
        h87 h87VarO = zH ? h87Var2 : h87Var2.o();
        h87 h87VarK = b87VarI.k();
        if (!zH) {
            h87VarK = h87VarK.j(h87VarO);
        }
        h87 h87VarA = h87Var.o().a(h87VarJ2).a(h87VarK);
        if (h87VarA.i()) {
            return new dml(b87VarI, h87VarA, b87VarI.l().n(), this.e);
        }
        h87 h87VarO2 = h87VarA.o();
        h87 h87VarJ3 = zH ? h87VarA : h87VarA.j(h87VarO);
        if (!zH) {
            h87VarJ = h87VarJ.j(h87Var2);
        }
        return new dml(b87VarI, h87VarO2, h87VarJ.p(h87VarA, h87VarJ2).a(h87VarO2).a(h87VarJ3), new h87[]{h87VarJ3}, this.e);
    }

    @Override // defpackage.i97
    public i97 a(i97 i97Var) {
        h87 h87VarJ;
        h87 h87VarJ2;
        h87 h87VarJ3;
        h87 h87VarA;
        h87 h87Var;
        h87 h87VarJ4;
        if (s()) {
            return i97Var;
        }
        if (i97Var.s()) {
            return this;
        }
        b87 b87VarI = i();
        h87 h87VarJ5 = this.f20903b;
        h87 h87VarN = i97Var.n();
        if (h87VarJ5.i()) {
            return h87VarN.i() ? b87VarI.q() : i97Var.a(this);
        }
        h87 h87Var2 = this.c;
        h87 h87Var3 = this.d[0];
        h87 h87VarO = i97Var.o();
        h87 h87VarR = i97Var.r(0);
        boolean zH = h87Var3.h();
        if (zH) {
            h87VarJ = h87VarN;
            h87VarJ2 = h87VarO;
        } else {
            h87VarJ = h87VarN.j(h87Var3);
            h87VarJ2 = h87VarO.j(h87Var3);
        }
        boolean zH2 = h87VarR.h();
        if (zH2) {
            h87VarJ3 = h87Var2;
        } else {
            h87VarJ5 = h87VarJ5.j(h87VarR);
            h87VarJ3 = h87Var2.j(h87VarR);
        }
        h87 h87VarA2 = h87VarJ3.a(h87VarJ2);
        h87 h87VarA3 = h87VarJ5.a(h87VarJ);
        if (h87VarA3.i()) {
            return h87VarA2.i() ? A() : b87VarI.q();
        }
        if (h87VarN.i()) {
            i97 i97VarW = w();
            h87 h87VarP = i97VarW.p();
            h87 h87VarQ = i97VarW.q();
            h87 h87VarD = h87VarQ.a(h87VarO).d(h87VarP);
            h87VarA = h87VarD.o().a(h87VarD).a(h87VarP).a(b87VarI.k());
            if (h87VarA.i()) {
                return new dml(b87VarI, h87VarA, b87VarI.l().n(), this.e);
            }
            h87 h87VarA4 = h87VarD.j(h87VarP.a(h87VarA)).a(h87VarA).a(h87VarQ).d(h87VarA).a(h87VarA);
            h87VarJ4 = b87VarI.j(y77.f39884b);
            h87Var = h87VarA4;
        } else {
            h87 h87VarO2 = h87VarA3.o();
            h87 h87VarJ6 = h87VarA2.j(h87VarJ5);
            h87 h87VarJ7 = h87VarA2.j(h87VarJ);
            h87 h87VarJ8 = h87VarJ6.j(h87VarJ7);
            if (h87VarJ8.i()) {
                return new dml(b87VarI, h87VarJ8, b87VarI.l().n(), this.e);
            }
            h87 h87VarJ9 = h87VarA2.j(h87VarO2);
            h87 h87VarJ10 = !zH2 ? h87VarJ9.j(h87VarR) : h87VarJ9;
            h87 h87VarP2 = h87VarJ7.a(h87VarO2).p(h87VarJ10, h87Var2.a(h87Var3));
            if (!zH) {
                h87VarJ10 = h87VarJ10.j(h87Var3);
            }
            h87VarA = h87VarJ8;
            h87Var = h87VarP2;
            h87VarJ4 = h87VarJ10;
        }
        return new dml(b87VarI, h87VarA, h87Var, new h87[]{h87VarJ4}, this.e);
    }

    @Override // defpackage.i97
    public i97 d() {
        return new dml(null, f(), g());
    }

    @Override // defpackage.i97
    public boolean h() {
        h87 h87VarN = n();
        return (h87VarN.i() || o().r() == h87VarN.r()) ? false : true;
    }

    @Override // defpackage.i97
    public h87 q() {
        h87 h87Var = this.f20903b;
        h87 h87Var2 = this.c;
        if (s() || h87Var.i()) {
            return h87Var2;
        }
        h87 h87VarJ = h87Var2.a(h87Var).j(h87Var);
        h87 h87Var3 = this.d[0];
        return !h87Var3.h() ? h87VarJ.d(h87Var3) : h87VarJ;
    }

    @Override // defpackage.i97
    public i97 v() {
        if (s()) {
            return this;
        }
        h87 h87Var = this.f20903b;
        if (h87Var.i()) {
            return this;
        }
        h87 h87Var2 = this.c;
        h87 h87Var3 = this.d[0];
        return new dml(this.f20902a, h87Var, h87Var2.a(h87Var3), new h87[]{h87Var3}, this.e);
    }

    public dml(b87 b87Var, h87 h87Var, h87 h87Var2, boolean z) {
        super(b87Var, h87Var, h87Var2);
        if ((h87Var == null) == (h87Var2 == null)) {
            this.e = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public dml(b87 b87Var, h87 h87Var, h87 h87Var2, h87[] h87VarArr, boolean z) {
        super(b87Var, h87Var, h87Var2, h87VarArr);
        this.e = z;
    }
}
