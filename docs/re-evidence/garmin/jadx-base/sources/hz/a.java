package hz;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhz/a;", "", "Lorg/joda/time/LocalDate;", "chartStartDateTime", "chartEndDateTime", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f86376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f86377b;

    public a(LocalDate localDate, LocalDate localDate2) {
        this.f86376a = localDate;
        this.f86377b = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f86376a, aVar.f86376a) && s.g(this.f86377b, aVar.f86377b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f86376a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f86377b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    public final String toString() {
        return "ChartDateInterval(chartStartDateTime=" + this.f86376a + ", chartEndDateTime=" + this.f86377b + ")";
    }
}
