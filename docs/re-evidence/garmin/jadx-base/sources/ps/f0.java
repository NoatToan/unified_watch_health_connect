package ps;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lps/f0;", "", "", "latitude", "longitude", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f139812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f139813b;

    public /* synthetic */ f0(Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.f139812a, f0Var.f139812a) && p005kotlin.jvm.internal.s.g(this.f139813b, f0Var.f139813b);
    }

    public final int hashCode() {
        Double d14 = this.f139812a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f139813b;
        return iHashCode + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        return "CoordinatesMetric(latitude=" + this.f139812a + ", longitude=" + this.f139813b + ")";
    }

    public f0(Double d14, Double d15) {
        this.f139812a = d14;
        this.f139813b = d15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
