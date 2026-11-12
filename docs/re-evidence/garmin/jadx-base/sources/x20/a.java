package x20;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.courses.details.CoursesDeepLinkActivity;
import com.garmin.android.apps.connectmobile.courses.details.PrivateCourseActivity;
import com.garmin.android.apps.connectmobile.courses.model.e;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;
import com.garmin.android.library.backgroundtaskmanagement.b;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx20/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements b.InterfaceC0995b<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoursesDeepLinkActivity f188480a;

    public a(CoursesDeepLinkActivity coursesDeepLinkActivity) {
        this.f188480a = coursesDeepLinkActivity;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, b.c cVar) {
        cVar.getClass();
        b.c cVar2 = b.c.UNRECOVERABLE;
        CoursesDeepLinkActivity coursesDeepLinkActivity = this.f188480a;
        if (cVar == cVar2) {
            coursesDeepLinkActivity.hideProgressOverlay();
            int i14 = PrivateCourseActivity.f32767a;
            Intent intent = new Intent(coursesDeepLinkActivity, (Class<?>) PrivateCourseActivity.class);
            intent.addFlags(268468224);
            coursesDeepLinkActivity.startActivity(intent);
        }
        coursesDeepLinkActivity.finish();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, b.e eVar, e eVar2) {
        e eVar3 = eVar2;
        eVar.getClass();
        eVar3.getClass();
        CoursesDeepLinkActivity coursesDeepLinkActivity = this.f188480a;
        coursesDeepLinkActivity.f32766a = -1L;
        coursesDeepLinkActivity.hideProgressOverlay();
        if (eVar3.courseId == null) {
            int i14 = PrivateCourseActivity.f32767a;
            Intent intent = new Intent(coursesDeepLinkActivity, (Class<?>) PrivateCourseActivity.class);
            intent.addFlags(268468224);
            coursesDeepLinkActivity.startActivity(intent);
            coursesDeepLinkActivity.finish();
            return;
        }
        CourseDetailsActivity.f33024k.getClass();
        Intent intent2 = new Intent(coursesDeepLinkActivity, (Class<?>) CourseDetailsActivity.class);
        intent2.putExtra("GCM_extra_course_id", eVar3.courseId);
        intent2.putExtra("GCM_extra_course_type", eVar3.m());
        intent2.putExtra("deep_link", true);
        intent2.addFlags(268468224);
        coursesDeepLinkActivity.startActivity(intent2);
    }
}
