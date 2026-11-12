package b53;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n23.w3;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.c f16146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23.d f16147b;

    public r(x33.c cVar, k23.d dVar) {
        this.f16146a = cVar;
        this.f16147b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k23.d<?> dVarE;
        p pVar = (p) obj;
        pVar.getClass();
        x33.c cVar = kotlin.reflect.jvm.internal.impl.builtins.f.a.L;
        x33.c cVar2 = this.f16146a;
        if (p005kotlin.jvm.internal.s.g(cVar2, cVar)) {
            k23.r.f102461c.getClass();
            k23.p pVarD = s0.d(Iterable.class, k23.r.f102462d);
            t0 t0Var = s0.f105811a;
            dVarE = ((a) t0Var.d(pVarD)).e();
            if (dVarE == null) {
                throw new w3(p6.b.h(t0Var, Iterable.class, new StringBuilder("No mutable collection class found: ")));
            }
        } else if (p005kotlin.jvm.internal.s.g(cVar2, kotlin.reflect.jvm.internal.impl.builtins.f.a.M)) {
            k23.r.f102461c.getClass();
            k23.p pVarD2 = s0.d(Collection.class, k23.r.f102462d);
            t0 t0Var2 = s0.f105811a;
            dVarE = ((a) t0Var2.d(pVarD2)).e();
            if (dVarE == null) {
                throw new w3(p6.b.h(t0Var2, Collection.class, new StringBuilder("No mutable collection class found: ")));
            }
        } else if (p005kotlin.jvm.internal.s.g(cVar2, kotlin.reflect.jvm.internal.impl.builtins.f.a.O)) {
            k23.r.f102461c.getClass();
            k23.p pVarD3 = s0.d(Collection.class, k23.r.f102462d);
            t0 t0Var3 = s0.f105811a;
            dVarE = ((a) t0Var3.d(pVarD3)).e();
            if (dVarE == null) {
                throw new w3(p6.b.h(t0Var3, Collection.class, new StringBuilder("No mutable collection class found: ")));
            }
        } else if (p005kotlin.jvm.internal.s.g(cVar2, kotlin.reflect.jvm.internal.impl.builtins.f.a.N)) {
            k23.r.f102461c.getClass();
            k23.p pVarD4 = s0.d(Iterator.class, k23.r.f102462d);
            t0 t0Var4 = s0.f105811a;
            dVarE = ((a) t0Var4.d(pVarD4)).e();
            if (dVarE == null) {
                throw new w3(p6.b.h(t0Var4, Iterator.class, new StringBuilder("No mutable collection class found: ")));
            }
        } else {
            dVarE = null;
        }
        List<k23.q> list = pVar.f16142c;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (k23.q qVar : list) {
            k23.r.a aVar = k23.r.f102461c;
            a aVarC = l23.g.c(qVar, null, 7);
            aVar.getClass();
            arrayList.add(k23.r.a.a(aVarC));
        }
        ArrayList arrayListC = p13.u.C(new k23.d[]{this.f16147b, dVarE});
        ArrayList arrayList2 = new ArrayList(y.r(arrayListC, 10));
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            arrayList2.add(l23.g.c((k23.d) it.next(), arrayList, 6));
        }
        return arrayList2;
    }
}
