package p43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class l0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f135866a;

    public l0(m0 m0Var) {
        this.f135866a = m0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        q43.f fVar = (q43.f) obj;
        fVar.getClass();
        m0 m0Var = this.f135866a;
        m0Var.getClass();
        fVar.getClass();
        LinkedHashSet<n0> linkedHashSet = m0Var.f135886b;
        ArrayList arrayList = new ArrayList(p13.y.r(linkedHashSet, 10));
        Iterator<T> it = linkedHashSet.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            arrayList.add(((n0) it.next()).K0(fVar));
            z14 = true;
        }
        m0 m0VarF = null;
        if (z14) {
            n0 n0Var = m0Var.f135885a;
            m0VarF = new m0(arrayList).f(n0Var != null ? n0Var.K0(fVar) : null);
        }
        if (m0VarF != null) {
            m0Var = m0VarF;
        }
        return m0Var.a();
    }
}
