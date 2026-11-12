package m4;

import h5.a1;
import h5.j1;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116495a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f116495a = iArr;
        }
    }

    public static final boolean a(j0 j0Var, boolean z14) {
        int i14 = a.f116495a[j0Var.a0().ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                if (z14 && !h4.i.f81561c) {
                    h5.k.h(j0Var).getFocusOwner().j(null);
                    j0Var.V1(h0.Captured, h0.Inactive);
                }
                return z14;
            }
            if (i14 == 3) {
                j0 j0VarC = m0.c(j0Var);
                if (!(j0VarC != null ? a(j0VarC, z14) : true)) {
                    return false;
                }
                j0Var.V1(h0.ActiveParent, h0.Inactive);
                return true;
            }
            if (i14 != 4) {
                u0.r();
                return false;
            }
        } else if (!h4.i.f81561c) {
            h5.k.h(j0Var).getFocusOwner().j(null);
            j0Var.V1(h0.Active, h0.Inactive);
        }
        return true;
    }

    public static final c b(j0 j0Var, int i14) {
        int i15 = a.f116495a[j0Var.a0().ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                return c.Cancelled;
            }
            if (i15 == 3) {
                j0 j0VarC = m0.c(j0Var);
                if (j0VarC == null) {
                    vb.h.s("ActiveParent with no focused child");
                    return null;
                }
                c cVarB = b(j0VarC, i14);
                c cVar = c.None;
                if (cVarB == cVar) {
                    cVarB = null;
                }
                if (cVarB != null) {
                    return cVarB;
                }
                if (j0Var.f116486d) {
                    return cVar;
                }
                j0Var.f116486d = true;
                try {
                    z zVarW1 = j0Var.W1();
                    b bVar = new b(i14, null);
                    u focusOwner = h5.k.h(j0Var).getFocusOwner();
                    j0 j0VarF = focusOwner.f();
                    zVarW1.f116556l.invoke(bVar);
                    j0 j0VarF2 = focusOwner.f();
                    if (bVar.f116450b) {
                        b0.f116451b.getClass();
                        return c.Cancelled;
                    }
                    if (j0VarF == j0VarF2 || j0VarF2 == null) {
                        return cVar;
                    }
                    b0.f116451b.getClass();
                    return b0.f116454e == b0.f116453d ? c.Cancelled : c.Redirected;
                } finally {
                    j0Var.f116486d = false;
                }
            }
            if (i15 != 4) {
                u0.r();
                return null;
            }
        }
        return c.None;
    }

    public static final c c(j0 j0Var, int i14) {
        if (!j0Var.f116487e) {
            j0Var.f116487e = true;
            try {
                z zVarW1 = j0Var.W1();
                b bVar = new b(i14, null);
                u focusOwner = h5.k.h(j0Var).getFocusOwner();
                j0 j0VarF = focusOwner.f();
                zVarW1.f116555k.invoke(bVar);
                j0 j0VarF2 = focusOwner.f();
                if (bVar.f116450b) {
                    b0.f116451b.getClass();
                    return c.Cancelled;
                }
                if (j0VarF != j0VarF2 && j0VarF2 != null) {
                    b0.f116451b.getClass();
                    return b0.f116454e == b0.f116453d ? c.Cancelled : c.Redirected;
                }
            } finally {
                j0Var.f116487e = false;
            }
        }
        return c.None;
    }

    public static final c d(j0 j0Var, int i14) {
        h4.r.c cVarB;
        a1 a1Var;
        int i15 = a.f116495a[j0Var.a0().ordinal()];
        if (i15 == 1 || i15 == 2) {
            return c.None;
        }
        if (i15 == 3) {
            j0 j0VarC = m0.c(j0Var);
            if (j0VarC != null) {
                return b(j0VarC, i14);
            }
            vb.h.s("ActiveParent with no focused child");
            return null;
        }
        if (i15 != 4) {
            u0.r();
            return null;
        }
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
        if (j0Var2 == null) {
            return c.None;
        }
        int i17 = a.f116495a[j0Var2.a0().ordinal()];
        if (i17 == 1) {
            return c(j0Var2, i14);
        }
        if (i17 == 2) {
            return c.Cancelled;
        }
        if (i17 == 3) {
            return d(j0Var2, i14);
        }
        if (i17 != 4) {
            u0.r();
            return null;
        }
        c cVarD = d(j0Var2, i14);
        c cVar2 = cVarD != c.None ? cVarD : null;
        return cVar2 == null ? c(j0Var2, i14) : cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01a6 A[PHI: r14
      0x01a6: PHI (r14v2 q3.c) = (r14v1 q3.c), (r14v1 q3.c), (r14v1 q3.c), (r14v4 q3.c) binds: [B:92:0x015f, B:94:0x0167, B:96:0x016b, B:110:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:154:0x024e A[ADDED_TO_REGION, LOOP:9: B:154:0x024e->B:161:0x0262, LOOP_START, PHI: r4
      0x024e: PHI (r4v9 int) = (r4v8 int), (r4v10 int) binds: [B:153:0x024c, B:161:0x0262] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x0250  */
    /* JADX WARN: Code duplicated, block: B:158:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x025d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0260  */
    /* JADX WARN: Code duplicated, block: B:162:0x026a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0272  */
    /* JADX WARN: Code duplicated, block: B:169:0x027f  */
    /* JADX WARN: Code duplicated, block: B:207:0x01d6 A[SYNTHETIC] */
    public static final boolean e(j0 j0Var) {
        q3.c cVar;
        int i14;
        Object[] objArr;
        j0 j0Var2;
        h0 h0Var;
        a1 a1Var;
        int i15;
        a1 a1Var2;
        u focusOwner = h5.k.h(j0Var).getFocusOwner();
        j0 j0VarF = focusOwner.f();
        h0 h0VarA0 = j0Var.a0();
        int i16 = 1;
        if (j0VarF == j0Var) {
            j0Var.V1(h0VarA0, h0VarA0);
            return true;
        }
        if (!h4.i.f81559a ? j0VarF != null || h5.k.h(j0Var).getFocusOwner().a() : !(j0VarF == null || j0VarF.f116483a) || j0Var.f116483a || h5.k.h(j0Var).getFocusOwner().a()) {
            return false;
        }
        if (j0VarF != null) {
            cVar = new q3.c(new j0[16], 0);
            if (!j0VarF.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            h4.r.c parent = j0VarF.getNode().getParent();
            h5.e0 e0VarG = h5.k.g(j0VarF);
            while (e0VarG != null) {
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 1024) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 1024) != 0) {
                            h4.r.c cVarB = parent;
                            q3.c cVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof j0) {
                                    cVar.b((j0) cVarB);
                                } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                    int i17 = 0;
                                    for (h4.r.c child = ((h5.m) cVarB).f81888b; child != null; child = child.getChild()) {
                                        if ((child.getKindSet() & 1024) != 0) {
                                            i17++;
                                            if (i17 == 1) {
                                                Unit unit = Unit.INSTANCE;
                                                cVarB = child;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar2.b(child);
                                            }
                                        }
                                    }
                                    if (i17 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                parent = (e0VarG == null || (a1Var2 = e0VarG.P) == null) ? null : a1Var2.f81684e;
            }
        } else {
            cVar = null;
        }
        q3.c cVar3 = new q3.c(new j0[16], 0);
        q3.c cVar4 = new q3.c(new j0[16], 0);
        if (!j0Var.getNode().getIsAttached()) {
            e5.a.b("visitAncestors called on an unattached node");
        }
        h4.r.c parent2 = j0Var.getNode().getParent();
        h5.e0 e0VarG2 = h5.k.g(j0Var);
        boolean z14 = true;
        while (e0VarG2 != null) {
            if ((e0VarG2.P.f81685f.getAggregateChildKindSet() & 1024) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & 1024) != 0) {
                        h4.r.c cVarB2 = parent2;
                        q3.c cVar5 = null;
                        while (cVarB2 != null) {
                            if (cVarB2 instanceof j0) {
                                j0 j0Var3 = (j0) cVarB2;
                                if (p005kotlin.jvm.internal.s.g(cVar != null ? Boolean.valueOf(cVar.j(j0Var3)) : null, Boolean.TRUE)) {
                                    cVar3.b(j0Var3);
                                } else {
                                    cVar4.b(j0Var3);
                                }
                                if (j0Var3 == j0VarF) {
                                    z14 = false;
                                }
                                i15 = 0;
                            } else {
                                i15 = i16;
                            }
                            if (i15 == 0 || (cVarB2.getKindSet() & 1024) == 0 || !(cVarB2 instanceof h5.m)) {
                                cVarB2 = h5.k.b(cVar5);
                                i16 = 1;
                            } else {
                                h4.r.c child2 = ((h5.m) cVarB2).f81888b;
                                int i18 = 0;
                                while (child2 != null) {
                                    if ((child2.getKindSet() & 1024) != 0) {
                                        i18++;
                                        if (i18 == i16) {
                                            Unit unit2 = Unit.INSTANCE;
                                            cVarB2 = child2;
                                        } else {
                                            if (cVar5 == null) {
                                                cVar5 = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (cVarB2 != null) {
                                                cVar5.b(cVarB2);
                                                cVarB2 = null;
                                            }
                                            cVar5.b(child2);
                                        }
                                    }
                                    child2 = child2.getChild();
                                    i16 = 1;
                                }
                                if (i18 != i16) {
                                    cVarB2 = h5.k.b(cVar5);
                                    i16 = 1;
                                }
                            }
                        }
                    }
                    parent2 = parent2.getParent();
                    i16 = 1;
                }
            }
            e0VarG2 = e0VarG2.K();
            parent2 = (e0VarG2 == null || (a1Var = e0VarG2.P) == null) ? null : a1Var.f81684e;
            i16 = 1;
        }
        if (!z14 || j0VarF == null || a(j0VarF, false)) {
            j1.a(j0Var, new l0(j0Var));
            int i19 = a.f116495a[j0Var.a0().ordinal()];
            if (i19 != 1 && i19 != 2) {
                if (i19 != 3 && i19 != 4) {
                    u0.r();
                    return false;
                }
                h5.k.h(j0Var).getFocusOwner().j(j0Var);
            }
            if (h4.i.f81561c && z14 && j0VarF != null) {
                j0VarF.V1(h0.Active, h0.Inactive);
                Unit unit3 = Unit.INSTANCE;
            }
            if (cVar != null) {
                int i24 = cVar.f142358c - 1;
                Object[] objArr2 = cVar.f142356a;
                if (i24 < objArr2.length) {
                    while (i24 >= 0) {
                        j0 j0Var4 = (j0) objArr2[i24];
                        if (focusOwner.f() == j0Var) {
                            j0Var4.V1(h0.ActiveParent, h0.Inactive);
                            i24--;
                        }
                    }
                }
                Unit unit4 = Unit.INSTANCE;
                i14 = cVar4.f142358c - 1;
                objArr = cVar4.f142356a;
                if (i14 < objArr.length) {
                    while (i14 >= 0) {
                        j0Var2 = (j0) objArr[i14];
                        if (focusOwner.f() != j0Var) {
                            if (j0Var2 == j0VarF) {
                                h0Var = h0.Active;
                            } else {
                                h0Var = h0.Inactive;
                            }
                            j0Var2.V1(h0Var, h0.ActiveParent);
                            i14--;
                        }
                    }
                    if (focusOwner.f() == j0Var) {
                        j0Var.V1(h0VarA0, h0.Active);
                        if (focusOwner.f() == j0Var) {
                            boolean z15 = h4.i.f81559a;
                            return true;
                        }
                    }
                } else if (focusOwner.f() == j0Var) {
                    j0Var.V1(h0VarA0, h0.Active);
                    if (focusOwner.f() == j0Var) {
                        boolean z16 = h4.i.f81559a;
                        return true;
                    }
                }
            } else {
                i14 = cVar4.f142358c - 1;
                objArr = cVar4.f142356a;
                if (i14 < objArr.length) {
                    while (i14 >= 0) {
                        j0Var2 = (j0) objArr[i14];
                        if (focusOwner.f() != j0Var) {
                            if (j0Var2 == j0VarF) {
                                h0Var = h0.Active;
                            } else {
                                h0Var = h0.Inactive;
                            }
                            j0Var2.V1(h0Var, h0.ActiveParent);
                            i14--;
                        }
                    }
                    if (focusOwner.f() == j0Var) {
                        j0Var.V1(h0VarA0, h0.Active);
                        if (focusOwner.f() == j0Var) {
                            boolean z17 = h4.i.f81559a;
                            return true;
                        }
                    }
                } else if (focusOwner.f() == j0Var) {
                    j0Var.V1(h0VarA0, h0.Active);
                    if (focusOwner.f() == j0Var) {
                        boolean z18 = h4.i.f81559a;
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
