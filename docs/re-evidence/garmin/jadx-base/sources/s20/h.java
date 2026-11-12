package s20;

import android.app.Activity;
import android.content.Context;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.details.CourseDetailsActivity;

/* JADX INFO: loaded from: classes8.dex */
public interface h {
    long A();

    boolean a();

    void b(CourseDetailsActivity courseDetailsActivity, CalendarItemDTO calendarItemDTO);

    boolean c();

    void d(CourseDetailsActivity courseDetailsActivity, com.garmin.android.library.mapsdkadapter.i.b bVar);

    void e(CourseDetailsActivity courseDetailsActivity, com.garmin.android.library.mapsdkadapter.i.b bVar);

    Object f(double d14, double d15, v13.c cVar);

    void g(CourseDetailsActivity courseDetailsActivity, com.garmin.android.library.mapsdkadapter.i.b bVar, k30.h hVar);

    void h(Activity activity);

    boolean i(long j8);

    void j(Activity activity, long j8, String str);

    boolean k();

    void l(CourseDetailsActivity courseDetailsActivity, com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar);

    void m();

    boolean n();

    void o(CourseDetailsActivity courseDetailsActivity, com.garmin.android.apps.connectmobile.courses.model.e eVar);

    void p(CourseDetailsActivity courseDetailsActivity, String str);

    void q(ab1.d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar);

    void r(Activity activity, String str);

    boolean s();

    void t(Activity activity, com.garmin.android.apps.connectmobile.courses.model.d dVar);

    long u();

    void v(CourseDetailsActivity courseDetailsActivity);

    void w(Activity activity, long j8, String str);

    void x();

    void y(Context context, long j8);

    long z();
}
