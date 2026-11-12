package vx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarActivity;
import com.garmin.android.apps.connectmobile.calendar.presentation.detail.details.CalendarDetailsActivity;
import ey.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public interface f {
    void A(CalendarDetailsActivity calendarDetailsActivity, CalendarItemDTO.b bVar, DateTime dateTime);

    long B();

    void C(int i14, boolean z14);

    String D(Context context, CalendarItemDTO calendarItemDTO);

    String E(Context context, CalendarItemDTO calendarItemDTO);

    String F(Context context, String str);

    p<LocalDate, LocalDate> G();

    String H(Context context, CalendarItemDTO calendarItemDTO);

    ArrayList I(List list, Date date);

    void J(CalendarDetailsActivity calendarDetailsActivity, int i14, DateTime dateTime);

    void K(CalendarDetailsActivity calendarDetailsActivity, CalendarItemDTO calendarItemDTO);

    void L(CalendarDetailsActivity calendarDetailsActivity, Long l14, LocalDate localDate);

    void M(Context context, hy.e eVar);

    String N(Context context, CalendarItemDTO calendarItemDTO);

    void O(Activity activity);

    String P(Context context, CalendarItemDTO calendarItemDTO);

    fy.e a();

    void b(Context context);

    String c(Context context, gs1.b bVar);

    boolean d();

    void e(CalendarDetailsActivity calendarDetailsActivity, CalendarItemDTO calendarItemDTO);

    void f(CalendarDetailsActivity calendarDetailsActivity, String str, boolean z14);

    boolean g(int i14);

    void h(CalendarDetailsActivity calendarDetailsActivity, DateTime dateTime);

    String i(Context context, CalendarItemDTO calendarItemDTO);

    String j(Context context, CalendarItemDTO calendarItemDTO);

    String k(sd2.f fVar);

    long l(n nVar);

    String m(Context context, CalendarItemDTO calendarItemDTO);

    void n(CalendarDetailsActivity calendarDetailsActivity, CalendarItemDTO calendarItemDTO);

    String o(Context context, CalendarItemDTO calendarItemDTO);

    void p(CalendarDetailsActivity calendarDetailsActivity, gs1.b bVar);

    String q(Context context, CalendarItemDTO calendarItemDTO);

    void r(CalendarDetailsActivity calendarDetailsActivity, gs1.f fVar);

    SpannableStringBuilder s(int i14, int i15, Context context);

    String t(Context context, CalendarItemDTO calendarItemDTO);

    void u(CalendarDetailsActivity calendarDetailsActivity, DateTime dateTime);

    Serializable v(DateTime dateTime, v13.c cVar);

    String w(int i14, Context context);

    Intent x(GCMCalendarActivity gCMCalendarActivity);

    void y(CalendarDetailsActivity calendarDetailsActivity);

    String z(Context context, CalendarItemDTO calendarItemDTO);
}
