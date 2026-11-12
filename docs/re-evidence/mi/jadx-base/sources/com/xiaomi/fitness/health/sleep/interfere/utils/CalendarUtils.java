package com.xiaomi.fitness.health.sleep.interfere.utils;

import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.sport_eco.SportConstants;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/utils/CalendarUtils;", "", "<init>", "()V", "calcWeekDay", "", SportConstants.KEY_TIMESTAMP, "", "calcDayStartTime", "calcDayEndTime", "calcCurrentTime", "Lkotlin/Pair;", "calcMonthDay", "calcSleepDayTimeline", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CalendarUtils {

    @NotNull
    public static final CalendarUtils INSTANCE = new CalendarUtils();

    private CalendarUtils() {
    }

    @NotNull
    public final Pair<Integer, Integer> calcCurrentTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.setTimeZone(TimeZone.getDefault());
        return new Pair<>(Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)));
    }

    public final long calcDayEndTime(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        calendar.setTimeZone(FitnessDateUtils.INSTANCE.getTimeZone(0));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTimeInMillis() / ((long) 1000);
    }

    public final long calcDayStartTime(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        calendar.setTimeZone(FitnessDateUtils.INSTANCE.getTimeZone(0));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / ((long) 1000);
    }

    public final int calcMonthDay(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * ((long) 1000));
        calendar.setTimeZone(TimeZone.getDefault());
        return calendar.get(5);
    }

    public final int calcSleepDayTimeline(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.setTimeZone(TimeZone.getDefault());
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeStamp * ((long) 1000));
        calendar2.setTimeZone(TimeZone.getDefault());
        int i4 = calendar2.get(1);
        int i5 = calendar2.get(2);
        int i6 = calendar2.get(5);
        if (i4 > i) {
            return 1;
        }
        if (i4 >= i) {
            if (i5 > i2) {
                return 1;
            }
            if (i5 >= i2) {
                if (i6 > i3) {
                    return 1;
                }
                if (i6 >= i3) {
                    return 0;
                }
            }
        }
        return -1;
    }

    public final int calcWeekDay(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * ((long) 1000));
        calendar.setTimeZone(TimeZone.getDefault());
        return calendar.get(7);
    }
}
