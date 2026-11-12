package com.huami.watch.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes11.dex */
public class DateDay {
    public static final String FORMAT_PATTERN_HM = "HH:mm";
    public static final String FORMAT_PATTERN_MDE = "MM-dd EEEE";
    public static final String FORMAT_PATTERN_MDEHM = "MM-dd EEEE HH:mm";
    private static final String d = "DateDay";
    private static final String e = "yyyy-MM-dd";
    private static final String f = "%s-%s-%s";
    private static final long g = Long.MIN_VALUE;
    private static final int h = 2;
    private static final int i = 4;
    private static final int j = 1;
    private static final int k = 1;
    private static Pattern l = null;
    private static boolean m = false;
    private static int n = 2;
    private static int o = 4;
    private String a;
    private long b;
    private int[] c;

    public static class Time {
        public int hour;
        public int minute;
        public int second;

        public String toString() {
            return "<hour: " + this.hour + ", minute: " + this.minute + ", second: " + this.second + Typography.greater;
        }
    }

    static {
        boolean zStartsWith = Locale.getDefault().toString().startsWith(Locale.ENGLISH.toString());
        m = zStartsWith;
        if (zStartsWith) {
            n = 1;
            o = 1;
        }
    }

    private DateDay(@NonNull String str) {
        this.b = Long.MIN_VALUE;
        if (checkIsLegal(str)) {
            this.a = str;
        } else {
            this.b = 0L;
        }
    }

    private static int a(int i2, int i3, int i4, int i5) {
        int i6 = 0;
        while (i2 < i3) {
            i6 = ((i2 % 4 != 0 || i2 % 100 == 0) && i2 % 400 != 0) ? i6 + 365 : i6 + 366;
            i2++;
        }
        return i6 + (i5 - i4);
    }

    private int[] b() {
        int[] iArr = this.c;
        if (iArr != null) {
            return iArr;
        }
        if (this.a == null) {
            str();
        }
        String[] strArrSplit = this.a.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        int[] iArr2 = {Integer.valueOf(strArrSplit[0]).intValue(), Integer.valueOf(strArrSplit[1]).intValue(), Integer.valueOf(strArrSplit[2]).intValue()};
        this.c = iArr2;
        return iArr2;
    }

    public static boolean checkIsLegal(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (l == null) {
            l = Pattern.compile("\\d\\d\\d\\d-\\d\\d-\\d\\d");
        }
        return l.matcher(str).matches();
    }

    public static DateDay from(@NonNull String str) {
        return new DateDay(str);
    }

    public static void onLocaleChanged(boolean z) {
        if (z != m) {
            m = z;
            if (z) {
                n = 1;
                o = 1;
            } else {
                n = 2;
                o = 4;
            }
        }
    }

    public static boolean sundayIsWeekStart() {
        return n == 1;
    }

    public static DateDay today() {
        return from(System.currentTimeMillis());
    }

    public DateDay add(int i2) {
        if (i2 == 0) {
            return this;
        }
        Calendar calendar = calendar();
        calendar.add(6, i2);
        return from(calendar);
    }

    public DateDay addMonth(int i2) {
        if (i2 == 0) {
            return this;
        }
        Calendar calendar = calendar();
        calendar.add(2, i2);
        return from(calendar);
    }

    public DateDay addWeek(int i2) {
        if (i2 == 0) {
            return this;
        }
        Calendar calendar = calendar();
        calendar.add(3, i2);
        return from(calendar);
    }

    public DateDay addYear(int i2) {
        if (i2 == 0) {
            return this;
        }
        Calendar calendar = calendar();
        calendar.add(1, i2);
        return from(calendar);
    }

    public boolean after(DateDay dateDay) {
        if (year() > dateDay.year()) {
            return true;
        }
        if (year() == dateDay.year()) {
            if (month() > dateDay.month()) {
                return true;
            }
            return month() == dateDay.month() && day() > dateDay.day();
        }
        return false;
    }

    public boolean before(DateDay dateDay) {
        if (year() < dateDay.year()) {
            return true;
        }
        if (year() != dateDay.year()) {
            return false;
        }
        if (month() < dateDay.month()) {
            return true;
        }
        return month() == dateDay.month() && day() < dateDay.day();
    }

