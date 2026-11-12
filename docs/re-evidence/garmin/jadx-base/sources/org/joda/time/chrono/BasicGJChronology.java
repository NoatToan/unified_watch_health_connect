package org.joda.time.chrono;

import org.joda.time.Chronology;

/* JADX INFO: loaded from: classes3.dex */
abstract class BasicGJChronology extends BasicChronology {
    private static final long FEB_29 = 5097600000L;
    private static final long serialVersionUID = 538276888268L;
    private static final int[] MIN_DAYS_PER_MONTH_ARRAY = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] MAX_DAYS_PER_MONTH_ARRAY = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];

    static {
        long j8 = 0;
        int i14 = 0;
        long j14 = 0;
        while (i14 < 11) {
            j8 += ((long) MIN_DAYS_PER_MONTH_ARRAY[i14]) * 86400000;
            int i15 = i14 + 1;
            MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i15] = j8;
            j14 += ((long) MAX_DAYS_PER_MONTH_ARRAY[i14]) * 86400000;
            MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i15] = j14;
            i14 = i15;
        }
    }

    public BasicGJChronology(Chronology chronology, Object obj, int i14) {
        super(chronology, obj, i14);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMax(int i14) {
        return MAX_DAYS_PER_MONTH_ARRAY[i14 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInMonthMaxForSet(long j8, int i14) {
        if (i14 > 28 || i14 < 1) {
            return getDaysInMonthMax(j8);
        }
        return 28;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getDaysInYearMonth(int i14, int i15) {
        return isLeapYear(i14) ? MAX_DAYS_PER_MONTH_ARRAY[i15 - 1] : MIN_DAYS_PER_MONTH_ARRAY[i15 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public int getMonthOfYear(long j8, int i14) {
        int yearMillis = (int) ((j8 - getYearMillis(i14)) >> 10);
        if (isLeapYear(i14)) {
            if (yearMillis < 15356250) {
                if (yearMillis < 7678125) {
                    if (yearMillis < 2615625) {
                        return 1;
                    }
                    return yearMillis < 5062500 ? 2 : 3;
                }
                if (yearMillis < 10209375) {
                    return 4;
                }
                return yearMillis < 12825000 ? 5 : 6;
            }
            if (yearMillis < 23118750) {
                if (yearMillis < 17971875) {
                    return 7;
                }
                return yearMillis < 20587500 ? 8 : 9;
            }
            if (yearMillis < 25734375) {
                return 10;
            }
            return yearMillis < 28265625 ? 11 : 12;
        }
        if (yearMillis < 15271875) {
            if (yearMillis < 7593750) {
                if (yearMillis < 2615625) {
                    return 1;
                }
                return yearMillis < 4978125 ? 2 : 3;
            }
            if (yearMillis < 10125000) {
                return 4;
            }
            return yearMillis < 12740625 ? 5 : 6;
        }
        if (yearMillis < 23034375) {
            if (yearMillis < 17887500) {
                return 7;
            }
            return yearMillis < 20503125 ? 8 : 9;
        }
        if (yearMillis < 25650000) {
            return 10;
        }
        return yearMillis < 28181250 ? 11 : 12;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getTotalMillisByYearMonth(int i14, int i15) {
        return isLeapYear(i14) ? MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i15 - 1] : MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i15 - 1];
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long getYearDifference(long j8, long j14) {
        int year = getYear(j8);
        int year2 = getYear(j14);
        long yearMillis = j8 - getYearMillis(year);
        long yearMillis2 = j14 - getYearMillis(year2);
        if (yearMillis2 >= FEB_29) {
            if (isLeapYear(year2)) {
                if (!isLeapYear(year)) {
                    yearMillis2 -= 86400000;
                }
            } else if (yearMillis >= FEB_29 && isLeapYear(year)) {
                yearMillis -= 86400000;
            }
        }
        int i14 = year - year2;
        if (yearMillis < yearMillis2) {
            i14--;
        }
        return i14;
    }

    @Override // org.joda.time.chrono.BasicChronology
    public boolean isLeapDay(long j8) {
        return dayOfMonth().get(j8) == 29 && monthOfYear().isLeap(j8);
    }

    @Override // org.joda.time.chrono.BasicChronology
    public long setYear(long j8, int i14) {
        int year = getYear(j8);
        int dayOfYear = getDayOfYear(j8, year);
        int millisOfDay = getMillisOfDay(j8);
        if (dayOfYear > 59) {
            if (isLeapYear(year)) {
                if (!isLeapYear(i14)) {
                    dayOfYear--;
                }
            } else if (isLeapYear(i14)) {
                dayOfYear++;
            }
        }
        return getYearMonthDayMillis(i14, 1, dayOfYear) + ((long) millisOfDay);
    }
}
