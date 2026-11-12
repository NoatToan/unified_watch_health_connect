package org.joda.time;

import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.field.FieldUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class MutableInterval extends BaseInterval implements ReadWritableInterval, Cloneable, Serializable {
    private static final long serialVersionUID = -5982824024992428470L;

    public MutableInterval() {
        super(0L, 0L, null);
    }

    public static MutableInterval parse(String str) {
        return new MutableInterval(str);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutableInterval copy() {
        return (MutableInterval) clone();
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setChronology(Chronology chronology) {
        super.setInterval(getStartMillis(), getEndMillis(), chronology);
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setDurationAfterStart(ReadableDuration readableDuration) {
        setEndMillis(FieldUtils.safeAdd(getStartMillis(), DateTimeUtils.getDurationMillis(readableDuration)));
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setDurationBeforeEnd(ReadableDuration readableDuration) {
        setStartMillis(FieldUtils.safeAdd(getEndMillis(), -DateTimeUtils.getDurationMillis(readableDuration)));
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setEnd(ReadableInstant readableInstant) {
        super.setInterval(getStartMillis(), DateTimeUtils.getInstantMillis(readableInstant), getChronology());
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setEndMillis(long j8) {
        super.setInterval(getStartMillis(), j8, getChronology());
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant != null || readableInstant2 != null) {
            super.setInterval(DateTimeUtils.getInstantMillis(readableInstant), DateTimeUtils.getInstantMillis(readableInstant2), DateTimeUtils.getInstantChronology(readableInstant));
        } else {
            long jCurrentTimeMillis = DateTimeUtils.currentTimeMillis();
            setInterval(jCurrentTimeMillis, jCurrentTimeMillis);
        }
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setPeriodAfterStart(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setEndMillis(getStartMillis());
        } else {
            setEndMillis(getChronology().add(readablePeriod, getStartMillis(), 1));
        }
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setPeriodBeforeEnd(ReadablePeriod readablePeriod) {
        if (readablePeriod == null) {
            setStartMillis(getEndMillis());
        } else {
            setStartMillis(getChronology().add(readablePeriod, getEndMillis(), -1));
        }
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setStart(ReadableInstant readableInstant) {
        super.setInterval(DateTimeUtils.getInstantMillis(readableInstant), getEndMillis(), getChronology());
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setStartMillis(long j8) {
        super.setInterval(j8, getEndMillis(), getChronology());
    }

    public MutableInterval(long j8, long j14) {
        super(j8, j14, null);
    }

    public MutableInterval(long j8, long j14, Chronology chronology) {
        super(j8, j14, chronology);
    }

    public MutableInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public MutableInterval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        super(readableInstant, readableDuration);
    }

    public MutableInterval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        super(readableDuration, readableInstant);
    }

    public MutableInterval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        super(readableInstant, readablePeriod);
    }

    public MutableInterval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        super(readablePeriod, readableInstant);
    }

    public void setDurationAfterStart(long j8) {
        setEndMillis(FieldUtils.safeAdd(getStartMillis(), j8));
    }

    public MutableInterval(Object obj) {
        super(obj, (Chronology) null);
    }

    public void setDurationBeforeEnd(long j8) {
        setStartMillis(FieldUtils.safeAdd(getEndMillis(), -j8));
    }

    public MutableInterval(Object obj, Chronology chronology) {
        super(obj, chronology);
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setInterval(ReadableInterval readableInterval) {
        if (readableInterval != null) {
            super.setInterval(readableInterval.getStartMillis(), readableInterval.getEndMillis(), readableInterval.getChronology());
        } else {
            h.s("Interval must not be null");
        }
    }

    @Override // org.joda.time.ReadWritableInterval
    public void setInterval(long j8, long j14) {
        super.setInterval(j8, j14, getChronology());
    }
}
