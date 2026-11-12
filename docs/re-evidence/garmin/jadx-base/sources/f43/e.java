package f43;

import b43.i;
import c2.o3;
import c53.j;
import c53.s;
import e23.l;
import java.util.Collection;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.r0;
import p13.g0;
import p13.u;
import p13.w;
import t23.c0;
import t23.h;
import t23.h0;
import t23.j1;
import t23.m;
import t23.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f68881a = 0;

    public static final /* synthetic */ class a extends q implements l<j1, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f68882a = new a();

        public a() {
            super(1, j1.class, "declaresDefaultValue", "declaresDefaultValue()Z", 0);
        }

        @Override // e23.l
        public final Boolean invoke(j1 j1Var) {
            j1 j1Var2 = j1Var;
            j1Var2.getClass();
            return Boolean.valueOf(j1Var2.h0());
        }
    }

    static {
        x33.f.e("value");
    }

    public static final boolean a(j1 j1Var) {
        j1Var.getClass();
        Boolean boolD = z43.b.d(w.c(j1Var), f43.a.f68877a, a.f68882a);
        boolD.getClass();
        return boolD.booleanValue();
    }

    public static t23.b b(t23.b bVar, l lVar) {
        bVar.getClass();
        lVar.getClass();
        return (t23.b) z43.b.b(w.c(bVar), new c(false), new f(new r0(), lVar));
    }

    public static final x33.c c(m mVar) {
        mVar.getClass();
        x33.d dVarF = i.f(mVar);
        dVarF.getClass();
        if (!dVarF.d()) {
            dVarF = null;
        }
        if (dVarF != null) {
            return dVarF.i();
        }
        return null;
    }

    public static final t23.e d(u23.c cVar) {
        cVar.getClass();
        h hVarT = cVar.getType().F0().t();
        if (hVarT instanceof t23.e) {
            return (t23.e) hVarT;
        }
        return null;
    }

    public static final p005kotlin.reflect.jvm.internal.impl.builtins.d e(t23.l lVar) {
        lVar.getClass();
        c0 c0VarC = i.c(lVar);
        c0VarC.getClass();
        return c0VarC.e();
    }

    public static final x33.b f(h hVar) {
        t23.l lVarD;
        x33.b bVarF;
        if (hVar == null || (lVarD = hVar.d()) == null) {
            return null;
        }
        if (lVarD instanceof h0) {
            x33.c cVarC = ((h0) lVarD).c();
            x33.f name = hVar.getName();
            name.getClass();
            return new x33.b(cVarC, name);
        }
        if (!(lVarD instanceof t23.i) || (bVarF = f((h) lVarD)) == null) {
            return null;
        }
        x33.f name2 = hVar.getName();
        name2.getClass();
        return bVarF.d(name2);
    }

    public static final x33.c g(t23.l lVar) {
        lVar.getClass();
        x33.c cVarG = i.g(lVar);
        return cVarG != null ? cVarG : i.f(lVar.d()).a(lVar.getName()).i();
    }

    public static final q43.f.a h(c0 c0Var) {
        c0Var.getClass();
        return q43.f.a.f142788a;
    }

    public static final t23.b i(t23.b bVar) {
        bVar.getClass();
        if (!(bVar instanceof q0)) {
            return bVar;
        }
        t23.r0 r0VarP0 = ((q0) bVar).p0();
        r0VarP0.getClass();
        return r0VarP0;
    }

    public static final c53.h j(t23.b bVar, boolean z14) {
        bVar.getClass();
        if (z14) {
            bVar = bVar.a();
        }
        s sVar = new s(bVar);
        Collection<? extends t23.b> collectionO = bVar.o();
        collectionO.getClass();
        j jVarV = u.v(new j[]{sVar, c53.c0.k(new g0(collectionO), new d(z14))});
        jVarV.getClass();
        return c53.q.c(jVarV, new o3(15));
    }
}
