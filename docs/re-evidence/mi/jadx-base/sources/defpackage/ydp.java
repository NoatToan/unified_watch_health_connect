package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ydp implements dbi<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zdp<o98>[] f40080a;

    public class a extends sy5<o98, o98> {
        public final ebi c;
        public final int d;
        public final ypk e;

        public a(cg4<o98> cg4Var, ebi ebiVar, int i) {
            super(cg4Var);
            this.c = ebiVar;
            this.d = i;
            this.e = ebiVar.b().m();
        }

        @Override // defpackage.sy5, defpackage.e52
        public void g(Throwable th) {
            if (ydp.this.e(this.d + 1, o(), this.c)) {
                return;
            }
            o().onFailure(th);
        }

        @Override // defpackage.e52
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(o98 o98Var, int i) {
            if (o98Var != null && (e52.e(i) || bep.c(o98Var, this.e))) {
                o().b(o98Var, i);
            } else if (e52.d(i)) {
                o98.c(o98Var);
                if (ydp.this.e(this.d + 1, o(), this.c)) {
                    return;
                }
                o().b(null, 1);
            }
        }
    }

    public ydp(zdp<o98>... zdpVarArr) {
        zdp<o98>[] zdpVarArr2 = (zdp[]) b6i.g(zdpVarArr);
        this.f40080a = zdpVarArr2;
        b6i.e(0, zdpVarArr2.length);
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        if (ebiVar.b().m() == null) {
            cg4Var.b(null, 1);
        } else {
            if (e(0, cg4Var, ebiVar)) {
                return;
            }
            cg4Var.b(null, 1);
        }
    }

    public final int d(int i, ypk ypkVar) {
        while (true) {
            zdp<o98>[] zdpVarArr = this.f40080a;
            if (i >= zdpVarArr.length) {
                return -1;
            }
            if (zdpVarArr[i].b(ypkVar)) {
                return i;
            }
            i++;
        }
    }

    public final boolean e(int i, cg4<o98> cg4Var, ebi ebiVar) {
        int iD = d(i, ebiVar.b().m());
        if (iD == -1) {
            return false;
        }
        this.f40080a[iD].a(new a(cg4Var, ebiVar, iD), ebiVar);
        return true;
    }
}
