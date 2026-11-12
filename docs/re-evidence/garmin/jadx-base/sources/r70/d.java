package r70;

import c2.x2;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import f5.z0;
import g02.s0;
import h5.e0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f151045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DashboardRoute f151046c;

    public /* synthetic */ d(DashboardActivity dashboardActivity, DashboardRoute dashboardRoute, int i14) {
        this.f151044a = i14;
        this.f151045b = dashboardActivity;
        this.f151046c = dashboardRoute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f151044a;
        DashboardRoute dashboardRoute = this.f151046c;
        DashboardActivity dashboardActivity = this.f151045b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = DashboardActivity.f33444q;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-1232814923, new d(dashboardActivity, dashboardRoute, i15), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = DashboardActivity.f33444q;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z14 = ((com.garmin.android.apps.connectmobile.dashboard.presentation.c) s9.c.c(dashboardActivity.na().f33559p, mVar2).getF182175a()) instanceof com.garmin.android.apps.connectmobile.dashboard.presentation.c.e;
                    dashboardActivity.ea(!z14);
                    if (z14 && p005kotlin.jvm.internal.s.g(dashboardRoute, DashboardRoute.Dashboard.INSTANCE)) {
                        mVar2.C(-523615035);
                        h4.r.a aVar = h4.r.S;
                        h4.r rVarD = x2.d(aVar, 1.0f);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar2 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar2);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        s0.b(c2.u.f22885a.c(aVar, h4.d.a.f81528f), 0.0f, mVar2, 0, 2);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(-523359440);
                        Object objQ = mVar2.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = p0.n(Boolean.valueOf(p005kotlin.jvm.internal.s.g(dashboardRoute, DashboardRoute.Dashboard.INSTANCE)));
                            mVar2.K(objQ);
                        }
                        p3.v.a(g02.d.f74342a.c(dashboardActivity.getOnBackPressedDispatcher()), z3.f.c(-601972711, new pp.g(dashboardActivity, 17, dashboardRoute, (p1) objQ), mVar2), mVar2, 56);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
