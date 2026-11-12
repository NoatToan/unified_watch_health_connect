package r50;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoursePointListActivity f150405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f150406c;

    public /* synthetic */ b(CoursePointListActivity coursePointListActivity, com.garmin.android.apps.connectmobile.courses.model.g gVar, int i14) {
        this.f150404a = i14;
        this.f150405b = coursePointListActivity;
        this.f150406c = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f150404a;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = this.f150406c;
        CoursePointListActivity coursePointListActivity = this.f150405b;
        switch (i14) {
            case 0:
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                CoursePointListActivity.a aVar = CoursePointListActivity.f33079c;
                geoPointDTO.getClass();
                coursePointListActivity.ea(new t50.b.l(gVar, geoPointDTO));
                break;
            default:
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CoursePointListActivity.a aVar2 = CoursePointListActivity.f33079c;
                gVar2.getClass();
                coursePointListActivity.ea(new t50.b.e(gVar, gVar2));
                break;
        }
        return Unit.INSTANCE;
    }
}
