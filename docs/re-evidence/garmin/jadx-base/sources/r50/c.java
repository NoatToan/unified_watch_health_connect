package r50;

import com.garmin.android.apps.connectmobile.courses.presentation.planner.CoursePointListActivity;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoursePointListActivity f150409b;

    public /* synthetic */ c(CoursePointListActivity coursePointListActivity, int i14) {
        this.f150408a = i14;
        this.f150409b = coursePointListActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f150408a;
        int i15 = 0;
        int i16 = 3;
        CoursePointListActivity coursePointListActivity = this.f150409b;
        switch (i14) {
            case 0:
                ((Boolean) obj).getClass();
                CoursePointListActivity.a aVar = CoursePointListActivity.f33079c;
                coursePointListActivity.da().x4();
                coursePointListActivity.da().z4();
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                CoursePointListActivity.a aVar2 = CoursePointListActivity.f33079c;
                g gVarDa = coursePointListActivity.da();
                gVarDa.getClass();
                gVarDa.y4(new t50.c.n(iIntValue));
                break;
            case 2:
                CoursePointListActivity.a aVar3 = CoursePointListActivity.f33079c;
                coursePointListActivity.ea(new t50.b.g((String) obj));
                break;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                CoursePointListActivity.a aVar4 = CoursePointListActivity.f33079c;
                g gVarDa2 = coursePointListActivity.da();
                i15 = iIntValue2 == 3 ? 1 : 0;
                p2 p2Var = gVarDa2.f150432k;
                p2Var.k(null, t50.e.a((t50.e) p2Var.getValue(), false, i15, null, null, 29));
                break;
            case 4:
                com.garmin.android.apps.connectmobile.courses.model.f fVar = (com.garmin.android.apps.connectmobile.courses.model.f) obj;
                CoursePointListActivity.a aVar5 = CoursePointListActivity.f33079c;
                fVar.getClass();
                g gVarDa3 = coursePointListActivity.da();
                gVarDa3.getClass();
                gVarDa3.y4(new t50.c.g(fVar));
                g gVarDa4 = coursePointListActivity.da();
                gVarDa4.getClass();
                gVarDa4.y4(t50.c.k.f162527a);
                androidx.fragment.app.v supportFragmentManager = coursePointListActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.e(supportFragmentManager, new c(coursePointListActivity, i16), new f(coursePointListActivity, i15), new qn0.f(23, coursePointListActivity, fVar));
                break;
            case 5:
                CoursePointListActivity.a aVar6 = CoursePointListActivity.f33079c;
                androidx.fragment.app.v supportFragmentManager2 = coursePointListActivity.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                c60.e.c(supportFragmentManager2);
                coursePointListActivity.ea(new t50.b.g((String) obj));
                break;
            default:
                com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CoursePointListActivity.a aVar7 = CoursePointListActivity.f33079c;
                gVar.getClass();
                androidx.fragment.app.v supportFragmentManager3 = coursePointListActivity.getSupportFragmentManager();
                supportFragmentManager3.getClass();
                c60.e.t(supportFragmentManager3, new d(coursePointListActivity, gVar, 3), new d(coursePointListActivity, gVar, 4), new d(coursePointListActivity, gVar, 5));
                break;
        }
        return Unit.INSTANCE;
    }
}
