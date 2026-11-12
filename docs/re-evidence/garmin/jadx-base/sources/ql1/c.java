package ql1;

import b63.z;
import g22.k;
import km1.u;
import km1.v;
import oe2.f;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final rm1.b a(v vVar, long j8, long j14) {
        DateTime dateTimeMinusDays;
        rm1.b bVarD = d(vVar);
        if (bVarD == null) {
            String calendarDate = vVar.getCalendarDate();
            bVarD = null;
            DateTime dateTimeAtStartOfDay = calendarDate != null ? k.v(calendarDate, "yyyy-MM-dd").toDateTimeAtStartOfDay() : null;
            DateTime dateTimePlusSeconds = (dateTimeAtStartOfDay == null || (dateTimeMinusDays = dateTimeAtStartOfDay.minusDays(1)) == null) ? null : dateTimeMinusDays.plusSeconds((int) j8);
            DateTime dateTimePlusSeconds2 = dateTimeAtStartOfDay != null ? dateTimeAtStartOfDay.plusSeconds((int) j14) : null;
            if (dateTimePlusSeconds != null && dateTimePlusSeconds2 != null) {
                return new rm1.b(dateTimePlusSeconds, dateTimePlusSeconds2, null, null, 12, null);
            }
        }
        return bVarD;
    }

    public static final DateTimeZone b(v vVar) {
        DateTime dateTime;
        DateTimeZone zone;
        vVar.getClass();
        rm1.b bVarD = d(vVar);
        if (bVarD != null && (dateTime = bVarD.f153533b) != null && (zone = dateTime.getZone()) != null) {
            return zone;
        }
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        dateTimeZone.getClass();
        return dateTimeZone;
    }

    public static final z c(v vVar) {
        DateTime dateTime;
        DateTimeZone zone;
        vVar.getClass();
        rm1.b bVarD = d(vVar);
        String id3 = (bVarD == null || (dateTime = bVarD.f153533b) == null || (zone = dateTime.getZone()) == null) ? null : zone.getID();
        if (id3 != null) {
            z.INSTANCE.getClass();
            return z.Companion.b(id3);
        }
        z.INSTANCE.getClass();
        return z.Companion.a();
    }

    public static final rm1.b d(v vVar) {
        vVar.getClass();
        long sleepStartTimestampGMT = vVar.getSleepStartTimestampGMT();
        long sleepStartTimestampLocal = vVar.getSleepStartTimestampLocal();
        long sleepEndTimestampGMT = vVar.getSleepEndTimestampGMT();
        long sleepEndTimestampLocal = vVar.getSleepEndTimestampLocal();
        if (sleepStartTimestampGMT <= 0 || sleepStartTimestampLocal <= 0 || sleepEndTimestampGMT <= 0 || sleepEndTimestampLocal <= 0) {
            return null;
        }
        rm1.b bVar = new rm1.b(sleepStartTimestampGMT, sleepStartTimestampLocal, sleepEndTimestampGMT, sleepEndTimestampLocal);
        DateTime dateTime = bVar.f153533b;
        DateTime dateTime2 = bVar.f153532a;
        if (dateTime.isBefore(dateTime2)) {
            DateTime dateTimeWithZone = dateTime2.minusDays(Days.daysBetween(dateTime, dateTime2).getDays() + 1).withZone(dateTime2.getZone());
            dateTimeWithZone.getClass();
            bVar = rm1.b.a(bVar, dateTimeWithZone);
        }
        return f.h0(bVar);
    }

    public static final boolean e(v vVar) {
        vVar.getClass();
        boolean sleepFromDevice = vVar.getSleepFromDevice();
        String sleepWindowConfirmedType = vVar.getSleepWindowConfirmedType();
        boolean sleepWindowConfirmed = vVar.getSleepWindowConfirmed();
        Long autoSleepStartTimestampGMT = vVar.getAutoSleepStartTimestampGMT();
        long jLongValue = autoSleepStartTimestampGMT != null ? autoSleepStartTimestampGMT.longValue() : 0L;
        Long autoSleepEndTimestampGMT = vVar.getAutoSleepEndTimestampGMT();
        long jLongValue2 = autoSleepEndTimestampGMT != null ? autoSleepEndTimestampGMT.longValue() : 0L;
        if (sleepFromDevice || sleepWindowConfirmedType == null) {
            return false;
        }
        if (sleepWindowConfirmedType.equals(u.OFF_WRIST.f105587a) && sleepWindowConfirmed) {
            return true;
        }
        return sleepWindowConfirmedType.equals(u.MANUALLY_CONFIRMED.f105587a) && jLongValue <= 0 && jLongValue2 <= 0;
    }
}
