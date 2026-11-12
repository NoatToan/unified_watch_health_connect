package org.joda.time.chrono;

import am.j;
import org.joda.time.Chronology;

/* JADX INFO: loaded from: classes3.dex */
abstract class BasicFixedMonthChronology extends BasicChronology {
    static final long MILLIS_PER_MONTH = 2592000000L;
    static final long MILLIS_PER_YEAR = 31557600000L;
    static final int MONTH_LENGTH = 30;
    private static final long serialVersionUID = 261387371998L;

    public BasicFixedMonthChronology(Chronology chronology, Object obj, int i14) {
        super(chronology, obj, i14);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDayOfMonth(long j8) {
        return ((getDayOfYear(j8) - 1) % 30) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i14) {
        return i14 != 13 ? 30 : 6;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i14, int i15) {
        if (i15 != 13) {
            return 30;
        }
        return isLeapYear(i14) ? 6 : 5;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMaxMonth() {
        return 13;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j8, int i14) {
        return ((int) ((j8 - getYearMillis(i14)) / MILLIS_PER_MONTH)) + 1;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i14, int i15) {
        return ((long) (i15 - 1)) * MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j8, long j14) {
        int year = getYear(j8);
        int year2 = getYear(j14);
        long yearMillis = j8 - getYearMillis(year);
        int i14 = year - year2;
        if (yearMillis < j14 - getYearMillis(year2)) {
            i14--;
        }
        return i14;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapYear(int i14) {
        return (i14 & 3) == 3;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j8, int i14) {
        int dayOfYear = getDayOfYear(j8, getYear(j8));
        int millisOfDay = getMillisOfDay(j8);
        if (dayOfYear > 365 && !isLeapYear(i14)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i14, 1, dayOfYear) + ((long) millisOfDay);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax() {
        return 30;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j8) {
        return j.a(getDayOfYear(j8), 1, 30, 1);
    }
}
