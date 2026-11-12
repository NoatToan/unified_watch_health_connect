package c62;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc62/m2;", "", "", "workoutSportKey", "", "sportId", "subSportId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f24810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f24811c;

    public m2(String str, Integer num, Integer num2) {
        this.f24809a = str;
        this.f24810b = num;
        this.f24811c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return p005kotlin.jvm.internal.s.g(this.f24809a, m2Var.f24809a) && p005kotlin.jvm.internal.s.g(this.f24810b, m2Var.f24810b) && p005kotlin.jvm.internal.s.g(this.f24811c, m2Var.f24811c);
    }

    public final int hashCode() {
        String str = this.f24809a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f24810b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f24811c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return f3.i(lc.u0.n("WorkoutSport(workoutSportKey=", this.f24810b, this.f24809a, ", sportId=", ", subSportId="), this.f24811c, ")");
    }
}
