package hz;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhz/f;", "", "Lorg/joda/time/DateTime;", "sleepStartDateGMT", "sleepEndDateGMT", "tomorrowSleepStartDateGMT", "tomorrowSleepEndDateGMT", "Lorg/joda/time/DateTimeZone;", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTimeZone;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f86391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f86392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f86393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f86394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTimeZone f86395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DateTime f86396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f86397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f86398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final DateTime f86399i;

    public f(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTimeZone dateTimeZone) {
        this.f86391a = dateTime;
        this.f86392b = dateTime2;
        this.f86393c = dateTime3;
        this.f86394d = dateTime4;
        this.f86395e = dateTimeZone;
        this.f86396f = dateTime != null ? dateTime.withZone(dateTimeZone) : null;
        this.f86397g = dateTime2 != null ? dateTime2.withZone(dateTimeZone) : null;
        this.f86398h = dateTime3 != null ? dateTime3.withZone(dateTimeZone) : null;
        this.f86399i = dateTime4 != null ? dateTime4.withZone(dateTimeZone) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f86391a, fVar.f86391a) && s.g(this.f86392b, fVar.f86392b) && s.g(this.f86393c, fVar.f86393c) && s.g(this.f86394d, fVar.f86394d) && s.g(this.f86395e, fVar.f86395e);
    }

    public final int hashCode() {
        DateTime dateTime = this.f86391a;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.f86392b;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.f86393c;
        int iHashCode3 = (iHashCode2 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.f86394d;
        int iHashCode4 = (iHashCode3 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        DateTimeZone dateTimeZone = this.f86395e;
        return iHashCode4 + (dateTimeZone != null ? dateTimeZone.hashCode() : 0);
    }

    public final String toString() {
        return "DailySleepChartDates(sleepStartDateGMT=" + this.f86391a + ", sleepEndDateGMT=" + this.f86392b + ", tomorrowSleepStartDateGMT=" + this.f86393c + ", tomorrowSleepEndDateGMT=" + this.f86394d + ", timeZone=" + this.f86395e + ")";
    }

    public f() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ f(DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTimeZone dateTimeZone, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : dateTime2, (i14 & 4) != 0 ? null : dateTime3, (i14 & 8) != 0 ? null : dateTime4, (i14 & 16) != 0 ? null : dateTimeZone);
    }
}
