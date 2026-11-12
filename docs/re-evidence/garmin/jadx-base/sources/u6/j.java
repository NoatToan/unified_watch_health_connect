package u6;

/* JADX INFO: loaded from: classes.dex */
public class j extends p {
    public j(t6.e eVar) {
        super(eVar);
        eVar.f162608d.f();
        eVar.f162610e.f();
        this.f168844f = ((t6.h) eVar).A0;
    }

    @Override // u6.p, u6.d
    public final void a(d dVar) {
        f fVar = this.f168846h;
        if (fVar.f168805c && !fVar.f168812j) {
            fVar.d((int) ((((f) fVar.f168814l.get(0)).f168809g * ((t6.h) this.f168840b).f162685w0) + 0.5f));
        }
    }

    @Override // u6.p
    public final void d() {
        t6.e eVar = this.f168840b;
        t6.h hVar = (t6.h) eVar;
        int i14 = hVar.f162686x0;
        int i15 = hVar.f162687y0;
        int i16 = hVar.A0;
        f fVar = this.f168846h;
        if (i16 == 1) {
            if (i14 != -1) {
                fVar.f168814l.add(eVar.X.f162608d.f168846h);
                this.f168840b.X.f162608d.f168846h.f168813k.add(fVar);
                fVar.f168808f = i14;
            } else if (i15 != -1) {
                fVar.f168814l.add(eVar.X.f162608d.f168847i);
                this.f168840b.X.f162608d.f168847i.f168813k.add(fVar);
                fVar.f168808f = -i15;
            } else {
                fVar.f168804b = true;
                fVar.f168814l.add(eVar.X.f162608d.f168847i);
                this.f168840b.X.f162608d.f168847i.f168813k.add(fVar);
            }
            m(this.f168840b.f162608d.f168846h);
            m(this.f168840b.f162608d.f168847i);
            return;
        }
        if (i14 != -1) {
            fVar.f168814l.add(eVar.X.f162610e.f168846h);
            this.f168840b.X.f162610e.f168846h.f168813k.add(fVar);
            fVar.f168808f = i14;
        } else if (i15 != -1) {
            fVar.f168814l.add(eVar.X.f162610e.f168847i);
            this.f168840b.X.f162610e.f168847i.f168813k.add(fVar);
            fVar.f168808f = -i15;
        } else {
            fVar.f168804b = true;
            fVar.f168814l.add(eVar.X.f162610e.f168847i);
            this.f168840b.X.f162610e.f168847i.f168813k.add(fVar);
        }
        m(this.f168840b.f162610e.f168846h);
        m(this.f168840b.f162610e.f168847i);
    }

    @Override // u6.p
    public final void e() {
        t6.e eVar = this.f168840b;
        int i14 = ((t6.h) eVar).A0;
        f fVar = this.f168846h;
        if (i14 == 1) {
            eVar.f162607c0 = fVar.f168809g;
        } else {
            eVar.f162609d0 = fVar.f168809g;
        }
    }

    @Override // u6.p
    public final void f() {
        this.f168846h.c();
    }

    @Override // u6.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f168846h;
        fVar2.f168813k.add(fVar);
        fVar.f168814l.add(fVar2);
    }
}
