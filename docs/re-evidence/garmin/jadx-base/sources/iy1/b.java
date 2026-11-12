package iy1;

import c83.a0;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import i83.f;
import i83.o;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Liy1/b;", "", "", "workoutId", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "b", "(J)Lo53/i0;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "benchmarks", "", "a", "(Ljava/util/List;)Lo53/i0;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("/workout-service/benchmarks/bulk")
    i0<a0<Unit>> a(@i83.a List<com.garmin.android.apps.connectmobile.workouts.data.model.b> benchmarks);

    @f("/workout-service/workout/{workoutId}")
    i0<a0<WorkoutDTO>> b(@s("workoutId") long workoutId);
}
