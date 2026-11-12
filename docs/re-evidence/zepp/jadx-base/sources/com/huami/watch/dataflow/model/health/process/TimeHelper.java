package com.huami.watch.dataflow.model.health.process;

import android.content.Context;
import android.text.Html;
import android.text.format.DateFormat;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes16.dex */
public final class TimeHelper {
    public static final int DAY_IN_MILLISECOND = 86400000;
    public static final int DAY_IN_MINUTES = 1440;
    public static final int DAY_IN_SECONDS = 86400;
    public static final int HOUR_IN_SECONDS = 3600;
    public static final String LANGUAGE_CN = "zh_CN";
    public static final String LANGUAGE_TW = "zh_TW";
    public static final String LANGUAGE_US = "en_US";
    private static final String a = ":";

    private TimeHelper() {
    }

    private static int a(Calendar calendar, boolean z) {
        int i = calendar.get(7) + (z ? 7 : 6);
        if (i > 7) {
            i -= 7;
        }
        return 1 - i;
    }

    public static long convert2Seconds(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, i3);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long convert2SecondsByMonthDay(int i, int i2) {
        return convert2Seconds(Calendar.getInstance().get(1), i, i2);
    }

    public static long convert2SecondsByYearMonth(int i, int i2) {
        return convert2Seconds(i, i2, 1);
    }

    public static long convertUTCTime(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(14, -(calendar.get(15) + calendar.get(16)));
        return calendar.getTimeInMillis();
    }

