package p43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class r1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f135912a;

    public r1(s1 s1Var) {
        this.f135912a = s1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        s1.b bVar = (s1.b) obj;
        s1.a aVar = s1.f135919e;
        t23.d1 d1Var = bVar.f135924a;
        d0 d0Var = bVar.f135925b;
        s1 s1Var = this.f135912a;
        s1Var.getClass();
        Set<t23.d1> setC = d0Var.c();
        if (setC != null && setC.contains(d1Var.a())) {
            return s1Var.a(d0Var);
        }
        v0 v0VarP = d1Var.p();
        v0VarP.getClass();
        LinkedHashSet<t23.d1> linkedHashSet = new LinkedHashSet();
        o72.t.v(v0VarP, v0VarP, linkedHashSet, setC);
        int iA = p13.t0.a(p13.y.r(linkedHashSet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (t23.d1 d1Var2 : linkedHashSet) {
            o13.p pVar = new o13.p(d1Var2.h(), (setC == null || !setC.contains(d1Var2)) ? s1Var.f135920a.a(d1Var2, d0Var, s1Var, s1Var.b(d1Var2, d0Var.d(d1Var))) : d2.m(d1Var2, d0Var));
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        a2 a2VarE = a2.e(o1.a.b(o1.f135897b, linkedHashMap));
        List<n0> upperBounds = d1Var.getUpperBounds();
        upperBounds.getClass();
        q13.g gVarC = s1Var.c(a2VarE, upperBounds, d0Var);
        if (gVarC.f142145a.isEmpty()) {
            return s1Var.a(d0Var);
        }
        if (!s1Var.f135921b.f135902b) {
            if (gVarC.f142145a.f142129i == 1) {
                return (n0) p13.h0.H0(gVarC);
            }
            vb.h.s("Should only be one computed upper bound if no need to intersect all bounds");
            return null;
        }
        List listB1 = p13.h0.b1(gVarC);
        ArrayList arrayList = new ArrayList(p13.y.r(listB1, 10));
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            arrayList.add(((n0) it.next()).I0());
        }
        return oe2.f.F(arrayList);
    }
}
