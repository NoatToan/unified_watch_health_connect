package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadWritablePeriod extends ReadablePeriod {
    void add(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25);

    void add(DurationFieldType durationFieldType, int i14);

    void add(ReadableInterval readableInterval);

    void add(ReadablePeriod readablePeriod);

    void addDays(int i14);

    void addHours(int i14);

    void addMillis(int i14);

    void addMinutes(int i14);

    void addMonths(int i14);

    void addSeconds(int i14);

    void addWeeks(int i14);

    void addYears(int i14);

    void clear();

    void set(DurationFieldType durationFieldType, int i14);

    void setDays(int i14);

    void setHours(int i14);

    void setMillis(int i14);

    void setMinutes(int i14);

    void setMonths(int i14);

    void setPeriod(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25);

    void setPeriod(ReadableInterval readableInterval);

    void setPeriod(ReadablePeriod readablePeriod);

    void setSeconds(int i14);

    void setValue(int i14, int i15);

    void setWeeks(int i14);

    void setYears(int i14);
}
