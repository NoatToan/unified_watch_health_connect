package com.xiaomi.smarthome.library.common.util;

import android.app.Activity;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.util.LocaleUtil;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class DateUtils {
    public static Date MAX_DATE = new Date(Long.MAX_VALUE);
    public static final long MILLISECONDS_DAY = 86400000;
    public static final long MILLISECONDS_HOUR = 3600000;
    public static final long MILLISECONDS_MINUTE = 60000;
    public static final long MILLISECONDS_WEEK = 604800000;

    public static Date clearMinutes(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static Date clearTime(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static DateFormat getDateFormatByCurrentLocale(Activity activity) {
        return DateFormat.getDateTimeInstance(3, 3, LocaleUtil.getCurrentLocale(activity));
    }

    public static String getDateFormatStringBy(Locale locale) {
        return getDateFormatStringBy(locale, "/");
    }

    public static Date getEnd(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTime();
    }

    public static int getIntervalDays(Date date, Date date2) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        int i2 = calendar.get(6);
        int i3 = calendar2.get(6);
        boolean z = true;
        int i4 = calendar.get(1);
        int i5 = calendar2.get(1);
        if (i4 == i5) {
            return i3 - i2;
        }
        if (i4 > i5) {
            i = i2 - i3;
            i4 = i5;
            i5 = i4;
        } else {
            i = i3 - i2;
            z = false;
        }
        while (i4 < i5) {
            i = ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) ? i + 365 : i + 366;
            i4++;
        }
        return z ? -i : i;
    }

    public static String getMMDDDateFormatStringBy(Locale locale) {
        String str = TextUtils.isEmpty("") ? "/" : "";
        if (LocaleUtil.localeEqual(locale, Locale.CHINA) || LocaleUtil.localeEqual(locale, Locale.TRADITIONAL_CHINESE) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_HK)) {
            return "MM月dd日";
        }
        if (LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_KO)) {
            return "MM월dd일";
        }
        if (LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_HU)) {
            return "MM-dd";
        }
        if (LocaleUtil.localeEqual(locale, Locale.JAPAN) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_SV)) {
            return "MM" + str + "dd";
        }
        if (LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_ES) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_VIETNAM) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_INDONESIA) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_RU) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_TURKEY) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_NETHERLANDS) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_BRAZIL) || LocaleUtil.localeEqual(locale, Locale.FRANCE) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_UK) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_SK) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_EL) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_ES_US) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_CS) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_NB) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_PT_PT)) {
            return "dd" + str + "MM";
        }
        if (LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_RO) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_FI)) {
            return "dd.MM";
        }
        return "MM" + str + "dd";
    }

    public static Date getStart(Date date) {
        return clearTime(date);
    }

    public static boolean hasTime(Date date) {
        if (date == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(11) > 0 || calendar.get(12) > 0 || calendar.get(13) > 0 || calendar.get(14) > 0;
    }

    public static boolean isAfterDay(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return isAfterDay(calendar, calendar2);
    }

    public static boolean isBeforeDay(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return isBeforeDay(calendar, calendar2);
    }

    public static boolean isLastDay(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar2.get(6) - calendar.get(6) == 1;
    }

    public static boolean isSameDay(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return isSameDay(calendar, calendar2);
    }

    public static boolean isSameMonth(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2);
    }

    public static boolean isSameWeek(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(3) == calendar2.get(3);
    }

    public static boolean isSameYear(Date date, Date date2) {
        if (date == null || date2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1);
    }

    public static boolean isToday(Date date) {
        return isSameDay(date, Calendar.getInstance().getTime());
    }

    public static boolean isWithinDaysFuture(Date date, int i) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isWithinDaysFuture(calendar, i);
    }

    public static boolean isWithinDaysPast(Date date, int i) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isWithinDaysPast(calendar, i);
    }

    public static Date max(Date date, Date date2) {
        if (date == null && date2 == null) {
            return null;
        }
        if (date == null) {
            return date2;
        }
        return (date2 == null || date.after(date2)) ? date : date2;
    }

    public static Date min(Date date, Date date2) {
        if (date == null && date2 == null) {
            return null;
        }
        if (date == null) {
            return date2;
        }
        return (date2 == null || date.before(date2)) ? date : date2;
    }

    public static String timeStamp2Date(String str, String str2) {
        if (str == null || str.isEmpty() || str.equals(AbstractJsonLexerKt.NULL)) {
            return "";
        }
        if (str2 == null || str2.isEmpty()) {
            str2 = "yyyy-MM-dd HH:mm:ss";
        }
        return new SimpleDateFormat(str2).format(new Date(Long.valueOf(str + "000").longValue()));
    }

    public static String getDateFormatStringBy(Locale locale, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "/";
        }
        if (LocaleUtil.localeEqual(locale, Locale.CHINA) || LocaleUtil.localeEqual(locale, Locale.TRADITIONAL_CHINESE) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_HK)) {
            return "yyyy年MM月dd日";
        }
        if (LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_KO)) {
            return "yyyy년MM월dd일";
        }
        if (LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_HU)) {
            return "yyyy-MM-dd";
        }
        if (LocaleUtil.localeEqual(locale, Locale.JAPAN) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_SV)) {
            return "yyyy" + str + "MM" + str + "dd";
        }
        if (LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_ES) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_VIETNAM) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_INDONESIA) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_RU) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_TURKEY) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_NETHERLANDS) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_BRAZIL) || LocaleUtil.localeEqual(locale, Locale.FRANCE) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_UK) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_SK) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_EL) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_ES_US) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_CS) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_NB) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_PT_PT)) {
            return "dd" + str + "MM" + str + "yyyy";
        }
        if (LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_RO) || LocaleUtil.localeEqual(locale, LocaleUtil.LOCALE_FI)) {
            return "dd.MM.yyyy";
        }
        return "MM" + str + "dd" + str + "yyyy";
    }

    public static boolean isToday(Calendar calendar) {
        return isSameDay(calendar, Calendar.getInstance());
    }

    public static boolean isWithinDaysFuture(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar3 = Calendar.getInstance();
            calendar3.add(6, i);
            return isAfterDay(calendar, calendar2) && !isAfterDay(calendar, calendar3);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static boolean isWithinDaysPast(Calendar calendar, int i) {
        if (calendar != null) {
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar3 = Calendar.getInstance();
            calendar3.add(6, -i);
            return isBeforeDay(calendar, calendar2) && !isBeforeDay(calendar, calendar3);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static boolean isAfterDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) < calendar2.get(0)) {
                return false;
            }
            if (calendar.get(0) > calendar2.get(0)) {
                return true;
            }
            if (calendar.get(1) < calendar2.get(1)) {
                return false;
            }
            return calendar.get(1) > calendar2.get(1) || calendar.get(6) > calendar2.get(6);
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public static boolean isBeforeDay(Calendar calendar, Calendar calendar2) {
        if (calendar != null && calendar2 != null) {
            if (calendar.get(0) < calendar2.get(0)) {
                return true;
            }
            if (calendar.get(0) > calendar2.get(0)) {
                return false;
            }
            if (calendar.get(1) < calendar2.get(1)) {
                return true;
            }
            return calendar.get(1) <= calendar2.get(1) && calendar.get(6) < calendar2.get(6);
        }
        throw new IllegalArgumentException("The dates must not be null");
    }

    public static boolean isSameDay(Calendar calendar, Calendar calendar2) {
        if (calendar == null || calendar2 == null) {
            throw new IllegalArgumentException("The dates must not be null");
        }
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }
}
