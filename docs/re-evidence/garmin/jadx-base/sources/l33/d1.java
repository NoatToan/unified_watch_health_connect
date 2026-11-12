package l33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p33.l1;
import p33.n1;
import p33.p1;
import p43.c2;
import p43.d2;
import p43.g2;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends w23.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k33.i f109719k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o33.u f109720l;

    /* JADX WARN: Illegal instructions before constructor call */
    public d1(k33.i iVar, o33.u uVar, int i14, t23.l lVar) {
        iVar.getClass();
        uVar.getClass();
        lVar.getClass();
        k33.c cVar = iVar.f102785a;
        super(cVar.f102751a, lVar, new k33.f(iVar, uVar, false, 4, null), uVar.getName(), g2.INVARIANT, false, i14, t23.y0.f162076a, cVar.f102763m);
        this.f109719k = iVar;
        this.f109720l = uVar;
    }

    @Override // w23.i
    public final List<p43.n0> D0(List<? extends p43.n0> list) {
        n1 n1Var;
        p43.n0 n0Var;
        p43.n0 n0VarB;
        list.getClass();
        k33.i iVar = this.f109719k;
        n1 n1Var2 = iVar.f102785a.f102768r;
        n1Var2.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        for (p43.n0 n0Var2 : list) {
            l1 l1Var = l1.f135473a;
            n0Var2.getClass();
            l1Var.getClass();
            if (d2.d(n0Var2, l1Var, null)) {
                n1Var = n1Var2;
                n0Var = n0Var2;
            } else {
                n1Var = n1Var2;
                n0Var = n0Var2;
                n0VarB = n1Var.b(new p1(this, false, iVar, h33.c.TYPE_PARAMETER_BOUNDS, false, 16, null), n0Var, p13.j0.f134944a, null, false);
                if (n0VarB == null) {
                }
                arrayList.add(n0VarB);
                n1Var2 = n1Var;
            }
            n0VarB = n0Var;
            arrayList.add(n0VarB);
            n1Var2 = n1Var;
        }
        return arrayList;
    }

    @Override // w23.i
    public final void E0(p43.n0 n0Var) {
        n0Var.getClass();
    }

    @Override // w23.i
    public final List<p43.n0> F0() {
        Collection<o33.i> upperBounds = this.f109720l.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        k33.i iVar = this.f109719k;
        if (zIsEmpty) {
            p43.v0 v0VarE = iVar.f102785a.f102765o.e().e();
            v0VarE.getClass();
            return p13.w.c(p43.q0.b(v0VarE, iVar.f102785a.f102765o.e().p()));
        }
        Collection<o33.i> collection = upperBounds;
        ArrayList arrayList = new ArrayList(p13.y.r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(iVar.f102788d.d((o33.i) it.next(), gg.b.P(c2.COMMON, false, this, 3)));
        }
        return arrayList;
    }
}
