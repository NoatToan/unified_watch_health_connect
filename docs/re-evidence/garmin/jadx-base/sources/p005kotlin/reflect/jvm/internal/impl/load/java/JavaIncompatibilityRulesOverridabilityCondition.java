package p005kotlin.reflect.jvm.internal.impl.load.java;

import b43.i;
import j33.c;
import java.util.List;
import o13.p;
import o72.t;
import p005kotlin.jvm.internal.j;
import p005kotlin.reflect.jvm.internal.impl.builtins.d;
import p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p13.h0;
import p43.n0;
import q33.b0;
import q33.s;
import t23.b;
import t23.e;
import t23.h;
import t23.j1;
import t23.l;
import t23.v;
import x33.f;

/* JADX INFO: loaded from: classes3.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final a Companion = new a(null);

    @Override // p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.a getContract() {
        return ExternalOverridabilityCondition.a.CONFLICTS_ONLY;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r0.equals(q33.b0.a(r1, 2)) != false) goto L45;
     */
    @Override // p005kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExternalOverridabilityCondition.b isOverridable(t23.a aVar, t23.a aVar2, e eVar) {
        b bVarC;
        boolean z14;
        v vVar;
        aVar.getClass();
        aVar2.getClass();
        if ((aVar instanceof b) && (aVar2 instanceof v) && !d.A(aVar2)) {
            b bVar = b.f105903m;
            v vVar2 = (v) aVar2;
            f name = vVar2.getName();
            name.getClass();
            bVar.getClass();
            if (b.b(name)) {
                bVarC = c.c((b) aVar);
                z14 = aVar instanceof v;
                if (z14) {
                    vVar = (v) aVar;
                } else {
                    vVar = null;
                }
                if (vVar == null) {
                    if (eVar instanceof c) {
                        if (bVarC instanceof v) {
                            String strA = b0.a(vVar2, 2);
                            v vVarA = ((v) aVar).a();
                            vVarA.getClass();
                        }
                    }
                } else if (eVar instanceof c) {
                    if (bVarC instanceof v) {
                        String strA2 = b0.a(vVar2, 2);
                        v vVarA2 = ((v) aVar).a();
                        vVarA2.getClass();
                    }
                }
                return ExternalOverridabilityCondition.b.INCOMPATIBLE;
            }
            d.a aVar3 = d.f105904a;
            f name2 = vVar2.getName();
            name2.getClass();
            aVar3.getClass();
            if (d.f105914k.contains(name2)) {
                bVarC = c.c((b) aVar);
                z14 = aVar instanceof v;
                if (z14) {
                    vVar = (v) aVar;
                } else {
                    vVar = null;
                }
                if ((vVar == null && vVar2.C0() == vVar.C0()) || (bVarC != null && vVar2.C0())) {
                    if ((eVar instanceof c) && vVar2.y0() == null && bVarC != null && !c.d(eVar, bVarC)) {
                        if ((bVarC instanceof v) && z14 && b.a((v) bVarC) != null) {
                            String strA3 = b0.a(vVar2, 2);
                            v vVarA3 = ((v) aVar).a();
                            vVarA3.getClass();
                        }
                    }
                }
                return ExternalOverridabilityCondition.b.INCOMPATIBLE;
            }
        }
        Companion.getClass();
        return a.a(aVar, aVar2) ? ExternalOverridabilityCondition.b.INCOMPATIBLE : ExternalOverridabilityCondition.b.UNKNOWN;
    }

    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static boolean a(t23.a aVar, t23.a aVar2) {
            aVar.getClass();
            aVar2.getClass();
            if (!(aVar2 instanceof j33.e) || !(aVar instanceof v)) {
                return false;
            }
            j33.e eVar = (j33.e) aVar2;
            eVar.f().size();
            v vVar = (v) aVar;
            vVar.f().size();
            List<j1> listF = eVar.a().f();
            listF.getClass();
            List<j1> listF2 = vVar.a().f();
            listF2.getClass();
            for (p pVar : h0.k1(listF, listF2)) {
                j1 j1Var = (j1) pVar.f128594a;
                j1 j1Var2 = (j1) pVar.f128595b;
                j1Var.getClass();
                boolean z14 = b((v) aVar2, j1Var) instanceof s.d;
                j1Var2.getClass();
                if (z14 != (b(vVar, j1Var2) instanceof s.d)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
        
            if (f43.e.g(r0).equals(f43.e.g(r1)) != false) goto L49;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static s b(v vVar, j1 j1Var) {
            l lVarD;
            e eVar;
            e eVar2;
            v vVarA;
            vVar.getClass();
            if (!p005kotlin.jvm.internal.s.g(vVar.getName().b(), "remove") || vVar.f().size() != 1 || (f43.e.i(vVar).d() instanceof c) || d.A(vVar)) {
                if (vVar.f().size() == 1) {
                    lVarD = vVar.d();
                    if (lVarD instanceof e) {
                        eVar = (e) lVarD;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        List<j1> listF = vVar.f();
                        listF.getClass();
                        h hVarT = ((j1) h0.I0(listF)).getType().F0().t();
                        eVar2 = hVarT instanceof e ? (e) hVarT : null;
                        if (eVar2 != null) {
                            if (d.u(eVar) != null) {
                            }
                        }
                    }
                }
                n0 type = j1Var.getType();
                type.getClass();
                return b0.c(type);
            }
            List<j1> listF2 = vVar.a().f();
            listF2.getClass();
            n0 type2 = ((j1) h0.I0(listF2)).getType();
            type2.getClass();
            s sVarC = b0.c(type2);
            s.d dVar = sVarC instanceof s.d ? (s.d) sVarC : null;
            if ((dVar != null ? dVar.f142536j : null) != g43.d.INT || (vVarA = b.a(vVar)) == null) {
                if (vVar.f().size() == 1) {
                    lVarD = vVar.d();
                    if (lVarD instanceof e) {
                        eVar = (e) lVarD;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        List<j1> listF3 = vVar.f();
                        listF3.getClass();
                        h hVarT2 = ((j1) h0.I0(listF3)).getType().F0().t();
                        if (hVarT2 instanceof e) {
                        }
                        if (eVar2 != null) {
                            if (d.u(eVar) != null) {
                            }
                        }
                    }
                }
                n0 type3 = j1Var.getType();
                type3.getClass();
                return b0.c(type3);
            }
            List<j1> listF4 = vVarA.a().f();
            listF4.getClass();
            n0 type4 = ((j1) h0.I0(listF4)).getType();
            type4.getClass();
            s sVarC2 = b0.c(type4);
            l lVarD2 = vVarA.d();
            lVarD2.getClass();
            x33.d dVarF = i.f(lVarD2);
            dVarF.getClass();
            if (!dVarF.equals(kotlin.reflect.jvm.internal.impl.builtins.f.a.L.f188596a) || !(sVarC2 instanceof s.c) || !p005kotlin.jvm.internal.s.g(((s.c) sVarC2).f142535j, "java/lang/Object")) {
                if (vVar.f().size() == 1) {
                    lVarD = vVar.d();
                    if (lVarD instanceof e) {
                        eVar = (e) lVarD;
                    } else {
                        eVar = null;
                    }
                    if (eVar != null) {
                        List<j1> listF5 = vVar.f();
                        listF5.getClass();
                        h hVarT3 = ((j1) h0.I0(listF5)).getType().F0().t();
                        if (hVarT3 instanceof e) {
                        }
                        if (eVar2 != null) {
                            if (d.u(eVar) != null) {
                            }
                        }
                    }
                }
                n0 type5 = j1Var.getType();
                type5.getClass();
                return b0.c(type5);
            }
            n0 type6 = j1Var.getType();
            type6.getClass();
            return b0.c(t.S(type6));
        }

        private a() {
        }
    }
}
