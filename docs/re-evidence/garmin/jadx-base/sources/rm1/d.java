package rm1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrm1/d;", "", "", "startTimeGMT", "", "respirationValue", "<init>", "(JLjava/lang/Double;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f153542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f153543b;

    public d(long j8, Double d14) {
        this.f153542a = j8;
        this.f153543b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f153542a == dVar.f153542a && s.g(this.f153543b, dVar.f153543b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f153542a) * 31;
        Double d14 = this.f153543b;
        return iHashCode + (d14 == null ? 0 : d14.hashCode());
    }

    public final String toString() {
        return "RespirationEvent(startTimeGMT=" + this.f153542a + ", respirationValue=" + this.f153543b + ")";
    }
}
