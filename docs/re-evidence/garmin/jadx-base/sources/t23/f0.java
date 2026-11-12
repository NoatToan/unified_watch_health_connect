package t23;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f162013a;

    public f0(g0 g0Var) {
        this.f162013a = g0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        l lVarA;
        g0.a aVar = (g0.a) obj;
        aVar.getClass();
        x33.b bVar = aVar.f162019a;
        List<Integer> list = aVar.f162020b;
        if (bVar.f188593c) {
            j20.x.k(bVar, "Unresolved local class: ");
            return null;
        }
        x33.b bVarE = bVar.e();
        g0 g0Var = this.f162013a;
        if (bVarE == null || (lVarA = g0Var.a(bVarE, p13.h0.U(list, 1))) == null) {
            lVarA = (g) ((o43.e.k) g0Var.f162017c).invoke(bVar.f188591a);
        }
        l lVar = lVarA;
        boolean zG = bVar.g();
        o43.n nVar = g0Var.f162015a;
        x33.f fVarF = bVar.f();
        Integer num = (Integer) p13.h0.d0(list);
        return new g0.b(nVar, lVar, fVarF, zG, num != null ? num.intValue() : 0);
    }
}
