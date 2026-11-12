package ax0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import db1.m;
import hx0.a0;
import hx0.v;
import jx0.g;
import lx0.h;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import v13.c;
import ww0.b;
import ww0.k;

/* JADX INFO: loaded from: classes9.dex */
public interface a {
    Object A(LocalDate localDate, b bVar, a0 a0Var);

    Object B(c cVar);

    void C(Context context, LocalDate localDate, boolean z14, m mVar);

    Object D(LocalDate localDate, v vVar);

    long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<?> interfaceC0995b);

    boolean c();

    boolean d();

    UserSettingsDTO getUserSettings();

    long i(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<?> interfaceC0995b);

    boolean k();

    Integer l(int i14);

    void m(Context context);

    g n(k kVar, boolean z14);

    void o(androidx.fragment.app.m mVar);

    Object p(h hVar);

    void q(MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity);

    void r(MenstrualCycleDetailsActivity menstrualCycleDetailsActivity);

    Object s(String str, m mVar, c cVar);

    Intent t(MenstrualCycleDetailsActivity menstrualCycleDetailsActivity);

    void u(Context context);

    void v(androidx.fragment.app.m mVar);

    void w(MenstrualCycleDetailsActivity menstrualCycleDetailsActivity);

    void x();

    void y(Context context);

    void z(MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity);
}
