package t23;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u {
    public static final e a(c0 c0Var, x33.b bVar) {
        c0Var.getClass();
        bVar.getClass();
        h hVarB = b(c0Var, bVar);
        if (hVarB instanceof e) {
            return (e) hVarB;
        }
        return null;
    }

    public static final h b(c0 c0Var, x33.b bVar) {
        c0Var.getClass();
        bVar.getClass();
        x33.c cVar = bVar.f188591a;
        x33.c cVar2 = bVar.f188592b;
        b43.x xVar = (b43.x) c0Var.A(b43.y.f15742a);
        c0 c0VarA = xVar != null ? xVar.a() : null;
        if (c0VarA == null) {
            n0 n0VarD0 = c0Var.d0(cVar);
            x33.d dVar = cVar2.f188596a;
            dVar.getClass();
            List<x33.f> listF = x33.d.f(dVar);
            h hVarF = ((i43.a) n0VarD0.i()).f((x33.f) p13.h0.b0(listF), b33.b.FROM_DESERIALIZATION);
            if (hVarF != null) {
                for (x33.f fVar : listF.subList(1, listF.size())) {
                    if (hVarF instanceof e) {
                        h hVarF2 = ((e) hVarF).b0().f(fVar, b33.b.FROM_DESERIALIZATION);
                        hVarF = hVarF2 instanceof e ? (e) hVarF2 : null;
                        if (hVarF != null) {
                        }
                    }
                }
                return hVarF;
            }
        } else {
            n0 n0VarD1 = c0VarA.d0(cVar);
            x33.d dVar2 = cVar2.f188596a;
            dVar2.getClass();
            List<x33.f> listF2 = x33.d.f(dVar2);
            h hVarF3 = ((i43.a) n0VarD1.i()).f((x33.f) p13.h0.b0(listF2), b33.b.FROM_DESERIALIZATION);
            if (hVarF3 == null) {
                hVarF3 = null;
                break;
            }
            for (x33.f fVar2 : listF2.subList(1, listF2.size())) {
                if (hVarF3 instanceof e) {
                    h hVarF4 = ((e) hVarF3).b0().f(fVar2, b33.b.FROM_DESERIALIZATION);
                    hVarF3 = hVarF4 instanceof e ? (e) hVarF4 : null;
                    if (hVarF3 != null) {
                    }
                }
                hVarF3 = null;
            }
            if (hVarF3 != null) {
                return hVarF3;
            }
            n0 n0VarD2 = c0Var.d0(cVar);
            x33.d dVar3 = cVar2.f188596a;
            dVar3.getClass();
            List<x33.f> listF3 = x33.d.f(dVar3);
            h hVarF5 = ((i43.a) n0VarD2.i()).f((x33.f) p13.h0.b0(listF3), b33.b.FROM_DESERIALIZATION);
            if (hVarF5 != null) {
                for (x33.f fVar3 : listF3.subList(1, listF3.size())) {
                    if (hVarF5 instanceof e) {
                        h hVarF6 = ((e) hVarF5).b0().f(fVar3, b33.b.FROM_DESERIALIZATION);
                        hVarF5 = hVarF6 instanceof e ? (e) hVarF6 : null;
                        if (hVarF5 != null) {
                        }
                    }
                }
                return hVarF5;
            }
        }
        return null;
    }

    public static final e c(c0 c0Var, x33.b bVar, g0 g0Var) {
        c0Var.getClass();
        bVar.getClass();
        g0Var.getClass();
        e eVarA = a(c0Var, bVar);
        return eVarA != null ? eVarA : g0Var.a(bVar, c53.c0.s(c53.c0.o(c53.q.e(new p005kotlin.jvm.internal.i0() { // from class: t23.u.a
            @Override // p005kotlin.jvm.internal.i0, k23.n
            public final Object get(Object obj) {
                return ((x33.b) obj).e();
            }
        }, bVar), t.f162064a)));
    }
}
