package ky0;

import android.net.Uri;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesActivity;
import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.i3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f107576b;

    public /* synthetic */ w(GearActivity gearActivity, lc.m0 m0Var) {
        this.f107575a = 3;
        this.f107576b = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x02af  */
    /* JADX WARN: Code duplicated, block: B:88:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:99:0x032d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        i53.c cVarB;
        i53.c cVarB2;
        i53.c cVarB3;
        androidx.lifecycle.j1 j1VarA;
        int i14 = this.f107575a;
        int i15 = 11;
        int i16 = 10;
        int i17 = 2;
        Long l14 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        lc.m0 m0Var = this.f107576b;
        switch (i14) {
            case 0:
                i3 i3Var = (i3) obj;
                MultiDayActivitiesDetailActivity.a aVar = MultiDayActivitiesDetailActivity.f39233a;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "MENU_ITEM_FILTER")) {
                    lc.y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.a.b.INSTANCE);
                }
                break;
            case 1:
                lk1.d dVar = (lk1.d) obj;
                dVar.getClass();
                lc.y.l(m0Var, dVar);
                break;
            case 2:
                List list = (List) obj;
                GearActivity.a aVar2 = GearActivity.f35500b;
                list.getClass();
                lc.y.l(m0Var, new GearRoute.l(list));
                break;
            case 3:
                jk0.x xVar = (jk0.x) obj;
                GearActivity.a aVar3 = GearActivity.f35500b;
                xVar.getClass();
                lc.v vVarFa = GearActivity.fa(m0Var, p005kotlin.jvm.internal.s0.f105811a.b(GearRoute.j.class), false);
                if (vVarFa != null) {
                    vVarFa.a().f(xVar, "AddGearScreen_Created");
                }
                rk0.f0.INSTANCE.getClass();
                m0Var.h(new ne2.t(i15), new GearRoute.i(rk0.f0.Companion.a(xVar), (Long) (objArr2 == true ? 1 : 0), i17, (p005kotlin.jvm.internal.j) (objArr == true ? 1 : 0)));
                break;
            case 4:
                List list2 = (List) obj;
                GearActivity.a aVar4 = GearActivity.f35500b;
                list2.getClass();
                lc.y.l(m0Var, new GearRoute.l(list2));
                break;
            case 5:
                jk0.x xVar2 = (jk0.x) obj;
                GearActivity.a aVar5 = GearActivity.f35500b;
                xVar2.getClass();
                lc.y.l(m0Var, new GearRoute.h(xVar2.d()));
                break;
            case 6:
                jk0.x xVar3 = (jk0.x) obj;
                GearActivity.a aVar6 = GearActivity.f35500b;
                xVar3.getClass();
                lc.y.l(m0Var, new GearRoute.f(xVar3.d()));
                break;
            case 7:
                jk0.j jVar = (jk0.j) obj;
                GearActivity.a aVar7 = GearActivity.f35500b;
                jVar.getClass();
                Iterable<jk0.n> iterable = jVar.f99270i;
                String str = jVar.f99264c;
                String str2 = jVar.f99262a;
                List<jk0.s> list3 = jVar.f99268g;
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList(p13.y.r(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(og2.k.L((jk0.s) it.next()));
                    }
                    cVarB = i53.a.e(arrayList);
                    if (cVarB == null) {
                        cVarB = j53.l.b();
                    }
                } else {
                    cVarB = j53.l.b();
                }
                i53.c cVar = cVarB;
                b63.o oVar = jVar.f99263b;
                List<jk0.g> list4 = jVar.f99269h;
                if (list4 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it3 = list4.iterator();
                    while (it3.hasNext()) {
                        am.x0 x0Var = (am.x0) ((jk0.g) it3.next()).f99251d.getValue();
                        if (x0Var != null) {
                            arrayList2.add(x0Var);
                        }
                    }
                    cVarB2 = i53.a.e(arrayList2);
                    if (cVarB2 == null) {
                        cVarB2 = j53.l.b();
                    }
                } else {
                    cVarB2 = j53.l.b();
                }
                i53.c cVar2 = cVarB2;
                String str3 = jVar.f99267f;
                if (iterable != null) {
                    ArrayList arrayList3 = new ArrayList(p13.y.r(iterable, 10));
                    for (jk0.n nVar : iterable) {
                        arrayList3.add(new y22.x(Uri.parse(nVar.f99297c), nVar.f99295a, false, 4, (p005kotlin.jvm.internal.j) null));
                    }
                    cVarB3 = i53.a.e(arrayList3);
                    if (cVarB3 == null) {
                        cVarB3 = j53.l.b();
                    }
                } else {
                    cVarB3 = j53.l.b();
                }
                sk0.l0 l0Var = new sk0.l0(str, str2, cVar, oVar, cVar2, false, str3, cVarB3);
                if (iterable == null) {
                    iterable = p13.j0.f134944a;
                }
                ArrayList arrayList4 = new ArrayList(p13.y.r(iterable, 10));
                for (jk0.n nVar2 : iterable) {
                    nVar2.getClass();
                    arrayList4.add(new com.garmin.android.apps.connectmobile.gear.presentation.navigation.a(nVar2.f99295a, nVar2.f99296b, nVar2.f99297c, nVar2.f99298d, nVar2.f99299e, nVar2.f99300f));
                }
                lc.y.l(m0Var, new GearRoute.g(l0Var, arrayList4));
                break;
            case 8:
                List list5 = (List) obj;
                GearActivity.a aVar8 = GearActivity.f35500b;
                list5.getClass();
                lc.y.l(m0Var, new GearRoute.l(list5));
                break;
            case 9:
                rk0.f0 f0Var = (rk0.f0) obj;
                GearActivity.a aVar9 = GearActivity.f35500b;
                f0Var.getClass();
                lc.y.l(m0Var, new GearRoute.i(f0Var, (Long) (objArr4 == true ? 1 : 0), i17, (p005kotlin.jvm.internal.j) (objArr3 == true ? 1 : 0)));
                break;
            case 10:
                rk0.f0 f0Var2 = (rk0.f0) obj;
                GearActivity.a aVar10 = GearActivity.f35500b;
                f0Var2.getClass();
                lc.y.l(m0Var, new GearRoute.i(f0Var2, l14, i17, (p005kotlin.jvm.internal.j) (objArr5 == true ? 1 : 0)));
                break;
            case 11:
                String str4 = (String) obj;
                GearActivity.a aVar11 = GearActivity.f35500b;
                str4.getClass();
                lc.y.l(m0Var, new GearRoute.d(str4));
                break;
            case 12:
                qk0.d dVar2 = (qk0.d) obj;
                GearActivity.a aVar12 = GearActivity.f35500b;
                dVar2.getClass();
                lc.v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(dVar2, "MultiActivitySelectionScreen_Selected");
                }
                m0Var.n();
                break;
            case 13:
                lc.p0 p0Var = (lc.p0) obj;
                lc.j0.a aVar13 = lc.j0.f111790h;
                lc.j0 j0VarK = m0Var.f111904b.k();
                aVar13.getClass();
                int i18 = lc.j0.a.a(j0VarK).f111773b.f144346e;
                p0Var.getClass();
                p0Var.b(i18);
                lc.y0 y0Var = new lc.y0();
                y0Var.f111914a = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0Var.f111915b;
                break;
            case 14:
                long jLongValue = ((Long) obj).longValue();
                ot1.e eVar = ot1.e.f133785a;
                og.a.T(m0Var, ot1.u.f133824a.d(), h7.c.a(new o13.p("trailId", String.valueOf(jLongValue))));
                break;
            case 15:
                long jLongValue2 = ((Long) obj).longValue();
                ot1.n nVar3 = ot1.n.f133806a;
                og.a.T(m0Var, ot1.u.f133824a.d(), h7.c.a(new o13.p("trailId", String.valueOf(jLongValue2))));
                break;
            case 16:
                Integer num = (Integer) obj;
                num.intValue();
                ot1.u uVar = ot1.u.f133824a;
                og.a.T(m0Var, ot1.w.f133841a.d(), h7.c.a(new o13.p("imageIndex", num)));
                break;
            case 17:
                long jLongValue3 = ((Long) obj).longValue();
                DeviceBackupActivity.a aVar14 = DeviceBackupActivity.f42558c;
                lc.y.k("viewBackup/" + jLongValue3, m0Var);
                break;
            case 18:
                long jLongValue4 = ((Long) obj).longValue();
                DeviceBackupActivity.a aVar15 = DeviceBackupActivity.f42558c;
                lc.y.k("singleDeviceBackup/" + jLongValue4, m0Var);
                break;
            case 19:
                i3 i3Var2 = (i3) obj;
                MultiDayActivitiesEditActivity.a aVar16 = MultiDayActivitiesEditActivity.f39291b;
                i3Var2.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var2.f111063a, "MENU_ITEM_FILTER")) {
                    lc.y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.d.INSTANCE);
                }
                break;
            case 20:
                i3 i3Var3 = (i3) obj;
                MultiDayActivitiesEditActivity.a aVar17 = MultiDayActivitiesEditActivity.f39291b;
                i3Var3.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var3.f111063a, "MENU_ITEM_FILTER")) {
                    lc.y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.b.INSTANCE);
                }
                break;
            case 21:
                String str5 = (String) obj;
                str5.getClass();
                lc.y.k(str5, m0Var);
                break;
            case 22:
                lc.k0 k0Var = (lc.k0) obj;
                k0Var.getClass();
                l82.a.a(k0Var, u72.d.a.f169454b.f169453a, new z3.e(409739927, true, new b21.m(m0Var, i16)));
                l82.a.a(k0Var, u72.d.b.f169455b.f169453a, new z3.e(584829134, true, new b21.m(m0Var, i15)));
                String str6 = u72.d.c.f169456b.f169453a;
                u72.b.f169451a.getClass();
                l82.a.a(k0Var, str6, u72.b.f169452b);
                break;
            case 23:
                qg2.c cVar3 = (qg2.c) obj;
                cVar3.getClass();
                lc.y.l(m0Var, new vg2.a.f(cVar3.f144686a));
                break;
            case 24:
                DashboardRoute dashboardRoute = (DashboardRoute) obj;
                dashboardRoute.getClass();
                lc.y.l(m0Var, dashboardRoute);
                break;
            case 25:
                DashboardRoute dashboardRoute2 = (DashboardRoute) obj;
                dashboardRoute2.getClass();
                lc.y.l(m0Var, dashboardRoute2);
                break;
            case 26:
                DashboardRoute dashboardRoute3 = (DashboardRoute) obj;
                dashboardRoute3.getClass();
                lc.y.l(m0Var, dashboardRoute3);
                break;
            case 27:
                List list6 = (List) obj;
                list6.getClass();
                m0Var.getClass();
                lc.y.l(m0Var, new c42.n.c(new c42.b(list6)));
                break;
            case 28:
                z51.h hVar = (z51.h) obj;
                PendingActivitiesActivity.a aVar18 = PendingActivitiesActivity.f39793d;
                hVar.getClass();
                lc.y.l(m0Var, new com.garmin.android.apps.connectmobile.pending.activities.presentation.a.c(hVar));
                break;
            default:
                i3 i3Var4 = (i3) obj;
                int i19 = PromotionsDevMenuActivity.f41027b;
                i3Var4.getClass();
                String str7 = i3Var4.f111063a;
                if (p005kotlin.jvm.internal.s.g(str7, "menuItemManageCache")) {
                    lc.y.k("promoManageCacheRoute", m0Var);
                } else if (p005kotlin.jvm.internal.s.g(str7, "menuItemOverridePromoConditions")) {
                    lc.y.k("promoConditionsRoute", m0Var);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ w(lc.m0 m0Var, int i14) {
        this.f107575a = i14;
        this.f107576b = m0Var;
    }
}
