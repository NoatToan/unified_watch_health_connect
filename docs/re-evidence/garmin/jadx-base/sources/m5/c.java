package m5;

import h4.r;
import h5.a1;
import h5.c1;
import h5.e0;
import h5.j;
import h5.k;
import h5.m;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Object a(j jVar, e23.a aVar, v13.c cVar) {
        Object obj;
        c1 c1VarF;
        Object objS1;
        a1 a1Var;
        if (!jVar.getNode().getIsAttached()) {
            return Unit.INSTANCE;
        }
        if (!jVar.getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        r.c parent = jVar.getNode().getParent();
        e0 e0VarG = k.g(jVar);
        loop0: while (true) {
            obj = null;
            if (e0VarG == null) {
                break;
            }
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 524288) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 524288) != 0) {
                        r.c cVarB = parent;
                        q3.c cVar2 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof a) {
                                obj = cVarB;
                                break loop0;
                            }
                            if ((cVarB.getKindSet() & 524288) != 0 && (cVarB instanceof m)) {
                                int i14 = 0;
                                for (r.c child = ((m) cVarB).f81888b; child != null; child = child.getChild()) {
                                    if ((child.getKindSet() & 524288) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVarB = child;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new q3.c(new r.c[16], 0);
                                            }
                                            if (cVarB != null) {
                                                cVar2.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar2.b(child);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            cVarB = k.b(cVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            e0VarG = e0VarG.K();
            parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
        a aVar2 = (a) obj;
        return (aVar2 != null && (objS1 = aVar2.s1((c1VarF = k.f(jVar)), new b(aVar, c1VarF), cVar)) == u13.a.COROUTINE_SUSPENDED) ? objS1 : Unit.INSTANCE;
    }
}
