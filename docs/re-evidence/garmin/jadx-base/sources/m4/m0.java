package m4;

import h5.c1;
import lc.u0;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f116501b;

        static {
            int[] iArr = new int[g6.o.values().length];
            try {
                iArr[g6.o.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g6.o.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f116500a = iArr;
            int[] iArr2 = new int[h0.values().length];
            try {
                iArr2[h0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h0.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f116501b = iArr2;
        }
    }

    public static final j0 a(j0 j0Var) {
        j0 j0VarF = h5.k.h(j0Var).getFocusOwner().f();
        if (j0VarF == null || !j0VarF.getIsAttached()) {
            return null;
        }
        return j0VarF;
    }

    public static final n4.d b(j0 j0Var) {
        if (!j0Var.getIsAttached()) {
            n4.d.f123545e.getClass();
            return n4.d.f123546f;
        }
        c1 coordinator = j0Var.getCoordinator();
        if (coordinator != null) {
            f5.c0 c0VarC = f5.d0.c(coordinator);
            if (!c0VarC.isAttached()) {
                c0VarC = null;
            }
            if (c0VarC != null) {
                return j0Var.X1(c0VarC);
            }
        }
        n4.d.f123545e.getClass();
        return n4.d.f123546f;
    }

    public static final j0 c(j0 j0Var) {
        if (j0Var.getNode().getIsAttached()) {
            if (!j0Var.getNode().getIsAttached()) {
                e5.a.b("visitChildren called on an unattached node");
            }
            q3.c cVar = new q3.c(new h4.r.c[16], 0);
            h4.r.c child = j0Var.getNode().getChild();
            if (child == null) {
                h5.k.a(cVar, j0Var.getNode());
            } else {
                cVar.b(child);
            }
            while (true) {
                int i14 = cVar.f142358c;
                if (i14 == 0) {
                    break;
                }
                h4.r.c cVarB = (h4.r.c) cVar.k(i14 - 1);
                if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                    h5.k.a(cVar, cVarB);
                } else {
                    while (cVarB != null) {
                        if ((cVarB.getKindSet() & 1024) != 0) {
                            q3.c cVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof j0) {
                                    j0 j0Var2 = (j0) cVarB;
                                    if (j0Var2.getNode().getIsAttached()) {
                                        int i15 = a.f116501b[j0Var2.a0().ordinal()];
                                        if (i15 == 1 || i15 == 2 || i15 == 3) {
                                            return j0Var2;
                                        }
                                        if (i15 != 4) {
                                            u0.r();
                                            return null;
                                        }
                                    }
                                } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                    int i16 = 0;
                                    for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                        if ((child2.getKindSet() & 1024) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                cVarB = child2;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar2.b(child2);
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar2);
                            }
                            break;
                        }
                        cVarB = cVarB.getChild();
                    }
                }
            }
        }
        return null;
    }

    public static final boolean d(j0 j0Var) {
        h5.e0 e0Var;
        c1 coordinator;
        h5.e0 e0Var2;
        c1 coordinator2 = j0Var.getCoordinator();
        return (coordinator2 == null || (e0Var = coordinator2.f81711p) == null || !e0Var.g() || (coordinator = j0Var.getCoordinator()) == null || (e0Var2 = coordinator.f81711p) == null || !e0Var2.isAttached()) ? false : true;
    }
}
