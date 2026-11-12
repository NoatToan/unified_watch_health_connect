package kd0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.devices.targetedselection.TDSActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/x4;", "Ls41/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x4 implements s41.a {
    @Override // s41.a
    public final long a() {
        return GCMSettingManager.r(fd0.d.PACEPRO, null);
    }

    @Override // s41.a
    public final Intent b(Context context, com.garmin.android.library.mapsdkadapter.i.b bVar) {
        context.getClass();
        TDSActivity.f34565f.getClass();
        fd0.d dVar = fd0.d.PACEPRO;
        GCMSettingManager.J(dVar, null, -1L);
        Intent intent = new Intent(context, (Class<?>) TDSActivity.class);
        intent.putExtra("arg.module.type", dVar);
        intent.putExtra("arg.course.coordinate.system", bVar);
        return intent;
    }

    @Override // s41.a
    public final Intent c(Context context, com.garmin.android.apps.connectmobile.courses.model.e eVar, List<com.garmin.android.apps.connectmobile.pacepro.data.dto.b> list) {
        context.getClass();
        list.getClass();
        List<CourseSegmentDTO> listI = eVar.i();
        boolean z14 = false;
        if (listI != null && (!listI.isEmpty())) {
            z14 = true;
        }
        List<GeoPointDTO> list2 = eVar.geoPoints;
        GeoPointDTO geoPointDTO = list2 != null ? (GeoPointDTO) p13.h0.d0(list2) : null;
        List<GeoPointDTO> list3 = eVar.geoPoints;
        GeoPointDTO geoPointDTO2 = list3 != null ? (GeoPointDTO) p13.h0.n0(list3) : null;
        if (geoPointDTO == null || geoPointDTO2 == null) {
            return null;
        }
        if (!(p005kotlin.jvm.internal.s.d(geoPointDTO.latitude, geoPointDTO2.latitude) && p005kotlin.jvm.internal.s.d(geoPointDTO.longitude, geoPointDTO2.longitude)) && z14) {
            CreateCustomCourseActivity.f33013f.getClass();
            return CreateCustomCourseActivity.a.a(context, eVar, list, null, false, false, false);
        }
        CreateCourseActivity.f32989g.getClass();
        return CreateCourseActivity.a.a(context, eVar, list, null, false, false, false);
    }

    @Override // s41.a
    public final void d() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_PACE_PRO);
    }

    @Override // s41.a
    public final void e(q41.a aVar) {
        aVar.getClass();
        SharedPreferences.Editor editorEdit = GCMSettingManager.f41536b.edit();
        Float f14 = aVar.f142589a;
        editorEdit.putFloat(GCMSettingManager.f41535a.getString(R.string.key_paceband_elevation_segment_tolerance), f14 != null ? f14.floatValue() : 50.0f);
        Float f15 = aVar.f142590b;
        editorEdit.putFloat(GCMSettingManager.f41535a.getString(R.string.key_paceband_elevation_segment_min_length), f15 != null ? f15.floatValue() : 1700.0f);
        Float f16 = aVar.f142591c;
        editorEdit.putFloat(GCMSettingManager.f41535a.getString(R.string.key_paceband_pace_factor), f16 != null ? f16.floatValue() : 2.0f);
        editorEdit.apply();
    }

    @Override // s41.a
    public final q41.a f() {
        return new q41.a(Float.valueOf(GCMSettingManager.f41536b.getFloat(GCMSettingManager.f41535a.getString(R.string.key_paceband_elevation_segment_tolerance), 50.0f)), Float.valueOf(GCMSettingManager.f41536b.getFloat(GCMSettingManager.f41535a.getString(R.string.key_paceband_elevation_segment_min_length), 1700.0f)), Float.valueOf(GCMSettingManager.f41536b.getFloat(GCMSettingManager.f41535a.getString(R.string.key_paceband_pace_factor), 2.0f)));
    }

    @Override // s41.a
    public final void g(Context context) {
        Intent intent = new Intent(context, (Class<?>) CoursesActivity.class);
        intent.putExtra("GCM_create_course_flow", 0);
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
