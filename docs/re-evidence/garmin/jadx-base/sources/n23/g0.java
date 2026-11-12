package n23;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f122469a;

    public g0(p0 p0Var) {
        this.f122469a = p0Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    @Override // e23.a
    public final Object invoke() {
        t23.u0 u0VarK0;
        o13.p pVar;
        List list;
        ArrayList arrayList = new ArrayList();
        p0 p0Var = this.f122469a;
        t23.b bVarE = p0Var.e();
        x33.c cVar = s4.f122608a;
        if (bVarE.H() != null) {
            t23.l lVarD = bVarE.d();
            lVarD.getClass();
            u0VarK0 = ((t23.e) lVarD).k0();
        } else {
            u0VarK0 = null;
        }
        if (u0VarK0 != null) {
            arrayList.add(new e1(p0Var, arrayList.size(), k23.k.a.INSTANCE, new m0(u0VarK0)));
        }
        t23.b bVarE2 = p0Var.e();
        if (bVarE2 instanceof n43.h0) {
            n43.h0 h0Var = (n43.h0) bVarE2;
            pVar = new o13.p(h0Var.P, h0Var.I.f156694o);
        } else if (bVarE2 instanceof n43.g0) {
            n43.g0 g0Var = (n43.g0) bVarE2;
            pVar = new o13.p(g0Var.E, g0Var.D.f156780o);
        } else if (bVarE2 instanceof t23.q0) {
            t23.r0 r0VarP0 = ((t23.q0) bVarE2).p0();
            n43.g0 g0Var2 = r0VarP0 instanceof n43.g0 ? (n43.g0) r0VarP0 : null;
            if (g0Var2 != null) {
                pVar = new o13.p(g0Var2.E, g0Var2.D.f156780o);
            } else {
                pVar = null;
            }
        } else {
            pVar = null;
        }
        if (pVar == null) {
            list = p13.j0.f134944a;
        } else {
            u33.d dVar = (u33.d) pVar.f128594a;
            List list2 = (List) pVar.f128595b;
            List<t23.u0> listS = bVarE2.S();
            listS.getClass();
            ArrayList arrayList2 = new ArrayList(p13.y.r(listS, 10));
            int i14 = 0;
            for (Object obj : listS) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                t23.u0 u0Var = (t23.u0) obj;
                u23.h annotations = u0Var.getAnnotations();
                x33.f fVarD = x33.f.d(dVar.getString(((s33.w) list2.get(i14)).f156976e));
                p43.n0 type = u0Var.getType();
                type.getClass();
                t23.y0 source = u0Var.getSource();
                source.getClass();
                arrayList2.add(new w23.x0(bVarE2, null, i14, annotations, fVarD, type, false, false, false, null, source));
                i14 = i15;
            }
            list = arrayList2;
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            arrayList.add(new e1(p0Var, arrayList.size(), k23.k.a.CONTEXT, new n0(list, i16)));
        }
        t23.u0 u0VarI = p0Var.e().I();
        if (u0VarI != null) {
            arrayList.add(new e1(p0Var, arrayList.size(), k23.k.a.EXTENSION_RECEIVER, new o0(u0VarI)));
        }
        return arrayList;
    }
}
