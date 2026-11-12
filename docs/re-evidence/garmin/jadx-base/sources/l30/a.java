package l30;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseActivity;
import java.util.ArrayList;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateCourseActivity f109512b;

    public /* synthetic */ a(CreateCourseActivity createCourseActivity, int i14) {
        this.f109511a = i14;
        this.f109512b = createCourseActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    @Override // e23.a
    public final Object invoke() {
        w20.a aVar;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        k30.k kVar;
        w20.b bVar;
        Object serializable;
        Object serializable2;
        Parcelable parcelable;
        int i14 = this.f109511a;
        CreateCourseActivity createCourseActivity = this.f109512b;
        switch (i14) {
            case 0:
                Bundle bundle = createCourseActivity.f32993d;
                if (bundle == null) {
                    aVar = new w20.a(new com.garmin.android.apps.connectmobile.courses.model.e(), null, null, null, null, false, 62, null);
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = (Parcelable) bundle.getParcelable("GCM_extra_course_data", w20.a.class);
                    } else {
                        Parcelable parcelable2 = bundle.getParcelable("GCM_extra_course_data");
                        if (!(parcelable2 instanceof w20.a)) {
                            parcelable2 = null;
                        }
                        parcelable = (w20.a) parcelable2;
                    }
                    aVar = (w20.a) parcelable;
                    if (aVar == null) {
                        aVar = new w20.a(new com.garmin.android.apps.connectmobile.courses.model.e(), null, null, null, null, false, 62, null);
                    }
                }
                Bundle bundle2 = createCourseActivity.f32993d;
                if (bundle2 != null) {
                    parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle2.getParcelableArrayList("EXTRA_RELATED_PACEBANDS", com.garmin.android.apps.connectmobile.pacepro.data.dto.b.class) : bundle2.getParcelableArrayList("EXTRA_RELATED_PACEBANDS");
                } else {
                    parcelableArrayList = null;
                }
                Bundle bundle3 = createCourseActivity.f32993d;
                if (bundle3 != null) {
                    parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundle3.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES", ab1.g.class) : bundle3.getParcelableArrayList("EXTRA_RELATED_POWER_GUIDES");
                } else {
                    parcelableArrayList2 = null;
                }
                Bundle bundle4 = createCourseActivity.f32993d;
                if (bundle4 == null) {
                    kVar = k30.k.POPULARITY;
                } else {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable2 = bundle4.getSerializable("GCM_extra_course_routing_type", k30.k.class);
                    } else {
                        Object serializable3 = bundle4.getSerializable("GCM_extra_course_routing_type");
                        if (!(serializable3 instanceof k30.k)) {
                            serializable3 = null;
                        }
                        serializable2 = (k30.k) serializable3;
                    }
                    kVar = (k30.k) serializable2;
                    if (kVar == null) {
                        kVar = k30.k.POPULARITY;
                    }
                }
                k30.k kVar2 = kVar;
                Bundle bundle5 = createCourseActivity.f32993d;
                boolean z14 = bundle5 != null ? bundle5.getBoolean("GCM_extra_course_avoid_high_traffic", false) : false;
                Bundle bundle6 = createCourseActivity.f32993d;
                boolean z15 = bundle6 != null ? bundle6.getBoolean("GCM_extra_course_avoid_closed_roads", false) : false;
                Bundle bundle7 = createCourseActivity.f32993d;
                boolean z16 = bundle7 != null ? bundle7.getBoolean("GCM_extra_course_avoid_unpaved_roads", false) : false;
                Bundle bundle8 = createCourseActivity.f32993d;
                double d14 = bundle8 != null ? bundle8.getDouble("GCM_extra_course_distance", Double.NaN) : Double.NaN;
                Bundle bundle9 = createCourseActivity.f32993d;
                if (bundle9 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = bundle9.getSerializable("GCM_extra_course_direction", w20.b.class);
                    } else {
                        Object serializable4 = bundle9.getSerializable("GCM_extra_course_direction");
                        if (!(serializable4 instanceof w20.b)) {
                            serializable4 = null;
                        }
                        serializable = (w20.b) serializable4;
                    }
                    bVar = (w20.b) serializable;
                } else {
                    bVar = null;
                }
                Bundle bundle10 = createCourseActivity.f32993d;
                return ParametersHolderKt.parametersOf(aVar, (!zf.b.D(Double.valueOf(d14)) || bVar == null) ? null : new n30.e(kVar2, z14, z15, z16, d14, bVar, bundle10 != null ? bundle10.getInt("GCM_create_course_flow", -1) : -1), parcelableArrayList, parcelableArrayList2 != null ? (ab1.g) p13.h0.d0(parcelableArrayList2) : null);
            case 1:
                CreateCourseActivity.a aVar2 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().x4();
                return Unit.INSTANCE;
            case 2:
                CreateCourseActivity.a aVar3 = CreateCourseActivity.f32989g;
                createCourseActivity.fa(n30.a.f.f123353a);
                return Unit.INSTANCE;
            case 3:
                CreateCourseActivity.a aVar4 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().y4();
                createCourseActivity.ea().x4();
                return Unit.INSTANCE;
            default:
                CreateCourseActivity.a aVar5 = CreateCourseActivity.f32989g;
                createCourseActivity.ea().y4();
                createCourseActivity.ea().x4();
                return Unit.INSTANCE;
        }
    }
}
