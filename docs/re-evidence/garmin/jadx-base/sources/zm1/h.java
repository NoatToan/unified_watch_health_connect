package zm1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzm1/h;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "avgDeviationCelsius", "avgDeviationFahrenheit", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f205308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f205309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f205310c;

    public h(LocalDate localDate, Double d14, Double d15) {
        this.f205308a = localDate;
        this.f205309b = d14;
        this.f205310c = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f205308a, hVar.f205308a) && p005kotlin.jvm.internal.s.g(this.f205309b, hVar.f205309b) && p005kotlin.jvm.internal.s.g(this.f205310c, hVar.f205310c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f205308a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Double d14 = this.f205309b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f205310c;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SkinTempValue(calendarDate=");
        sb3.append(this.f205308a);
        sb3.append(", avgDeviationCelsius=");
        sb3.append(this.f205309b);
        sb3.append(", avgDeviationFahrenheit=");
        return b71.i.g(sb3, this.f205310c, ")");
    }
}
