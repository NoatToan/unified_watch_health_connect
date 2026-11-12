package dc1;

import c22.t;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldc1/d;", "", "", "timestamp", "", "value", "<init>", "(JD)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f59143b;

    public d(long j8, double d14) {
        this.f59142a = j8;
        this.f59143b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f59142a == dVar.f59142a && Double.compare(this.f59143b, dVar.f59143b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f59143b) + (Long.hashCode(this.f59142a) * 31);
    }

    public final String toString() {
        return t.d(this.f59143b, ")", e0.k(this.f59142a, "SpO2HourlyAverage(timestamp=", ", value="));
    }
}
