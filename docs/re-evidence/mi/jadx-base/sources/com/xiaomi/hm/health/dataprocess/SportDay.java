package com.xiaomi.hm.health.dataprocess;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class SportDay implements Serializable {
    private static final int ISO_FIRST_DAY_OF_WEEK = 2;
    private static final int ISO_MINIMAL_DAYS_IN_FIRST_WEEK = 4;
    private static final int US_FIRST_DAY_OF_WEEK = 1;
    private static final int US_MINIMAL_DAYS_IN_FIRST_WEEK = 1;
    private static int sFirstDayOfWeek = 2;
    private static boolean sIsEnglish = false;
    private static int sMinimalDaysInFirstWeek = 4;
    private static final long serialVersionUID = 1;
    public Calendar calendar;
    public int day;
    public int mon;
    public int year;

    static {
        boolean zStartsWith = Locale.getDefault().toString().startsWith(Locale.ENGLISH.toString());
        sIsEnglish = zStartsWith;
        if (zStartsWith) {
            sFirstDayOfWeek = 1;
            sMinimalDaysInFirstWeek = 1;
        }
    }

    public SportDay() {
        this(Calendar.getInstance());
    }

    private boolean equalsDate(int i, int i2, int i3) {
        return this.day == i3 && this.mon == i2 && this.year == i;
    }

    public static SportDay fromString(String str) {
        try {
            String[] strArrSplit = str.split("-");
            return new SportDay(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]) - 1, Integer.parseInt(strArrSplit[2]));
        } catch (Exception unused) {
            return new SportDay();
        }
    }

    public static SportDay getToday() {
        return new SportDay();
    }

    public static void onLocaleChanged(boolean z) {
        if (z != sIsEnglish) {
            sIsEnglish = z;
            if (z) {
                sFirstDayOfWeek = 1;
                sMinimalDaysInFirstWeek = 1;
            } else {
                sFirstDayOfWeek = 2;
                sMinimalDaysInFirstWeek = 4;
            }
        }
    }

    public static Calendar toCalenday(String str) {
        Calendar calendar = Calendar.getInstance();
        try {
            String[] strArrSplit = str.split("-");
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]) - 1;
            int i3 = Integer.parseInt(strArrSplit[2]);
            calendar.clear();
            calendar.set(i, i2, i3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return calendar;
    }

    public SportDay addDay(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.add(6, i);
        return new SportDay(calendar);
    }

    public SportDay addMonth(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.add(2, i);
        return new SportDay(calendar);
    }

    public SportDay addWeek(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.add(3, i);
        return new SportDay(calendar);
    }

    public SportDay addYear(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.add(1, i);
        return new SportDay(calendar);
    }

    public boolean after(SportDay sportDay) {
        int i;
        int i2;
        int i3 = this.year;
        int i4 = sportDay.year;
        return i3 > i4 || (i3 == i4 && ((i = this.mon) > (i2 = sportDay.mon) || (i == i2 && this.day > sportDay.day)));
    }

    public boolean before(SportDay sportDay) {
        int i;
        int i2;
        int i3 = this.year;
        int i4 = sportDay.year;
        return i3 < i4 || (i3 == i4 && ((i = this.mon) < (i2 = sportDay.mon) || (i == i2 && this.day < sportDay.day)));
    }

    public int compare(SportDay sportDay) {
        int i = this.year;
        int i2 = sportDay.year;
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        int i3 = this.mon;
        int i4 = sportDay.mon;
        if (i3 > i4) {
            return 1;
        }
        if (i3 < i4) {
            return -1;
        }
        int i5 = this.day;
        int i6 = sportDay.day;
        if (i5 > i6) {
            return 1;
        }
        return i5 < i6 ? -1 : 0;
    }

    public boolean equals(SportDay sportDay) {
        return equalsDate(sportDay.year, sportDay.mon, sportDay.day);
    }

    public boolean equalsCalendar(Calendar calendar) {
        return equalsDate(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    public Calendar getCalendar() {
        return this.calendar;
    }

    public String getKey() {
        return toString();
    }

    public SportDay getMonthEndDay() {
        SportDay monthStartDay = getMonthStartDay();
        SportDay sportDayAddDay = null;
        for (int i = 1; i <= 4; i++) {
            sportDayAddDay = monthStartDay.addDay(31 - i);
            if (sportDayAddDay.year == this.year && sportDayAddDay.mon == this.mon) {
                break;
            }
        }
        return sportDayAddDay;
    }

    public SportDay getMonthStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.set(5, 1);
        return new SportDay(calendar);
    }

    public SportDay getNextDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day + 1);
        return new SportDay(calendar);
    }

    public SportDay getPreDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day - 1);
        return new SportDay(calendar);
    }

    public long getTimestamp() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(this.year, this.mon, this.day);
        return calendar.getTimeInMillis();
    }

    public int getWeek() {
        int i = this.calendar.get(7);
        if (i == 1) {
            return 6;
        }
        return i - 2;
    }

    public SportDay getWeekEndDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.set(7, 7);
        calendar2.add(5, 1);
        if (calendar2.after(Calendar.getInstance())) {
            calendar2 = Calendar.getInstance();
        }
        return new SportDay(calendar2);
    }

    public SportDay getWeekStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        int i = calendar.get(7) - sFirstDayOfWeek;
        if (i < 0) {
            i += 7;
        }
        calendar.add(6, -i);
        return new SportDay(calendar);
    }

    public SportDay getYearEndDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.set(6, 1);
        calendar.add(1, 1);
        calendar.add(6, -1);
        return new SportDay(calendar);
    }

    public SportDay getYearStartDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.set(6, 1);
        return new SportDay(calendar);
    }

    public boolean isToday() {
        return offsetDay(new SportDay()) == 0;
    }

    public boolean isYesterday() {
        return offsetDay(new SportDay()) == -1;
    }

    public int offsetDay(SportDay sportDay) {
        Calendar calendar = sportDay.calendar;
        Calendar calendar2 = this.calendar;
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(1);
        int i5 = 0;
        if (i3 < i4) {
            while (i3 < i4) {
                i5 = ((i3 % 4 != 0 || i3 % 100 == 0) && i3 % 400 != 0) ? i5 + 365 : i5 + 366;
                i3++;
            }
        } else if (i3 > i4) {
            while (i4 < i3) {
                i5 = ((i4 % 4 != 0 || i4 % 100 == 0) && i4 % 400 != 0) ? i5 - 365 : i5 - 366;
                i4++;
            }
        }
        return i5 + (i2 - i);
    }

    public int offsetMonth(SportDay sportDay) {
        int i = this.year;
        int i2 = sportDay.year;
        return i == i2 ? this.mon - sportDay.mon : ((i - i2) * 12) + (this.mon - sportDay.mon);
    }

    public int offsetWeek(SportDay sportDay) {
        Calendar calendar = this.calendar;
        Calendar calendar2 = sportDay.calendar;
        return (this.year != sportDay.year || calendar.get(3) < calendar.get(4) || calendar2.get(3) < calendar2.get(4) || calendar.get(3) <= calendar2.get(3)) ? getWeekStartDay().offsetDay(sportDay.getWeekStartDay()) / 7 : calendar.get(3) - calendar2.get(3);
    }

    public int offsetYear(SportDay sportDay) {
        return Math.abs(this.year - sportDay.year);
    }

    public SportDay setKey(String str) {
        String[] strArrSplit = str.split("-");
        this.year = Integer.parseInt(strArrSplit[0]);
        this.mon = Integer.parseInt(strArrSplit[1]) - 1;
        this.day = Integer.parseInt(strArrSplit[2]);
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.setFirstDayOfWeek(sFirstDayOfWeek);
        calendar.setMinimalDaysInFirstWeek(sMinimalDaysInFirstWeek);
        this.calendar = calendar;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.year);
        sb.append('-');
        if (this.mon + 1 < 10) {
            sb.append(0);
        }
        sb.append(this.mon + 1);
        sb.append('-');
        if (this.day < 10) {
            sb.append(0);
        }
        sb.append(this.day);
        return sb.toString();
    }

    public SportDay(int i, int i2, int i3) {
        this.year = i;
        this.mon = i2;
        this.day = i3;
        Calendar calendar = Calendar.getInstance();
        calendar.set(this.year, this.mon, this.day);
        calendar.setFirstDayOfWeek(sFirstDayOfWeek);
        calendar.setMinimalDaysInFirstWeek(sMinimalDaysInFirstWeek);
        this.calendar = calendar;
    }

    public SportDay(Calendar calendar) {
        this.year = calendar.get(1);
        this.mon = calendar.get(2);
        this.day = calendar.get(5);
        calendar.setFirstDayOfWeek(sFirstDayOfWeek);
        calendar.setMinimalDaysInFirstWeek(sMinimalDaysInFirstWeek);
        this.calendar = calendar;
    }

    public SportDay(SportDay sportDay) {
        this(sportDay.year, sportDay.mon, sportDay.day);
    }
}
