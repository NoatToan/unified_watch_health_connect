package z2;

import p005kotlin.Metadata;
import p006l2.i3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz2/f2;", "Ll2/p2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f2 implements p006l2.p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f201578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f201579b;

    public f2(h2 h2Var, boolean z14) {
        this.f201578a = h2Var;
        this.f201579b = z14;
    }

    @Override // p006l2.p2
    public final void a() {
        h2 h2Var = this.f201578a;
        h2.c(h2Var, null);
        h2Var.f201623t.setValue(null);
        h2Var.D(true);
    }

    @Override // p006l2.p2
    public final void b(long j8, d0 d0Var) {
    }

    @Override // p006l2.p2
    public final void c() {
        i3 i3VarD;
        boolean z14 = this.f201579b;
        p006l2.l1 l1Var = z14 ? p006l2.l1.SelectionStart : p006l2.l1.SelectionEnd;
        h2 h2Var = this.f201578a;
        h2.c(h2Var, l1Var);
        long jA = x0.a(h2Var.s(z14));
        p006l2.b2 b2Var = h2Var.f201607d;
        if (b2Var == null || (i3VarD = b2Var.d()) == null) {
            return;
        }
        long jE = i3VarD.e(jA);
        h2Var.f201619p = jE;
        h2Var.f201623t.setValue(n4.c.a(jE));
        n4.c.f123541b.getClass();
        h2Var.f201621r = 0L;
        h2Var.f201624u = -1;
        p006l2.b2 b2Var2 = h2Var.f201607d;
        if (b2Var2 != null) {
            b2Var2.f108407q.setValue(Boolean.TRUE);
        }
        h2Var.D(false);
    }

    @Override // p006l2.p2
    public final void d(long j8) {
        h2 h2Var = this.f201578a;
        long j14 = n4.c.j(h2Var.f201621r, j8);
        h2Var.f201621r = j14;
        h2Var.f201623t.setValue(n4.c.a(n4.c.j(h2Var.f201619p, j14)));
        x5.l0 l0VarU = h2Var.u();
        n4.c cVarP = h2Var.p();
        cVarP.getClass();
        long j15 = cVarP.f123544a;
        d0.f201550a.getClass();
        h2.d(h2Var, l0VarU, j15, false, this.f201579b, d0.a.f201556f, true);
        h2Var.D(false);
    }

    @Override // p006l2.p2
    public final void onCancel() {
    }

    @Override // p006l2.p2
    public final void onStop() {
        h2 h2Var = this.f201578a;
        h2.c(h2Var, null);
        h2Var.f201623t.setValue(null);
        h2Var.D(true);
    }
}
