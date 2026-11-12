package gs1;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;

/* JADX INFO: loaded from: classes10.dex */
public final class u {
    public static final DateTimeZone a(i.b bVar) {
        rm1.b bVarH0;
        DateTime dateTime;
        DateTimeZone zone;
        long sleepStartTimestampGMT = bVar.getSleepStartTimestampGMT();
        long sleepStartTimestampLocal = bVar.getSleepStartTimestampLocal();
        long sleepEndTimestampGMT = bVar.getSleepEndTimestampGMT();
        long sleepEndTimestampLocal = bVar.getSleepEndTimestampLocal();
        if (sleepStartTimestampGMT <= 0 || sleepStartTimestampLocal <= 0 || sleepEndTimestampGMT <= 0 || sleepEndTimestampLocal <= 0) {
            bVarH0 = null;
        } else {
            rm1.b bVar2 = new rm1.b(sleepStartTimestampGMT, sleepStartTimestampLocal, sleepEndTimestampGMT, sleepEndTimestampLocal);
            DateTime dateTime2 = bVar2.f153533b;
            DateTime dateTime3 = bVar2.f153532a;
            if (dateTime2.isBefore(dateTime3)) {
                DateTime dateTimeWithZone = dateTime3.minusDays(Days.daysBetween(dateTime2, dateTime3).getDays() + 1).withZone(dateTime3.getZone());
                dateTimeWithZone.getClass();
                bVar2 = rm1.b.a(bVar2, dateTimeWithZone);
            }
            bVarH0 = oe2.f.h0(bVar2);
        }
        if (bVarH0 != null && (dateTime = bVarH0.f153533b) != null && (zone = dateTime.getZone()) != null) {
            return zone;
        }
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        dateTimeZone.getClass();
        return dateTimeZone;
    }
}
