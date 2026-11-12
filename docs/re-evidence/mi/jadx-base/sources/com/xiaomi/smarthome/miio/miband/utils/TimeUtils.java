package com.xiaomi.smarthome.miio.miband.utils;

import android.text.TextUtils;
import com.miui.tsmclient.util.StringUtils;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TimeUtils {
    public static String Date2String(Date date, String str) {
        return new SimpleDateFormat(str, Locale.CHINA).format(date);
    }

    public static long String2TimeStamp(String str, String str2) {
        return new SimpleDateFormat(str2, Locale.CHINA).parse(str, new ParsePosition(0)).getTime();
    }

    public static String transToTime(Object obj) {
        if (obj != null && !TextUtils.isEmpty(String.valueOf(obj))) {
            try {
                return new SimpleDateFormat(com.xiaomi.fitness.common.utils.TimeUtils.FORMAT_H_M, Locale.getDefault()).format(new Date(Long.parseLong(obj.toString()) * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public static String transToTimeMotion(Object obj) {
        if (obj != null && !TextUtils.isEmpty(String.valueOf(obj))) {
            try {
                Date date = new Date(Long.parseLong(obj.toString()) * 1000);
                Date date2 = new Date();
                return (date.getYear() == date2.getYear() && date.getMonth() == date2.getMonth() && date.getDay() == date2.getDay()) ? new SimpleDateFormat(com.xiaomi.fitness.common.utils.TimeUtils.FORMAT_H_M, Locale.getDefault()).format(date) : new SimpleDateFormat(StringUtils.EXPECT_DATE_FORMAT, Locale.getDefault()).format(date);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
