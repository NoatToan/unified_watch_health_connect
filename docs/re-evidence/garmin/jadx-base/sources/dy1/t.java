package dy1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ldy1/t;", "", "", "showNextWorkout", "Ldy1/i;", "nextWorkout", "showWorkoutSchedule", "", "remainingWorkoutsScheduledThisWeek", "Lkotlin/Function0;", "", "Lcom/garmin/android/apps/connectmobile/training/stp/presentation/composables/ButtonClicked;", "workoutScheduleClicked", "nextWorkoutClicked", "<init>", "(ZLdy1/i;ZLjava/lang/String;Le23/a;Le23/a;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f61633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f61634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f61635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f61636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f61637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.a<Unit> f61638f;

    public /* synthetic */ t(boolean z14, i iVar, boolean z15, String str, e23.a aVar, e23.a aVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? null : iVar, z15, (i14 & 8) != 0 ? null : str, aVar, (i14 & 32) != 0 ? null : aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f61633a == tVar.f61633a && p005kotlin.jvm.internal.s.g(this.f61634b, tVar.f61634b) && this.f61635c == tVar.f61635c && p005kotlin.jvm.internal.s.g(this.f61636d, tVar.f61636d) && p005kotlin.jvm.internal.s.g(this.f61637e, tVar.f61637e) && p005kotlin.jvm.internal.s.g(this.f61638f, tVar.f61638f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f61633a) * 31;
        i iVar = this.f61634b;
        int iG = q6.f.g((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f61635c);
        String str = this.f61636d;
        int iF = q6.f.f((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f61637e);
        e23.a<Unit> aVar = this.f61638f;
        return iF + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutScheduleDashboardState(showNextWorkout=");
        sb3.append(this.f61633a);
        sb3.append(", nextWorkout=");
        sb3.append(this.f61634b);
        sb3.append(", showWorkoutSchedule=");
        fb1.c.w(", remainingWorkoutsScheduledThisWeek=", this.f61636d, ", workoutScheduleClicked=", sb3, this.f61635c);
        sb3.append(this.f61637e);
        sb3.append(", nextWorkoutClicked=");
        sb3.append(this.f61638f);
        sb3.append(")");
        return sb3.toString();
    }

    public t(boolean z14, i iVar, boolean z15, String str, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        aVar.getClass();
        this.f61633a = z14;
        this.f61634b = iVar;
        this.f61635c = z15;
        this.f61636d = str;
        this.f61637e = aVar;
        this.f61638f = aVar2;
    }
}