    public static String formatTime(long j, String str, boolean z) {
        if (j <= 0) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        if (z) {
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String formatTime12WithoutSecond(long j, boolean z) {
        String time = formatTime(j, "a hh:mm", z);
        return time == null ? "00:00" : time;
    }

    public static String formatTime24WithoutSecond(long j, boolean z) {
        String time = formatTime(j, "HH:mm", z);
        return time == null ? "00:00" : time;
    }

    public static String formatTimeInFullForm(long j, boolean z) {
        String time = formatTime(j, "HH:mm:ss", z);
        return time == null ? "00:00" : time;
    }

    public static String formatTimeInSportForm(float f) {
        if (f <= 0.0f) {
            return "00'00\"";
        }
        if (f >= 6000.0f) {
            return "99'59\"";
        }
        int i = (int) (f / 60.0f);
        int i2 = ((int) f) - (i * 60);
        StringBuffer stringBuffer = new StringBuffer();
        if (i < 10) {
            stringBuffer.append("0");
            stringBuffer.append(i);
            stringBuffer.append("'");
        } else {
            stringBuffer.append(i);
            stringBuffer.append("'");
        }
        if (i2 < 10) {
            stringBuffer.append("0");
            stringBuffer.append(i2);
            stringBuffer.append("\"");
        } else {
            stringBuffer.append(i2);
            stringBuffer.append("\"");
        }
        return stringBuffer.toString();
    }

    public static String formatTimeWithoutHour(long j, boolean z) {
        String time = formatTime(j, "mm:ss", z);
        return time == null ? "00:00" : time;
    }

    public static String formatTimeYearFor12WithoutSecond(long j, boolean z) {
        String time = formatTime(j, "yyyy-MM-dd a hh:mm", z);
        return time == null ? "00:00" : time;
    }

    public static String formatTimeYearFor24WithoutSecond(long j, boolean z) {
        String time = formatTime(j, "yyyy-MM-dd HH:mm", z);
        return time == null ? "00:00" : time;
    }

    public static int getCurrMinutesToday() {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static Calendar getFirstDayOfWeek(Calendar calendar, boolean z) {
        if (z && 1 == calendar.get(7)) {
            return calendar;
        }
        if (!z && 2 == calendar.get(7)) {
            return calendar;
        }
        calendar.add(5, a(calendar, z));
        return calendar;
    }

    public static long[] getHourRangeOverTheSamePeriodOfYesterday(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return new long[]{calendar.getTimeInMillis() / 1000, calendar.getTimeInMillis() / 1000};
    }

    public static CharSequence getHtmlFormatedString(Context context, int i, Object... objArr) {
        return Html.fromHtml(context.getResources().getString(i, objArr));
    }

    public static int getIntervalTillNowInSecond(Calendar calendar) {
        return (int) ((Calendar.getInstance().getTimeInMillis() - calendar.getTimeInMillis()) / 1000);
    }

    public static String getLanguage() {
        return Locale.getDefault().toString();
    }

    public static Calendar getLastDayOfWeek(Calendar calendar, boolean z) {
        if (z && 7 == calendar.get(7)) {
            return calendar;
        }
        if (!z && 1 == calendar.get(7)) {
            return calendar;
        }
        calendar.add(5, a(calendar, z) + 6);
        return calendar;
    }

    public static long getMidnightOfDayInMillis(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5));
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2.getTimeInMillis();
    }

    public static long getMidnightOfDayInMillisNoTimeZone(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5));
        calendar2.setTimeZone(TimeZone.getTimeZone("GMT"));
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2.getTimeInMillis();
    }

    public static int getMinutesOfDay(long j) {
        return (int) (j / 60);
    }

    public static String getTimeForCNorTW(Context context, String str) {
        if (str == null || "00:00".equals(str)) {
            return " 0:00";
        }
        String[] strArrSplit = str.split(":");
        if (2 > strArrSplit.length || 3 < strArrSplit.length || strArrSplit[0] == null || 2 < strArrSplit[0].length()) {
            return str;
        }
        int iIntValue = Integer.valueOf(strArrSplit[0]).intValue();
        if (iIntValue >= 0 && 12 >= iIntValue) {
            return iIntValue + ":" + strArrSplit[1];
        }
        if (13 > iIntValue || 23 < iIntValue) {
            return " 0:00";
        }
        return (iIntValue - 12) + ":" + strArrSplit[1];
    }

    public static String getTimeFullDesc(long j) {
        String str = "";
        if (j <= 0) {
            return "";
        }
        long j2 = j / TimeUtils.TIME_1_HOURS;
        long j3 = (j % TimeUtils.TIME_1_HOURS) / 60;
        long j4 = j % 60;
        if (j2 > 0) {
            str = "" + j2 + "时";
        }
        if (j3 > 0) {
            str = str + j3 + "分";
        }
        if (j4 <= 0) {
            return str;
        }
        return str + j4 + "秒";
    }

    public static String getTimeWithColon(long j) {
        if (j < 0) {
            return "00:00";
        }
        long j2 = j / TimeUtils.TIME_1_HOURS;
        long j3 = (j % TimeUtils.TIME_1_HOURS) / 60;
        long j4 = j % 60;
        StringBuffer stringBuffer = new StringBuffer();
        if (j2 <= 0) {
            if (j3 < 10) {
                stringBuffer.append("0");
                stringBuffer.append(j3);
            } else {
                stringBuffer.append(j3);
            }
            stringBuffer.append(":");
            if (j4 < 10) {
                stringBuffer.append("0");
                stringBuffer.append(j4);
            } else {
                stringBuffer.append(j4);
            }
        } else {
            if (j2 < 10) {
                stringBuffer.append("0");
                stringBuffer.append(j2);
            } else {
                stringBuffer.append(j2);
            }
            stringBuffer.append(":");
            if (j3 < 10) {
                stringBuffer.append("0");
                stringBuffer.append(j3);
                stringBuffer.append(":");
            } else {
                stringBuffer.append(j3);
                stringBuffer.append(":");
            }
            if (j4 < 10) {
                stringBuffer.append("0");
                stringBuffer.append(j4);
            } else {
                stringBuffer.append(j4);
            }
        }
        return stringBuffer.toString();
    }

    public static boolean ifNeedFormatTimeForCNorTW(Context context) {
        if (is24HourFormat(context)) {
            return false;
        }
        String language = getLanguage();
        return "zh_CN".equals(language) || LANGUAGE_TW.equals(language);
    }

    public static boolean is24HourFormat(Context context) {
        return DateFormat.is24HourFormat(context);
    }

    public static int parsePaceStr(String str) {
        int length = str.length();
        return (Integer.parseInt(str.substring(0, length - 4)) * 60) + Integer.parseInt(str.substring(length - 3, length - 1));
    }

    public static int getIntervalTillNowInSecond(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getIntervalTillNowInSecond(calendar);
    }

    public static String formatTime(long j, boolean z) {
        String time = formatTime(j, "yyyy-MM-dd HH:mm:ss", z);
        return time == null ? "" : time;
    }

    public static int getIntervalTillNowInSecond(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i >= 1970 && i2 > 0 && i2 <= 12 && i3 > 0 && i3 <= 31) {
            Calendar calendar = Calendar.getInstance();
            calendar.setLenient(false);
            calendar.set(1, i);
            calendar.set(2, i2);
            calendar.set(5, i3);
            calendar.set(11, i4);
            calendar.set(12, i5);
            calendar.set(13, i6);
            calendar.set(14, 0);
            return getIntervalTillNowInSecond(calendar);
        }
        throw new IllegalArgumentException();
    }
}
