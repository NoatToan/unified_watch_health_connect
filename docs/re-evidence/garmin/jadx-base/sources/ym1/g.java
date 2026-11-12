package ym1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lym1/g;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "sleepNeedSeconds", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Integer;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f198127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f198128b;

    public g(LocalDate localDate, Integer num) {
        this.f198127a = localDate;
        this.f198128b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f198127a, gVar.f198127a) && s.g(this.f198128b, gVar.f198128b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f198127a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Integer num = this.f198128b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SleepNeedValue(calendarDate=" + this.f198127a + ", sleepNeedSeconds=" + this.f198128b + ")";
    }
}
