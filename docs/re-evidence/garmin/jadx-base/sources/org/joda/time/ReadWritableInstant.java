package org.joda.time;

/* JADX INFO: loaded from: classes3.dex */
public interface ReadWritableInstant extends ReadableInstant {
    void add(long j8);

    void add(DurationFieldType durationFieldType, int i14);

    void add(ReadableDuration readableDuration);

    void add(ReadableDuration readableDuration, int i14);

    void add(ReadablePeriod readablePeriod);

    void add(ReadablePeriod readablePeriod, int i14);

    void set(DateTimeFieldType dateTimeFieldType, int i14);

    void setChronology(Chronology chronology);

    void setMillis(long j8);

    void setMillis(ReadableInstant readableInstant);

    void setZone(DateTimeZone dateTimeZone);

    void setZoneRetainFields(DateTimeZone dateTimeZone);
}
