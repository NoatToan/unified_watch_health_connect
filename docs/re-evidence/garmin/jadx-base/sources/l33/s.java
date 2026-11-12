package l33;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class s implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f109802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k33.i f109803b;

    public s(a0 a0Var, k33.i iVar) {
        this.f109802a = a0Var;
        this.f109803b = iVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.f fVar = (x33.f) obj;
        int i14 = a0.f109693v;
        fVar.getClass();
        a0 a0Var = this.f109802a;
        o43.j<Set<x33.f>> jVar = a0Var.f109698r;
        t23.e eVar = a0Var.f109694n;
        boolean zContains = jVar.invoke().contains(fVar);
        k33.i iVar = this.f109803b;
        if (zContains) {
            h33.o oVar = iVar.f102785a.f102752b;
            x33.b bVarF = f43.e.f(eVar);
            bVarF.getClass();
            z23.t tVarA = oVar.a(new h33.o.a(bVarF.d(fVar), null, a0Var.f109695o, 2, null));
            if (tVarA != null) {
                m mVar = new m(iVar, a0Var.f109694n, tVarA, null, 8, null);
                iVar.f102785a.f102769s.a(mVar);
                return mVar;
            }
        } else if (a0Var.f109699s.invoke().contains(fVar)) {
            q13.b bVarB = p13.w.b();
            iVar.f102785a.f102774x.e(eVar, fVar, bVarB, iVar);
            q13.b bVarA = p13.w.a(bVarB);
            int f97124f = bVarA.getF97124f();
            if (f97124f != 0) {
                if (f97124f == 1) {
                    return (t23.e) p13.h0.I0(bVarA);
                }
                o2.c.s(bVarA, "Multiple classes with same name are generated: ");
                return null;
            }
        } else {
            o33.m mVar2 = a0Var.f109700t.invoke().get(fVar);
            if (mVar2 != null) {
                k33.c cVar = iVar.f102785a;
                return w23.s.E0(cVar.f102751a, a0Var.f109694n, fVar, cVar.f102751a.g(new x(a0Var)), gg.b.N(iVar, mVar2), cVar.f102760j.a(mVar2));
            }
        }
        return null;
    }
}
