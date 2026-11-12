package c62;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import java.util.Calendar;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements r22.c0.b, com.garmin.android.apps.connectmobile.q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiSportsDetailsActivity f24710b;

    public /* synthetic */ d(MultiSportsDetailsActivity multiSportsDetailsActivity, int i14) {
        this.f24709a = i14;
        this.f24710b = multiSportsDetailsActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        WorkoutScheduleDTO workoutScheduleDTO;
        WorkoutDetailsDTO workoutDetailsDTO;
        WorkoutDetailsDTO workoutDetailsDTO2;
        int i14 = this.f24709a;
        MultiSportsDetailsActivity multiSportsDetailsActivity = this.f24710b;
        switch (i14) {
            case 1:
                MultiSportsDetailsActivity.a aVar = MultiSportsDetailsActivity.f48440z;
                if (z14 && (workoutScheduleDTO = multiSportsDetailsActivity.ea().f48606t) != null && (workoutDetailsDTO = workoutScheduleDTO.f48065a) != null) {
                    long j8 = workoutDetailsDTO.Y;
                    WorkoutScheduleDTO workoutScheduleDTO2 = multiSportsDetailsActivity.ea().f48606t;
                    if (workoutScheduleDTO2 != null) {
                        multiSportsDetailsActivity.ea().b5(j8, workoutScheduleDTO2.f48067c);
                    }
                    break;
                }
                break;
            case 2:
                MultiSportsDetailsActivity.a aVar2 = MultiSportsDetailsActivity.f48440z;
                if (z14 && multiSportsDetailsActivity.getIntent().getExtras() != null) {
                    Bundle extras = multiSportsDetailsActivity.getIntent().getExtras();
                    Long lValueOf = extras != null ? Long.valueOf(extras.getLong("GCM_workout_schedule_id")) : null;
                    WorkoutDetailsDTO workoutDetailsDTO3 = multiSportsDetailsActivity.ea().f48605r;
                    if (workoutDetailsDTO3 != null) {
                        long j14 = workoutDetailsDTO3.Y;
                        if (lValueOf != null) {
                            multiSportsDetailsActivity.ea().b5(j14, lValueOf.longValue());
                        }
                    }
                    break;
                }
                break;
            default:
                MultiSportsDetailsActivity.a aVar3 = MultiSportsDetailsActivity.f48440z;
                if (z14) {
                    WorkoutScheduleDTO workoutScheduleDTO3 = multiSportsDetailsActivity.ea().f48606t;
                    Long lValueOf2 = (workoutScheduleDTO3 == null || (workoutDetailsDTO2 = workoutScheduleDTO3.f48065a) == null) ? null : Long.valueOf(workoutDetailsDTO2.f48055o);
                    WorkoutScheduleDTO workoutScheduleDTO4 = multiSportsDetailsActivity.ea().f48606t;
                    Long lValueOf3 = workoutScheduleDTO4 != null ? Long.valueOf(workoutScheduleDTO4.f48067c) : null;
                    if (lValueOf2 != null && lValueOf3 != null) {
                        p pVarEa = multiSportsDetailsActivity.ea();
                        ge1.b.T(androidx.lifecycle.v1.a(pVarEa), null, null, new j2(pVarEa, lValueOf2.longValue(), lValueOf3.longValue(), null), 3);
                        break;
                    }
                }
                break;
        }
    }

    @Override // r22.c0.b
    public void h(Calendar calendar) {
        MultiSportsDetailsActivity.a aVar = MultiSportsDetailsActivity.f48440z;
        p pVarEa = this.f24710b.ea();
        long timeInMillis = calendar.getTimeInMillis();
        w9.a aVarA = androidx.lifecycle.v1.a(pVarEa);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.workouts.presentation.details.j(timeInMillis, pVarEa, null), 2);
    }
}
