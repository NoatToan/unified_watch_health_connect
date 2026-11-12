package p43;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f135904a = new q0();

    public static final class a implements e23.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f135905a = 0;

        static {
            new a();
        }

        @Override // e23.l
        public final Object invoke(Object obj) {
            ((q43.f) obj).getClass();
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m1 f135906a;

        public b(v0 v0Var, m1 m1Var) {
            this.f135906a = m1Var;
        }
    }

    static {
        int i14 = a.f135905a;
    }

    private q0() {
    }

    public static final v0 a(t23.c1 c1Var, List<? extends t1> list) {
        list.getClass();
        f1 f1Var = new f1(h1.a.f135854a, false);
        g1.f135838e.getClass();
        g1 g1VarA = g1.a.a(null, c1Var, list);
        k1.f135863b.getClass();
        k1 k1Var = k1.f135864c;
        k1Var.getClass();
        return f1Var.c(g1VarA, k1Var, false, 0, true);
    }

    public static final f2 b(v0 v0Var, v0 v0Var2) {
        v0Var.getClass();
        v0Var2.getClass();
        return v0Var.equals(v0Var2) ? v0Var : new g0(v0Var, v0Var2);
    }

    public static b c(m1 m1Var, q43.f fVar, List list) {
        t23.h hVarT = m1Var.t();
        if (hVarT != null) {
            fVar.d(hVarT);
        }
        return null;
    }

    public static final v0 d(k1 k1Var, t23.e eVar, List<? extends t1> list) {
        k1Var.getClass();
        eVar.getClass();
        list.getClass();
        m1 m1VarH = eVar.h();
        m1VarH.getClass();
        return e(k1Var, m1VarH, list, false, null);
    }

    public static final v0 e(k1 k1Var, m1 m1Var, List<? extends t1> list, boolean z14, q43.f fVar) {
        i43.l lVarA;
        w23.e0 e0Var;
        k1Var.getClass();
        m1Var.getClass();
        list.getClass();
        if (k1Var.isEmpty() && list.isEmpty() && !z14 && m1Var.t() != null) {
            t23.h hVarT = m1Var.t();
            hVarT.getClass();
            v0 v0VarP = hVarT.p();
            v0VarP.getClass();
            return v0VarP;
        }
        f135904a.getClass();
        t23.h hVarT2 = m1Var.t();
        if (hVarT2 instanceof t23.d1) {
            lVarA = ((t23.d1) hVarT2).p().i();
        } else {
            if (hVarT2 instanceof t23.e) {
                if (fVar == null) {
                    int i14 = f43.e.f68881a;
                    t23.c0 c0VarC = b43.i.c(hVarT2);
                    c0VarC.getClass();
                    fVar = f43.e.h(c0VarC);
                }
                if (list.isEmpty()) {
                    t23.e eVar = (t23.e) hVarT2;
                    fVar.getClass();
                    w23.e0.f181593a.getClass();
                    e0Var = eVar instanceof w23.e0 ? (w23.e0) eVar : null;
                    if (e0Var == null || (lVarA = e0Var.N(fVar)) == null) {
                        lVarA = eVar.c0();
                        lVarA.getClass();
                    }
                } else {
                    t23.e eVar2 = (t23.e) hVarT2;
                    w1 w1VarA = o1.f135897b.a(m1Var, list);
                    fVar.getClass();
                    w23.e0.f181593a.getClass();
                    e0Var = eVar2 instanceof w23.e0 ? (w23.e0) eVar2 : null;
                    if (e0Var == null || (lVarA = e0Var.y(w1VarA, fVar)) == null) {
                        lVarA = eVar2.t(w1VarA);
                        lVarA.getClass();
                    }
                }
            } else if (hVarT2 instanceof t23.c1) {
                r43.h hVar = r43.h.SCOPE_FOR_ABBREVIATION_TYPE;
                String str = ((t23.c1) hVarT2).getName().f188605a;
                str.getClass();
                lVarA = r43.l.a(hVar, true, str);
            } else {
                if (!(m1Var instanceof m0)) {
                    androidx.core.view.j.t("Unsupported classifier: ", hVarT2, " for constructor: ", m1Var);
                    return null;
                }
                i43.y.a aVar = i43.y.f91078c;
                LinkedHashSet<n0> linkedHashSet = ((m0) m1Var).f135886b;
                aVar.getClass();
                lVarA = i43.y.a.a("member scope for intersection type", linkedHashSet);
            }
        }
        return f(k1Var, m1Var, list, z14, lVarA, new o0(m1Var, list, k1Var, z14));
    }

    public static final v0 f(k1 k1Var, m1 m1Var, List<? extends t1> list, boolean z14, i43.l lVar, e23.l<? super q43.f, ? extends v0> lVar2) {
        k1Var.getClass();
        m1Var.getClass();
        list.getClass();
        lVar.getClass();
        w0 w0Var = new w0(m1Var, list, z14, lVar, lVar2);
        return k1Var.isEmpty() ? w0Var : new x0(w0Var, k1Var);
    }

    public static final v0 g(m1 m1Var, List list, k1 k1Var, boolean z14, i43.l lVar) {
        k1Var.getClass();
        m1Var.getClass();
        list.getClass();
        lVar.getClass();
        w0 w0Var = new w0(m1Var, list, z14, lVar, new p0(m1Var, list, k1Var, z14, lVar));
        return k1Var.isEmpty() ? w0Var : new x0(w0Var, k1Var);
    }
}