    public Calendar calendar() {
        if (this.b != Long.MIN_VALUE) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.b);
            return calendar;
        }
        b();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, this.c[0]);
        calendar2.set(2, this.c[1] - 1);
        calendar2.set(5, this.c[2]);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        this.b = calendar2.getTimeInMillis();
        return calendar2;
    }

    public int day() {
        b();
        return this.c[2];
    }

    public long dayEndMills() {
        Calendar calendar = calendar();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public long dayStartMills() {
        Calendar calendar = calendar();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public boolean equals(DateDay dateDay) {
        boolean zEquals = super.equals((Object) dateDay);
        return (zEquals || dateDay == null) ? zEquals : str().equals(dateDay.str());
    }

    public DateDay getMonthEndDay() {
        DateDay monthStartDay = getMonthStartDay();
        DateDay dateDayAdd = null;
        for (int i2 = 1; i2 <= 4; i2++) {
            dateDayAdd = monthStartDay.add(31 - i2);
            if (dateDayAdd.year() == year() && dateDayAdd.month() == month()) {
                break;
            }
        }
        return dateDayAdd;
    }

    public DateDay getMonthStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year(), month() - 1, day());
        calendar.set(5, 1);
        return from(calendar);
    }

    public DateDay getWeekStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year(), month() - 1, day());
        calendar.setFirstDayOfWeek(n);
        calendar.setMinimalDaysInFirstWeek(o);
        int i2 = calendar.get(7) - n;
        if (i2 < 0) {
            i2 += 7;
        }
        calendar.add(6, -i2);
        return from(calendar);
    }

    public boolean isToday() {
        return equals(today());
    }

    public boolean isWeekStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year(), month() - 1, day());
        calendar.setFirstDayOfWeek(n);
        calendar.setMinimalDaysInFirstWeek(o);
        return calendar.get(7) - n == 0;
    }

    public int month() {
        b();
        return this.c[1];
    }

    public int offsetDay(DateDay dateDay) {
        Calendar calendar = dateDay.calendar();
        Calendar calendar2 = calendar();
        int i2 = calendar.get(1);
        int i3 = calendar2.get(1);
        int i4 = calendar.get(6);
        int i5 = calendar2.get(6);
        if (i2 == i3) {
            return i5 - i4;
        }
        return i2 < i3 ? a(i2, i3, i4, i5) : -a(i3, i2, i5, i4);
    }

    public int offsetMonth(DateDay dateDay) {
        return year() == dateDay.year() ? month() - dateDay.month() : ((year() - dateDay.year()) * 12) + (month() - dateDay.month());
    }

    public int offsetWeek(DateDay dateDay) {
        Calendar calendar = calendar();
        Calendar calendar2 = dateDay.calendar();
        return (year() != dateDay.year() || calendar.get(3) < calendar.get(4) || calendar2.get(3) < calendar2.get(4)) ? getWeekStartDay().offsetDay(dateDay.getWeekStartDay()) / 7 : calendar.get(3) - calendar2.get(3);
    }

    public String str() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        String dateTime = TimeUtil.formatDateTime(this.b, "yyyy-MM-dd");
        this.a = dateTime;
        return dateTime;
    }

    public Time time() {
        Calendar calendar = calendar();
        Time time = new Time();
        time.hour = calendar.get(11);
        time.minute = calendar.get(12);
        time.second = calendar.get(13);
        return time;
    }

    public long timeInMillis() {
        long j2 = this.b;
        if (j2 != Long.MIN_VALUE) {
            return j2;
        }
        calendar();
        return this.b;
    }

    public String toString() {
        return str();
    }

    public DateDay tomorrow() {
        return add(1);
    }

    public int year() {
        b();
        return this.c[0];
    }

    public DateDay yesterday() {
        return add(-1);
    }

    public static DateDay from(@NonNull Calendar calendar) {
        return new DateDay(calendar.getTimeInMillis());
    }

    public static DateDay from(long j2) {
        return new DateDay(j2);
    }

    public boolean equals(String str) {
        return checkIsLegal(str) && str().equals(str);
    }

    public String str(String str) {
        String str2 = this.a;
        if (str2 != null) {
            return str2;
        }
        String dateTime = TimeUtil.formatDateTime(this.b, str);
        this.a = dateTime;
        return dateTime;
    }

    public static DateDay from(int i2) {
        return new DateDay(((long) i2) * 1000);
    }

    public boolean equals(long j2) {
        return equals(new DateDay(j2));
    }

    public static DateDay from(int i2, int i3, int i4) {
        String strValueOf = String.valueOf(i3);
        if (i3 < 10) {
            strValueOf = "0" + strValueOf;
        }
        String strValueOf2 = String.valueOf(i4);
        if (i4 < 10) {
            strValueOf2 = "0" + i4;
        }
        DateDay dateDay = new DateDay(String.format(f, Integer.valueOf(i2), strValueOf, strValueOf2));
        dateDay.c = new int[]{i2, i3, i4};
        return dateDay;
    }

    public boolean equals(@NonNull Calendar calendar) {
        return equals(new DateDay(calendar.getTimeInMillis()));
    }

    private DateDay(long j2) {
        this.b = Long.MIN_VALUE;
        this.b = j2;
    }

    public boolean equals(int i2, int i3, int i4) {
        return equals(from(i2, i3, i4));
    }
}
