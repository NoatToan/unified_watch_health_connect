package ug2;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyReportsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class x implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f171064b;

    public /* synthetic */ x(lc.m0 m0Var, int i14) {
        this.f171063a = i14;
        this.f171064b = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f171063a;
        int i15 = 8;
        int i16 = 1;
        c42.b bVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        lc.m0 m0Var = this.f171064b;
        switch (i14) {
            case 0:
                m0Var.n();
                break;
            case 1:
                if (m0Var.f() != null) {
                    m0Var.n();
                }
                break;
            case 2:
                if (m0Var.f() != null) {
                    m0Var.n();
                }
                break;
            case 3:
                m0Var.n();
                break;
            case 4:
                m0Var.n();
                break;
            case 5:
                lc.y.l(m0Var, new DashboardRoute.HomeSettings(true));
                break;
            case 6:
                lc.y.q(m0Var, DashboardRoute.Dashboard.INSTANCE);
                break;
            case 7:
                m0Var.getClass();
                lc.y.l(m0Var, new vv0.i(new ro0.i(ro0.l.LIFESTYLE_LOGGING, "DEVICE_COMPATIBILITY")));
                break;
            case 8:
                m0Var.getClass();
                lc.y.l(m0Var, vv0.h.INSTANCE);
                break;
            case 9:
                m0Var.getClass();
                vv0.x xVar = vv0.x.INSTANCE;
                m0Var.h(new c42.o(m0Var, 9), xVar);
                m0Var.f111904b.k().q(xVar);
                break;
            case 10:
                m0Var.getClass();
                vv0.l lVar = vv0.l.INSTANCE;
                m0Var.h(new c42.o(m0Var, i15), lVar);
                m0Var.f111904b.k().q(lVar);
                break;
            case 11:
                m0Var.getClass();
                vv0.l lVar2 = vv0.l.INSTANCE;
                m0Var.h(new c42.o(m0Var, i15), lVar2);
                m0Var.f111904b.k().q(lVar2);
                break;
            case 12:
                m0Var.getClass();
                lc.y.l(m0Var, new vv0.i((ro0.i) (objArr2 == true ? 1 : 0), i16, (p005kotlin.jvm.internal.j) (objArr == true ? 1 : 0)));
                break;
            case 13:
                m0Var.getClass();
                lc.y.l(m0Var, vv0.g0.INSTANCE);
                break;
            case 14:
                m0Var.getClass();
                lc.y.l(m0Var, vv0.k.INSTANCE);
                break;
            case 15:
                m0Var.getClass();
                lc.y.l(m0Var, new w32.c(new ro0.i(ro0.l.VO2_MAX, "WHAT_IS_VO2_MAX_ACTION"), bVar, 2, (p005kotlin.jvm.internal.j) (objArr3 == true ? 1 : 0)));
                break;
            case 16:
                m0Var.n();
                break;
            case 17:
                m0Var.n();
                break;
            case 18:
                int i17 = PromotionsDevMenuActivity.f41027b;
                m0Var.n();
                break;
            case 19:
                int i18 = PromotionsDevMenuActivity.f41027b;
                m0Var.n();
                break;
            case 20:
                int i19 = PromotionsDevMenuActivity.f41027b;
                m0Var.n();
                break;
            case 21:
                RunningEconomyReportsActivity.a aVar = RunningEconomyReportsActivity.f41149c;
                m0Var.n();
                break;
            default:
                lc.y.p(m0Var, wv1.c.b.f187459b.f187457a, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
