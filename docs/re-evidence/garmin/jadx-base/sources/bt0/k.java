package bt0;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbt0/k;", "", "Lorg/joda/time/DateTime;", "date", "", "value", "<init>", "(Lorg/joda/time/DateTime;D)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f21084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f21085b;

    public k(DateTime dateTime, double d14) {
        dateTime.getClass();
        this.f21084a = dateTime;
        this.f21085b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f21084a.equals(kVar.f21084a) && Double.compare(this.f21085b, kVar.f21085b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f21085b) + (this.f21084a.hashCode() * 31);
    }

    public final String toString() {
        return "SportSpecificLTChartShortSummary(date=" + this.f21084a + ", value=" + this.f21085b + ")";
    }
}
