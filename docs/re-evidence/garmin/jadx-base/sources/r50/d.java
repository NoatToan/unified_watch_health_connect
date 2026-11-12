package r50;

import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoursePointListActivity f150412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f150413c;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.courses.model.g gVar, CoursePointListActivity coursePointListActivity) {
        this.f150411a = 0;
        this.f150413c = gVar;
        this.f150412b = coursePointListActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f150411a;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = this.f150413c;
        CoursePointListActivity coursePointListActivity = this.f150412b;
        switch (i14) {
            case 0:
                CoursePointListActivity.a aVar = CoursePointListActivity.f33079c;
                Long coursePointId = gVar.getCoursePointId();
                if (coursePointId != null) {
                    coursePointListActivity.ea(new t50.b.c(coursePointId.longValue()));
                }
                break;
            case 1:
                CoursePointListActivity.a aVar2 = CoursePointListActivity.f33079c;
                coursePointListActivity.fa(gVar);
                break;
            case 2:
                CoursePointListActivity.a aVar3 = CoursePointListActivity.f33079c;
                g gVarDa = coursePointListActivity.da();
                gVarDa.getClass();
                gVarDa.y4(new t50.c.m(gVar));
                g gVarDa2 = coursePointListActivity.da();
                gVarDa2.getClass();
                gVarDa2.y4(new t50.c.n(0));
                coursePointListActivity.da().z4();
                break;
            case 3:
                CoursePointListActivity.a aVar4 = CoursePointListActivity.f33079c;
                g gVarDa3 = coursePointListActivity.da();
                gVarDa3.getClass();
                gVar.getClass();
                gVarDa3.y4(new t50.c.i(gVar));
                break;
            case 4:
                CoursePointListActivity.a aVar5 = CoursePointListActivity.f33079c;
                g gVarDa4 = coursePointListActivity.da();
                gVarDa4.getClass();
                gVar.getClass();
                gVarDa4.y4(new t50.c.d(gVar));
                break;
            default:
                CoursePointListActivity.a aVar6 = CoursePointListActivity.f33079c;
                coursePointListActivity.da().x4();
                coursePointListActivity.da().A4(gVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(CoursePointListActivity coursePointListActivity, com.garmin.android.apps.connectmobile.courses.model.g gVar, int i14) {
        this.f150411a = i14;
        this.f150412b = coursePointListActivity;
        this.f150413c = gVar;
    }
}
