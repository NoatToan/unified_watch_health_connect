package m4;

import h5.a1;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116512a;

        static {
            int[] iArr = new int[h0.values().length];
            try {
                iArr[h0.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f116512a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/g$a;", "", "invoke", "(Lf5/g$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<f5.g.a, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0 f116513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f116514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j0 f116515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f116516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.l<j0, Boolean> f116517e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(j0 j0Var, j0 j0Var2, j0 j0Var3, int i14, e23.l<? super j0, Boolean> lVar) {
            super(1);
            this.f116513a = j0Var;
            this.f116514b = j0Var2;
            this.f116515c = j0Var3;
            this.f116516d = i14;
            this.f116517e = lVar;
        }

        @Override // e23.l
        public final Boolean invoke(f5.g.a aVar) {
            f5.g.a aVar2 = aVar;
            j0 j0Var = this.f116514b;
            if (this.f116513a != h5.k.h(j0Var).getFocusOwner().f()) {
                return Boolean.TRUE;
            }
            boolean zF = p0.f(j0Var, this.f116515c, this.f116516d, this.f116517e);
            Boolean boolValueOf = Boolean.valueOf(zF);
            if (zF || !aVar2.a()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[RETURN] */
    public static final boolean a(j0 j0Var, e23.l<? super j0, Boolean> lVar) {
        h0 h0VarA0 = j0Var.a0();
        int[] iArr = a.f116512a;
        int i14 = iArr[h0VarA0.ordinal()];
        if (i14 != 1) {
            if (i14 == 2 || i14 == 3) {
                return d(j0Var, lVar);
            }
            if (i14 != 4) {
                u0.r();
                return false;
            }
            if (!d(j0Var, lVar)) {
                if (!(j0Var.W1().f116546b ? lVar.invoke(j0Var).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        j0 j0VarC = m0.c(j0Var);
        if (j0VarC == null) {
            vb.h.z("ActiveParent must have a focusedChild");
            return false;
        }
        int i15 = iArr[j0VarC.a0().ordinal()];
        if (i15 == 1) {
            if (!a(j0VarC, lVar)) {
                g.f116466b.getClass();
                if (!c(j0Var, j0VarC, g.f116468d, lVar) && (!j0VarC.W1().f116546b || !lVar.invoke(j0VarC).booleanValue())) {
                    return false;
                }
            }
            return true;
        }
        if (i15 == 2 || i15 == 3) {
            g.f116466b.getClass();
            return c(j0Var, j0VarC, g.f116468d, lVar);
        }
        if (i15 != 4) {
            u0.r();
            return false;
        }
        vb.h.z("ActiveParent must have a focusedChild");
        return false;
    }

    public static final boolean b(j0 j0Var, e23.l<? super j0, Boolean> lVar) {
        int i14 = a.f116512a[j0Var.a0().ordinal()];
        if (i14 != 1) {
            if (i14 == 2 || i14 == 3) {
                return e(j0Var, lVar);
            }
            if (i14 == 4) {
                return j0Var.W1().f116546b ? lVar.invoke(j0Var).booleanValue() : e(j0Var, lVar);
            }
            u0.r();
            return false;
        }
        j0 j0VarC = m0.c(j0Var);
        if (j0VarC == null) {
            vb.h.z("ActiveParent must have a focusedChild");
            return false;
        }
        if (!b(j0VarC, lVar)) {
            g.f116466b.getClass();
            if (!c(j0Var, j0VarC, g.f116467c, lVar)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(j0 j0Var, j0 j0Var2, int i14, e23.l<? super j0, Boolean> lVar) {
        if (f(j0Var, j0Var2, i14, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) m4.a.a(j0Var, i14, new b(h5.k.h(j0Var).getFocusOwner().f(), j0Var, j0Var2, i14, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(j0 j0Var, e23.l<? super j0, Boolean> lVar) {
        q3.c cVar = new q3.c(new j0[16], 0);
        if (!j0Var.getNode().getIsAttached()) {
            e5.a.b("visitChildren called on an unattached node");
        }
        q3.c cVar2 = new q3.c(new h4.r.c[16], 0);
        h4.r.c child = j0Var.getNode().getChild();
        if (child == null) {
            h5.k.a(cVar2, j0Var.getNode());
        } else {
            cVar2.b(child);
        }
        while (true) {
            int i14 = cVar2.f142358c;
            if (i14 == 0) {
                break;
            }
            h4.r.c cVarB = (h4.r.c) cVar2.k(i14 - 1);
            if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                h5.k.a(cVar2, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.getKindSet() & 1024) != 0) {
                        q3.c cVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof j0) {
                                cVar.b((j0) cVarB);
                            } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                int i15 = 0;
                                for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                    if ((child2.getKindSet() & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarB = child2;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (cVarB != null) {
                                                cVar3.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar3.b(child2);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarB = h5.k.b(cVar3);
                        }
                        break;
                    }
                    cVarB = cVarB.getChild();
                }
            }
        }
        cVar.n(o0.f116511a);
        int i16 = cVar.f142358c - 1;
        Object[] objArr = cVar.f142356a;
        if (i16 < objArr.length) {
            while (i16 >= 0) {
                j0 j0Var2 = (j0) objArr[i16];
                if (m0.d(j0Var2) && a(j0Var2, lVar)) {
                    return true;
                }
                i16--;
            }
        }
        return false;
    }

    public static final boolean e(j0 j0Var, e23.l<? super j0, Boolean> lVar) {
        q3.c cVar = new q3.c(new j0[16], 0);
        if (!j0Var.getNode().getIsAttached()) {
            e5.a.b("visitChildren called on an unattached node");
        }
        q3.c cVar2 = new q3.c(new h4.r.c[16], 0);
        h4.r.c child = j0Var.getNode().getChild();
        if (child == null) {
            h5.k.a(cVar2, j0Var.getNode());
        } else {
            cVar2.b(child);
        }
        while (true) {
            int i14 = cVar2.f142358c;
            if (i14 == 0) {
                break;
            }
            h4.r.c cVarB = (h4.r.c) cVar2.k(i14 - 1);
            if ((cVarB.getAggregateChildKindSet() & 1024) == 0) {
                h5.k.a(cVar2, cVarB);
            } else {
                while (cVarB != null) {
                    if ((cVarB.getKindSet() & 1024) != 0) {
                        q3.c cVar3 = null;
                        while (cVarB != null) {
                            if (cVarB instanceof j0) {
                                cVar.b((j0) cVarB);
                            } else if ((cVarB.getKindSet() & 1024) != 0 && (cVarB instanceof h5.m)) {
                                int i15 = 0;
                                for (h4.r.c child2 = ((h5.m) cVarB).f81888b; child2 != null; child2 = child2.getChild()) {
                                    if ((child2.getKindSet() & 1024) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarB = child2;
                                        } else {
                                            if (cVar3 == null) {
                                                cVar3 = new q3.c(new h4.r.c[16], 0);
                                            }
                                            if (cVarB != null) {
                                                cVar3.b(cVarB);
                                                cVarB = null;
                                            }
                                            cVar3.b(child2);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarB = h5.k.b(cVar3);
                        }
                        break;
                    }
                    cVarB = cVarB.getChild();
                }
            }
        }
        cVar.n(o0.f116511a);
        Object[] objArr = cVar.f142356a;
        int i16 = cVar.f142358c;
        for (int i17 = 0; i17 < i16; i17++) {
            j0 j0Var2 = (j0) objArr[i17];
            if (m0.d(j0Var2) && b(j0Var2, lVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:156:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x015a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0166 A[ADDED_TO_REGION, LOOP:6: B:89:0x0166->B:117:0x01bb, LOOP_START, PHI: r12
      0x0166: PHI (r12v14 h4.r$c) = (r12v9 h4.r$c), (r12v15 h4.r$c) binds: [B:88:0x0164, B:117:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0168  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x017a  */
    public static final boolean f(j0 j0Var, j0 j0Var2, int i14, e23.l<? super j0, Boolean> lVar) {
        h4.r.c cVar;
        h4.r.c parent;
        h5.e0 e0VarG;
        a1 a1Var;
        h4.r.c cVarB;
        q3.c cVar2;
        if (j0Var.a0() != h0.ActiveParent) {
            vb.h.z("This function should only be used within a parent that has focus.");
            return false;
        }
        q3.c cVar3 = new q3.c(new j0[16], 0);
        if (!j0Var.getNode().getIsAttached()) {
            e5.a.b("visitChildren called on an unattached node");
        }
        q3.c cVar4 = new q3.c(new h4.r.c[16], 0);
        h4.r.c child = j0Var.getNode().getChild();
        if (child == null) {
            h5.k.a(cVar4, j0Var.getNode());
        } else {
            cVar4.b(child);
        }
        while (true) {
            int i15 = cVar4.f142358c;
            cVar = null;
            if (i15 == 0) {
                break;
            }
            h4.r.c cVarB2 = (h4.r.c) cVar4.k(i15 - 1);
            if ((cVarB2.getAggregateChildKindSet() & 1024) == 0) {
                h5.k.a(cVar4, cVarB2);
            } else {
                while (cVarB2 != null) {
                    if ((cVarB2.getKindSet() & 1024) != 0) {
                        q3.c cVar5 = null;
                        while (cVarB2 != null) {
                            if (cVarB2 instanceof j0) {
                                cVar3.b((j0) cVarB2);
                            } else if ((cVarB2.getKindSet() & 1024) != 0 && (cVarB2 instanceof h5.m)) {
                                int i16 = 0;
                                for (h4.r.c child2 = ((h5.m) cVarB2).f81888b; child2 != null; child2 = child2.getChild()) {
                                    if ((child2.getKindSet() & 1024) != 0) {
                                        i16++;
                                        if (i16 == 1) {
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
                                }
                                if (i16 == 1) {
                                }
                            }
                            cVarB2 = h5.k.b(cVar5);
                        }
                        break;
                    }
                    cVarB2 = cVarB2.getChild();
                }
            }
        }
        cVar3.n(o0.f116511a);
        g.f116466b.getClass();
        if (i14 != g.f116467c) {
            if (i14 != g.f116468d) {
                vb.h.z("This function should only be used for 1-D focus search");
                return false;
            }
            j23.l lVarO = j23.t.o(0, cVar3.f142358c);
            int i17 = lVarO.f96796a;
            int i18 = lVarO.f96797b;
            if (i17 <= i18) {
                boolean z14 = false;
                while (true) {
                    if (z14) {
                        j0 j0Var3 = (j0) cVar3.f142356a[i18];
                        if (m0.d(j0Var3) && a(j0Var3, lVar)) {
                            return true;
                        }
                    }
                    if (p005kotlin.jvm.internal.s.g(cVar3.f142356a[i18], j0Var2)) {
                        z14 = true;
                    }
                    if (i18 == i17) {
                        break;
                    }
                    i18--;
                }
            }
            g.f116466b.getClass();
            if (i14 != g.f116467c) {
                if (!j0Var.getNode().getIsAttached()) {
                    e5.a.b("visitAncestors called on an unattached node");
                }
                parent = j0Var.getNode().getParent();
                e0VarG = h5.k.g(j0Var);
                loop5: while (e0VarG != null) {
                    if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 1024) != 0) {
                        while (parent != null) {
                            if ((parent.getKindSet() & 1024) != 0) {
                                cVarB = parent;
                                cVar2 = null;
                                while (cVarB != null) {
                                    if (cVarB instanceof j0) {
                                        cVar = cVarB;
                                        break loop5;
                                    }
                                    if ((cVarB.getKindSet() & 1024) == 0) {
                                    }
                                    cVarB = h5.k.b(cVar2);
                                }
                            }
                            parent = parent.getParent();
                        }
                    }
                    e0VarG = e0VarG.K();
                    if (e0VarG != null) {
                    }
                }
                if (cVar != null) {
                    return lVar.invoke(j0Var).booleanValue();
                }
            }
            return false;
        }
        j23.l lVarO2 = j23.t.o(0, cVar3.f142358c);
        int i19 = lVarO2.f96796a;
        int i24 = lVarO2.f96797b;
        if (i19 <= i24) {
            boolean z15 = false;
            while (true) {
                if (z15) {
                    j0 j0Var4 = (j0) cVar3.f142356a[i19];
                    if (m0.d(j0Var4) && b(j0Var4, lVar)) {
                        return true;
                    }
                }
                if (p005kotlin.jvm.internal.s.g(cVar3.f142356a[i19], j0Var2)) {
                    z15 = true;
                }
                if (i19 == i24) {
                    break;
                }
                i19++;
            }
        }
        g.f116466b.getClass();
        if (i14 != g.f116467c && j0Var.W1().f116546b) {
            if (!j0Var.getNode().getIsAttached()) {
                e5.a.b("visitAncestors called on an unattached node");
            }
            parent = j0Var.getNode().getParent();
            e0VarG = h5.k.g(j0Var);
            loop5: while (e0VarG != null) {
                if ((e0VarG.P.f81685f.getAggregateChildKindSet() & 1024) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & 1024) != 0) {
                            cVarB = parent;
                            cVar2 = null;
                            while (cVarB != null) {
                                if (cVarB instanceof j0) {
                                    cVar = cVarB;
                                    break loop5;
                                }
                                if ((cVarB.getKindSet() & 1024) == 0 && (cVarB instanceof h5.m)) {
                                    int i25 = 0;
                                    for (h4.r.c child3 = ((h5.m) cVarB).f81888b; child3 != null; child3 = child3.getChild()) {
                                        if ((child3.getKindSet() & 1024) != 0) {
                                            i25++;
                                            if (i25 == 1) {
                                                cVarB = child3;
                                            } else {
                                                if (cVar2 == null) {
                                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                                }
                                                if (cVarB != null) {
                                                    cVar2.b(cVarB);
                                                    cVarB = null;
                                                }
                                                cVar2.b(child3);
                                            }
                                        }
                                    }
                                    if (i25 == 1) {
                                    }
                                }
                                cVarB = h5.k.b(cVar2);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                e0VarG = e0VarG.K();
                parent = (e0VarG != null || (a1Var = e0VarG.P) == null) ? null : a1Var.f81684e;
            }
            if (cVar != null) {
                return lVar.invoke(j0Var).booleanValue();
            }
        }
        return false;
    }
}
