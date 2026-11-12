package g22;

import android.text.format.DateUtils;
import b63.u;
import b63.z;
import d53.w;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.IllegalInstantException;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static final DateTime A(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTimeWithMaximumValue = dateTime.millisOfDay().withMaximumValue();
        dateTimeWithMaximumValue.getClass();
        return dateTimeWithMaximumValue;
    }

    public static final DateTime B(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTimeWithMillisOfSecond = dateTime.withSecondOfMinute(0).withMillisOfSecond(0);
        dateTimeWithMillisOfSecond.getClass();
        return dateTimeWithMillisOfSecond;
    }

    public static final int a(DateTime dateTime, DateTime dateTime2) {
        dateTime.getClass();
        dateTime2.getClass();
        return Math.abs(Days.daysBetween(dateTime, dateTime2).getDays());
    }

    public static final DateTime b(int i14, DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTimeN = n(i14, dateTime);
        if (dateTime.toLocalDate().isEqual(dateTimeN.toLocalDate())) {
            DateTime dateTimePlusDays = dateTime.plusDays(6);
            dateTimePlusDays.getClass();
            return dateTimePlusDays;
        }
        DateTime dateTimeMinusDays = dateTimeN.minusDays(1);
        dateTimeMinusDays.getClass();
        return dateTimeMinusDays;
    }

    public static final boolean c(DateTime dateTime) {
        if (dateTime != null) {
            return dateTime.isBefore(DateTime.now().minusDays(1));
        }
        return false;
    }

    public static final boolean d(DateTime dateTime, DateTime dateTime2) {
        dateTime.getClass();
        return f(dateTime.plusDays(1), dateTime2);
    }

    public static final boolean e(DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        Interval interval = new Interval(dateTime2, dateTime3);
        return interval.contains(dateTime) || interval.getEnd().isEqual(dateTime);
    }

    public static final boolean f(DateTime dateTime, DateTime dateTime2) {
        if (dateTime != null && dateTime2 != null) {
            boolean z14 = dateTime.getYear() == dateTime2.getYear();
            boolean z15 = dateTime.getMonthOfYear() == dateTime2.getMonthOfYear();
            boolean z16 = dateTime.getDayOfMonth() == dateTime2.getDayOfMonth();
            if (z14 && z15 && z16) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(LocalDate localDate, LocalDate localDate2) {
        if (localDate != null && localDate2 != null) {
            boolean z14 = localDate.getYear() == localDate2.getYear();
            boolean z15 = localDate.getMonthOfYear() == localDate2.getMonthOfYear();
            boolean z16 = localDate.getDayOfMonth() == localDate2.getDayOfMonth();
            if (z14 && z15 && z16) {
                return true;
            }
        }
        return false;
    }

    public static final boolean h(DateTime dateTime, DateTime dateTime2) {
        if (dateTime == null || dateTime2 == null) {
            return false;
        }
        return f(dateTime, dateTime2) || dateTime.isBefore(dateTime2);
    }

    public static final boolean i(DateTime dateTime, DateTime dateTime2) {
        if (dateTime != null && dateTime2 != null) {
            boolean z14 = dateTime.getYear() == dateTime2.getYear();
            boolean z15 = dateTime.getWeekOfWeekyear() == dateTime2.getWeekOfWeekyear();
            if (z14 && z15) {
                return true;
            }
        }
        return false;
    }

    public static final boolean j(DateTime dateTime, DateTime dateTime2) {
        return (dateTime == null || dateTime2 == null || dateTime.getYear() != dateTime2.getYear()) ? false : true;
    }

    public static final boolean k(DateTime dateTime) {
        dateTime.getClass();
        return f(dateTime, new DateTime());
    }

    public static final boolean l(DateTime dateTime) {
        dateTime.getClass();
        return DateUtils.isToday(dateTime.getMillis() - 86400000);
    }

    public static final boolean m(LocalDate localDate) {
        if (localDate != null) {
            return g(localDate, LocalDate.now().minusDays(1));
        }
        return false;
    }

    public static final DateTime n(int i14, DateTime dateTime) {
        dateTime.getClass();
        if (i14 < 1 || i14 > 7) {
            return dateTime;
        }
        int dayOfWeek = i14 - dateTime.getDayOfWeek();
        if (dayOfWeek < 0) {
            dayOfWeek = 7 - Math.abs(dayOfWeek);
        }
        DateTime dateTimePlusDays = dateTime.plusDays(dayOfWeek);
        dateTimePlusDays.getClass();
        return dateTimePlusDays;
    }

    public static final DateTime o(int i14, DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTimeN = n(i14, dateTime);
        if (dateTime.toLocalDate().isEqual(dateTimeN.toLocalDate())) {
            return dateTimeN;
        }
        DateTime dateTimeMinusDays = dateTimeN.minusDays(7);
        dateTimeMinusDays.getClass();
        return dateTimeMinusDays;
    }

    public static final DateTime p(String str, String str2, DateTimeZone dateTimeZone) {
        str.getClass();
        DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(str2);
        if (w.z(str2, "Z", false)) {
            DateTime dateTime = dateTimeFormatterForPattern.withZone(dateTimeZone).parseDateTime(str);
            dateTime.getClass();
            return dateTime;
        }
        DateTime dateTime2 = dateTimeFormatterForPattern.withZoneUTC().parseDateTime(str);
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        DateTime dateTimeWithZoneRetainFields = dateTime2.withZoneRetainFields(dateTimeZone);
        dateTimeWithZoneRetainFields.getClass();
        return dateTimeWithZoneRetainFields;
    }

    public static final DateTime q(String str, String str2, DateTimeZone dateTimeZone) {
        if (str == null) {
            return null;
        }
        try {
            return p(str, str2, dateTimeZone);
        } catch (IllegalInstantException e4) {
            e4.getMessage();
            return null;
        } catch (IllegalArgumentException e14) {
            e14.getMessage();
            return null;
        }
    }

    public static DateTime r(LocalDateTime localDateTime) {
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        dateTimeZone.getClass();
        if (dateTimeZone.isLocalDateTimeGap(localDateTime)) {
            DateTime dateTime = localDateTime.plusHours(1).toDateTime(dateTimeZone);
            dateTime.getClass();
            return dateTime;
        }
        DateTime dateTime2 = localDateTime.toDateTime(dateTimeZone);
        dateTime2.getClass();
        return dateTime2;
    }

    public static final b63.o s(DateTime dateTime) {
        return new b63.o(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth());
    }

    public static final b63.o t(LocalDate localDate) {
        localDate.getClass();
        return new b63.o(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth());
    }

    public static final u u(LocalDateTime localDateTime) {
        localDateTime.getClass();
        return new u(localDateTime.getYear(), localDateTime.getMonthOfYear(), localDateTime.getDayOfMonth(), localDateTime.getHourOfDay(), localDateTime.getMinuteOfHour(), localDateTime.getSecondOfMinute(), localDateTime.getMillisOfSecond() * 1000000);
    }

    public static final LocalDate v(String str, String str2) {
        str.getClass();
        LocalDate localDate = DateTimeFormat.forPattern(str2).parseLocalDate(str);
        localDate.getClass();
        return localDate;
    }

    public static final LocalDate w(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return v(str, str2);
        } catch (IllegalInstantException e4) {
            e4.getMessage();
            return null;
        } catch (IllegalArgumentException e14) {
            e14.getMessage();
            return null;
        }
    }

    public static final DateTime x(LocalDateTime localDateTime) {
        localDateTime.getClass();
        DateTime dateTimeWithZone = localDateTime.toDateTime(DateTimeZone.UTC).withZone(DateTimeZone.getDefault());
        dateTimeWithZone.getClass();
        return dateTimeWithZone;
    }

    public static final u y(DateTime dateTime, z zVar) {
        dateTime.getClass();
        b63.l.Companion aVar = b63.l.INSTANCE;
        long millis = dateTime.getMillis();
        aVar.getClass();
        b63.l lVarA = b63.l.Companion.a(millis);
        if (zVar == null) {
            z.INSTANCE.getClass();
            zVar = z.Companion.a();
        }
        return b63.b.d(lVarA, zVar);
    }

    public static /* synthetic */ u z(DateTime dateTime) {
        z.INSTANCE.getClass();
        return y(dateTime, z.Companion.a());
    }
}
