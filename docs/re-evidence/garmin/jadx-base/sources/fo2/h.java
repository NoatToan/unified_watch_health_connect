package fo2;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfo2/h;", "", "Lorg/joda/time/LocalDate;", "activeDate", "validDate", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f72983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f72984b;

    public h(LocalDate localDate, LocalDate localDate2) {
        localDate.getClass();
        localDate2.getClass();
        this.f72983a = localDate;
        this.f72984b = localDate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f72983a.equals(hVar.f72983a) && this.f72984b.equals(hVar.f72984b);
    }

    public final int hashCode() {
        return this.f72984b.hashCode() + (this.f72983a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpirationDates(activeDate=" + this.f72983a + ", validDate=" + this.f72984b + ")";
    }
}
