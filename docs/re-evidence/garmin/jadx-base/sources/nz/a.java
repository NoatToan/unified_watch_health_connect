package nz;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final int a(DateTime dateTime, DateTime dateTime2, DateTimeZone dateTimeZone, int i14) {
        if (dateTime2 != null) {
            if (dateTime != null) {
                int minutes = Minutes.minutesBetween(dateTime, dateTime2).getMinutes() % i14;
                if (minutes > 0) {
                    return i14 - minutes;
                }
                return 0;
            }
            Minutes minutesMinutesIn = Minutes.minutesIn(new Interval(0L, Math.abs(dateTimeZone != null ? dateTimeZone.getOffset(dateTime2) : 0)));
            Integer numValueOf = minutesMinutesIn != null ? Integer.valueOf(minutesMinutesIn.getMinutes()) : null;
            if (numValueOf != null) {
                return numValueOf.intValue() % i14;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DateTimeZone b(DateTime dateTime, DateTime dateTime2) {
        int hours;
        int minutes;
        LocalDateTime localDateTime = dateTime != null ? dateTime.toLocalDateTime() : null;
        LocalDateTime localDateTime2 = dateTime2 != null ? dateTime2.toLocalDateTime() : null;
        if (localDateTime == null || localDateTime2 == null) {
            hours = 0;
            minutes = 0;
        } else {
            hours = Hours.hoursBetween(localDateTime, localDateTime2).getHours();
            minutes = Minutes.minutesBetween(localDateTime, localDateTime2.minusHours(hours)).getMinutes();
        }
        p pVar = new p(Integer.valueOf(hours), Integer.valueOf(minutes));
        int iIntValue = ((Number) pVar.f128594a).intValue();
        int iIntValue2 = ((Number) pVar.f128595b).intValue();
        int iSignum = Integer.signum(iIntValue) * Integer.min(Math.abs(iIntValue), 23);
        int iMin = Integer.min(Math.abs(iIntValue2), 59) * (iSignum > 0 ? Integer.signum(iIntValue2) : 1);
        if (iSignum != iIntValue || iMin != iIntValue2) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            StringBuilder sbI = p6.b.i("getOffsetDateTimeZone: Offset between ", dateTime != null ? dateTime.toString("yyyy-MM-dd'T'HH:mm:ss.SSS") : null, " & ", dateTime != null ? dateTime.toString("yyyy-MM-dd'T'HH:mm:ss.SSS") : null, " = ");
            sbI.append(iIntValue);
            sbI.append(":");
            sbI.append(iIntValue2);
            String string = sbI.toString();
            aVar.getClass();
            i2.a.o(a2Var, string);
        }
        DateTimeZone dateTimeZoneForOffsetHoursMinutes = DateTimeZone.forOffsetHoursMinutes(iSignum, iMin);
        dateTimeZoneForOffsetHoursMinutes.getClass();
        return dateTimeZoneForOffsetHoursMinutes;
    }

    public static final hz.b c(hz.b bVar, int i14) {
        DateTime dateTime = bVar.f86378a;
        DateTime dateTimePlusMinutes = dateTime != null ? dateTime.plusMinutes(i14) : null;
        DateTime dateTime2 = bVar.f86379b;
        DateTime dateTimePlusMinutes2 = dateTime2 != null ? dateTime2.plusMinutes(i14) : null;
        DateTime dateTime3 = bVar.f86380c;
        return new hz.b(dateTimePlusMinutes, dateTimePlusMinutes2, dateTime3 != null ? dateTime3.plusMinutes(i14) : null, bVar.f86381d);
    }
}
