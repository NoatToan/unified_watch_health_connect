package hz;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhz/b;", "", "Lorg/joda/time/DateTime;", "chartStartDateTime", "chartEndDateTime", "lastSyncedValueDateTime", "Lorg/joda/time/DateTimeZone;", "dateTimeZone", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTimeZone;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f86378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f86379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f86380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTimeZone f86381d;

    public b(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTimeZone dateTimeZone) {
        this.f86378a = dateTime;
        this.f86379b = dateTime2;
        this.f86380c = dateTime3;
        this.f86381d = dateTimeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f86378a, bVar.f86378a) && s.g(this.f86379b, bVar.f86379b) && s.g(this.f86380c, bVar.f86380c) && s.g(this.f86381d, bVar.f86381d);
    }

    public final int hashCode() {
        DateTime dateTime = this.f86378a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.f86379b;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.f86380c;
        int iHashCode3 = (iHashCode2 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTimeZone dateTimeZone = this.f86381d;
        return iHashCode3 + (dateTimeZone != null ? dateTimeZone.hashCode() : 0);
    }

    public final String toString() {
        return "ChartDateTimeInterval(chartStartDateTime=" + this.f86378a + ", chartEndDateTime=" + this.f86379b + ", lastSyncedValueDateTime=" + this.f86380c + ", dateTimeZone=" + this.f86381d + ")";
    }
}
