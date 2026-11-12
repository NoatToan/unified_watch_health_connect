package z2;

import p005kotlin.Metadata;
import p006l2.i3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz2/d2;", "Ll2/p2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d2 implements p006l2.p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f201563a;

    public d2(h2 h2Var) {
        this.f201563a = h2Var;
    }

    @Override // p006l2.p2
    public final void a() {
        h2 h2Var = this.f201563a;
        h2.c(h2Var, null);
        h2Var.f201623t.setValue(null);
    }

    @Override // p006l2.p2
    public final void b(long j8, d0 d0Var) {
        i3 i3VarD;
        h2 h2Var = this.f201563a;
        long jA = x0.a(h2Var.s(true));
        p006l2.b2 b2Var = h2Var.f201607d;
        if (b2Var == null || (i3VarD = b2Var.d()) == null) {
            return;
        }
        long jE = i3VarD.e(jA);
        h2Var.f201619p = jE;
        h2Var.f201623t.setValue(n4.c.a(jE));
        n4.c.f123541b.getClass();
        h2Var.f201621r = 0L;
        h2Var.f201622s.setValue(p006l2.l1.Cursor);
        h2Var.D(false);
    }

    @Override // p006l2.p2
    public final void c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l2.p2
    public final void d(long j8) {
        i3 i3VarD;
        w4.a aVar;
        h2 h2Var = this.f201563a;
        h2Var.f201621r = n4.c.j(h2Var.f201621r, j8);
        p006l2.b2 b2Var = h2Var.f201607d;
        if (b2Var == null || (i3VarD = b2Var.d()) == null) {
            return;
        }
        h2Var.f201623t.setValue(n4.c.a(n4.c.j(h2Var.f201619p, h2Var.f201621r)));
        x5.c0 c0Var = h2Var.f201605b;
        n4.c cVarP = h2Var.p();
        cVarP.getClass();
        int iA = c0Var.a(i3VarD.b(cVarP.f123544a, true));
        long jL = og.a.l(iA, iA);
        if (s5.w0.d(jL, h2Var.u().f188879b)) {
            return;
        }
        p006l2.b2 b2Var2 = h2Var.f201607d;
        if ((b2Var2 == null || ((Boolean) b2Var2.f108407q.getF182175a()).booleanValue()) && (aVar = h2Var.f201615l) != null) {
            w4.b.f181904b.getClass();
            aVar.a(w4.b.a.b());
        }
        h2Var.f201606c.invoke(h2.k(h2Var.u().f188878a, jL));
        h2Var.f201627x = s5.w0.a(jL);
    }

    @Override // p006l2.p2
    public final void onCancel() {
    }

    @Override // p006l2.p2
    public final void onStop() {
        h2 h2Var = this.f201563a;
        h2.c(h2Var, null);
        h2Var.f201623t.setValue(null);
    }
}
