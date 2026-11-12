package zm1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzm1/e;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "averageSpO2", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Double;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f205302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f205303b;

    public e(LocalDate localDate, Double d14) {
        this.f205302a = localDate;
        this.f205303b = d14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f205302a, eVar.f205302a) && p005kotlin.jvm.internal.s.g(this.f205303b, eVar.f205303b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f205302a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Double d14 = this.f205303b;
        return iHashCode + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        return "PulseOxValue(calendarDate=" + this.f205302a + ", averageSpO2=" + this.f205303b + ")";
    }
}
