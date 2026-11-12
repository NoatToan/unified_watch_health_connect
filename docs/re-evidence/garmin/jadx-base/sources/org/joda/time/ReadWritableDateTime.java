package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadWritableDateTime extends ReadableDateTime, ReadWritableInstant {
    void addDays(int i14);

    void addHours(int i14);

    void addMillis(int i14);

    void addMinutes(int i14);

    void addMonths(int i14);

    void addSeconds(int i14);

    void addWeeks(int i14);

    void addWeekyears(int i14);

    void addYears(int i14);

    void setDate(int i14, int i15, int i16);

    void setDateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24);

    void setDayOfMonth(int i14);

    void setDayOfWeek(int i14);

    void setDayOfYear(int i14);

    void setHourOfDay(int i14);

    void setMillisOfDay(int i14);

    void setMillisOfSecond(int i14);

    void setMinuteOfDay(int i14);

    void setMinuteOfHour(int i14);

    void setMonthOfYear(int i14);

    void setSecondOfDay(int i14);

    void setSecondOfMinute(int i14);

    void setTime(int i14, int i15, int i16, int i17);

    void setWeekOfWeekyear(int i14);

    void setWeekyear(int i14);

    void setYear(int i14);
}
