package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDateTime extends AbstractDateTime implements ReadableDateTime, Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile Chronology iChronology;
    private volatile long iMillis;

    public BaseDateTime(Object obj, Chronology chronology) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        this.iChronology = checkChronology(instantConverter.getChronology(obj, chronology));
        this.iMillis = checkInstant(instantConverter.getInstantMillis(obj, chronology), this.iChronology);
        adjustForMinMax();
    }

    private void adjustForMinMax() {
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == Long.MAX_VALUE) {
            this.iChronology = this.iChronology.withUTC();
        }
    }

    public Chronology checkChronology(Chronology chronology) {
        return DateTimeUtils.getChronology(chronology);
    }

    public long checkInstant(long j8, Chronology chronology) {
        return j8;
    }

    @Override // org.joda.time.ReadableInstant
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.ReadableInstant
    public long getMillis() {
        return this.iMillis;
    }

    public void setChronology(Chronology chronology) {
        this.iChronology = checkChronology(chronology);
    }

    public void setMillis(long j8) {
        this.iMillis = checkInstant(j8, this.iChronology);
    }

    public BaseDateTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public BaseDateTime(long j8) {
        this(j8, ISOChronology.getInstance());
    }

    public BaseDateTime(long j8, DateTimeZone dateTimeZone) {
        this(j8, ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(long j8, Chronology chronology) {
        this.iChronology = checkChronology(chronology);
        this.iMillis = checkInstant(j8, this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Object obj, DateTimeZone dateTimeZone) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        Chronology chronologyCheckChronology = checkChronology(instantConverter.getChronology(obj, dateTimeZone));
        this.iChronology = chronologyCheckChronology;
        this.iMillis = checkInstant(instantConverter.getInstantMillis(obj, chronologyCheckChronology), chronologyCheckChronology);
        adjustForMinMax();
    }

    public BaseDateTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public BaseDateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        this(i14, i15, i16, i17, i18, i19, i24, ISOChronology.getInstance());
    }

    public BaseDateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24, DateTimeZone dateTimeZone) {
        this(i14, i15, i16, i17, i18, i19, i24, ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(int i14, int i15, int i16, int i17, int i18, int i19, int i24, Chronology chronology) {
        this.iChronology = checkChronology(chronology);
        this.iMillis = checkInstant(this.iChronology.getDateTimeMillis(i14, i15, i16, i17, i18, i19, i24), this.iChronology);
        adjustForMinMax();
    }
}
