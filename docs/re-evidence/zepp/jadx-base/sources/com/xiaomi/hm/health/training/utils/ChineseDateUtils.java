package com.xiaomi.hm.health.training.utils;

import android.content.Context;
import com.xiaomi.hm.health.training.R;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes22.dex */
public class ChineseDateUtils {
    private static int a(Calendar calendar, Calendar calendar2) {
        calendar.clear(10);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar2.clear(10);
        calendar2.clear(12);
        calendar2.clear(13);
        calendar2.clear(14);
        return (int) ((calendar.getTime().getTime() - calendar2.getTime().getTime()) / 86400000);
    }

    public static String formatChineseWeek(Context context, Date date) {
        String str = "";
        if (date == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        String string = context.getString(R.string.month_day, Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
        Calendar calendar2 = Calendar.getInstance();
        String string2 = context.getString(R.string.calendar_today);
        String string3 = context.getString(R.string.calendar_tommorrow);
        int iA = a(calendar, calendar2);
        if (iA == 0) {
            str = string2;
        } else if (iA == 1) {
            str = string3;
        }
        String string4 = context.getString(R.string.calendar_next_week);
        String string5 = context.getString(R.string.calendar_week);
        int i = calendar.get(7) - 1;
        int i2 = calendar2.get(7) - 1;
        int i3 = calendar2.get(3);
        int i4 = calendar.get(3);
        if (i == 0 && i2 != 0) {
            i4--;
        }
        if (i3 - i4 == -1) {
            string5 = string4;
        }
        if (calendar2.get(1) - calendar.get(1) != -1) {
            string4 = string5;
        }
        return String.format("%s %s %s%s", str, string, string4, context.getResources().getStringArray(R.array.week_name)[i]);
    }

    public static Date[] getDateByYearMonthWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Date[] dateArr = new Date[7];
        for (int i = 0; i < 7; i++) {
            dateArr[i] = calendar.getTime();
            calendar.add(5, 1);
        }
        return dateArr;
    }
}
