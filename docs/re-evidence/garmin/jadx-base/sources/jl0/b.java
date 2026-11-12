package jl0;

import b21.m;
import e23.l;
import lc.k0;
import lc.m0;
import lc.q0;
import lc.r;
import lc.u;
import nc.n;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f99456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f99457c;

    public /* synthetic */ b(m0 m0Var, e23.a aVar, int i14) {
        this.f99455a = i14;
        this.f99456b = m0Var;
        this.f99457c = aVar;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f99455a;
        e23.a aVar = this.f99457c;
        m0 m0Var = this.f99456b;
        switch (i14) {
            case 0:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                n.b(k0Var, "DOWNLOADED_GOLF_COURSES_DESTINATION", null, null, null, null, null, null, new z3.e(-627176842, true, new ca0.a(m0Var, aVar, 3)), 254);
                n.b(k0Var, "SEARCH_GOLF_COURSES_DESTINATION", null, null, null, null, null, null, new z3.e(1016622381, true, new ca0.a(m0Var, aVar, 4)), 254);
                u uVar = new u();
                uVar.b(q0.f111851p);
                Unit unit = Unit.INSTANCE;
                n.b(k0Var, "GOLF_COURSE_DETAILS?GOLF_COURSE={GOLF_COURSE}", w.c(new r("GOLF_COURSE", uVar.f111877a.a())), null, null, null, null, null, new z3.e(-2060065298, true, new ca0.r(aVar, 2)), 252);
                break;
            default:
                k0 k0Var2 = (k0) obj;
                k0Var2.getClass();
                z3.e eVar = new z3.e(623794767, true, new ca0.a(m0Var, aVar, 10));
                p13.k0 k0Var3 = p13.k0.f134949a;
                k0Var3.getClass();
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                n.a(k0Var2, t0Var.b(zq0.c.class), k0Var3, j0Var, null, null, null, null, eVar);
                zq0.b.INSTANCE.getClass();
                n.a(k0Var2, t0Var.b(zq0.b.class), zq0.b.f206631d, j0Var, null, null, null, null, new z3.e(70244216, true, new m(m0Var, 14)));
                n.a(k0Var2, t0Var.b(zq0.a.class), k0Var3, j0Var, null, null, null, null, new z3.e(515781527, true, new m(m0Var, 15)));
                break;
        }
        return Unit.INSTANCE;
    }
}
