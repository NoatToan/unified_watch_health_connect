package h5;

import i3.e5;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static final void a(q3.c cVar, h4.r.c cVar2) {
        q3.c<e0> cVarN = g(cVar2).N();
        int i14 = cVarN.f142358c - 1;
        e0[] e0VarArr = cVarN.f142356a;
        if (i14 < e0VarArr.length) {
            while (i14 >= 0) {
                cVar.b(e0VarArr[i14].P.f81685f);
                i14--;
            }
        }
    }

    public static final h4.r.c b(q3.c cVar) {
        int i14;
        if (cVar == null || (i14 = cVar.f142358c) == 0) {
            return null;
        }
        return (h4.r.c) cVar.k(i14 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final c0 c(h4.r.c cVar) {
        if ((cVar.getKindSet() & 2) != 0) {
            if (cVar instanceof c0) {
                return (c0) cVar;
            }
            if (cVar instanceof m) {
                h4.r.c child = ((m) cVar).f81888b;
                while (child != 0) {
                    if (child instanceof c0) {
                        return (c0) child;
                    }
                    child = (!(child instanceof m) || (child.getKindSet() & 2) == 0) ? child.getChild() : ((m) child).f81888b;
                }
            }
        }
        return null;
    }

    public static final void d(j jVar) {
        e0 e0VarG = g(jVar);
        if (e0VarG.f81780v) {
            return;
        }
        i0.a(e0VarG).L(e0VarG);
    }

    public static final c1 e(j jVar, int i14) {
        c1 coordinator = jVar.getNode().getCoordinator();
        coordinator.getClass();
        if (coordinator.F1() != jVar || !g1.h(i14)) {
            return coordinator;
        }
        c1 c1Var = coordinator.f81714t;
        c1Var.getClass();
        return c1Var;
    }

    public static final c1 f(j jVar) {
        if (!jVar.getNode().getIsAttached()) {
            e5.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        c1 c1VarE = e(jVar, 2);
        if (!c1VarE.isAttached()) {
            e5.a.b("LayoutCoordinates is not attached.");
        }
        return c1VarE;
    }

    public static final e0 g(j jVar) {
        c1 coordinator = jVar.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.f81711p;
        }
        throw e5.m("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final o1 h(j jVar) {
        o1 o1Var = g(jVar).f81774n;
        if (o1Var != null) {
            return o1Var;
        }
        throw e5.m("This node does not have an owner.");
    }
}
