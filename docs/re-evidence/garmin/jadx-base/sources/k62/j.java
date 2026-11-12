package k62;

import androidx.lifecycle.j1;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.group.create.GroupCreationActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import lc.m0;
import lc.v;
import lc.y;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f103201b;

    public /* synthetic */ j(GearActivity gearActivity, m0 m0Var, int i14) {
        this.f103200a = i14;
        this.f103201b = m0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        j1 j1VarA;
        j1 j1VarA2;
        int i14 = this.f103200a;
        m0 m0Var = this.f103201b;
        switch (i14) {
            case 0:
                m0Var.getClass();
                o oVar = o.INSTANCE;
                m0Var.h(new c42.o(m0Var, 5), oVar);
                m0Var.f111904b.k().q(oVar);
                break;
            case 1:
                m0Var.getClass();
                m mVar = m.INSTANCE;
                m0Var.h(new c42.o(m0Var, 4), mVar);
                m0Var.f111904b.k().q(mVar);
                break;
            case 2:
                int i15 = GroupCreationActivity.f36131b;
                m0Var.n();
                break;
            case 3:
                int i16 = GroupCreationActivity.f36131b;
                y.k("search_invite_route", m0Var);
                break;
            case 4:
                MultiDayActivitiesDetailActivity.a aVar = MultiDayActivitiesDetailActivity.f39233a;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.C0698a.INSTANCE);
                break;
            case 5:
                MultiDayActivitiesDetailActivity.a aVar2 = MultiDayActivitiesDetailActivity.f39233a;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.d.INSTANCE);
                break;
            case 6:
                MultiDayActivitiesDetailActivity.a aVar3 = MultiDayActivitiesDetailActivity.f39233a;
                m0Var.n();
                break;
            case 7:
                MultiDayActivitiesDetailActivity.a aVar4 = MultiDayActivitiesDetailActivity.f39233a;
                m0Var.m();
                break;
            case 8:
                y.l(m0Var, n51.b.l.INSTANCE);
                break;
            case 9:
                v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(Boolean.TRUE, "connected_app_list_updated");
                }
                break;
            case 10:
                int i17 = PreviewCatalogActivity.f49781a;
                m0Var.m();
                break;
            case 11:
                int i18 = PreviewCatalogActivity.f49781a;
                y.l(m0Var, w72.g.a.INSTANCE);
                break;
            case 12:
                int i19 = PreviewCatalogActivity.f49781a;
                y.l(m0Var, w72.g.d.INSTANCE);
                break;
            case 13:
                int i24 = PreviewCatalogActivity.f49781a;
                y.l(m0Var, w72.g.j.INSTANCE);
                break;
            case 14:
                int i25 = PreviewCatalogActivity.f49781a;
                y.l(m0Var, w72.g.C3398g.INSTANCE);
                break;
            case 15:
                int i26 = PreviewCatalogActivity.f49781a;
                y.l(m0Var, w72.g.b.INSTANCE);
                break;
            case 16:
                int i27 = PreviewCatalogActivity.f49781a;
                y.l(m0Var, w72.g.h.INSTANCE);
                break;
            case 17:
                int i28 = PreviewCatalogActivity.f49781a;
                y.l(m0Var, w72.g.c.INSTANCE);
                break;
            case 18:
                m0Var.m();
                break;
            case 19:
                m0Var.m();
                break;
            case 20:
                m0Var.m();
                break;
            case 21:
                GearActivity.a aVar5 = GearActivity.f35500b;
                v vVarFa = GearActivity.fa(m0Var, s0.f105811a.b(GearRoute.i.class), true);
                if (vVarFa != null) {
                    vVarFa.a().f(Boolean.TRUE, "ManagePhotos_Edited");
                }
                break;
            case 22:
                GearActivity.a aVar6 = GearActivity.f35500b;
                v vVarFa2 = GearActivity.fa(m0Var, s0.f105811a.b(GearRoute.d.class), true);
                if (vVarFa2 != null) {
                    vVarFa2.a().f(Boolean.TRUE, "ManagePhotos_Edited");
                }
                break;
            case 23:
                GearActivity.a aVar7 = GearActivity.f35500b;
                y.l(m0Var, new GearRoute.r(false));
                break;
            case 24:
                GearActivity.a aVar8 = GearActivity.f35500b;
                y.l(m0Var, new GearRoute.r(false));
                break;
            case 25:
                GearActivity.a aVar9 = GearActivity.f35500b;
                m0Var.n();
                break;
            case 26:
                GearActivity.a aVar10 = GearActivity.f35500b;
                v vVarF2 = m0Var.f();
                if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                    j1VarA2.f(Boolean.TRUE, "CollectionDetailsScreen_Edited");
                }
                break;
            case 27:
                GearActivity.a aVar11 = GearActivity.f35500b;
                m0Var.n();
                break;
            case 28:
                GearActivity.a aVar12 = GearActivity.f35500b;
                y.l(m0Var, new GearRoute.r(true));
                break;
            default:
                GearActivity.a aVar13 = GearActivity.f35500b;
                y.l(m0Var, GearRoute.a.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(m0 m0Var, int i14) {
        this.f103200a = i14;
        this.f103201b = m0Var;
    }
}
