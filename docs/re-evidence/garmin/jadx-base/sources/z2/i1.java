package z2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz2/i1;", "Ll2/p2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1 implements p006l2.p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f201644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f201645b;

    public i1(boolean z14, o1 o1Var) {
        this.f201644a = z14;
        this.f201645b = o1Var;
    }

    @Override // p006l2.p2
    public final void a() {
        o1 o1Var = this.f201645b;
        o1Var.f201734y = true;
        o1Var.r();
        o1Var.f201728s.setValue(null);
        o1Var.f201729t.setValue(null);
    }

    @Override // p006l2.p2
    public final void b(long j8, d0 d0Var) {
        o1 o1Var = this.f201645b;
        if (o1Var.f() == null) {
            return;
        }
        b0 b0VarG = o1Var.g();
        b0VarG.getClass();
        boolean z14 = this.f201644a;
        y yVarB = o1Var.f201710a.f201768c.b((z14 ? b0VarG.f201523a : b0VarG.f201524b).f201528c);
        if (yVarB == null) {
            b2.e.d("SelectionRegistrar should contain the current selection's selectableIds");
            o2.c.f();
            return;
        }
        y yVar = yVarB;
        f5.c0 c0VarE = yVar.e();
        if (c0VarE == null) {
            b2.e.d("Current selectable should have layout coordinates.");
            o2.c.f();
            return;
        }
        long jF = yVar.f(b0VarG, z14);
        if ((9223372034707292159L & jF) == 9205357640488583168L) {
            return;
        }
        o1Var.f201724o.setValue(n4.c.a(o1Var.l().b0(c0VarE, x0.a(jF))));
        n4.c.f123541b.getClass();
        o1Var.f201725p.setValue(n4.c.a(0L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l2.p2
    public final void c() {
        b0 b0VarG;
        f5.c0 c0VarE;
        boolean z14 = this.f201644a;
        o1 o1Var = this.f201645b;
        if ((z14 ? (n4.c) o1Var.f201726q.getF182175a() : (n4.c) o1Var.f201727r.getF182175a()) == null || (b0VarG = o1Var.g()) == null) {
            return;
        }
        y yVarC = o1Var.c(z14 ? b0VarG.f201523a : b0VarG.f201524b);
        if (yVarC == null || (c0VarE = yVarC.e()) == null) {
            return;
        }
        long jF = yVarC.f(b0VarG, z14);
        if ((9223372034707292159L & jF) == 9205357640488583168L) {
            return;
        }
        o1Var.f201729t.setValue(n4.c.a(o1Var.l().b0(c0VarE, x0.a(jF))));
        o1Var.f201728s.setValue(z14 ? p006l2.l1.SelectionStart : p006l2.l1.SelectionEnd);
        o1Var.f201734y = false;
        o1Var.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l2.p2
    public final void d(long j8) {
        o1 o1Var = this.f201645b;
        p006l2.l1 l1VarF = o1Var.f();
        p3.c2 c2Var = o1Var.f201724o;
        p3.c2 c2Var2 = o1Var.f201725p;
        if (l1VarF == null) {
            return;
        }
        c2Var2.setValue(n4.c.a(n4.c.j(((n4.c) c2Var2.getF182175a()).f123544a, j8)));
        long j14 = n4.c.j(((n4.c) c2Var.getF182175a()).f123544a, ((n4.c) c2Var2.getF182175a()).f123544a);
        n4.c cVarA = n4.c.a(j14);
        long j15 = ((n4.c) c2Var.getF182175a()).f123544a;
        d0.f201550a.getClass();
        c0 c0Var = d0.a.f201556f;
        o1Var.getClass();
        if (o1Var.q(cVarA.f123544a, j15, this.f201644a, c0Var)) {
            c2Var.setValue(n4.c.a(j14));
            n4.c.f123541b.getClass();
            c2Var2.setValue(n4.c.a(0L));
        }
    }

    @Override // p006l2.p2
    public final void onCancel() {
        o1 o1Var = this.f201645b;
        o1Var.f201734y = true;
        o1Var.r();
        o1Var.f201728s.setValue(null);
        o1Var.f201729t.setValue(null);
    }

    @Override // p006l2.p2
    public final void onStop() {
        o1 o1Var = this.f201645b;
        o1Var.f201734y = true;
        o1Var.r();
        o1Var.f201728s.setValue(null);
        o1Var.f201729t.setValue(null);
    }
}
