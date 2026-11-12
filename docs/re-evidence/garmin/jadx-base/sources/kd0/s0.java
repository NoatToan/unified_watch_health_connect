package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.pacepro.presentation.activity.CreatePaceProComposeActivity;
import com.garmin.android.apps.connectmobile.pacepro.presentation.activity.PaceProComposeActivity;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideAlgorithm;
import com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.powerguide.edit.EditPowerGuideStrategyActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.trails.presentation.GarminTrailsActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.EventDetailsActivity;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/s0;", "Ls20/h;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 implements s20.h {
    @Override // s20.h
    public final long A() {
        return GCMSettingManager.r(fd0.d.POWER_GUIDE, null);
    }

    @Override // s20.h
    public final boolean a() {
        return bo1.a.a().c().g0();
    }

    @Override // s20.h
    public final void b(CourseDetailsActivity courseDetailsActivity, CalendarItemDTO calendarItemDTO) {
        EventDetailsActivity.f45692o.getClass();
        Intent intent = new Intent(courseDetailsActivity, (Class<?>) EventDetailsActivity.class);
        intent.putExtra("GCM_calendar_items", calendarItemDTO);
        courseDetailsActivity.startActivity(intent);
    }

    @Override // s20.h
    public final boolean c() {
        c22.s3.f23252a.getClass();
        return c22.s3.a("ROLE_MBTESTER") || ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("GretaLaunchEnabled");
    }

    @Override // s20.h
    public final void d(CourseDetailsActivity courseDetailsActivity, com.garmin.android.library.mapsdkadapter.i.b bVar) {
        fd0.d dVar = fd0.d.POWER_GUIDE;
        GCMSettingManager.J(dVar, null, -1L);
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(courseDetailsActivity, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", dVar);
        intent.putExtra("arg.course.coordinate.system", bVar);
        courseDetailsActivity.startActivityForResult(intent, 123);
    }

    @Override // s20.h
    public final void e(CourseDetailsActivity courseDetailsActivity, com.garmin.android.library.mapsdkadapter.i.b bVar) {
        fd0.d dVar = fd0.d.PACEPRO;
        GCMSettingManager.J(dVar, null, -1L);
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(courseDetailsActivity, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", dVar);
        intent.putExtra("arg.course.coordinate.system", bVar);
        courseDetailsActivity.startActivityForResult(intent, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // s20.h
    public final Object f(double d14, double d15, v13.c cVar) throws Throwable {
        q0 q0Var;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f104301e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f104301e = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object objJ = q0Var.f104299c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f104301e;
        if (i15 == 0) {
            o13.r.b(objJ);
            zd0.j1 j1Var = (zd0.j1) KoinJavaComponent.get$default(zd0.j1.class, null, null, 6, null);
            c80.q qVar = c80.q.GARMIN_TRAILS;
            q0Var.f104297a = d14;
            q0Var.f104298b = d15;
            q0Var.f104301e = 1;
            objJ = j1Var.j(qVar, q0Var);
            if (objJ != aVar) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objJ);
                return objJ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d15 = q0Var.f104298b;
        d14 = q0Var.f104297a;
        o13.r.b(objJ);
        double d16 = d14;
        double d17 = d15;
        if (((c80.p) objJ) instanceof c80.p.a) {
            return Boolean.FALSE;
        }
        x53.c cVar2 = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        r0 r0Var = new r0(d16, d17, null);
        q0Var.f104297a = d16;
        q0Var.f104298b = d17;
        q0Var.f104301e = 2;
        Object objE0 = ge1.b.e0(bVar, r0Var, q0Var);
        return objE0 == aVar ? aVar : objE0;
    }

    @Override // s20.h
    public final void g(CourseDetailsActivity courseDetailsActivity, com.garmin.android.library.mapsdkadapter.i.b bVar, k30.h hVar) {
        bVar.getClass();
        fd0.d dVar = fd0.d.COURSES;
        GCMSettingManager.J(dVar, null, -1L);
        boolean z14 = hVar.f102549a;
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_lap_by_course_point_enabled, GCMSettingManager.f41536b.edit(), z14);
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(courseDetailsActivity, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", dVar);
        intent.putExtra("arg.course.coordinate.system", bVar);
        intent.putExtra("arg.course.feature.preferences", hVar);
        courseDetailsActivity.startActivityForResult(intent, 500);
    }

    @Override // s20.h
    public final void h(Activity activity) {
        activity.getClass();
        activity.startActivity(new Intent(activity, (Class<?>) GarminTrailsActivity.class));
    }

    @Override // s20.h
    public final boolean i(long j8) {
        return j8 == ((long) ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
    }

    @Override // s20.h
    public final void j(Activity activity, long j8, String str) {
        activity.getClass();
        str.getClass();
        EditPowerGuideStrategyActivity.f40384t.getClass();
        EditPowerGuideStrategyActivity.a.a(activity, j8, str, 345);
    }

    @Override // s20.h
    public final boolean k() {
        com.garmin.android.apps.connectmobile.l.g().getClass();
        return gh2.i.f77458c.a().f77477b.c("obstacle_points_enabled");
    }

    @Override // s20.h
    public final void l(CourseDetailsActivity courseDetailsActivity, com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar) {
        PaceProComposeActivity.f39792a.getClass();
        courseDetailsActivity.startActivityForResult(PaceProComposeActivity.a.a(courseDetailsActivity, bVar), 100);
    }

    @Override // s20.h
    public final void m() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_COURSES);
    }

    @Override // s20.h
    public final boolean n() {
        return GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_course_create_tip_displayed), false);
    }

    @Override // s20.h
    public final void o(CourseDetailsActivity courseDetailsActivity, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        CreatePaceProComposeActivity.f39791b.getClass();
        courseDetailsActivity.startActivityForResult(CreatePaceProComposeActivity.a.a(courseDetailsActivity, eVar, null, true), 1555);
    }

    @Override // s20.h
    public final void p(CourseDetailsActivity courseDetailsActivity, String str) {
        CreatePowerGuideStrategyActivity.f40374b.getClass();
        Intent intent = new Intent(courseDetailsActivity, (Class<?>) CreatePowerGuideStrategyActivity.class);
        intent.putExtra("GCM_extra_course_id", str);
        intent.putExtra("GCM_extra_navigate_from_course_details", true);
        courseDetailsActivity.startActivityForResult(intent, 55);
    }

    @Override // s20.h
    public final void q(ab1.d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        eVar.getClass();
        xa1.h.e(dVar, eVar, new PowerGuideAlgorithm());
    }

    @Override // s20.h
    public final void r(Activity activity, String str) {
        activity.getClass();
        CreatePowerGuideStrategyActivity.f40374b.getClass();
        Intent intent = new Intent(activity, (Class<?>) CreatePowerGuideStrategyActivity.class);
        intent.putExtra("GCM_extra_course_id", str);
        activity.startActivity(intent);
    }

    @Override // s20.h
    public final boolean s() {
        return bo1.a.a().c().D();
    }

    @Override // s20.h
    public final void t(Activity activity, com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        activity.getClass();
        CreatePaceProComposeActivity.f39791b.getClass();
        Intent intent = new Intent(activity, (Class<?>) CreatePaceProComposeActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("connect://createPacePro"));
        Bundle bundle = new Bundle();
        bundle.putString("course_id_key", dVar.courseId);
        bundle.putDouble("distance_in_meters_key", dVar.distanceInMeters);
        bundle.putBoolean("should_return_to_pace_pro_list_key", true);
        com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
        com.garmin.android.apps.connectmobile.l2.a.b().a(intent, bundle);
        activity.startActivity(intent);
    }

    @Override // s20.h
    public final long u() {
        return GCMSettingManager.r(fd0.d.COURSES, null);
    }

    @Override // s20.h
    public final void v(CourseDetailsActivity courseDetailsActivity) {
        z6.h0 h0VarE = z6.h0.e(courseDetailsActivity);
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(courseDetailsActivity, (Class<?>) DashboardActivity.class);
        ArrayList<Intent> arrayList = h0VarE.f202637a;
        arrayList.add(intent);
        arrayList.add(new Intent(courseDetailsActivity, (Class<?>) CoursesActivity.class));
        h0VarE.g();
    }

    @Override // s20.h
    public final void w(Activity activity, long j8, String str) {
        activity.getClass();
        CreatePowerGuideStrategyActivity.f40374b.getClass();
        Intent intent = new Intent(activity, (Class<?>) CreatePowerGuideStrategyActivity.class);
        intent.putExtra("GCM_extra_course_id", str);
        intent.putExtra("GCM_extra_power_guide_id_to_replace", j8);
        activity.startActivity(intent);
    }

    @Override // s20.h
    public final void x() {
        com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_course_create_tip_displayed, GCMSettingManager.f41536b.edit(), true);
    }

    @Override // s20.h
    public final void y(Context context, long j8) {
        context.getClass();
        if (j8 <= 0 || !hk0.p.k(j8)) {
            return;
        }
        yr1.e.g(j8, -1L, context, "CourseDetailsActivity");
    }

    @Override // s20.h
    public final long z() {
        return GCMSettingManager.r(fd0.d.PACEPRO, null);
    }
}
