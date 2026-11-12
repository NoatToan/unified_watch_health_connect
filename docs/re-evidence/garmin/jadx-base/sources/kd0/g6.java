package kd0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.map.CourseMapActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationActivity;
import com.garmin.android.apps.connectmobile.pacepro.presentation.activity.CreatePaceProComposeActivity;
import com.garmin.android.apps.connectmobile.pacepro.presentation.activity.PaceProComposeActivity;
import com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.race_time_prediction.presentation.RaceTimePredictionActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardActivity;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/g6;", "Ljy1/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g6 implements jy1.b {
    @Override // jy1.b
    public final void A(androidx.fragment.app.m mVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, long j8, String str, boolean z14) {
        eVar.getClass();
        String str2 = eVar.courseId;
        if (str2 != null) {
            PaceProComposeActivity.f39792a.getClass();
            Intent intent = new Intent(mVar, (Class<?>) PaceProComposeActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse("connect://viewPacePro"));
            Bundle bundle = new Bundle();
            bundle.putString("course_id_key", str2);
            bundle.putLong("time_key", j8);
            if (g22.n.d(str)) {
                bundle.putString("event_name_key", str);
                bundle.putBoolean("event_distance_match_course_key", z14);
            }
            bundle.putBoolean("should_return_to_pace_pro_list_key", false);
            com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
            com.garmin.android.apps.connectmobile.l2.a.b().a(intent, bundle);
            mVar.startActivity(intent);
        }
    }

    @Override // jy1.b
    public final boolean a() {
        return bo1.a.a().c().g0();
    }

    @Override // jy1.b
    public final boolean b(long j8) {
        return hk0.p.k(j8);
    }

    @Override // jy1.b
    public final Context c() {
        GarminConnectMobileApp.f28685g.getClass();
        return GarminConnectMobileApp.a.a();
    }

    @Override // jy1.b
    public final boolean d() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        if (gh2.i.f77458c.a().f77477b.c("bravo_ti")) {
            return true;
        }
        c22.s3.f23252a.getClass();
        return c22.s3.a("ROLE_MBTESTER");
    }

    @Override // jy1.b
    public final String e() {
        return GCMSettingManager.k().b();
    }

    @Override // jy1.b
    public final String f(int i14, am.x0 x0Var, Context context) {
        x0Var.getClass();
        new mn.a(new l22.a(context));
        return mn.a.b(i14, x0Var, context);
    }

    @Override // jy1.b
    public final void g(androidx.fragment.app.m mVar, am.x0 x0Var, ArrayList arrayList, Boolean bool, boolean z14, Integer num, com.garmin.android.apps.connectmobile.workouts.data.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, boolean z15) {
        Boolean bool2 = Boolean.TRUE;
        x0Var.getClass();
        Intent intent = new Intent(mVar, (Class<?>) CoursesActivity.class);
        intent.putExtra("GCM_extra_navigate_to_course_from_ti", true);
        intent.putExtra("GCM_extra_navigate_to_course_from_ti_for_training_plan", z15);
        intent.putExtra("GCM_extra_is_sharable_event", bool);
        intent.putExtra("GCM_extra_is_triathlon_event", z14);
        intent.putExtra("GCM_extra_activity_type", (Parcelable) x0Var);
        intent.putExtra("GCM_extra_navigate_to_courses_from_reviewentries", bool2);
        intent.putExtra("GCM_extra_is_garmin_coach_distance", num);
        if (fVar != null && !fVar.f().isEmpty()) {
            intent.putExtra("GCM_extra_event_leg_distance", fVar);
        }
        if (fVar2 != null) {
            intent.putExtra("GCM_extra_event_location", fVar2);
        }
        mVar.startActivityForResult(intent, 99);
    }

    @Override // jy1.b
    public final void h(EventDetailsActivity eventDetailsActivity, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        CourseMapActivity.f33059b.getClass();
        CourseMapActivity.a.a(eventDetailsActivity, eVar);
    }

    @Override // jy1.b
    public final void i(androidx.fragment.app.m mVar, long j8) {
        TrainingPlanDashboardActivity.a.c(TrainingPlanDashboardActivity.f45383n, mVar, j8, false, null, null, 103, 60);
    }

    @Override // jy1.b
    public final void j(EventDetailsActivity eventDetailsActivity, List list) {
        list.getClass();
        CourseMapActivity.f33059b.getClass();
        ((s20.g) KoinJavaComponent.get$default(s20.g.class, null, null, 6, null)).o(list);
        eventDetailsActivity.startActivity(new Intent(eventDetailsActivity, (Class<?>) CourseMapActivity.class));
    }

    @Override // jy1.b
    public final void k(androidx.fragment.app.m mVar, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        CourseDetailsActivity.f33024k.getClass();
        CourseDetailsActivity.a.b(mVar, eVar, 1234);
    }

    @Override // jy1.b
    public final void l(androidx.fragment.app.m mVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar) {
        PaceProComposeActivity.f39792a.getClass();
        mVar.startActivity(PaceProComposeActivity.a.a(mVar, bVar));
    }

    @Override // jy1.b
    public final void m(androidx.fragment.app.m mVar, long j8) {
        ITPDashboardActivity.f45618m.getClass();
        mVar.startActivityForResult(ITPDashboardActivity.a.a(mVar, j8, null, false), 103);
    }

    @Override // jy1.b
    public final void n(androidx.fragment.app.m mVar, am.x0 x0Var) {
        if (mVar != null) {
            Intent intent = new Intent(mVar, (Class<?>) CoursesActivity.class);
            intent.putExtra("GCM_extra_navigate_to_courses_from_eventdetails", true);
            x0Var.getClass();
            intent.putExtra("GCM_extra_activity_type", (Parcelable) x0Var);
            mVar.startActivityForResult(intent, 88);
        }
    }

    @Override // jy1.b
    public final String o(Context context, double d14, String str) {
        str.getClass();
        new mn.a(new l22.a(context));
        String strC = mn.a.c(context, d14, str);
        return strC == null ? "" : strC;
    }

    @Override // jy1.b
    public final void p(androidx.fragment.app.m mVar, String str, Double d14, String str2) {
        CreatePowerGuideStrategyActivity.f40374b.getClass();
        CreatePowerGuideStrategyActivity.a.a(mVar, str, d14, str2);
    }

    @Override // jy1.b
    public final void q(androidx.fragment.app.m mVar, am.x0 x0Var, Boolean bool, boolean z14, int i14) {
        x0Var.getClass();
        Intent intent = new Intent(mVar, (Class<?>) CoursesActivity.class);
        intent.putExtra("GCM_extra_navigate_to_course_from_ti_for_training_plan", true);
        intent.putExtra("GCM_extra_navigate_to_course_from_ti", true);
        intent.putExtra("GCM_extra_is_sharable_event", bool);
        intent.putExtra("GCM_extra_is_triathlon_event", z14);
        intent.putExtra("GCM_extra_activity_type", (Parcelable) x0Var);
        intent.putExtra("GCM_extra_is_garmin_coach_distance", i14);
        mVar.startActivityForResult(intent, 99);
    }

    @Override // jy1.b
    public final void r(Context context, long j8, xw1.n nVar) {
        TrainingPlanDashboardActivity.a aVar = TrainingPlanDashboardActivity.f45383n;
        aVar.getClass();
        Intent intentB = TrainingPlanDashboardActivity.a.b(aVar, context, j8, null, 32);
        intentB.putExtra("extra_ti_race_dto", nVar);
        context.startActivity(intentB);
    }

    @Override // jy1.b
    public final void s(androidx.fragment.app.m mVar, long j8, vt1.o oVar) {
        FBTDashBoardActivity.a.c(FBTDashBoardActivity.f45458n, mVar, j8, oVar, 103, 64);
    }

    @Override // jy1.b
    public final void t(androidx.fragment.app.m mVar) {
        ActivitiesListActivity.a.b(ActivitiesListActivity.f29099d, mVar, am.g.f3942f, null, 28);
    }

    @Override // jy1.b
    public final void u(androidx.fragment.app.m mVar, fg0.k kVar) {
        kVar.getClass();
        RaceTimePredictionActivity.f41078b.getClass();
        Intent intent = new Intent(mVar, (Class<?>) RaceTimePredictionActivity.class);
        intent.putExtra("GCM_extra_sharable_event_dto", kVar);
        mVar.startActivity(intent);
    }

    @Override // jy1.b
    public final void v(androidx.fragment.app.m mVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, String str, boolean z14) {
        eVar.getClass();
        CreatePaceProComposeActivity.f39791b.getClass();
        mVar.startActivityForResult(CreatePaceProComposeActivity.a.a(mVar, eVar, str, z14), 1555);
    }

    @Override // jy1.b
    public final void w(androidx.fragment.app.m mVar, long j8, String str) {
        str.getClass();
        EditPowerGuideStrategyActivity.f40384t.getClass();
        EditPowerGuideStrategyActivity.a.a(mVar, j8, str, 234);
    }

    @Override // jy1.b
    public final void x(Context context, f.c<Intent> cVar, long j8, String str, am.h hVar) {
        cVar.getClass();
        str.getClass();
        hVar.getClass();
        aq.b bVar = new aq.b();
        bVar.f11823b = j8;
        am.h hVar2 = am.h.VIEW_EDIT;
        if (hVar2 != null) {
            bVar.f11824c = hVar2;
        }
        bVar.f11825d = true;
        bVar.f11827f = str;
        cVar.a(bVar.a(context), null);
    }

    @Override // jy1.b
    public final void y(androidx.fragment.app.m mVar, am.x0 x0Var, ArrayList arrayList, Boolean bool, boolean z14, com.garmin.android.apps.connectmobile.workouts.data.model.f fVar, com.garmin.android.library.mapsdkadapter.f fVar2, boolean z15) {
        Intent intent = new Intent(mVar, (Class<?>) CoursesActivity.class);
        intent.putExtra("GCM_extra_navigate_to_course_from_ti", true);
        intent.putExtra("GCM_extra_navigate_to_course_from_ti_for_training_plan", z15);
        if (x0Var != null) {
            intent.putExtra("GCM_extra_activity_type", (Parcelable) x0Var);
        }
        intent.putParcelableArrayListExtra("GCM_extra_activity_type_list", arrayList);
        intent.putExtra("GCM_extra_is_sharable_event", bool);
        intent.putExtra("GCM_extra_is_triathlon_event", z14);
        if (fVar != null && !fVar.f().isEmpty()) {
            intent.putExtra("GCM_extra_event_leg_distance", fVar);
        }
        if (fVar2 != null) {
            intent.putExtra("GCM_extra_event_location", fVar2);
        }
        mVar.startActivityForResult(intent, 99);
    }

    @Override // jy1.b
    public final void z(androidx.fragment.app.m mVar, w01.c cVar, f.c cVar2) {
        cVar2.getClass();
        NutritionHydrationActivity.f33067b.getClass();
        Intent intent = new Intent(mVar, (Class<?>) NutritionHydrationActivity.class);
        intent.putExtra("GCM_extra_nutrition_hydration_details", cVar);
        cVar2.a(intent, null);
    }
}
