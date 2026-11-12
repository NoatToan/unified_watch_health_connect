package m4;

import h5.a1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final <T> T a(j0 j0Var, int i14, e23.l<? super f5.g.a, ? extends T> lVar) {
        h4.r.c cVarB;
        f5.g gVarY1;
        int i15;
        a1 a1Var;
        if (!j0Var.getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c parent = j0Var.getNode().getParent();
        h5.e0 e0VarG = h5.k.g(j0Var);
        loop0: while (true) {
            if (e0VarG == null) {
                cVarB = null;
                break;
            }
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 1024) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 1024) != 0) {
                        cVarB = parent;
                        q3.c cVar = null;
                        while (cVarB != null) {
                            if (cVarB instanceof j0) {
                                break loop0;
                            }
                            if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                int i16 = 0;
                                for (h4.r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                    if ((child.getKindSet() & 1024) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            cVarB = child;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (cVarB != null) {
                                                cVar.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar.b(child);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            cVarB = h5.k.b(cVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            e0VarG = e0VarG.K();
            parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
        j0 j0Var2 = (j0) cVarB;
        if ((j0Var2 != null && p005kotlin.jvm.internal.s.g(j0Var2.Y1(), j0Var.Y1())) || (gVarY1 = j0Var.Y1()) == null) {
            return null;
        }
        g.f116466b.getClass();
        if (i14 == g.f116471g) {
            f5.g.b.f68944b.getClass();
            i15 = f5.g.b.f68949g;
        } else if (i14 == g.f116472h) {
            f5.g.b.f68944b.getClass();
            i15 = f5.g.b.f68950h;
        } else if (i14 == g.f116469e) {
            f5.g.b.f68944b.getClass();
            i15 = f5.g.b.f68947e;
        } else if (i14 == g.f116470f) {
            f5.g.b.f68944b.getClass();
            i15 = f5.g.b.f68948f;
        } else if (i14 == g.f116467c) {
            f5.g.b.f68944b.getClass();
            i15 = f5.g.b.f68946d;
        } else {
            if (i14 != g.f116468d) {
                vb.h.z("Unsupported direction for beyond bounds layout");
                return null;
            }
            f5.g.b.f68944b.getClass();
            i15 = f5.g.b.f68945c;
        }
        return (T) gVarY1.J0(i15, lVar);
    }
}
