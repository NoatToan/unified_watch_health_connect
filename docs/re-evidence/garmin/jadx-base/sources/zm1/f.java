package zm1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzm1/f;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "averageRespiration", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Double;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f205304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f205305b;

    public f(LocalDate localDate, Double d14) {
        this.f205304a = localDate;
        this.f205305b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f205304a, fVar.f205304a) && p005kotlin.jvm.internal.s.g(this.f205305b, fVar.f205305b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f205304a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Double d14 = this.f205305b;
        return iHashCode + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        return "RespirationValue(calendarDate=" + this.f205304a + ", averageRespiration=" + this.f205305b + ")";
    }
}
