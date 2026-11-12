package pr0;

import am.x0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lpr0/c;", "", "Lam/x0;", "activityType", "", "event", "Lorg/joda/time/DateTime;", "startTimeGMT", "Lorg/joda/time/DateTimeZone;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "<init>", "(Lam/x0;ZLorg/joda/time/DateTime;Lorg/joda/time/DateTimeZone;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f139604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f139605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f139606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTimeZone f139607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f139608e;

    public c(x0 x0Var, boolean z14, DateTime dateTime, DateTimeZone dateTimeZone) {
        x0Var.getClass();
        this.f139604a = x0Var;
        this.f139605b = z14;
        this.f139606c = dateTime;
        this.f139607d = dateTimeZone;
        this.f139608e = dateTime != null ? dateTime.withZone(dateTimeZone) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f139604a == cVar.f139604a && this.f139605b == cVar.f139605b && s.g(this.f139606c, cVar.f139606c) && s.g(this.f139607d, cVar.f139607d);
    }

    public final int hashCode() {
        int iG = q6.f.g(this.f139604a.hashCode() * 31, 31, this.f139605b);
        DateTime dateTime = this.f139606c;
        int iHashCode = (iG + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTimeZone dateTimeZone = this.f139607d;
        return iHashCode + (dateTimeZone != null ? dateTimeZone.hashCode() : 0);
    }

    public final String toString() {
        return "DailyChartActivity(activityType=" + this.f139604a + ", event=" + this.f139605b + ", startTimeGMT=" + this.f139606c + ", timeZone=" + this.f139607d + ")";
    }

    public /* synthetic */ c(x0 x0Var, boolean z14, DateTime dateTime, DateTimeZone dateTimeZone, int i14, p005kotlin.jvm.internal.j jVar) {
        this(x0Var, z14, (i14 & 4) != 0 ? null : dateTime, (i14 & 8) != 0 ? null : dateTimeZone);
    }
}
