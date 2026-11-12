package ca0;

import b21.d7;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f26482b;

    public /* synthetic */ u0(lc.m0 m0Var, int i14) {
        this.f26481a = i14;
        this.f26482b = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // e23.a
    public final Object invoke() {
        lc.h0 h0Var;
        String str;
        androidx.lifecycle.o0 o0Var;
        androidx.lifecycle.b0.b bVar;
        int i14 = this.f26481a;
        ?? r14 = 0;
        r14 = 0;
        int i15 = 1;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z24 = false;
        boolean z25 = false;
        lc.m0 m0Var = this.f26482b;
        switch (i14) {
            case 0:
                m0Var.n();
                break;
            case 1:
                m0Var.n();
                break;
            case 2:
                m0Var.n();
                break;
            case 3:
                lc.y.l(m0Var, b1.h.INSTANCE);
                break;
            case 4:
                m0Var.n();
                break;
            case 5:
                m0Var.n();
                break;
            case 6:
                lc.y.l(m0Var, f1.a.INSTANCE);
                break;
            case 7:
                m0Var.n();
                break;
            case 8:
                m0Var.h(zf.b.g(m0Var), z1.g.INSTANCE);
                break;
            case 9:
                m0Var.h(zf.b.g(m0Var), z1.g.INSTANCE);
                break;
            case 10:
                lc.v vVarF = m0Var.f();
                if (vVarF != null && (h0Var = vVarF.f111882b) != null) {
                    str = h0Var.f111773b.f144347f;
                }
                if (r14 != 0) {
                    r14 = str;
                    m0Var.n();
                } else {
                    r14 = str;
                    m0Var.h(new d7(m0Var, 23), z1.g.INSTANCE);
                }
                break;
            case 11:
                m0Var.h(new d2(z15 ? 1 : 0), k2.h.INSTANCE);
                break;
            case 12:
                m0Var.h(new d2(z16 ? 1 : 0), k2.i.INSTANCE);
                break;
            case 13:
                m0Var.h(new d2(z17 ? 1 : 0), k2.i.INSTANCE);
                break;
            case 14:
                m0Var.h(new d2(z18 ? 1 : 0), k2.d.INSTANCE);
                break;
            case 15:
                m0Var.h(new d2(z19 ? 1 : 0), k2.c.INSTANCE);
                break;
            case 16:
                m0Var.h(new d2(z24 ? 1 : 0), k2.g.INSTANCE);
                break;
            case 17:
                m0Var.h(new d2(z25 ? 1 : 0), k2.c.INSTANCE);
                break;
            case 18:
                m0Var.h(zf.b.g(m0Var), q2.d.INSTANCE);
                break;
            case 19:
                lc.y.l(m0Var, new c4.c(z14, i15, (p005kotlin.jvm.internal.j) r14));
                break;
            case 20:
                lc.y.l(m0Var, g4.e.INSTANCE);
                break;
            case 21:
                m0Var.h(zf.b.G(m0Var), g4.f.INSTANCE);
                break;
            case 22:
                lc.y.l(m0Var, g4.a.INSTANCE);
                break;
            case 23:
                m0Var.h(new d81.t(26), dt.h.INSTANCE);
                break;
            case 24:
                lc.y.l(m0Var, dt.g.INSTANCE);
                break;
            case 25:
                lc.v vVarI = m0Var.f111904b.i();
                if (vVarI != null && (o0Var = vVarI.f111888h.f144302j) != null && (bVar = o0Var.f7973d) != null && bVar.a(androidx.lifecycle.b0.b.RESUMED)) {
                    m0Var.n();
                }
                break;
            case 26:
                m0Var.n();
                break;
            case 27:
                m0Var.getClass();
                gl1.j jVar = gl1.j.INSTANCE;
                m0Var.h(new c42.o(m0Var, i15), jVar);
                m0Var.f111904b.k().q(jVar);
                break;
            case 28:
                RunningToleranceReportsActivity.a aVar = RunningToleranceReportsActivity.f41161b;
                m0Var.n();
                break;
            default:
                lc.y.k("SEARCH_GOLF_COURSES_DESTINATION", m0Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
