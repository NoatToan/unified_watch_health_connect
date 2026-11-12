package zm1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzm1/q;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "sleepScore", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Integer;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f205329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f205330b;

    public q(LocalDate localDate, Integer num) {
        this.f205329a = localDate;
        this.f205330b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.f205329a, qVar.f205329a) && p005kotlin.jvm.internal.s.g(this.f205330b, qVar.f205330b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f205329a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Integer num = this.f205330b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "SleepScoreValue(calendarDate=" + this.f205329a + ", sleepScore=" + this.f205330b + ")";
    }
}
