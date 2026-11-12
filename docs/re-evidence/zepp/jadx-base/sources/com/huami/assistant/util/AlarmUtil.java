package com.huami.assistant.util;

import android.content.Context;
import android.text.TextUtils;
import com.huami.assistant.R;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes5.dex */
public class AlarmUtil {
    private static final String a = "AlarmUtil";

    public static long getAlarmNextStartTime(int hour, int minute) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, hour);
        calendar.set(12, minute);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        if (timeInMillis > jCurrentTimeMillis) {
            return timeInMillis;
        }
        calendar.add(5, 1);
        return calendar.getTimeInMillis();
    }

    public static String getAlarmRepeatString(Context context, int repeatDays) {
        StringBuilder sb = new StringBuilder();
        String[] stringArray = context.getResources().getStringArray(R.array.alarm_repeat_type);
        if (repeatDays == 0) {
            return stringArray[0];
        }
        if (repeatDays == 127) {
            return stringArray[1];
        }
        if (repeatDays == 31) {
            return stringArray[2];
        }
        String[] stringArray2 = context.getResources().getStringArray(R.array.week_day_min_short);
        sb.append(context.getString(R.string.alarm_repeat_every));
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            if (((1 << i) & repeatDays) != 0) {
                arrayList.add(stringArray2[i]);
            }
        }
        sb.append(TextUtils.join(",", arrayList));
        Log.d(a, "week string : " + sb.toString(), new Object[0]);
        return sb.toString();
    }

    public static String getAlarmTime(int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, hour);
        calendar.set(12, minute);
        return TimeUtil.formatDateTime(calendar.getTimeInMillis(), "HH:mm");
    }

    public static int getTimeTotalMinutes(long startTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static String toMifitLoop(int days) {
        StringBuilder sb = new StringBuilder();
        if (days == 0) {
            sb.append("10");
        } else if (days == 127) {
            sb.append("0");
        } else {
            int i = 0;
            for (int i2 = days; i2 > 0; i2 >>= 1) {
                if ((i2 & 1) == 1) {
                    i++;
                }
            }
            for (int i3 = 0; i3 < 7; i3++) {
                if (((1 << i3) & days) != 0) {
                    sb.append(i3 + 1);
                    i--;
                    if (i > 0) {
                        sb.append(",");
                    }
                }
            }
        }
        String string = sb.toString();
        Log.d(a, "Alarm loop to mifit:" + string, new Object[0]);
        return string;
    }
}
