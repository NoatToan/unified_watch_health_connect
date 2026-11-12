package v43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.p;
import o72.t;
import p13.h0;
import p13.y;
import p43.a2;
import p43.d2;
import p43.f0;
import p43.g2;
import p43.m1;
import p43.n0;
import p43.q0;
import p43.t1;
import p43.v0;
import p43.v1;
import p43.y1;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175700a;

        static {
            int[] iArr = new int[g2.values().length];
            try {
                iArr[g2.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g2.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g2.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f175700a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v43.a<n0> a(n0 n0Var) {
        e eVar;
        Object objB;
        g2 g2VarB;
        e eVar2;
        n0Var.getClass();
        if (n0Var.I0() instanceof f0) {
            v43.a<n0> aVarA = a(oi0.c.Q(n0Var));
            v43.a<n0> aVarA2 = a(oi0.c.Y(n0Var));
            return new v43.a<>(og.a.P(q0.b(oi0.c.Q(aVarA.f175697a), oi0.c.Y(aVarA2.f175697a)), n0Var), og.a.P(q0.b(oi0.c.Q(aVarA.f175698b), oi0.c.Y(aVarA2.f175698b)), n0Var));
        }
        m1 m1VarF0 = n0Var.F0();
        if (n0Var.F0() instanceof c43.b) {
            m1VarF0.getClass();
            t1 projection = ((c43.b) m1VarF0).getProjection();
            n0 type = projection.getType();
            type.getClass();
            n0 n0VarJ = d2.j(type, n0Var.G0());
            int i14 = a.f175700a[projection.a().ordinal()];
            if (i14 == 2) {
                return new v43.a<>(n0VarJ, t.D(n0Var).p());
            }
            if (i14 != 3) {
                com.nimbusds.jose.shaded.gson.internal.a.y(projection, "Only nontrivial projections should have been captured, not: ");
                return null;
            }
            v0 v0VarO = t.D(n0Var).o();
            v0VarO.getClass();
            return new v43.a<>(d2.j(v0VarO, n0Var.G0()), n0VarJ);
        }
        if (n0Var.D0().isEmpty() || n0Var.D0().size() != m1VarF0.getParameters().size()) {
            return new v43.a<>(n0Var, n0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<t1> listD0 = n0Var.D0();
        List<d1> parameters = m1VarF0.getParameters();
        parameters.getClass();
        Iterator it = h0.k1(listD0, parameters).iterator();
        while (true) {
            boolean z14 = true;
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (!it3.hasNext()) {
                            z14 = false;
                            break;
                        }
                        eVar = (e) it3.next();
                        eVar.getClass();
                    } while (q43.d.f142786a.d(eVar.f175702b, eVar.f175703c));
                } else {
                    z14 = false;
                    break;
                }
                if (z14) {
                    objB = t.D(n0Var).o();
                    objB.getClass();
                } else {
                    objB = b(n0Var, arrayList);
                }
                return new v43.a<>(objB, b(n0Var, arrayList2));
            }
            p pVar = (p) it.next();
            t1 t1Var = (t1) pVar.f128594a;
            d1 d1Var = (d1) pVar.f128595b;
            d1Var.getClass();
            g2 g2VarM = d1Var.m();
            if (g2VarM == null) {
                a2.a(35);
                throw null;
            }
            if (t1Var == null) {
                a2.a(36);
                throw null;
            }
            a2 a2Var = a2.f135794b;
            if (t1Var.b()) {
                g2VarB = g2.OUT_VARIANCE;
                if (g2VarB == null) {
                    a2.a(37);
                    throw null;
                }
            } else {
                g2VarB = a2.b(g2VarM, t1Var.a());
            }
            int i15 = a.f175700a[g2VarB.ordinal()];
            if (i15 == 1) {
                n0 type2 = t1Var.getType();
                type2.getClass();
                n0 type3 = t1Var.getType();
                type3.getClass();
                eVar2 = new e(d1Var, type2, type3);
            } else if (i15 == 2) {
                n0 type4 = t1Var.getType();
                type4.getClass();
                v0 v0VarP = f43.e.e(d1Var).p();
                v0VarP.getClass();
                eVar2 = new e(d1Var, type4, v0VarP);
            } else {
                if (i15 != 3) {
                    u0.r();
                    return null;
                }
                v0 v0VarO2 = f43.e.e(d1Var).o();
                v0VarO2.getClass();
                n0 type5 = t1Var.getType();
                type5.getClass();
                eVar2 = new e(d1Var, v0VarO2, type5);
            }
            if (t1Var.b()) {
                arrayList.add(eVar2);
                arrayList2.add(eVar2);
            } else {
                v43.a<n0> aVarA3 = a(eVar2.f175702b);
                n0 n0Var2 = aVarA3.f175697a;
                n0 n0Var3 = aVarA3.f175698b;
                v43.a<n0> aVarA4 = a(eVar2.f175703c);
                n0 n0Var4 = aVarA4.f175697a;
                n0 n0Var5 = aVarA4.f175698b;
                d1 d1Var2 = eVar2.f175701a;
                v43.a aVar = new v43.a(new e(d1Var2, n0Var3, n0Var4), new e(d1Var2, n0Var2, n0Var5));
                e eVar3 = (e) aVar.f175697a;
                e eVar4 = (e) aVar.f175698b;
                arrayList.add(eVar3);
                arrayList2.add(eVar4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    public static final n0 b(n0 n0Var, ArrayList arrayList) {
        v1 v1Var;
        n0Var.D0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.getClass();
            n0 n0Var2 = eVar.f175703c;
            n0 n0Var3 = eVar.f175702b;
            d1 d1Var = eVar.f175701a;
            q43.d.f142786a.d(n0Var3, n0Var2);
            if (n0Var3.equals(n0Var2)) {
                v1Var = new v1(n0Var3);
            } else {
                g2 g2VarM = d1Var.m();
                g2 g2Var = g2.IN_VARIANCE;
                if (g2VarM == g2Var) {
                    v1Var = new v1(n0Var3);
                } else if (p005kotlin.reflect.jvm.internal.impl.builtins.d.F(n0Var3) && d1Var.m() != g2Var) {
                    g2 g2Var2 = g2.OUT_VARIANCE;
                    if (g2Var2 == d1Var.m()) {
                        g2Var2 = g2.INVARIANT;
                    }
                    v1Var = new v1(g2Var2, n0Var2);
                } else if (p005kotlin.reflect.jvm.internal.impl.builtins.d.y(n0Var2) && n0Var2.G0()) {
                    if (g2Var == d1Var.m()) {
                        g2Var = g2.INVARIANT;
                    }
                    v1Var = new v1(g2Var, n0Var3);
                } else {
                    g2 g2Var3 = g2.OUT_VARIANCE;
                    if (g2Var3 == d1Var.m()) {
                        g2Var3 = g2.INVARIANT;
                    }
                    v1Var = new v1(g2Var3, n0Var2);
                }
            }
            arrayList2.add(v1Var);
        }
        return y1.c(n0Var, arrayList2, null, 6);
    }
}
