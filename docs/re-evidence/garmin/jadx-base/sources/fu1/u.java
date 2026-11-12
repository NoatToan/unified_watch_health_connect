package fu1;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDTO;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfu1/u;", "", "Lorg/joda/time/DateTime;", "date", "Lfu1/q;", "gradedWorkout", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;", "workoutDetail", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;", "activitySummary", "<init>", "(Lorg/joda/time/DateTime;Lfu1/q;Lcom/garmin/android/apps/connectmobile/workouts/data/model/WorkoutDTO;Lcom/garmin/android/apps/connectmobile/activities/newmodel/h;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f73556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f73557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkoutDTO f73558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f73559d;

    public /* synthetic */ u(DateTime dateTime, q qVar, WorkoutDTO workoutDTO, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dateTime, (i14 & 2) != 0 ? null : qVar, (i14 & 4) != 0 ? null : workoutDTO, (i14 & 8) != 0 ? null : hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f73556a, uVar.f73556a) && p005kotlin.jvm.internal.s.g(this.f73557b, uVar.f73557b) && p005kotlin.jvm.internal.s.g(this.f73558c, uVar.f73558c) && p005kotlin.jvm.internal.s.g(this.f73559d, uVar.f73559d);
    }

    public final int hashCode() {
        int iHashCode = this.f73556a.hashCode() * 31;
        q qVar = this.f73557b;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        WorkoutDTO workoutDTO = this.f73558c;
        int iHashCode3 = (iHashCode2 + (workoutDTO == null ? 0 : workoutDTO.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f73559d;
        return iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "ScheduledWorkoutItem(date=" + this.f73556a + ", gradedWorkout=" + this.f73557b + ", workoutDetail=" + this.f73558c + ", activitySummary=" + this.f73559d + ")";
    }

    public u(DateTime dateTime, q qVar, WorkoutDTO workoutDTO, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar) {
        dateTime.getClass();
        this.f73556a = dateTime;
        this.f73557b = qVar;
        this.f73558c = workoutDTO;
        this.f73559d = hVar;
    }
}
