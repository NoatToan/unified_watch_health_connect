package b50;

import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f15958b;

    public /* synthetic */ c(CourseDetailsActivity courseDetailsActivity, int i14) {
        this.f15957a = i14;
        this.f15958b = courseDetailsActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f15957a;
        int i15 = 3;
        CourseDetailsActivity courseDetailsActivity = this.f15958b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) obj;
                CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                gVar.getClass();
                courseDetailsActivity.ia().F4(true);
                androidx.fragment.app.v supportFragmentManager = courseDetailsActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                c60.e.t(supportFragmentManager, new b(courseDetailsActivity, gVar, 2), new b(courseDetailsActivity, gVar, i15), new b(courseDetailsActivity, gVar, 4));
                break;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().G4(iIntValue == 3);
                break;
            case 2:
                int iIntValue2 = ((Integer) obj).intValue();
                CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().G4(iIntValue2 == 3);
                break;
            case 3:
                int iIntValue3 = ((Integer) obj).intValue();
                CourseDetailsActivity.a aVar4 = CourseDetailsActivity.f33024k;
                p pVarIa = courseDetailsActivity.ia();
                pVarIa.getClass();
                pVarIa.z4(new e50.b.m(iIntValue3));
                break;
            case 4:
                int iIntValue4 = ((Integer) obj).intValue();
                CourseDetailsActivity.a aVar5 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().G4(iIntValue4 == 3);
                break;
            case 5:
                int iIntValue5 = ((Integer) obj).intValue();
                CourseDetailsActivity.a aVar6 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().G4(iIntValue5 == 3);
                break;
            case 6:
                int iIntValue6 = ((Integer) obj).intValue();
                CourseDetailsActivity.a aVar7 = CourseDetailsActivity.f33024k;
                courseDetailsActivity.ia().G4(iIntValue6 == 3);
                break;
            case 7:
                int iIntValue7 = ((Integer) obj).intValue();
                CourseDetailsActivity.a aVar8 = CourseDetailsActivity.f33024k;
                p pVarIa2 = courseDetailsActivity.ia();
                pVarIa2.getClass();
                pVarIa2.z4(new e50.b.m(iIntValue7));
                p pVarIa3 = courseDetailsActivity.ia();
                pVarIa3.getClass();
                pVarIa3.z4(e50.b.a.f62947a);
                break;
            default:
                int iIntValue8 = ((Integer) obj).intValue();
                CourseDetailsActivity.a aVar9 = CourseDetailsActivity.f33024k;
                p pVarIa4 = courseDetailsActivity.ia();
                pVarIa4.getClass();
                pVarIa4.z4(new e50.b.o(iIntValue8));
                break;
        }
        return Unit.INSTANCE;
    }
}
