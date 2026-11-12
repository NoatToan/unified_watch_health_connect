package defpackage;

import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jg2 extends a {
    static final long MILLIS_PER_MONTH = 2592000000L;
    static final long MILLIS_PER_YEAR = 31557600000L;
    static final int MONTH_LENGTH = 30;
    private static final long serialVersionUID = 261387371998L;

    public jg2(bw3 bw3Var, Object obj, int i) {
        super(bw3Var, obj, i);
    }

    @Override // org.joda.time.chrono.a
    public long getAverageMillisPerMonth() {
        return MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.a
    public long getAverageMillisPerYear() {
        return MILLIS_PER_YEAR;
    }

    @Override // org.joda.time.chrono.a
    public long getAverageMillisPerYearDividedByTwo() {
        return 15778800000L;
    }

    @Override // org.joda.time.chrono.a
    public int getDayOfMonth(long j) {
        return ((getDayOfYear(j) - 1) % 30) + 1;
    }

    @Override // org.joda.time.chrono.a
    public int getDaysInMonthMax() {
        return 30;
    }

    @Override // org.joda.time.chrono.a
    public int getDaysInYearMonth(int i, int i2) {
        if (i2 != 13) {
            return 30;
        }
        return isLeapYear(i) ? 6 : 5;
    }

    @Override // org.joda.time.chrono.a
    public int getMaxMonth() {
        return 13;
    }

    @Override // org.joda.time.chrono.a
    public int getMonthOfYear(long j) {
        return ((getDayOfYear(j) - 1) / 30) + 1;
    }

    @Override // org.joda.time.chrono.a
    public long getTotalMillisByYearMonth(int i, int i2) {
        return ((long) (i2 - 1)) * MILLIS_PER_MONTH;
    }

    @Override // org.joda.time.chrono.a
    public long getYearDifference(long j, long j2) {
        int year = getYear(j);
        int year2 = getYear(j2);
        long yearMillis = j - getYearMillis(year);
        int i = year - year2;
        if (yearMillis < j2 - getYearMillis(year2)) {
            i--;
        }
        return i;
    }

    @Override // org.joda.time.chrono.a
    public boolean isLeapYear(int i) {
        return (i & 3) == 3;
    }

    @Override // org.joda.time.chrono.a
    public long setYear(long j, int i) {
        int dayOfYear = getDayOfYear(j, getYear(j));
        int millisOfDay = getMillisOfDay(j);
        if (dayOfYear > 365 && !isLeapYear(i)) {
            dayOfYear--;
        }
        return getYearMonthDayMillis(i, 1, dayOfYear) + ((long) millisOfDay);
    }

    @Override // org.joda.time.chrono.a
    public int getDaysInMonthMax(int i) {
        return i != 13 ? 30 : 6;
    }

    @Override // org.joda.time.chrono.a
    public int getMonthOfYear(long j, int i) {
        return ((int) ((j - getYearMillis(i)) / MILLIS_PER_MONTH)) + 1;
    }
}
