package c62;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsActivity;
import java.util.Calendar;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements r22.c0.b, com.garmin.android.apps.connectmobile.q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WorkoutDetailsActivity f24906b;

    public /* synthetic */ u(WorkoutDetailsActivity workoutDetailsActivity, int i14) {
        this.f24905a = i14;
        this.f24906b = workoutDetailsActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        WorkoutScheduleDTO workoutScheduleDTO;
        WorkoutDetailsDTO workoutDetailsDTO;
        WorkoutDetailsDTO workoutDetailsDTO2;
        int i14 = this.f24905a;
        WorkoutDetailsActivity workoutDetailsActivity = this.f24906b;
        switch (i14) {
            case 1:
                WorkoutDetailsActivity.a aVar = WorkoutDetailsActivity.f48482f;
                if (z14 && (workoutScheduleDTO = workoutDetailsActivity.ea().f48606t) != null && (workoutDetailsDTO = workoutScheduleDTO.f48065a) != null) {
                    long j8 = workoutDetailsDTO.Y;
                    WorkoutScheduleDTO workoutScheduleDTO2 = workoutDetailsActivity.ea().f48606t;
                    if (workoutScheduleDTO2 != null) {
                        workoutDetailsActivity.ea().b5(j8, workoutScheduleDTO2.f48067c);
                    }
                    break;
                }
                break;
            case 2:
                WorkoutDetailsActivity.a aVar2 = WorkoutDetailsActivity.f48482f;
                if (z14 && workoutDetailsActivity.getIntent().getExtras() != null) {
                    Bundle extras = workoutDetailsActivity.getIntent().getExtras();
                    Long lValueOf = extras != null ? Long.valueOf(extras.getLong("GCM_workout_schedule_id")) : null;
                    WorkoutDetailsDTO workoutDetailsDTO3 = workoutDetailsActivity.ea().f48605r;
                    if (workoutDetailsDTO3 != null) {
                        long j14 = workoutDetailsDTO3.Y;
                        if (lValueOf != null) {
                            workoutDetailsActivity.ea().b5(j14, lValueOf.longValue());
                        }
                    }
                    break;
                }
                break;
            default:
                WorkoutDetailsActivity.a aVar3 = WorkoutDetailsActivity.f48482f;
                if (z14) {
                    WorkoutScheduleDTO workoutScheduleDTO3 = workoutDetailsActivity.ea().f48606t;
                    Long lValueOf2 = (workoutScheduleDTO3 == null || (workoutDetailsDTO2 = workoutScheduleDTO3.f48065a) == null) ? null : Long.valueOf(workoutDetailsDTO2.f48055o);
                    WorkoutScheduleDTO workoutScheduleDTO4 = workoutDetailsActivity.ea().f48606t;
                    Long lValueOf3 = workoutScheduleDTO4 != null ? Long.valueOf(workoutScheduleDTO4.f48067c) : null;
                    if (lValueOf2 != null && lValueOf3 != null) {
                        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = workoutDetailsActivity.ea();
                        ge1.b.T(androidx.lifecycle.v1.a(fVarEa), null, null, new j2(fVarEa, lValueOf2.longValue(), lValueOf3.longValue(), null), 3);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r22.c0.b
    public void h(Calendar calendar) {
        WorkoutDetailsActivity.a aVar = WorkoutDetailsActivity.f48482f;
        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVarEa = this.f24906b.ea();
        long timeInMillis = calendar.getTimeInMillis();
        w9.a aVarA = androidx.lifecycle.v1.a(fVarEa);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.j(timeInMillis, fVarEa, null), 2);
    }
}
