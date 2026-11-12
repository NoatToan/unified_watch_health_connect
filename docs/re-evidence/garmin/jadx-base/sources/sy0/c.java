package sy0;

import am.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsy0/c;", "", "Li53/d;", "", "Lam/i2;", "stats", "<init>", "(Li53/d;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.d<String, i53.d<String, i2>> f161206a;

    /* JADX WARN: Multi-variable type inference failed */
    public c(i53.d<String, ? extends i53.d<String, i2>> dVar) {
        dVar.getClass();
        this.f161206a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f161206a.equals(((c) obj).f161206a);
    }

    public final int hashCode() {
        return this.f161206a.hashCode();
    }

    public final String toString() {
        return "ActivityDetailedStatsUiState(stats=" + this.f161206a + ")";
    }
}
