package rm1;

import c22.i0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB)\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lrm1/b;", "", "Lorg/joda/time/DateTime;", TtmlNode.START, TtmlNode.END, "Lorg/joda/time/DateTimeZone;", "startOriginalTimeZone", "endOriginalTimeZone", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTimeZone;Lorg/joda/time/DateTimeZone;)V", "", "startTimestampGmt", "startTimestampLocal", "endTimestampGmt", "endTimestampLocal", "(JJJJ)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f153532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f153533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTimeZone f153534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTimeZone f153535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f153536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f153537f;

    public b(long j8, long j14, long j15, long j16) {
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        DateTime dateTime = new DateTime(j8, dateTimeZone);
        i0.f23086a.getClass();
        DateTime dateTimeWithZone = dateTime.withZone(i0.a(j8, j14));
        dateTimeWithZone.getClass();
        DateTime dateTimeWithZone2 = new DateTime(j15, dateTimeZone).withZone(i0.a(j15, j16));
        dateTimeWithZone2.getClass();
        this(dateTimeWithZone, dateTimeWithZone2, null, null, 12, null);
    }

    public static b a(b bVar, DateTime dateTime) {
        DateTime dateTime2 = bVar.f153533b;
        DateTimeZone dateTimeZone = bVar.f153534c;
        DateTimeZone dateTimeZone2 = bVar.f153535d;
        dateTime2.getClass();
        dateTimeZone.getClass();
        dateTimeZone2.getClass();
        return new b(dateTime, dateTime2, dateTimeZone, dateTimeZone2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f153532a, bVar.f153532a) && s.g(this.f153533b, bVar.f153533b) && s.g(this.f153534c, bVar.f153534c) && s.g(this.f153535d, bVar.f153535d);
    }

    public final int hashCode() {
        return this.f153535d.hashCode() + ((this.f153534c.hashCode() + e0.a(this.f153532a.hashCode() * 31, this.f153533b, 31)) * 31);
    }

    public final String toString() {
        return "DataInterval(start=" + this.f153532a + ", end=" + this.f153533b + ", startOriginalTimeZone=" + this.f153534c + ", endOriginalTimeZone=" + this.f153535d + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(DateTime dateTime, DateTime dateTime2, DateTimeZone dateTimeZone, DateTimeZone dateTimeZone2, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            dateTimeZone = dateTime.getZone();
            dateTimeZone.getClass();
        }
        if ((i14 & 8) != 0) {
            dateTimeZone2 = dateTime2.getZone();
            dateTimeZone2.getClass();
        }
        this(dateTime, dateTime2, dateTimeZone, dateTimeZone2);
    }

    public b(DateTime dateTime, DateTime dateTime2, DateTimeZone dateTimeZone, DateTimeZone dateTimeZone2) {
        dateTime.getClass();
        dateTime2.getClass();
        dateTimeZone.getClass();
        dateTimeZone2.getClass();
        this.f153532a = dateTime;
        this.f153533b = dateTime2;
        this.f153534c = dateTimeZone;
        this.f153535d = dateTimeZone2;
        DateTime dateTimeWithZone = dateTime.withZone(dateTimeZone);
        dateTimeWithZone.getClass();
        this.f153536e = dateTimeWithZone;
        DateTime dateTimeWithZone2 = dateTime2.withZone(dateTimeZone2);
        dateTimeWithZone2.getClass();
        this.f153537f = dateTimeWithZone2;
    }
}
