package p5;

import h5.a1;
import h5.y1;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    /* JADX WARN: Code duplicated, block: B:36:0x0070 A[LOOP:0: B:5:0x000f->B:36:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0075 A[EDGE_INSN: B:44:0x0075->B:37:0x0075 BREAK  A[LOOP:0: B:5:0x000f->B:36:0x0070], SYNTHETIC] */
    public static final y a(h5.e0 e0Var, boolean z14) {
        a1 a1Var = e0Var.P;
        Object obj = null;
        if ((a1Var.f81685f.getAggregateChildKindSet() & 8) != 0) {
            loop0: for (h4.r.c child = a1Var.f81685f; child != null; child = child.getChild()) {
                if ((child.getKindSet() & 8) == 0) {
                    if ((child.getAggregateChildKindSet() & 8) != 0) {
                        break;
                        break;
                    }
                } else {
                    h4.r.c cVarB = child;
                    q3.c cVar = null;
                    while (cVarB != null) {
                        if (cVarB instanceof y1) {
                            obj = cVarB;
                            break loop0;
                        }
                        if ((cVarB.getKindSet() & 8) != 0 && (cVarB instanceof h5.m)) {
                            int i14 = 0;
                            for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                if ((child2.getKindSet() & 8) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        cVarB = child2;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new q3.c(new h4.r.c[16], 0);
                                        }
                                        if (cVarB != null) {
                                            cVar.b(cVarB);
                                            cVarB = null;
                                        }
                                        cVar.b(child2);
                                    }
                                }
                            }
                            if (i14 == 1) {
                            }
                        }
                        cVarB = h5.k.b(cVar);
                    }
                    if ((child.getAggregateChildKindSet() & 8) != 0) {
                        break;
                    }
                }
            }
        }
        obj.getClass();
        h4.r.c node = ((y1) obj).getNode();
        q qVarY = e0Var.y();
        if (qVarY == null) {
            qVarY = new q();
        }
        return new y(node, z14, e0Var, qVarY);
    }
}
