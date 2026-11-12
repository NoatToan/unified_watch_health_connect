package w23;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p43.a2;
import p43.g2;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f181592a;

    public e(h hVar) {
        this.f181592a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r16v0, types: [t23.a, t23.v, w23.v0, w23.x] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    @Override // e23.a
    public final Object invoke() {
        t23.d dVarB;
        q0 q0VarH;
        ?? arrayList;
        k23.l<Object>[] lVarArr = h.f181601i;
        h hVar = this.f181592a;
        hVar.getClass();
        n43.i0 i0Var = (n43.i0) hVar;
        t23.e eVarZ = i0Var.z();
        if (eVarZ == null) {
            return p13.j0.f134944a;
        }
        Collection<t23.d> collectionN = eVarZ.n();
        collectionN.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (t23.d dVar : collectionN) {
            v0.a aVar = v0.X;
            o43.n nVar = hVar.f181602e;
            dVar.getClass();
            aVar.getClass();
            nVar.getClass();
            ?? r14 = 0;
            r14 = 0;
            r14 = 0;
            a2 a2VarD = i0Var.z() == null ? null : a2.d(i0Var.E());
            if (a2VarD != null && (dVarB = dVar.b(a2VarD)) != null) {
                u23.h annotations = dVar.getAnnotations();
                t23.b.a kind = dVar.getKind();
                kind.getClass();
                t23.y0 source = hVar.getSource();
                source.getClass();
                ?? v0Var = new v0(nVar, hVar, dVarB, null, annotations, kind, source, null);
                List<j1> listF = dVar.f();
                if (listF == null) {
                    x.y(28);
                    throw null;
                }
                a2 a2Var = a2VarD;
                ArrayList arrayListG0 = x.G0(v0Var, listF, a2Var, false, false, null);
                if (arrayListG0 != null) {
                    p43.v0 v0VarC = p43.z0.c(oi0.c.Q(dVarB.getReturnType().I0()), i0Var.p());
                    t23.u0 u0VarH = dVar.H();
                    if (u0VarH != null) {
                        p43.n0 n0VarH = a2Var.h(g2.INVARIANT, u0VarH.getType());
                        u23.h.f168226x0.getClass();
                        q0VarH = b43.h.h(v0Var, n0VarH, u23.h.a.f168228b);
                    } else {
                        q0VarH = null;
                    }
                    t23.e eVarZ2 = i0Var.z();
                    if (eVarZ2 != null) {
                        List<t23.u0> listS = dVar.S();
                        listS.getClass();
                        arrayList = new ArrayList(p13.y.r(listS, 10));
                        Iterator it = listS.iterator();
                        int i14 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            t23.u0 u0Var = (t23.u0) next;
                            p43.n0 n0VarH2 = a2Var.h(g2.INVARIANT, u0Var.getType());
                            j43.g value = u0Var.getValue();
                            value.getClass();
                            x33.f fVarA = ((j43.f) value).a();
                            u23.h.f168226x0.getClass();
                            u23.h.a.C3153a c3153a = u23.h.a.f168228b;
                            if (c3153a == null) {
                                b43.h.a(35);
                                throw null;
                            }
                            Iterator it3 = it;
                            j43.b bVar = new j43.b(eVarZ2, n0VarH2, fVarA, null);
                            d53.k kVar = x33.g.f188607a;
                            arrayList.add(new q0(eVarZ2, bVar, c3153a, x33.f.e(x33.g.f188608b + '_' + i14)));
                            i14 = i15;
                            it = it3;
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                    v0Var.H0(q0VarH, null, arrayList, hVar.q(), arrayListG0, v0VarC, t23.a0.FINAL, hVar.f181603f);
                    r14 = v0Var;
                }
            }
            if (r14 != 0) {
                arrayList2.add(r14);
            }
        }
        return arrayList2;
    }
}
