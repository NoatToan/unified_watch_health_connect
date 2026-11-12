package b50;

import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.apps.connectmobile.q1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements u20.d.a, q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseDetailsActivity f15965b;

    public /* synthetic */ d(CourseDetailsActivity courseDetailsActivity, int i14) {
        this.f15964a = i14;
        this.f15965b = courseDetailsActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        int i14 = this.f15964a;
        CourseDetailsActivity courseDetailsActivity = this.f15965b;
        switch (i14) {
            case 1:
                CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
                if (z14) {
                    courseDetailsActivity.ia().B4(e50.a.y.f62945a);
                }
                break;
            case 2:
                CourseDetailsActivity.a aVar2 = CourseDetailsActivity.f33024k;
                if (z14) {
                    courseDetailsActivity.ca();
                }
                break;
            default:
                CourseDetailsActivity.a aVar3 = CourseDetailsActivity.f33024k;
                if (z14) {
                    courseDetailsActivity.ia().B4(e50.a.f0.f62919a);
                }
                break;
        }
    }

    @Override // u20.d.a
    public void k(boolean z14) {
        CourseDetailsActivity.a aVar = CourseDetailsActivity.f33024k;
        if (z14) {
            this.f15965b.ia().B4(e50.a.d.f62913a);
        }
    }
}
