package zm1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzm1/d;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "overnightHeartRate", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Double;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f205300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f205301b;

    public d(LocalDate localDate, Double d14) {
        this.f205300a = localDate;
        this.f205301b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f205300a, dVar.f205300a) && p005kotlin.jvm.internal.s.g(this.f205301b, dVar.f205301b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f205300a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Double d14 = this.f205301b;
        return iHashCode + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        return "OvernightHeartRateValue(calendarDate=" + this.f205300a + ", overnightHeartRate=" + this.f205301b + ")";
    }
}
