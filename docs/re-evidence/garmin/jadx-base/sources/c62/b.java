package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc62/b;", "", "", "deviceUnitId", "", "deviceName", "Lc62/m2;", "workoutSport", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z;", "workoutType", "<init>", "(JLjava/lang/String;Lc62/m2;Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/z;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2 f24685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.presentation.details.z f24686d;

    public b(long j8, String str, m2 m2Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.z zVar) {
        m2Var.getClass();
        zVar.getClass();
        this.f24683a = j8;
        this.f24684b = str;
        this.f24685c = m2Var;
        this.f24686d = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24683a == bVar.f24683a && p005kotlin.jvm.internal.s.g(this.f24684b, bVar.f24684b) && this.f24685c.equals(bVar.f24685c) && this.f24686d.equals(bVar.f24686d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f24683a) * 31;
        String str = this.f24684b;
        return this.f24686d.hashCode() + ((this.f24685c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f24683a, "LoadWorkoutData(deviceUnitId=", ", deviceName=", this.f24684b);
        sbK.append(", workoutSport=");
        sbK.append(this.f24685c);
        sbK.append(", workoutType=");
        sbK.append(this.f24686d);
        sbK.append(")");
        return sbK.toString();
    }
}
