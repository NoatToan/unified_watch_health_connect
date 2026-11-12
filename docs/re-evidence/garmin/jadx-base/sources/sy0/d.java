package sy0;

import am.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsy0/d;", "", "", "countOfActivities", "Li53/d;", "", "Lam/i2;", "allStats", "<init>", "(ILi53/d;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.d<String, i2> f161208b;

    public d(int i14, i53.d<String, i2> dVar) {
        dVar.getClass();
        this.f161207a = i14;
        this.f161208b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f161207a == dVar.f161207a && this.f161208b.equals(dVar.f161208b);
    }

    public final int hashCode() {
        return this.f161208b.hashCode() + (Integer.hashCode(this.f161207a) * 31);
    }

    public final String toString() {
        return "ActivityOverviewStatsUiState(countOfActivities=" + this.f161207a + ", allStats=" + this.f161208b + ")";
    }
}
