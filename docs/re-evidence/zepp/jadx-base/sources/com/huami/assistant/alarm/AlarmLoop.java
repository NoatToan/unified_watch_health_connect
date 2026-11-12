package com.huami.assistant.alarm;

import com.huami.watch.util.DateDay;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmLoop {
    public static final short EVERY_DAY = 127;
    public static final short FRIDAY = 16;
    public static final short MONDAY = 1;
    public static final short MON_2_FRI = 31;
    public static final short ONCE = 0;
    public static final short SATURDAY = 32;
    public static final short SUNDAY = 64;
    public static final short THURSDAY = 8;
    public static final short TUESDAY = 2;
    public static final short WEDNESDAY = 4;
    public static int[] WEEK_MASK = {1, 2, 4, 8, 16, 32, 64};
    private static final String a = "AlarmLoop";

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    public static boolean checkAvailableByDay(Alarm alarm, DateDay day) {
        boolean z;
        int i;
        if (alarm.enabled) {
            int i2 = alarm.days;
            z = true;
            if (i2 == 0) {
                DateDay.Time time = day.time();
                Log.d(a, "CurrentTime : " + time, new Object[0]);
                if (!DateDay.today().equals(day) ? !DateDay.today().tomorrow().equals(day) : (time.hour * 60) + time.minute > (alarm.hour * 60) + alarm.minutes) {
                    z = false;
                }
            } else {
                switch (day.calendar().get(7)) {
                    case 1:
                        i = 64;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 2;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 8;
                        break;
                    case 6:
                        i = 16;
                        break;
                    case 7:
                        i = 32;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i == -1 || (i & i2) <= 0) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        Log.d(a, alarm + " is available : " + z, new Object[0]);
        return z;
    }
}
