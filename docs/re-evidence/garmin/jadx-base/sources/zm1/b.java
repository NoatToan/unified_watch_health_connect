package zm1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzm1/b;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "hrv7dAvg", "", "hrvStatus", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Double;Ljava/lang/String;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f205294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f205295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205296c;

    public b(LocalDate localDate, Double d14, String str) {
        this.f205294a = localDate;
        this.f205295b = d14;
        this.f205296c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f205294a, bVar.f205294a) && p005kotlin.jvm.internal.s.g(this.f205295b, bVar.f205295b) && p005kotlin.jvm.internal.s.g(this.f205296c, bVar.f205296c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f205294a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Double d14 = this.f205295b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.f205296c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HrvStatusValue(calendarDate=");
        sb3.append(this.f205294a);
        sb3.append(", hrv7dAvg=");
        sb3.append(this.f205295b);
        sb3.append(", hrvStatus=");
        return am.j.o(this.f205296c, ")", sb3);
    }
}
