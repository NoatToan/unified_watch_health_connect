package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc62/c;", "", "", "isUnOwned", "", "ownedWorkoutId", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/p;", "headerItemInfo", "<init>", "(ZJLcom/garmin/android/apps/connectmobile/workouts/data/model/p;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.workouts.data.model.p f24692c;

    public c(boolean z14, long j8, com.garmin.android.apps.connectmobile.workouts.data.model.p pVar) {
        pVar.getClass();
        this.f24690a = z14;
        this.f24691b = j8;
        this.f24692c = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24690a == cVar.f24690a && this.f24691b == cVar.f24691b && this.f24692c.equals(cVar.f24692c);
    }

    public final int hashCode() {
        return this.f24692c.hashCode() + q6.f.e(Boolean.hashCode(this.f24690a) * 31, 31, this.f24691b);
    }

    public final String toString() {
        return "MSNWorkoutInfo(isUnOwned=" + this.f24690a + ", ownedWorkoutId=" + this.f24691b + ", headerItemInfo=" + this.f24692c + ")";
    }
}
