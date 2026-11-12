package zm1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzm1/a;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "bodyBatteryChange", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Integer;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f205292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f205293b;

    public a(LocalDate localDate, Integer num) {
        this.f205292a = localDate;
        this.f205293b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f205292a, aVar.f205292a) && p005kotlin.jvm.internal.s.g(this.f205293b, aVar.f205293b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f205292a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Integer num = this.f205293b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "BodyBatteryChangeValue(calendarDate=" + this.f205292a + ", bodyBatteryChange=" + this.f205293b + ")";
    }
}
