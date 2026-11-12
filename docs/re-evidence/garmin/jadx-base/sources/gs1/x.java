package gs1;

import c22.l3;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes10.dex */
public final class x {
    public static final v a(DateTime dateTime, DateTime dateTime2, v.a aVar) {
        if (!g22.k.f(dateTime, dateTime2)) {
            return null;
        }
        l3.a aVar2 = l3.f23124b;
        int hourOfDay = dateTime.getHourOfDay();
        int minuteOfHour = dateTime.getMinuteOfHour();
        aVar2.getClass();
        return new v(aVar, (int) (l3.a.z(hourOfDay, minuteOfHour) / 60.0d), null, 0, 12, null);
    }

    public static final v b(LocalDateTime localDateTime, LocalDateTime localDateTime2, v.a aVar, Double d14) {
        if (localDateTime == null || localDateTime2 == null) {
            return null;
        }
        l3.a aVar2 = l3.f23124b;
        int hourOfDay = localDateTime.getHourOfDay();
        int minuteOfHour = localDateTime.getMinuteOfHour();
        aVar2.getClass();
        int iZ = (int) (l3.a.z(hourOfDay, minuteOfHour) / 60.0d);
        int hourOfDay2 = localDateTime2.getHourOfDay();
        int minuteOfHour2 = localDateTime2.getMinuteOfHour();
        aVar2.getClass();
        Integer numValueOf = Integer.valueOf((int) (l3.a.z(hourOfDay2, minuteOfHour2) / 60.0d));
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        aVar2.getClass();
        return new v(aVar, iZ, numValueOf, (int) (dDoubleValue / 60.0d));
    }
}
