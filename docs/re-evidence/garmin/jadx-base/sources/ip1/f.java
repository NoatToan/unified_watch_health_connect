package ip1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lip1/f;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "rideTimeGainedSec", "<init>", "(Lorg/joda/time/LocalDate;J)V", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f94684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f94685b;

    public f(LocalDate localDate, long j8) {
        localDate.getClass();
        this.f94684a = localDate;
        this.f94685b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f94684a.equals(fVar.f94684a) && this.f94685b == fVar.f94685b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f94685b) + (this.f94684a.hashCode() * 31);
    }

    public final String toString() {
        return "RideTimeGainedSummaryEntry(calendarDate=" + this.f94684a + ", rideTimeGainedSec=" + this.f94685b + ")";
    }
}
