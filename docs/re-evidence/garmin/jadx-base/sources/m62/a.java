package m62;

import androidx.lifecycle.m;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.schedule.ScheduleWorkoutTypeActivity;
import fw.p;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduleWorkoutTypeActivity f116888b;

    public /* synthetic */ a(ScheduleWorkoutTypeActivity scheduleWorkoutTypeActivity, int i14) {
        this.f116887a = i14;
        this.f116888b = scheduleWorkoutTypeActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f116887a;
        ScheduleWorkoutTypeActivity scheduleWorkoutTypeActivity = this.f116888b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = ScheduleWorkoutTypeActivity.f49542g;
                p pVar = g3Var.f35300a;
                if (pVar == p.LOADING) {
                    scheduleWorkoutTypeActivity.showProgressOverlay();
                } else if (pVar == p.SUCCESS) {
                    WorkoutScheduleDTO workoutScheduleDTO = (WorkoutScheduleDTO) g3Var.f35301b;
                    g gVar = scheduleWorkoutTypeActivity.f49546d;
                    int i16 = gVar.f116908c;
                    if (i16 == -1) {
                        scheduleWorkoutTypeActivity.hideProgressOverlay();
                        scheduleWorkoutTypeActivity.setResult(-1);
                        scheduleWorkoutTypeActivity.finish();
                    } else {
                        long jLongValue = (i16 == -1 ? null : gVar.f116906a.get(i16)).f48074a.longValue();
                        long j8 = workoutScheduleDTO.f48067c;
                        long j14 = scheduleWorkoutTypeActivity.f49544b;
                        d dVar = scheduleWorkoutTypeActivity.f49543a;
                        DateTime dateTime = new DateTime(j14);
                        dVar.getClass();
                        m.a(null, new c(dateTime, dVar, jLongValue, j8, null), 3).f(scheduleWorkoutTypeActivity, new a(scheduleWorkoutTypeActivity, 1));
                    }
                } else if (pVar == p.ERROR) {
                    scheduleWorkoutTypeActivity.hideProgressOverlay();
                    scheduleWorkoutTypeActivity.displayFailedMessage();
                }
                break;
            default:
                int i17 = ScheduleWorkoutTypeActivity.f49542g;
                p pVar2 = g3Var.f35300a;
                if (pVar2 == p.LOADING) {
                    scheduleWorkoutTypeActivity.showProgressOverlay();
                } else if (pVar2 == p.SUCCESS) {
                    scheduleWorkoutTypeActivity.hideProgressOverlay();
                    scheduleWorkoutTypeActivity.setResult(-1);
                    scheduleWorkoutTypeActivity.finish();
                } else if (pVar2 == p.ERROR) {
                    scheduleWorkoutTypeActivity.hideProgressOverlay();
                    scheduleWorkoutTypeActivity.displayFailedMessage();
                }
                break;
        }
    }
}
