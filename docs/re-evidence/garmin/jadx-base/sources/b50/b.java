package b50;

import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f15953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.g f15954c;

    public /* synthetic */ b(com.garmin.android.apps.connectmobile.courses.model.g gVar, CourseDetailsActivity courseDetailsActivity) {
        this.f15952a = 6;
        this.f15954c = gVar;
        this.f15953b = courseDetailsActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        List<com.garmin.android.apps.connectmobile.courses.model.g> listJ;
        int i14 = this.f15952a;
        com.garmin.android.apps.connectmobile.courses.model.g gVar = this.f15954c;
        CourseDetailsActivity courseDetailsActivity = this.f15953b;
        switch (i14) {
            case 0:
                CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().F4(true);
                androidx.fragment.app.v supportFragmentManager = courseDetailsActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.c(supportFragmentManager);
                Long coursePointId = gVar.getCoursePointId();
                if (coursePointId != null) {
                    courseDetailsActivity.ma(new e50.a.e(coursePointId.longValue()));
                }
                break;
            case 1:
                CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().F4(true);
                com.garmin.android.apps.connectmobile.courses.model.e eVarEa = courseDetailsActivity.ea();
                com.garmin.android.apps.connectmobile.courses.model.g gVar2 = null;
                Object obj = null;
                gVar2 = null;
                if (eVarEa != null && (listJ = eVarEa.j()) != null) {
                    for (Object obj2 : listJ) {
                        if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.g) obj2).getCoursePointId(), gVar.getCoursePointId())) {
                            obj = obj2;
                            gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                        }
                    }
                    gVar2 = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                }
                if (gVar2 != null) {
                    p pVarIa = courseDetailsActivity.ia();
                    pVarIa.getClass();
                    pVarIa.z4(new e50.b.c0(gVar2));
                    courseDetailsActivity.ia().A4(gVar2);
                }
                break;
            case 2:
                CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                p pVarIa2 = courseDetailsActivity.ia();
                pVarIa2.getClass();
                gVar.getClass();
                pVarIa2.z4(new e50.b.d(gVar));
                break;
            case 3:
                CourseDetailsActivity.a aVar4 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().F4(false);
                p pVarIa3 = courseDetailsActivity.ia();
                pVarIa3.getClass();
                gVar.getClass();
                pVarIa3.z4(new e50.b.C1327b(gVar));
                break;
            case 4:
                CourseDetailsActivity.a aVar5 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().F4(false);
                p pVarIa4 = courseDetailsActivity.ia();
                pVarIa4.getClass();
                pVarIa4.z4(e50.b.c.f62951a);
                courseDetailsActivity.ia().A4(gVar);
                break;
            case 5:
                CourseDetailsActivity.a aVar6 = CourseDetailsActivity.f33024k;
                p pVarIa5 = courseDetailsActivity.ia();
                pVarIa5.getClass();
                pVarIa5.z4(new e50.b.n(gVar));
                p pVarIa6 = courseDetailsActivity.ia();
                pVarIa6.getClass();
                pVarIa6.z4(e50.b.a.f62947a);
                break;
            case 6:
                CourseDetailsActivity.a aVar7 = CourseDetailsActivity.f33024k;
                Long coursePointId2 = gVar.getCoursePointId();
                if (coursePointId2 != null) {
                    courseDetailsActivity.ma(new e50.a.e(coursePointId2.longValue()));
                }
                break;
            case 7:
                CourseDetailsActivity.a aVar8 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.pa(gVar);
                break;
            default:
                CourseDetailsActivity.a aVar9 = CourseDetailsActivity.f33024k;
                p pVarIa7 = courseDetailsActivity.ia();
                pVarIa7.getClass();
                pVarIa7.z4(new e50.b.n(gVar));
                p pVarIa8 = courseDetailsActivity.ia();
                pVarIa8.getClass();
                pVarIa8.z4(e50.b.a.f62947a);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b(CourseDetailsActivity courseDetailsActivity, com.garmin.android.apps.connectmobile.courses.model.g gVar, int i14) {
        this.f15952a = i14;
        this.f15953b = courseDetailsActivity;
        this.f15954c = gVar;
    }
}
