package ew1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.developer.HelpRegistryActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleSymptomActivity;
import i3.ri;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f66362c;

    public /* synthetic */ c2(int i14, Object obj, Object obj2) {
        this.f66360a = i14;
        this.f66362c = obj;
        this.f66361b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        String str;
        String str2;
        int i14 = this.f66360a;
        int i15 = 0;
        int i16 = 3;
        Bundle bundle = null;
        Object obj = this.f66361b;
        Object obj2 = this.f66362c;
        switch (i14) {
            case 0:
                d2.a aVar = d2.f66384d;
                ((p3.p1) obj).setValue(Boolean.FALSE);
                aw1.h hVarW6 = ((d2) obj2).w6();
                ge1.b.T(androidx.lifecycle.v1.a(hVarW6), null, null, new aw1.t(hVarW6, null), 3);
                return Unit.INSTANCE;
            case 1:
                h2 h2Var = (h2) obj2;
                h2.a aVar2 = h2.f66500d;
                jv1.h hVar = (jv1.h) ((p3.p1) obj).getF182175a();
                if (hVar != null) {
                    fy1.c.f73884a.getClass();
                    fy1.c.b("GarminCoachPlanDurationSelected");
                    h2Var.y6().z7(hVar);
                    if (hVar instanceof jv1.g) {
                        tu1.i.f166483a.getClass();
                        o13.p pVarM = tu1.i.a.m(h2Var.y6().b7(), (jv1.g) hVar);
                        boolean zBooleanValue = ((Boolean) pVarM.f128594a).booleanValue();
                        vt1.n nVar = (vt1.n) pVarM.f128595b;
                        if (zBooleanValue) {
                            h2Var.y6().j5(nVar, true, true);
                        } else {
                            h2Var.y6().i7();
                        }
                    } else {
                        if (!(hVar instanceof jv1.i)) {
                            lc.u0.r();
                            return null;
                        }
                        h2Var.y6().i7();
                    }
                }
                return Unit.INSTANCE;
            case 2:
                m2.a aVar3 = m2.f66581d;
                ((e23.l) obj2).invoke((vt1.d) obj);
                return Unit.INSTANCE;
            case 3:
                o2.a aVar4 = o2.f66641d;
                ((o2) obj2).w6().G6((vt1.h) obj);
                return Unit.INSTANCE;
            case 4:
                s2.a aVar5 = s2.f66742d;
                ((s2) obj2).w6().U7((tw1.k) obj);
                return Unit.INSTANCE;
            case 5:
                u2 u2Var = (u2) obj2;
                e23.a aVar6 = (e23.a) obj;
                u2.a aVar7 = u2.f66789c;
                if (u2Var.y6().f13385r1) {
                    u2Var.y6().v7("FBTSwimDaysSelectionFragCompose");
                } else {
                    u2Var.y6().Q7(null);
                }
                aVar6.invoke();
                return Unit.INSTANCE;
            case 6:
                x2.a aVar8 = x2.f66834d;
                ((e23.l) obj2).invoke(((p005kotlin.jvm.internal.r0) obj).f105810a);
                return Unit.INSTANCE;
            case 7:
                b3.a aVar9 = b3.f66335d;
                aw1.h hVarF6 = ((b3) obj2).F6();
                int i17 = aw1.h.S1;
                hVarF6.j8((fg0.k) obj, null);
                return Unit.INSTANCE;
            case 8:
                d3 d3Var = (d3) obj2;
                d3.a aVar10 = d3.f66394d;
                Integer num = (Integer) ((p3.p1) obj).getF182175a();
                if (num != null) {
                    int iIntValue = num.intValue();
                    fy1.c.f73884a.getClass();
                    fy1.c.b("GarminCoachWorkoutsPerWeekSelected");
                    d3Var.y6().l8(iIntValue);
                }
                return Unit.INSTANCE;
            case 9:
                p3.p1 p1Var = (p3.p1) obj;
                xx.d dVar = (xx.d) obj2;
                List<xx.d> list = (List) p1Var.getF182175a();
                ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                for (xx.d dVar2 : list) {
                    xx.e eVar = dVar2.f192473a;
                    if (eVar == dVar.f192473a) {
                        xx.d dVar3 = new xx.d(eVar);
                        dVar3.f192474b = !dVar2.a();
                        ((vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null)).C(dVar3.f192473a.f192495a, dVar3.f192474b);
                        dVar2 = dVar3;
                    }
                    arrayList.add(dVar2);
                }
                p1Var.setValue(arrayList);
                return Unit.INSTANCE;
            case 10:
                f2.p0 p0Var = (f2.p0) obj;
                f2.l lVar = (f2.l) ((p3.d0) obj2).getF182175a();
                return new f2.p(p0Var, lVar, new g2.q1((j23.l) p0Var.f68264d.f68228e.getF182175a(), lVar));
            case 11:
                ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.p) obj2).A2(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj).f49260p);
                return Unit.INSTANCE;
            case 12:
                return l52.o.e(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj2).f49250f, new f2.o0((w02.r) obj, i16));
            case 13:
                g90.c cVar = (g90.c) obj;
                ((e23.p) obj2).invoke(cVar.f76468a, cVar.f76469b);
                return Unit.INSTANCE;
            case 14:
                ((fa0.h) obj2).x4();
                ((ca0.u0) obj).invoke();
                return Unit.INSTANCE;
            case 15:
                ff2.i iVar = (ff2.i) obj2;
                ff2.f fVar = (ff2.f) obj;
                iVar.b().debug("storeCampaignsToCache: ");
                try {
                    for (ff2.a aVar11 : fVar.a()) {
                        iVar.b().debug("storing " + aVar11.getCampaignId() + ": ");
                        iVar.b().debug("Downloading detail image: ");
                        hf2.a.C1650a c1650a = hf2.a.f83640a;
                        Context context = iVar.f71157a;
                        String detailImageUrl = aVar11.getDetailPayload().getDetailImageUrl();
                        long campaignId = aVar11.getCampaignId();
                        kf2.c cVar2 = kf2.c.DETAIL_TYPE;
                        ff2.g gVar = new ff2.g(iVar, aVar11, i15);
                        c1650a.getClass();
                        hf2.a.C1650a.d(context, detailImageUrl, campaignId, cVar2, gVar);
                    }
                } catch (Exception e4) {
                    iVar.c(null, e4.getMessage());
                }
                return Unit.INSTANCE;
            case 16:
                ((pm1.f) obj2).d((Context) obj);
                return Unit.INSTANCE;
            case 17:
                ((e23.l) obj2).invoke((wo0.a) obj);
                return Unit.INSTANCE;
            case 18:
                e23.a aVar12 = (e23.a) obj;
                if (fo.d.c.f72299a[((jo.e) obj2).ordinal()] == 1) {
                    aVar12.invoke();
                }
                return Unit.INSTANCE;
            case 19:
                fv0.g gVar2 = (fv0.g) obj2;
                e23.a aVar13 = (e23.a) obj;
                ou0.e eVar2 = (ou0.e) ((g3) gVar2.f73645e.f150540a.getValue()).f35301b;
                if (eVar2 != null && (str = eVar2.f133978a) != null && !d53.w.J(str)) {
                    wd2.m.i(gVar2.f73641a, new wd2.a2(new wd2.z1(gVar2.f73641a, str, null, null, null, null, null, 124, null), null, 2, null));
                }
                aVar13.invoke();
                return Unit.INSTANCE;
            case 20:
                ht.s sVar = ht.s.f85508a;
                lt.e.k kVar = new lt.e.k(lt.e.a.Add, o70.t.P0);
                sVar.getClass();
                ht.s.a(kVar);
                MenstrualCycleSymptomActivity.a aVar14 = MenstrualCycleSymptomActivity.f38817c;
                Integer num2 = ((bx0.d.b) obj).f21665e;
                aVar14.getClass();
                MenstrualCycleSymptomActivity.a.c((Context) obj2, num2);
                return Unit.INSTANCE;
            case 21:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar3 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e) obj2;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.f46024o;
                eVar3.y6().L4(eVar3.f46029e, eVar3.f46028d);
                ng0.a aVar16 = eVar3.f46032h;
                ng0.a aVar17 = ng0.a.LEG_SCREEN_VIEW;
                if (aVar16 == aVar17) {
                    com.garmin.android.apps.connectmobile.workouts.data.model.k kVar2 = eVar3.f46029e;
                    m52.c eventLegActivityType = kVar2 != null ? kVar2.getEventLegActivityType() : null;
                    int i18 = eventLegActivityType == null ? -1 : com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.b.f46039a[eventLegActivityType.ordinal()];
                    if (i18 == -1) {
                        p92.y.f136664a.getClass();
                        p92.y.a.c("EventLegGoalFragment", "Invalid option selected.");
                    } else if (i18 == 1) {
                        eVar3.y6().z4().m("EventLegGoalReviewFragment");
                    } else if (i18 == 2) {
                        eVar3.y6().F4(m52.c.RUNNING, aVar17);
                    } else {
                        if (i18 != 3 && i18 != 4 && i18 != 5) {
                            lc.u0.r();
                            return null;
                        }
                        eVar3.y6().F4(m52.c.CYCLING, aVar17);
                    }
                } else {
                    eVar3.y6().L4(eVar3.f46029e, eVar3.f46028d);
                    Intent intent = new Intent();
                    intent.putExtra("GCM_extra_sharable_event_dto", eVar3.y6().x4());
                    eVar3.requireActivity().setResult(-1, intent);
                    eVar3.requireActivity().finish();
                }
                return Unit.INSTANCE;
            case 22:
                com.garmin.android.apps.connectmobile.userprofile.model.g gVar3 = (com.garmin.android.apps.connectmobile.userprofile.model.g) obj2;
                g10.d dVar4 = (g10.d) obj;
                g10.d.a aVar18 = g10.d.f74830e;
                hi0.a aVar19 = new hi0.a(gVar3.f46857a, null, gVar3.f46858b, null, null, null, null, null, null, 506, null);
                ((mh1.w) dVar4.f74834d.getValue()).y4(new com.garmin.android.apps.connectmobile.smartscale.model.b(null, String.valueOf(dVar4.f74831a), Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), null, null, aVar19.getUserId(), null, com.garmin.android.apps.connectmobile.smartscale.model.d.INVITED, null, null, null, null, null, null, null, null, 65369, null), aVar19, true);
                return Unit.INSTANCE;
            case 23:
                p13.k0 k0Var = p13.k0.f134949a;
                k0Var.getClass();
                return new g2.n1((d4.f) obj2, k0Var, (d4.c) obj);
            case 24:
                return ((g4.i) obj2).f75741a.W(obj);
            case 25:
                return "Only found " + ((p005kotlin.jvm.internal.p0) obj2).f105807a + " digits in a row, but need to parse " + ((g63.g) obj).b();
            case 26:
                HelpRegistryActivity helpRegistryActivity = (HelpRegistryActivity) obj2;
                ro0.l lVar2 = (ro0.l) obj;
                int i19 = HelpRegistryActivity.f33616a;
                int[] iArr = HelpRegistryActivity.a.f33617a;
                int i24 = iArr[lVar2.ordinal()];
                if (i24 == 1) {
                    str2 = null;
                } else if (i24 == 2) {
                    str2 = "PERSONAL_INFORMATION";
                } else if (i24 == 3) {
                    str2 = "CALORIES_DURING_ACTIVITY_ACTION";
                } else if (i24 != 4) {
                    str2 = null;
                } else {
                    str2 = "ACUTE_CHRONIC_WORKLOAD_ACTION";
                }
                switch (iArr[lVar2.ordinal()]) {
                    case 3:
                        bundle = new Bundle();
                        bundle.putBoolean("EXTRA_CALORIE_BURNED", true);
                        bundle.putInt("ACTIVE_CALORIES", 10);
                        bundle.putInt("RESTING_CALORIES", 20);
                        bundle.putInt("TOTAL_CALORIES", 30);
                        bundle.putInt("CONSUMED_CALORIES", 40);
                        bundle.putInt("REMAINING_CALORIES", 50);
                        bundle.putInt("CALORIE_GOAL", 60);
                        bundle.putInt("ADJUSTED_GOAL", 70);
                        break;
                    case 5:
                        ir0.d dVar5 = new ir0.d(10, 10, 30);
                        or0.j.f133348g.getClass();
                        bundle = new Bundle();
                        bundle.putParcelable("KEY_INTENSITY_MINUTES_EXTRA", dVar5);
                        break;
                    case 6:
                        bundle = new Bundle();
                        bundle.putBoolean("IS_LTE_CAPABLE_DEVICE", true);
                        bundle.putBoolean("IS_GEOS_CAPABLE_COUNTRY", true);
                        bundle.putBoolean("IS_EMERGENCY_CALLING_CAPABLE_DEVICE", true);
                        break;
                    case 7:
                        bundle = new Bundle();
                        bundle.putBoolean("extra_training_status", false);
                        break;
                    case 8:
                        bundle = new Bundle();
                        bundle.putBoolean("has_primary_benefit", true);
                        break;
                    case 9:
                        bundle = new Bundle();
                        bundle.putBoolean("is_primary_device", false);
                        bundle.putBoolean("extra_primary_device_has_incomptible", true);
                        bundle.putInt("EXTRA_PRIMARY_DEVICE_UI_STATE", 1);
                        break;
                    case 10:
                        bundle = new Bundle();
                        bundle.putBoolean("EXTRA_POD_DEVICE_DATA", true);
                        bundle.putInt("extra_chart_type", 14);
                        break;
                    case 11:
                        bundle = new Bundle();
                        bundle.putBoolean("GCM_extra_key_include_strava_help", true);
                        bundle.putBoolean("GCM_extra_key_include_course_sharing_help", true);
                        bundle.putBoolean("GCM_extra_key_include_spec_msg_help", true);
                        bundle.putBoolean("GCM_extra_key_include_premium_help", false);
                        bundle.putString("GCM_extra_key_delete_profile_url", "garmin.com/settings/delete-profile");
                        break;
                }
                HelpActivity.f36653a.getClass();
                HelpActivity.a.d(helpRegistryActivity, lVar2, str2, bundle);
                return Unit.INSTANCE;
            case 27:
                ri riVar = (ri) obj;
                ((e23.p) obj2).invoke(Integer.valueOf(riVar.b()), Integer.valueOf(riVar.a()));
                return Unit.INSTANCE;
            case 28:
                lc.y.k(lk1.e.b.f113147b.f113145a, (lc.y) obj2);
                ((p3.p1) obj).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                gp.b bVar = (gp.b) obj2;
                Context context2 = (Context) obj;
                e23.a<Unit> aVar20 = bVar.f78341d;
                if (aVar20 != null) {
                    aVar20.invoke();
                }
                if (bVar.f78339b) {
                    ht.s sVar2 = ht.s.f85508a;
                    lt.e.b bVar2 = new lt.e.b(lt.e.a.Tapped, o70.b.ACTIVITY, bVar.b().f29265g.f4358a);
                    sVar2.getClass();
                    ht.s.a(bVar2);
                }
                String str3 = bVar.b().f29265g.f4358a;
                long j8 = bVar.b().f29250b;
                aq.b bVar3 = new aq.b();
                bVar3.f11823b = j8;
                am.h hVar2 = am.h.VIEW_EDIT;
                if (hVar2 != null) {
                    bVar3.f11824c = hVar2;
                }
                bVar3.f11827f = str3;
                bVar3.f11825d = true;
                context2.startActivity(bVar3.a(context2));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c2(p3.p1 p1Var, Object obj, int i14) {
        this.f66360a = i14;
        this.f66361b = p1Var;
        this.f66362c = obj;
    }
}
