package b43;

import p43.n0;
import p43.v0;
import t23.d0;
import t23.h1;
import t23.k1;
import t23.r0;
import t23.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15729a = 0;

    static {
        x33.c cVar = new x33.c("kotlin.jvm.JvmInline");
        x33.b.f188590d.getClass();
        x33.b.a.b(cVar);
        new x33.c("kotlin.jvm.JvmName");
    }

    public static final boolean a(t23.b bVar) {
        h1<v0> h1VarJ;
        bVar.getClass();
        if (!(bVar instanceof s0)) {
            return false;
        }
        r0 r0VarP0 = ((s0) bVar).p0();
        r0VarP0.getClass();
        if (r0VarP0.I() != null) {
            return false;
        }
        t23.l lVarD = r0VarP0.d();
        t23.e eVar = lVarD instanceof t23.e ? (t23.e) lVarD : null;
        if (eVar == null || (h1VarJ = eVar.J()) == null) {
            return false;
        }
        x33.f name = r0VarP0.getName();
        name.getClass();
        return h1VarJ.a(name);
    }

    public static final boolean b(t23.l lVar) {
        lVar.getClass();
        return (lVar instanceof t23.e) && (((t23.e) lVar).J() instanceof t23.w);
    }

    public static final boolean c(t23.l lVar) {
        lVar.getClass();
        return (lVar instanceof t23.e) && (((t23.e) lVar).J() instanceof d0);
    }

    public static final boolean d(k1 k1Var) {
        if (k1Var.I() != null) {
            return false;
        }
        t23.l lVarD = k1Var.d();
        x33.f fVar = null;
        t23.e eVar = lVarD instanceof t23.e ? (t23.e) lVarD : null;
        if (eVar != null) {
            int i14 = f43.e.f68881a;
            h1<v0> h1VarJ = eVar.J();
            t23.w wVar = h1VarJ instanceof t23.w ? (t23.w) h1VarJ : null;
            if (wVar != null) {
                fVar = wVar.f162067a;
            }
        }
        return p005kotlin.jvm.internal.s.g(fVar, k1Var.getName());
    }

    public static final boolean e(t23.l lVar) {
        lVar.getClass();
        return b(lVar) || c(lVar);
    }

    public static final boolean f(n0 n0Var) {
        n0Var.getClass();
        t23.h hVarT = n0Var.F0().t();
        if (hVarT == null || !c(hVarT)) {
            return false;
        }
        q43.s.f142813a.getClass();
        return !q43.b.a.M(n0Var);
    }

    public static final v0 g(n0 n0Var) {
        n0Var.getClass();
        t23.h hVarT = n0Var.F0().t();
        t23.e eVar = hVarT instanceof t23.e ? (t23.e) hVarT : null;
        if (eVar != null) {
            int i14 = f43.e.f68881a;
            h1<v0> h1VarJ = eVar.J();
            t23.w wVar = h1VarJ instanceof t23.w ? (t23.w) h1VarJ : null;
            if (wVar != null) {
                return (v0) wVar.f162068b;
            }
        }
        return null;
    }
}
