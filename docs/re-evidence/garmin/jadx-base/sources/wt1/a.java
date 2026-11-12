package wt1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.training.CompletedTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;
import com.garmin.android.apps.connectmobile.training.atp.schedule.WorkoutScheduleActivity;
import org.joda.time.DateTime;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    static /* synthetic */ void g(a aVar, com.garmin.android.apps.connectmobile.c cVar, int i14, DateTime dateTime, DateTime dateTime2, String str, xw1.k kVar, int i15) {
        if ((i15 & 32) != 0) {
            kVar = null;
        }
        aVar.m(cVar, i14, dateTime, dateTime2, str, kVar, Integer.valueOf(zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal()));
    }

    long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> interfaceC0995b);

    Context b();

    void c(Activity activity, long j8, boolean z14, String str);

    boolean d();

    void e(WorkoutScheduleActivity workoutScheduleActivity, long j8, String str);

    void f(androidx.fragment.app.m mVar);

    UserSettingsDTO getUserSettings();

    void h();

    void i(androidx.fragment.app.m mVar, boolean z14);

    void j(CompletedTrainingPlansActivity completedTrainingPlansActivity, long j8);

    void k(Activity activity);

    boolean l();

    void m(androidx.fragment.app.m mVar, int i14, DateTime dateTime, DateTime dateTime2, String str, xw1.k kVar, Integer num);

    void n(RecyclerView.f0 f0Var, fu1.m mVar, fu1.d dVar, cu1.a.b bVar);

    void o(WorkoutScheduleActivity workoutScheduleActivity);

    void p(ActiveTrainingPlansActivity activeTrainingPlansActivity);

    void q(androidx.fragment.app.m mVar, long j8, long j14, boolean z14);

    void r(com.garmin.android.apps.connectmobile.c cVar, long j8, boolean z14, boolean z15, int i14);

    boolean s();

    void t(TrainingPlanDashboardActivity trainingPlanDashboardActivity, int i14, Bundle bundle);

    hm.a u(View view2);
}
