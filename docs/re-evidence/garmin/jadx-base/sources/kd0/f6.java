package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bs2.nv;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationActivity;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import com.garmin.android.apps.connectmobile.pacepro.domain.algorithm.PaceProAlgorithm;
import com.garmin.android.apps.connectmobile.segments.presentation.SegmentDetailsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanActivity;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/f6;", "Lrt1/m;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f6 implements rt1.m {

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"kd0/f6$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends String>> {
    }

    @Override // rt1.m
    public final boolean A() {
        com.garmin.android.apps.connectmobile.k1.f37122a.getClass();
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("dsw_plans_enabled");
    }

    @Override // rt1.m
    public final void B(long j8, String str) {
        if (hk0.p.k(j8)) {
            GarminConnectMobileApp.f28685g.getClass();
            yr1.e.g(j8, -1L, GarminConnectMobileApp.a.a(), str);
        }
    }

    @Override // rt1.m
    public final PaceBandSplitDTO[] C(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, GeoPointDTO[] geoPointDTOArr) {
        return new PaceProAlgorithm().a(bVar, geoPointDTOArr);
    }

    @Override // rt1.m
    public final Object D(fz0.c cVar, fz0.c cVar2, qv1.f fVar) {
        return ((y60.a) KoinJavaComponent.get$default(y60.a.class, null, null, 6, null)).a(cVar, cVar2, j61.h.WEEKLY, fVar);
    }

    @Override // rt1.m
    public final boolean E() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("bravo_gfc");
    }

    @Override // rt1.m
    public final long F(long j8, long j14, com.garmin.android.apps.connectmobile.workouts.presentation.details.f.l lVar) {
        lVar.getClass();
        ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
        return ((wt1.u) KoinJavaComponent.get$default(wt1.u.class, null, null, 6, null)).I(j8, j14, lVar);
    }

    @Override // rt1.m
    public final void G(ps.m mVar) {
        mVar.getClass();
        CacheDatabase.i().e().f(mVar);
    }

    @Override // rt1.m
    public final boolean H() {
        return GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_video_close_captions_enabled), false);
    }

    @Override // rt1.m
    public final boolean a(long j8) {
        return hk0.p.k(j8);
    }

    @Override // rt1.m
    public final Context b() {
        GarminConnectMobileApp.f28685g.getClass();
        return GarminConnectMobileApp.a.a();
    }

    @Override // rt1.m
    public final boolean c() {
        c22.s3.f23252a.getClass();
        return c22.s3.a("ROLE_MBTESTER") || ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("GretaLaunchEnabled");
    }

    @Override // rt1.m
    public final boolean d() {
        com.garmin.android.apps.connectmobile.k1.f37122a.getClass();
        return com.garmin.android.apps.connectmobile.k1.u();
    }

    @Override // rt1.m
    public final ps.m e(long j8) {
        return CacheDatabase.i().e().e(j8);
    }

    @Override // rt1.m
    public final boolean f() {
        return com.garmin.android.apps.connectmobile.k1.f37122a.f();
    }

    @Override // rt1.m
    public final Intent g(Context context) {
        return ActiveTrainingPlansActivity.a.c(ActiveTrainingPlansActivity.f45098w, context, false, false, false, null, 192);
    }

    @Override // rt1.m
    public final Object h(v13.c cVar) {
        return ((y60.a) KoinJavaComponent.get$default(y60.a.class, null, null, 6, null)).h(cVar);
    }

    @Override // rt1.m
    public final String i(long j8) {
        rd2.f.a().f152045a.getClass();
        String productDisplayName = null;
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            productDisplayName = TextUtils.isEmpty(fVarI.getDisplayName()) ? fVarI.getProductDisplayName() : fVarI.getDisplayName();
        }
        return productDisplayName == null ? "" : productDisplayName;
    }

    @Override // rt1.m
    public final boolean j() {
        return com.garmin.android.apps.connectmobile.k1.f37122a.j();
    }

    @Override // rt1.m
    public final boolean k() {
        com.garmin.android.apps.connectmobile.k1 k1Var = com.garmin.android.apps.connectmobile.k1.f37122a;
        return k1Var.M() || k1Var.v();
    }

    @Override // rt1.m
    public final void l(Activity activity, bg1.a aVar) {
        aVar.getClass();
        SegmentDetailsActivity.Z.getClass();
        SegmentDetailsActivity.a.b(activity, aVar, 1);
    }

    @Override // rt1.m
    public final boolean m() {
        com.garmin.android.apps.connectmobile.k1.f37122a.getClass();
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("strength_dsw_enabled");
    }

    @Override // rt1.m
    public final boolean n() {
        com.garmin.android.apps.connectmobile.k1.f37122a.getClass();
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("bravo_nrc");
    }

    @Override // rt1.m
    public final boolean o() {
        return com.garmin.android.apps.connectmobile.k1.f37122a.T();
    }

    @Override // rt1.m
    public final boolean p() {
        return com.garmin.android.apps.connectmobile.k1.f37122a.V();
    }

    @Override // rt1.m
    public final List<j23.o> q() {
        w13.c cVar = q91.d.f143557c1;
        ArrayList arrayListK = n23.j.k(cVar);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            if (((q91.d) next).f143580b == q91.g.RUNNING) {
                arrayListK.add(next);
            }
        }
        ArrayList arrayList = new ArrayList(p13.y.r(arrayListK, 10));
        Iterator it = arrayListK.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((q91.d) it.next()).f143579a));
        }
        List listM0 = p13.h0.M0(arrayList);
        if (listM0.isEmpty()) {
            listM0 = null;
        }
        j23.o oVar = listM0 != null ? new j23.o(((Number) p13.h0.b0(listM0)).longValue(), ((Number) p13.h0.m0(listM0)).longValue()) : null;
        w13.c cVar2 = q91.d.f143557c1;
        ArrayList arrayListK2 = n23.j.k(cVar2);
        p13.c.b bVar2 = new p13.c.b();
        while (bVar2.hasNext()) {
            Object next2 = bVar2.next();
            if (((q91.d) next2).f143580b == q91.g.CYCLING) {
                arrayListK2.add(next2);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayListK2, 10));
        Iterator it3 = arrayListK2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((q91.d) it3.next()).f143579a));
        }
        List listM1 = p13.h0.M0(arrayList2);
        if (listM1.isEmpty()) {
            listM1 = null;
        }
        j23.o oVar2 = listM1 != null ? new j23.o(((Number) p13.h0.b0(listM1)).longValue(), ((Number) p13.h0.m0(listM1)).longValue()) : null;
        w13.c cVar3 = q91.d.f143557c1;
        ArrayList arrayListK3 = n23.j.k(cVar3);
        p13.c.b bVar3 = new p13.c.b();
        while (bVar3.hasNext()) {
            Object next3 = bVar3.next();
            if (((q91.d) next3).f143580b == q91.g.SWIMMING) {
                arrayListK3.add(next3);
            }
        }
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayListK3, 10));
        Iterator it4 = arrayListK3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Long.valueOf(((q91.d) it4.next()).f143579a));
        }
        List listM2 = p13.h0.M0(arrayList3);
        if (listM2.isEmpty()) {
            listM2 = null;
        }
        return p13.x.k(listM2 != null ? new j23.o(((Number) p13.h0.b0(listM2)).longValue(), ((Number) p13.h0.m0(listM2)).longValue()) : null, oVar2, oVar);
    }

    @Override // rt1.m
    public final Object r(String str, xf1.m mVar) {
        yf1.b.f196866b.getClass();
        yf1.b bVarA = yf1.b.a.a();
        return com.garmin.android.apps.connectmobile.f0.J(bVarA, new yf1.h(bVarA, str, null), mVar);
    }

    @Override // rt1.m
    public final boolean s() {
        List list = (List) new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("courses_show_lap_points"), new a().getType());
        if (list == null) {
            return false;
        }
        if (list.contains("AnyUser")) {
            return true;
        }
        if (list.contains("MBTester")) {
            c22.s3.f23252a.getClass();
            if (c22.s3.a("ROLE_MBTESTER")) {
                return true;
            }
        }
        if (!list.contains("DITester")) {
            return false;
        }
        c22.s3.f23252a.getClass();
        return c22.s3.a("ROLE_DI_TESTER");
    }

    @Override // rt1.m
    public final Object t(String str, xf1.l lVar) {
        yf1.b.f196866b.getClass();
        yf1.b bVarA = yf1.b.a.a();
        return com.garmin.android.apps.connectmobile.f0.J(bVarA, new yf1.c(bVarA, str, null), lVar);
    }

    @Override // rt1.m
    public final Intent u(Context context, fg0.k kVar, ww1.g gVar, boolean z14, boolean z15) {
        kVar.getClass();
        FindTrainingPlanActivity.f45585g.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("navigation_flow_type", jw1.a.EVENT_TRAINING_PLAN_FLOW.ordinal());
        bundle.putBoolean("extras_launch_event_details", z15);
        bundle.putBoolean("extras_navigating_from_event_creation", z14);
        am.a2.b(bundle, "GCM_extra_event", kVar);
        am.a2.b(bundle, "extra_active_plan_info_dto", gVar);
        Intent intent = new Intent(context, (Class<?>) FindTrainingPlanActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // rt1.m
    public final void v(boolean z14) {
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_video_close_captions_enabled, GCMSettingManager.f41536b.edit(), z14);
    }

    @Override // rt1.m
    public final void w(Context context, w01.c cVar, f.c<Intent> cVar2) {
        cVar2.getClass();
        NutritionHydrationActivity.f33067b.getClass();
        if (cVar != null) {
            Intent intent = new Intent(context, (Class<?>) NutritionHydrationActivity.class);
            intent.putExtra("GCM_extra_nutrition_hydration_details", cVar);
            cVar2.a(intent, null);
        }
    }

    @Override // rt1.m
    public final boolean x() {
        com.garmin.android.apps.connectmobile.k1.f37122a.getClass();
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("bravo_ncc");
    }

    @Override // rt1.m
    public final long y(nv nvVar) {
        return GCMSettingManager.r(fd0.d.WORKOUTS, nvVar);
    }

    @Override // rt1.m
    public final String z() {
        gg1.v0.T.getClass();
        return gg1.v0.a.a("PROD").b();
    }
}
