package hz;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBC\b\u0016\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhz/c;", "", "Lorg/joda/time/LocalDate;", "calendarStartDate", "calendarEndDate", "Lorg/joda/time/DateTime;", "startDateTimeGMT", "endDateTimeGMT", "endDateTimeLocal", "", "measurementStepMinutes", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;I)V", "calendarDate", "(Lorg/joda/time/LocalDate;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f86382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f86383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f86384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DateTime f86385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f86386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f86387f;

    public /* synthetic */ c(LocalDate localDate, LocalDate localDate2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? null : localDate2, (i15 & 4) != 0 ? null : dateTime, (i15 & 8) != 0 ? null : dateTime2, (i15 & 16) != 0 ? null : dateTime3, (i15 & 32) != 0 ? 1 : i14);
    }

    public final b a() {
        DateTime dateTimeMinusMinutes;
        LocalDate localDatePlusDays;
        DateTime dateTime = this.f86386e;
        DateTime dateTime2 = this.f86385d;
        DateTimeZone dateTimeZoneB = nz.a.b(dateTime2, dateTime);
        DateTime dateTimePlusMinutes = null;
        DateTime dateTimeWithZone = dateTime2 != null ? dateTime2.withZone(dateTimeZoneB) : null;
        LocalDate localDate = this.f86383b;
        DateTime dateTimeAtStartOfDay = (localDate == null || (localDatePlusDays = localDate.plusDays(1)) == null) ? null : localDatePlusDays.toDateTimeAtStartOfDay(dateTimeZoneB);
        if (dateTimeAtStartOfDay != null && (dateTimeWithZone == null || !dateTimeWithZone.isAfter(dateTimeAtStartOfDay))) {
            dateTimeWithZone = dateTimeAtStartOfDay;
        }
        DateTime dateTime3 = this.f86384c;
        DateTime dateTimeWithZone2 = dateTime3 != null ? dateTime3.withZone(dateTimeZoneB) : null;
        LocalDate localDate2 = this.f86382a;
        DateTime dateTimeAtStartOfDay2 = localDate2 != null ? localDate2.toDateTimeAtStartOfDay(dateTimeZoneB) : null;
        if (dateTimeAtStartOfDay2 != null && (dateTimeWithZone2 == null || !dateTimeWithZone2.isBefore(dateTimeAtStartOfDay2))) {
            dateTimeWithZone2 = dateTimeAtStartOfDay2;
        }
        int i14 = this.f86387f;
        if (dateTimeWithZone2 == null || dateTimeWithZone == null) {
            dateTimeMinusMinutes = null;
        } else {
            int minutes = Minutes.minutesBetween(dateTimeWithZone2, dateTimeWithZone).getMinutes() % i14;
            dateTimeMinusMinutes = dateTimeWithZone2.minusMinutes(minutes > 0 ? i14 - minutes : 0);
        }
        DateTime dateTimeWithZone3 = dateTime2 != null ? dateTime2.withZone(dateTimeZoneB) : null;
        if (dateTimeWithZone != null && dateTimeWithZone3 != null) {
            dateTimePlusMinutes = dateTimeWithZone3.plusMinutes(Minutes.minutesBetween(dateTimeWithZone3, dateTimeWithZone).getMinutes() % i14);
        }
        return new b(dateTimeMinusMinutes, dateTimeWithZone, dateTimePlusMinutes, dateTimeZoneB);
    }

    public c(LocalDate localDate, LocalDate localDate2, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i14) {
        this.f86382a = localDate;
        this.f86383b = localDate2;
        this.f86384c = dateTime;
        this.f86385d = dateTime2;
        this.f86386e = dateTime3;
        this.f86387f = i14;
    }

    public c() {
        this(null, null, null, null, null, 0, 63, null);
    }

    public /* synthetic */ c(LocalDate localDate, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? null : dateTime, (i15 & 4) != 0 ? null : dateTime2, (i15 & 8) != 0 ? null : dateTime3, (i15 & 16) != 0 ? 1 : i14);
    }

    public c(LocalDate localDate, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i14) {
        this(localDate, localDate, dateTime, dateTime2, dateTime3, i14);
    }
}
