package sy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsy0/g;", "", "", "startDateMillis", "endDateMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f161219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f161220b;

    public /* synthetic */ g(Long l14, Long l15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f161219a, gVar.f161219a) && p005kotlin.jvm.internal.s.g(this.f161220b, gVar.f161220b);
    }

    public final int hashCode() {
        Long l14 = this.f161219a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f161220b;
        return iHashCode + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        return "DateRangeSelectionState(startDateMillis=" + this.f161219a + ", endDateMillis=" + this.f161220b + ")";
    }

    public g(Long l14, Long l15) {
        this.f161219a = l14;
        this.f161220b = l15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
