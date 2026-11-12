package c62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc62/o;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;", "workoutDetails", "", "", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListMap", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDetailsDTO;Ljava/util/Map;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkoutDetailsDTO f24821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Integer, com.garmin.android.apps.connectmobile.repcounting.model.c> f24822b;

    public o(WorkoutDetailsDTO workoutDetailsDTO, Map<Integer, com.garmin.android.apps.connectmobile.repcounting.model.c> map) {
        workoutDetailsDTO.getClass();
        map.getClass();
        this.f24821a = workoutDetailsDTO;
        this.f24822b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f24821a.equals(oVar.f24821a) && this.f24822b.equals(oVar.f24822b);
    }

    public final int hashCode() {
        return this.f24822b.hashCode() + (this.f24821a.hashCode() * 31);
    }

    public final String toString() {
        return "MultiSportsWorkoutDetails(workoutDetails=" + this.f24821a + ", exerciseListMap=" + this.f24822b + ")";
    }
}
