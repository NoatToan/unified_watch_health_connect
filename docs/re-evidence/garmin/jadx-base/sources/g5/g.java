package g5;

import h4.r;
import h5.a1;
import h5.e0;
import h5.j;
import h5.k;
import h5.m;

/* JADX INFO: loaded from: classes.dex */
public interface g extends j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    default <T> T I0(c<T> cVar) {
        a1 a1Var;
        if (!getNode().getIsAttached()) {
            e5.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        r.c parent = getNode().getParent();
        e0 e0VarG = k.g(this);
        while (e0VarG != null) {
            if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 32) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & 32) != 0) {
                        ?? B = parent;
                        ?? cVar2 = 0;
                        while (B != 0) {
                            if (B instanceof g) {
                                g gVar = (g) B;
                                if (gVar.P0().a(cVar)) {
                                    return (T) gVar.P0().b(cVar);
                                }
                            } else if ((B.getKindSet() & 32) != 0 && (B instanceof m)) {
                                r.c child = ((m) B).f81888b;
                                int i14 = 0;
                                B = B;
                                cVar2 = cVar2;
                                while (child != null) {
                                    if ((child.getKindSet() & 32) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            cVar2 = cVar2;
                                            B = child;
                                        } else {
                                            if (cVar2 == 0) {
                                                cVar2 = new q3.c(new r.c[16], 0);
                                            }
                                            if (B != 0) {
                                                cVar2.b(B);
                                                B = 0;
                                            }
                                            cVar2.b(child);
                                        }
                                    }
                                    child = child.getChild();
                                    B = B;
                                    cVar2 = cVar2;
                                }
                                if (i14 == 1) {
                                }
                            }
                            B = k.b(cVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            e0VarG = e0VarG.K();
            parent = (e0VarG == null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
        }
        return cVar.f75874a.invoke();
    }

    default f P0() {
        return b.f75873a;
    }
}
