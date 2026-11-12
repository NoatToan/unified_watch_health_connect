package ym1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lym1/d;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "totalSleepTimeSeconds", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Integer;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f198111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f198112b;

    public d(LocalDate localDate, Integer num) {
        this.f198111a = localDate;
        this.f198112b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f198111a, dVar.f198111a) && s.g(this.f198112b, dVar.f198112b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f198111a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Integer num = this.f198112b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SleepDurationValue(calendarDate=" + this.f198111a + ", totalSleepTimeSeconds=" + this.f198112b + ")";
    }
}
