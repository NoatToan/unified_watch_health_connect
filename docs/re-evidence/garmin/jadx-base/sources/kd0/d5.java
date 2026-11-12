package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/d5;", "Lsa1/j;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d5 implements sa1.j {
    @Override // sa1.j
    public final long a() {
        return GCMSettingManager.r(fd0.d.POWER_GUIDE, null);
    }

    @Override // sa1.j
    public final String b(long j8) {
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI == null) {
            return "";
        }
        String displayName = fVarI.getDisplayName();
        if (displayName != null) {
            return displayName;
        }
        String productDisplayName = fVarI.getProductDisplayName();
        productDisplayName.getClass();
        return productDisplayName;
    }

    @Override // sa1.j
    public final long c(ta1.a aVar) {
        uk1.j jVarA = uk1.j.f171905b.a();
        jVarA.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.g(jVarA, false, "CYCLING", 2, null), aVar);
    }

    @Override // sa1.j
    public final void d(Activity activity, com.garmin.android.apps.connectmobile.courses.model.e eVar, boolean z14) {
        eVar.getClass();
        CourseDetailsActivity.f33024k.getClass();
        Intent intent = new Intent(activity, (Class<?>) CourseDetailsActivity.class);
        intent.putExtra("readOnlyMode", z14);
        intent.putExtra("GCM_extra_course_navigate_up", false);
        intent.putExtra("GCM_extra_course_id", eVar.courseId);
        com.garmin.android.apps.connectmobile.courses.model.i.a aVar = com.garmin.android.apps.connectmobile.courses.model.i.f32968g;
        am.x0 x0VarG = eVar.g();
        aVar.getClass();
        intent.putExtra("GCM_extra_course_type", com.garmin.android.apps.connectmobile.courses.model.i.a.a(x0VarG));
        activity.startActivityForResult(intent, 3333);
    }

    @Override // sa1.j
    public final void e() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_POWER_GUIDE);
    }

    @Override // sa1.j
    public final void f(Fragment fragment, com.garmin.android.apps.connectmobile.courses.model.e eVar, ArrayList arrayList) {
        fragment.getClass();
        eVar.getClass();
        arrayList.getClass();
        if (fragment instanceof c50.i) {
            m(fragment);
            c50.i iVar = (c50.i) fragment;
            iVar.C = false;
            if (iVar.f97016t != null) {
                iVar.X6().setShowMapOptions(false);
            }
            iVar.B = false;
            if (iVar.f97016t != null) {
                iVar.X6().setShowNewMapButtons(false);
            }
            iVar.P = true;
            iVar.W0 = false;
            com.garmin.android.library.mapsdkadapter.e.a aVar = new com.garmin.android.library.mapsdkadapter.e.a();
            List<GeoPointDTO> list = eVar.geoPoints;
            if (list != null) {
                for (GeoPointDTO geoPointDTO : list) {
                    Double d14 = geoPointDTO.latitude;
                    double dDoubleValue = 0.0d;
                    double dDoubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
                    Double d15 = geoPointDTO.longitude;
                    if (d15 != null) {
                        dDoubleValue = d15.doubleValue();
                    }
                    aVar.b(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue2, dDoubleValue, eVar.h()));
                }
            }
            com.garmin.android.library.mapsdkadapter.e eVarA = aVar.a();
            if (eVarA != null) {
                iVar.X0 = true;
                iVar.Y0 = eVarA;
            }
            i(fragment, eVar, arrayList);
        }
    }

    @Override // sa1.j
    public final c50.i g(com.garmin.android.apps.connectmobile.courses.model.i iVar) {
        iVar.getClass();
        c50.i.f24502a1.getClass();
        c50.i iVar2 = new c50.i();
        iVar2.f97020y = new c5(iVar);
        return iVar2;
    }

    @Override // sa1.j
    public final void h(Activity activity, com.garmin.android.apps.connectmobile.courses.model.e eVar) {
        eVar.getClass();
        CourseDetailsActivity.f33024k.getClass();
        CourseDetailsActivity.a.c(activity, eVar, true);
    }

    @Override // sa1.j
    public final void i(Fragment fragment, com.garmin.android.apps.connectmobile.courses.model.e eVar, List<Integer> list) {
        fragment.getClass();
        eVar.getClass();
        list.getClass();
        if (fragment instanceof c50.i) {
            c50.i iVar = (c50.i) fragment;
            iVar.Z0 = list;
            iVar.f8(eVar);
        }
    }

    @Override // sa1.j
    public final void j(Context context, long j8, String str) {
        if (j8 <= 0 || !hk0.p.k(j8)) {
            return;
        }
        yr1.e.g(j8, -1L, context, str);
    }

    @Override // sa1.j
    public final void k(Fragment fragment, com.garmin.android.apps.connectmobile.courses.model.e eVar, List<Integer> list) {
        fragment.getClass();
        if (fragment instanceof c50.i) {
            m(fragment);
            c50.i iVar = (c50.i) fragment;
            iVar.W0 = true;
            iVar.T7(true);
            iVar.C = true;
            if (iVar.f97016t != null) {
                iVar.X6().setShowMapOptions(true);
            }
            iVar.B = false;
            if (iVar.f97016t != null) {
                iVar.X6().setShowNewMapButtons(false);
            }
            i(fragment, eVar, list);
        }
    }

    @Override // sa1.j
    public final long l(ok1.b bVar, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Unit> interfaceC0995b) {
        bVar.getClass();
        uk1.j jVarA = uk1.j.f171905b.a();
        jVarA.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new uk1.n(bVar, jVarA), interfaceC0995b);
    }

    @Override // sa1.j
    public final void m(Fragment fragment) {
        fragment.getClass();
        if (fragment instanceof c50.i) {
            f12.l.f68084a.getClass();
            ((c50.i) fragment).N7(f12.l.a.a().c1());
        }
    }

    @Override // sa1.j
    public final void n(Activity activity, com.garmin.android.library.mapsdkadapter.i.b bVar) {
        activity.getClass();
        fd0.d dVar = fd0.d.POWER_GUIDE;
        GCMSettingManager.J(dVar, null, -1L);
        TDSActivity.f34565f.getClass();
        Intent intent = new Intent(activity, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", dVar);
        intent.putExtra("arg.course.coordinate.system", bVar);
        activity.startActivityForResult(intent, 123);
    }

    @Override // sa1.j
    public final long o(String str, ta1.a aVar) {
        t20.h.f161777b.getClass();
        return t20.h.a.a().c(str, aVar);
    }

    @Override // sa1.j
    public final void p(Activity activity, ArrayList arrayList) {
        Intent intent = new Intent(activity, (Class<?>) CoursesActivity.class);
        intent.putExtra("GCM_create_course_flow", 1);
        intent.putExtra("GCM_extra_power_guide_list", arrayList);
        activity.startActivityForResult(intent, 234);
    }
}
