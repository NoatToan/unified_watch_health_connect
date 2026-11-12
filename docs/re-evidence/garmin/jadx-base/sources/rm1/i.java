package rm1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrm1/i;", "", "", "sleepActivityLevel", "Lorg/joda/time/DateTime;", "sleepStartTimestampGMT", "sleepEndTimestampGMT", "<init>", "(DLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f153582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f153583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f153584c;

    public i(double d14, DateTime dateTime, DateTime dateTime2) {
        this.f153582a = d14;
        this.f153583b = dateTime;
        this.f153584c = dateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Double.compare(this.f153582a, iVar.f153582a) == 0 && s.g(this.f153583b, iVar.f153583b) && s.g(this.f153584c, iVar.f153584c);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f153582a) * 31;
        DateTime dateTime = this.f153583b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f153584c;
        return iHashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public final String toString() {
        return "SleepChart(sleepActivityLevel=" + this.f153582a + ", sleepStartTimestampGMT=" + this.f153583b + ", sleepEndTimestampGMT=" + this.f153584c + ")";
    }
}
