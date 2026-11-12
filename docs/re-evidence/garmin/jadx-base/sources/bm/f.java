package bm;

import am.x0;
import am.z0;
import android.content.Context;
import androidx.lifecycle.w0;
import androidx.viewpager.widget.ViewPager;
import c22.b2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.android.material.tabs.TabLayout;
import i3.mc;
import i3.pc;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18793a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f18798f;

    public /* synthetic */ f(b63.v vVar, b63.v vVar2, boolean z14, String[] strArr, boolean z15) {
        this.f18796d = vVar;
        this.f18797e = vVar2;
        this.f18794b = z14;
        this.f18798f = strArr;
        this.f18795c = z15;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        String str;
        Double d14;
        List<Double> listC;
        List<Double> listC2;
        fw.m mVar;
        int i14 = this.f18793a;
        Object obj2 = this.f18798f;
        Object obj3 = this.f18797e;
        Object obj4 = this.f18796d;
        switch (i14) {
            case 0:
                ActivitiesTrimActivity activitiesTrimActivity = (ActivitiesTrimActivity) obj4;
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) obj3;
                ps.p pVar = (ps.p) obj2;
                ActivitiesTrimActivity.a aVar = ActivitiesTrimActivity.f28809p;
                fw.p pVar2 = ((fw.m) obj).f73769b;
                if (pVar2 == fw.p.SUCCESS) {
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa = activitiesTrimActivity.ga();
                    w0 w0Var = dVarGa.f28866d;
                    Double d15 = null;
                    ActivityDetailChartDTO activityDetailChartDTO = (w0Var == null || (mVar = (fw.m) w0Var.d()) == null) ? null : (ActivityDetailChartDTO) mVar.f73770c;
                    dVarGa.f28867e = activityDetailChartDTO;
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = dVarGa.f28869g;
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar2 != null ? hVar2.f29460m : null;
                    x0 x0VarC = hVar2 != null ? hVar2.C() : null;
                    Double dValueOf = i0Var != null ? Double.valueOf(i0Var.f29512h) : null;
                    if (activityDetailChartDTO != null) {
                        str = "DIRECTPOWER";
                        if (!m.m(activityDetailChartDTO, "DIRECTPOWER") || x0VarC == null) {
                            str = "DIRECTSPEED";
                            if (m.m(activityDetailChartDTO, "DIRECTSPEED") || !m.p(dValueOf) || ((i0Var == null || !b2.a(Double.valueOf(i0Var.f29544r), Double.valueOf(i0Var.f29538p))) && !z0.H(x0VarC.f4358a))) {
                                str = "DIRECTHEARTRATE";
                                if (!m.m(activityDetailChartDTO, "DIRECTHEARTRATE")) {
                                    str = "WEIGHTEDMEANHEARTRATE";
                                    if (!m.m(activityDetailChartDTO, "WEIGHTEDMEANHEARTRATE")) {
                                        str = "DIRECTELEVATION";
                                        if (!m.m(activityDetailChartDTO, "DIRECTELEVATION")) {
                                            str = null;
                                        }
                                    }
                                }
                            }
                        } else {
                            String str2 = x0VarC.f4358a;
                            if (z0.v(str2) || z0.b(x0.f4308n, str2) || z0.H(str2)) {
                                str = "DIRECTSPEED";
                                if (m.m(activityDetailChartDTO, "DIRECTSPEED")) {
                                    str = "DIRECTHEARTRATE";
                                    if (!m.m(activityDetailChartDTO, "DIRECTHEARTRATE")) {
                                        str = "WEIGHTEDMEANHEARTRATE";
                                        if (!m.m(activityDetailChartDTO, "WEIGHTEDMEANHEARTRATE")) {
                                            str = "DIRECTELEVATION";
                                            if (!m.m(activityDetailChartDTO, "DIRECTELEVATION")) {
                                                str = null;
                                            }
                                        }
                                    }
                                } else {
                                    str = "DIRECTHEARTRATE";
                                    if (!m.m(activityDetailChartDTO, "DIRECTHEARTRATE")) {
                                        str = "WEIGHTEDMEANHEARTRATE";
                                        if (!m.m(activityDetailChartDTO, "WEIGHTEDMEANHEARTRATE")) {
                                            str = "DIRECTELEVATION";
                                            if (!m.m(activityDetailChartDTO, "DIRECTELEVATION")) {
                                                str = null;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str = null;
                    }
                    dVarGa.f28871i = str;
                    Double dValueOf2 = Double.valueOf(0.0d);
                    ActivityDetailChartDTO activityDetailChartDTO2 = dVarGa.f28867e;
                    Integer numValueOf = activityDetailChartDTO2 != null ? Integer.valueOf(activityDetailChartDTO2.H("SUMDURATION")) : null;
                    ActivityDetailChartDTO activityDetailChartDTO3 = dVarGa.f28867e;
                    Integer numValueOf2 = activityDetailChartDTO3 != null ? Integer.valueOf(activityDetailChartDTO3.H("SUMDISTANCE")) : null;
                    ActivityDetailChartDTO activityDetailChartDTO4 = dVarGa.f28867e;
                    List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC3 = activityDetailChartDTO4 != null ? activityDetailChartDTO4.C() : null;
                    if (numValueOf != null && numValueOf2 != null && listC3 != null && !listC3.isEmpty()) {
                        if (numValueOf.intValue() >= 0) {
                            com.garmin.android.apps.connectmobile.activities.newmodel.b bVar = (com.garmin.android.apps.connectmobile.activities.newmodel.b) com.airbnb.lottie.animation.keyframe.a.c(1, listC3);
                            d14 = (bVar == null || (listC2 = bVar.C()) == null) ? null : listC2.get(numValueOf.intValue());
                        } else {
                            d14 = dValueOf2;
                        }
                        if (numValueOf2.intValue() >= 0) {
                            com.garmin.android.apps.connectmobile.activities.newmodel.b bVar2 = (com.garmin.android.apps.connectmobile.activities.newmodel.b) com.airbnb.lottie.animation.keyframe.a.c(1, listC3);
                            if (bVar2 != null && (listC = bVar2.C()) != null) {
                                d15 = listC.get(numValueOf2.intValue());
                            }
                        } else {
                            d15 = dValueOf2;
                        }
                        if (d14 != null && d15 != null) {
                            dVarGa.f28864b = new com.garmin.android.apps.connectmobile.activities.advancedactivityediting.c(MathKt.b(d14.doubleValue()), 0, MathKt.b(d14.doubleValue()), d15.doubleValue(), 0.0d, d15.doubleValue(), null, null, null, null, null, 1984, null);
                        }
                    }
                    boolean z14 = this.f18794b;
                    if (z14 && this.f18795c) {
                        androidx.fragment.app.v supportFragmentManager = activitiesTrimActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        ActivitiesTrimActivity.b bVar3 = new ActivitiesTrimActivity.b(activitiesTrimActivity, supportFragmentManager);
                        ViewPager viewPager = (ViewPager) activitiesTrimActivity.findViewById(R.id.trim_activity_view_pager);
                        viewPager.setAdapter(bVar3);
                        ((TabLayout) activitiesTrimActivity.findViewById(R.id.trim_activity_tab_layout)).setupWithViewPager(viewPager);
                    } else if (z14) {
                        activitiesTrimActivity.findViewById(R.id.trim_activity_view_pager).setVisibility(8);
                        activitiesTrimActivity.findViewById(R.id.trim_activity_tab_layout).setVisibility(8);
                        activitiesTrimActivity.findViewById(R.id.trim_activity_fragment_container).setVisibility(0);
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f.f28907h.getClass();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f fVar = new com.garmin.android.apps.connectmobile.activities.advancedactivityediting.f();
                        androidx.fragment.app.v supportFragmentManager2 = activitiesTrimActivity.getSupportFragmentManager();
                        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager2, supportFragmentManager2);
                        aVarB.j(R.id.trim_activity_fragment_container, fVar, "TimeFragment", 1);
                        aVarB.e();
                    } else {
                        activitiesTrimActivity.findViewById(R.id.trim_activity_view_pager).setVisibility(8);
                        activitiesTrimActivity.findViewById(R.id.trim_activity_tab_layout).setVisibility(8);
                        activitiesTrimActivity.findViewById(R.id.trim_activity_fragment_container).setVisibility(0);
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e.f28888i.getClass();
                        com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e eVar = new com.garmin.android.apps.connectmobile.activities.advancedactivityediting.e();
                        androidx.fragment.app.v supportFragmentManager3 = activitiesTrimActivity.getSupportFragmentManager();
                        androidx.fragment.app.a aVarB2 = androidx.core.view.j.b(supportFragmentManager3, supportFragmentManager3);
                        aVarB2.j(R.id.trim_activity_fragment_container, eVar, "DistanceFragment", 1);
                        aVarB2.e();
                    }
                    activitiesTrimActivity.ja(hVar, pVar);
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa2 = activitiesTrimActivity.ga();
                    Context applicationContext = activitiesTrimActivity.getApplicationContext();
                    applicationContext.getClass();
                    dVarGa2.O4(applicationContext);
                    activitiesTrimActivity.ga().N4(activitiesTrimActivity);
                    activitiesTrimActivity.hideProgressOverlay();
                } else if (pVar2 == fw.p.ERROR) {
                    activitiesTrimActivity.hideProgressOverlay();
                }
                return Unit.INSTANCE;
            case 1:
                return new mc(this.f18794b, (e23.a) obj4, (e23.a) obj3, (pc) obj, (e23.l) obj2, this.f18795c);
            default:
                String[] strArr = (String[]) obj2;
                String str3 = (String) obj;
                str3.getClass();
                return new o21.c(b63.v.Companion.c(b63.v.INSTANCE, str3), (b63.v) obj4, (b63.v) obj3, this.f18794b, strArr, this.f18795c);
        }
    }

    public /* synthetic */ f(ActivitiesTrimActivity activitiesTrimActivity, boolean z14, boolean z15, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, ps.p pVar) {
        this.f18796d = activitiesTrimActivity;
        this.f18794b = z14;
        this.f18795c = z15;
        this.f18797e = hVar;
        this.f18798f = pVar;
    }

    public /* synthetic */ f(boolean z14, e23.a aVar, e23.a aVar2, e23.l lVar, boolean z15) {
        this.f18794b = z14;
        this.f18796d = aVar;
        this.f18797e = aVar2;
        this.f18798f = lVar;
        this.f18795c = z15;
    }
}
