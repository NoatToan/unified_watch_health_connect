package nr;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lnr/n0;", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;", "roundsDTO", "Lps/s0;", "exerciseSetsDTO", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseListDTO", "", "showMuscleMapHint", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/f;Lps/s0;Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.f f127265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps.s0 f127266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.c f127267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127268d;

    static {
        com.garmin.android.apps.connectmobile.repcounting.model.c.b bVar = com.garmin.android.apps.connectmobile.repcounting.model.c.f41095b;
        Parcelable.Creator<ps.s0> creator = ps.s0.CREATOR;
        Parcelable.Creator<com.garmin.android.apps.connectmobile.activities.newmodel.f> creator2 = com.garmin.android.apps.connectmobile.activities.newmodel.f.CREATOR;
    }

    public /* synthetic */ n0(com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, ps.s0 s0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : fVar, (i14 & 2) != 0 ? null : s0Var, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127265a, n0Var.f127265a) && p005kotlin.jvm.internal.s.g(this.f127266b, n0Var.f127266b) && p005kotlin.jvm.internal.s.g(this.f127267c, n0Var.f127267c) && this.f127268d == n0Var.f127268d;
    }

    public final int hashCode() {
        com.garmin.android.apps.connectmobile.activities.newmodel.f fVar = this.f127265a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        ps.s0 s0Var = this.f127266b;
        int iHashCode2 = (iHashCode + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f127267c;
        return Boolean.hashCode(this.f127268d) + ((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RoundsExerciseSetsData(roundsDTO=" + this.f127265a + ", exerciseSetsDTO=" + this.f127266b + ", exerciseListDTO=" + this.f127267c + ", showMuscleMapHint=" + this.f127268d + ")";
    }

    public n0(com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, ps.s0 s0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, boolean z14) {
        this.f127265a = fVar;
        this.f127266b = s0Var;
        this.f127267c = cVar;
        this.f127268d = z14;
    }

    public n0() {
        this(null, null, null, false, 15, null);
    }
}
