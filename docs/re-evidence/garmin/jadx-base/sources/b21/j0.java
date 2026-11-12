package b21;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.running_tolerance.presentation.RunningToleranceReportsActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f14760b;

    public /* synthetic */ j0(lc.m0 m0Var, int i14) {
        this.f14759a = i14;
        this.f14760b = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:13:0x0050  */
    /* JADX WARN: Code duplicated, block: B:149:0x0438  */
    /* JADX WARN: Code duplicated, block: B:164:0x0487  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:62:0x0197  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x0247  */
    /* JADX WARN: Code duplicated, block: B:96:0x0287  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.lifecycle.j1 j1VarA;
        androidx.lifecycle.j1 j1VarA2;
        androidx.lifecycle.j1 j1VarA3;
        androidx.lifecycle.j1 j1VarA4;
        androidx.lifecycle.j1 j1VarA5;
        androidx.lifecycle.j1 j1VarA6;
        androidx.lifecycle.j1 j1VarA7;
        androidx.lifecycle.j1 j1VarA8;
        int i14 = this.f14759a;
        int i15 = 19;
        p3.m.a aVar = p3.m.f135153a;
        int i16 = 1;
        lc.m0 m0Var = this.f14760b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                lc.v vVarF = m0Var.f();
                if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                    j1VarA.f(new o13.p(str, bool), "foodFavoriteResult");
                }
                break;
            case 1:
                Long l14 = (Long) obj;
                l14.longValue();
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                lc.v vVarF2 = m0Var.f();
                if (vVarF2 != null && (j1VarA2 = vVarF2.a()) != null) {
                    j1VarA2.f(new o13.p(l14, bool2), "mealFavoriteResult");
                }
                break;
            case 2:
                b63.u uVar = (b63.u) obj;
                b11.k kVar = (b11.k) obj2;
                uVar.getClass();
                if (!z10.d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                    lc.y.l(m0Var, new l4.u0((z10.f0) null, 1, (p005kotlin.jvm.internal.j) null));
                } else {
                    lc.y.l(m0Var, new l4.m((m21.b) m21.b.e.INSTANCE, uVar, kVar, false, 8, (p005kotlin.jvm.internal.j) null));
                }
                break;
            case 3:
                b63.u uVar2 = (b63.u) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                uVar2.getClass();
                if (!z10.d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                    lc.y.l(m0Var, new l4.u0((z10.f0) null, 1, (p005kotlin.jvm.internal.j) null));
                } else {
                    lc.y.l(m0Var, new l4.w0(uVar2, (String) null, new b11.m(zBooleanValue, null)));
                }
                break;
            case 4:
                String str2 = (String) obj;
                Boolean bool3 = (Boolean) obj2;
                bool3.booleanValue();
                lc.v vVarF3 = m0Var.f();
                if (vVarF3 != null && (j1VarA3 = vVarF3.a()) != null) {
                    j1VarA3.f(new o13.p(str2, bool3), "recipeFavoriteResult");
                }
                break;
            case 5:
                String str3 = (String) obj;
                Boolean bool4 = (Boolean) obj2;
                bool4.booleanValue();
                lc.v vVarF4 = m0Var.f();
                if (vVarF4 != null && (j1VarA4 = vVarF4.a()) != null) {
                    j1VarA4.f(new o13.p(str3, bool4), "recipeFavoriteResult");
                }
                break;
            case 6:
                String str4 = (String) obj;
                Boolean bool5 = (Boolean) obj2;
                bool5.booleanValue();
                lc.v vVarF5 = m0Var.f();
                if (vVarF5 != null && (j1VarA5 = vVarF5.a()) != null) {
                    j1VarA5.f(new o13.p(str4, bool5), "recipeFavoriteResult");
                }
                break;
            case 7:
                String str5 = (String) obj;
                Boolean bool6 = (Boolean) obj2;
                bool6.booleanValue();
                lc.v vVarF6 = m0Var.f();
                if (vVarF6 != null && (j1VarA6 = vVarF6.a()) != null) {
                    j1VarA6.f(new o13.p(str5, bool6), "foodFavoriteResult");
                }
                break;
            case 8:
                String str6 = (String) obj;
                Boolean bool7 = (Boolean) obj2;
                bool7.booleanValue();
                lc.v vVarF7 = m0Var.f();
                if (vVarF7 != null && (j1VarA7 = vVarF7.a()) != null) {
                    j1VarA7.f(new o13.p(str6, bool7), "foodFavoriteResult");
                }
                break;
            case 9:
                long jLongValue = ((Long) obj).longValue();
                l90.b bVar = (l90.b) obj2;
                bVar.getClass();
                ht.a aVar2 = ht.a.f85464a;
                Bundle bundleA = h7.c.a(new o13.p("Screen", "DevicePairingBlocked"), new o13.p("Type", "BiC"), new o13.p("deviceName", bVar.f111521f));
                aVar2.getClass();
                ht.a.a(bundleA, "PageView");
                m0Var.h(new ca0.k(22), new ca0.n1.i(jLongValue, bVar));
                break;
            case 10:
                gl1.y.E(m0Var, ((Long) obj).longValue(), (String) obj2, true);
                break;
            case 11:
                gl1.y.E(m0Var, ((Long) obj).longValue(), (String) obj2, false);
                break;
            case 12:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                RunningToleranceReportsActivity.a aVar3 = RunningToleranceReportsActivity.f41161b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    boolean zR = mVar.r(m0Var);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new ca0.u0(m0Var, 28);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ca0.u0(m0Var, 28);
                            mVar.K(objQ);
                        }
                    }
                    t70.s0.d(null, (e23.a) objQ, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 13:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                MultiDayActivitiesDetailActivity.a aVar4 = MultiDayActivitiesDetailActivity.f39233a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_filter);
                    boolean zR2 = mVar2.r(m0Var);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new k62.j(m0Var, 6);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new k62.j(m0Var, 6);
                            mVar2.K(objQ2);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ2, null, strQ, mVar2, null);
                } else {
                    mVar2.e();
                }
                break;
            case 14:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                MultiDayActivitiesDetailActivity.a aVar5 = MultiDayActivitiesDetailActivity.f39233a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.Sa);
                    boolean zR3 = mVar3.r(m0Var);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new k62.j(m0Var, 7);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new k62.j(m0Var, 7);
                            mVar3.K(objQ3);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ3, null, strW, mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
            case 15:
                List list = (List) obj;
                qk0.c cVar = (qk0.c) obj2;
                GearActivity.a aVar6 = GearActivity.f35500b;
                list.getClass();
                cVar.getClass();
                lc.y.l(m0Var, new GearRoute.o(list, cVar));
                break;
            case 16:
                List list2 = (List) obj;
                qk0.c cVar2 = (qk0.c) obj2;
                GearActivity.a aVar7 = GearActivity.f35500b;
                list2.getClass();
                cVar2.getClass();
                lc.y.l(m0Var, new GearRoute.o(list2, cVar2));
                break;
            case 17:
                List list3 = (List) obj;
                qk0.c cVar3 = (qk0.c) obj2;
                GearActivity.a aVar8 = GearActivity.f35500b;
                list3.getClass();
                cVar3.getClass();
                lc.y.l(m0Var, new GearRoute.o(list3, cVar3));
                break;
            case 18:
                List list4 = (List) obj;
                qk0.c cVar4 = (qk0.c) obj2;
                GearActivity.a aVar9 = GearActivity.f35500b;
                list4.getClass();
                cVar4.getClass();
                lc.y.l(m0Var, new GearRoute.o(list4, cVar4));
                break;
            case 19:
                List list5 = (List) obj;
                qk0.c cVar5 = (qk0.c) obj2;
                GearActivity.a aVar10 = GearActivity.f35500b;
                list5.getClass();
                cVar5.getClass();
                lc.y.l(m0Var, new GearRoute.o(list5, cVar5));
                break;
            case 20:
                List list6 = (List) obj;
                qk0.c cVar6 = (qk0.c) obj2;
                GearActivity.a aVar11 = GearActivity.f35500b;
                list6.getClass();
                cVar6.getClass();
                lc.y.l(m0Var, new GearRoute.o(list6, cVar6));
                break;
            case 21:
                String str7 = (String) obj;
                rk0.w0 w0Var = (rk0.w0) obj2;
                GearActivity.a aVar12 = GearActivity.f35500b;
                str7.getClass();
                w0Var.getClass();
                lc.y.l(m0Var, new GearRoute.s(str7, w0Var));
                break;
            case 22:
                List list7 = (List) obj;
                qk0.c cVar7 = (qk0.c) obj2;
                GearActivity.a aVar13 = GearActivity.f35500b;
                list7.getClass();
                cVar7.getClass();
                lc.y.l(m0Var, new GearRoute.o(list7, cVar7));
                break;
            case 23:
                String str8 = (String) obj;
                String str9 = (String) obj2;
                GearActivity.a aVar14 = GearActivity.f35500b;
                str8.getClass();
                lc.v vVarF8 = m0Var.f();
                if (vVarF8 != null && (j1VarA8 = vVarF8.a()) != null) {
                    j1VarA8.f(new pk0.f(str8, str9, false, false, 12, null), "BrandModelSelectionResult");
                }
                break;
            case 24:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar15 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    c22.x0.f23314a.getClass();
                    String strW2 = gl1.d.W(c22.x0.K9);
                    boolean zR4 = mVar4.r(m0Var);
                    Object objQ4 = mVar4.q();
                    int i17 = 20;
                    if (zR4) {
                        objQ4 = new nk0.l(m0Var, 20);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new nk0.l(m0Var, 20);
                            mVar4.K(objQ4);
                        }
                    }
                    e23.a aVar16 = (e23.a) objQ4;
                    String strQ2 = gl1.y.Q(mVar4, R.string.lbl_filter);
                    s62.a.f157643a.getClass();
                    i53.f fVarA = i53.a.a(new l72.i3("MENU_ITEM_FILTER", strQ2, false, v62.n3.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                    boolean zR5 = mVar4.r(m0Var);
                    Object objQ5 = mVar4.q();
                    if (zR5) {
                        objQ5 = new ky0.w(m0Var, i17);
                        mVar4.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ky0.w(m0Var, i17);
                            mVar4.K(objQ5);
                        }
                    }
                    z02.f.d(strW2, null, null, aVar16, fVarA, null, (e23.l) objQ5, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar4.e();
                }
                break;
            case 25:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar17 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar5, R.string.lbl_edit_privacy);
                    boolean zR6 = mVar5.r(m0Var);
                    Object objQ6 = mVar5.q();
                    if (zR6) {
                        objQ6 = new nk0.l(m0Var, 19);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new nk0.l(m0Var, 19);
                            mVar5.K(objQ6);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ6, null, strQ3, mVar5, null);
                } else {
                    mVar5.e();
                }
                break;
            case 26:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar18 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar6, R.string.lbl_filter);
                    boolean zR7 = mVar6.r(m0Var);
                    Object objQ7 = mVar6.q();
                    if (zR7) {
                        objQ7 = new nk0.l(m0Var, 21);
                        mVar6.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new nk0.l(m0Var, 21);
                            mVar6.K(objQ7);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ7, null, strQ4, mVar6, null);
                } else {
                    mVar6.e();
                }
                break;
            case 27:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar19 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar7, R.string.txt_activity_type);
                    boolean zR8 = mVar7.r(m0Var);
                    Object objQ8 = mVar7.q();
                    if (zR8) {
                        objQ8 = new nk0.l(m0Var, 18);
                        mVar7.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new nk0.l(m0Var, 18);
                            mVar7.K(objQ8);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ8, null, strQ5, mVar7, null);
                } else {
                    mVar7.e();
                }
                break;
            case 28:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar20 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    String strQ6 = gl1.y.Q(mVar8, R.string.title_course);
                    boolean zR9 = mVar8.r(m0Var);
                    Object objQ9 = mVar8.q();
                    if (zR9) {
                        objQ9 = new nk0.l(m0Var, 17);
                        mVar8.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new nk0.l(m0Var, 17);
                            mVar8.K(objQ9);
                        }
                    }
                    e23.a aVar21 = (e23.a) objQ9;
                    String strQ7 = gl1.y.Q(mVar8, R.string.lbl_filter);
                    s62.a.f157643a.getClass();
                    i53.f fVarA2 = i53.a.a(new l72.i3("MENU_ITEM_FILTER", strQ7, false, v62.n3.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                    boolean zR10 = mVar8.r(m0Var);
                    Object objQ10 = mVar8.q();
                    if (zR10) {
                        objQ10 = new ky0.w(m0Var, i15);
                        mVar8.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new ky0.w(m0Var, i15);
                            mVar8.K(objQ10);
                        }
                    }
                    z02.f.d(strQ6, null, null, aVar21, fVarA2, null, (e23.l) objQ10, mVar8, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar8.e();
                }
                break;
            default:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    int i18 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    String strQ8 = gl1.y.Q(mVar9, R.string.strength_training_select_exercise);
                    boolean zR11 = mVar9.r(m0Var);
                    Object objQ11 = mVar9.q();
                    if (zR11) {
                        objQ11 = new ug2.x(m0Var, i16);
                        mVar9.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new ug2.x(m0Var, i16);
                            mVar9.K(objQ11);
                        }
                    }
                    l72.h3.e(dVarA, strQ8, null, null, (e23.a) objQ11, null, null, mVar9, 0, 108);
                } else {
                    mVar9.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
