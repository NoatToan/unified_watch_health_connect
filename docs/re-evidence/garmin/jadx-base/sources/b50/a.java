package b50;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f15948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f15949c;

    public /* synthetic */ a(CourseDetailsActivity courseDetailsActivity, com.garmin.android.apps.connectmobile.courses.model.g gVar, int i14) {
        this.f15947a = i14;
        this.f15948b = courseDetailsActivity;
        this.f15949c = gVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f15947a;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = this.f15949c;
        CourseDetailsActivity courseDetailsActivity = this.f15948b;
        switch (i14) {
            case 0:
                GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                geoPointDTO.getClass();
                courseDetailsActivity.ma(new e50.a.h0(gVar, geoPointDTO));
                break;
            case 1:
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                gVar2.getClass();
                courseDetailsActivity.ia().F4(true);
                androidx.fragment.app.v supportFragmentManager = courseDetailsActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.c(supportFragmentManager);
                courseDetailsActivity.ma(new e50.a.i(gVar, gVar2));
                break;
            default:
                com.garmin.android.apps.connectmobile.courses.model.g gVar3 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                gVar3.getClass();
                courseDetailsActivity.ma(new e50.a.i(gVar, gVar3));
                break;
        }
        return Unit.INSTANCE;
    }
}
