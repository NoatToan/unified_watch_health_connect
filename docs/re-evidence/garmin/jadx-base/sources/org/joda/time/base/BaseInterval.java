package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.MutableInterval;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseInterval extends AbstractInterval implements ReadableInterval, Serializable {
    private static final long serialVersionUID = 576586928732749278L;
    private volatile Chronology iChronology;
    private volatile long iEndMillis;
    private volatile long iStartMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseInterval(Object obj, Chronology chronology) {
        IntervalConverter intervalConverter = ConverterManager.getInstance().getIntervalConverter(obj);
        if (intervalConverter.isReadableInterval(obj, chronology)) {
            ReadableInterval readableInterval = (ReadableInterval) obj;
            this.iChronology = chronology == null ? readableInterval.getChronology() : chronology;
            this.iStartMillis = readableInterval.getStartMillis();
            this.iEndMillis = readableInterval.getEndMillis();
        } else if (this instanceof ReadWritableInterval) {
            intervalConverter.setInto((ReadWritableInterval) this, obj, chronology);
        } else {
            MutableInterval mutableInterval = new MutableInterval();
            intervalConverter.setInto(mutableInterval, obj, chronology);
            this.iChronology = mutableInterval.getChronology();
            this.iStartMillis = mutableInterval.getStartMillis();
            this.iEndMillis = mutableInterval.getEndMillis();
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    @Override // org.joda.time.ReadableInterval
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.ReadableInterval
    public long getEndMillis() {
        return this.iEndMillis;
    }

    @Override // org.joda.time.ReadableInterval
    public long getStartMillis() {
        return this.iStartMillis;
    }

    public void setInterval(long j8, long j14, Chronology chronology) {
        checkInterval(j8, j14);
        this.iStartMillis = j8;
        this.iEndMillis = j14;
        this.iChronology = DateTimeUtils.getChronology(chronology);
    }

    public BaseInterval(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        if (readableInstant == null && readableInstant2 == null) {
            long jCurrentTimeMillis = DateTimeUtils.currentTimeMillis();
            this.iEndMillis = jCurrentTimeMillis;
            this.iStartMillis = jCurrentTimeMillis;
            this.iChronology = ISOChronology.getInstance();
            return;
        }
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant2);
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadableInstant readableInstant, ReadableDuration readableDuration) {
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iEndMillis = FieldUtils.safeAdd(this.iStartMillis, DateTimeUtils.getDurationMillis(readableDuration));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadableDuration readableDuration, ReadableInstant readableInstant) {
        this.iChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant);
        this.iStartMillis = FieldUtils.safeAdd(this.iEndMillis, -DateTimeUtils.getDurationMillis(readableDuration));
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadableInstant readableInstant, ReadablePeriod readablePeriod) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iChronology = instantChronology;
        this.iStartMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long j8 = this.iStartMillis;
        if (readablePeriod == null) {
            this.iEndMillis = j8;
        } else {
            this.iEndMillis = instantChronology.add(readablePeriod, j8, 1);
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(ReadablePeriod readablePeriod, ReadableInstant readableInstant) {
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        this.iChronology = instantChronology;
        this.iEndMillis = DateTimeUtils.getInstantMillis(readableInstant);
        long j8 = this.iEndMillis;
        if (readablePeriod == null) {
            this.iStartMillis = j8;
        } else {
            this.iStartMillis = instantChronology.add(readablePeriod, j8, -1);
        }
        checkInterval(this.iStartMillis, this.iEndMillis);
    }

    public BaseInterval(long j8, long j14, Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology);
        checkInterval(j8, j14);
        this.iStartMillis = j8;
        this.iEndMillis = j14;
    }
}
