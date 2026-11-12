package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant extends AbstractInstant implements ReadableInstant, Serializable {
    public static final Instant EPOCH = new Instant(0);
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    public Instant(Object obj) {
        this.iMillis = ConverterManager.getInstance().getInstantConverter(obj).getInstantMillis(obj, ISOChronology.getInstanceUTC());
    }

    public static Instant now() {
        return new Instant();
    }

    public static Instant ofEpochMilli(long j8) {
        return new Instant(j8);
    }

    public static Instant ofEpochSecond(long j8) {
        return new Instant(FieldUtils.safeMultiply(j8, 1000));
    }

    @FromString
    public static Instant parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser());
    }

    @Override // org.joda.time.ReadableInstant
    public Chronology getChronology() {
        return ISOChronology.getInstanceUTC();
    }

    @Override // org.joda.time.ReadableInstant
    public long getMillis() {
        return this.iMillis;
    }

    public Instant minus(long j8) {
        return withDurationAdded(j8, -1);
    }

    public Instant plus(long j8) {
        return withDurationAdded(j8, 1);
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableDateTime
    public DateTime toDateTime() {
        return new DateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // org.joda.time.base.AbstractInstant
    @Deprecated
    public DateTime toDateTimeISO() {
        return toDateTime();
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableInstant
    public Instant toInstant() {
        return this;
    }

    @Override // org.joda.time.base.AbstractInstant
    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // org.joda.time.base.AbstractInstant
    @Deprecated
    public MutableDateTime toMutableDateTimeISO() {
        return toMutableDateTime();
    }

    public Instant withDurationAdded(long j8, int i14) {
        return (j8 == 0 || i14 == 0) ? this : withMillis(getChronology().add(getMillis(), j8, i14));
    }

    public Instant withMillis(long j8) {
        return j8 == this.iMillis ? this : new Instant(j8);
    }

    public Instant minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public Instant plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    public static Instant parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toInstant();
    }

    public Instant(long j8) {
        this.iMillis = j8;
    }

    public Instant() {
        this.iMillis = DateTimeUtils.currentTimeMillis();
    }

    public Instant withDurationAdded(ReadableDuration readableDuration, int i14) {
        return (readableDuration == null || i14 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i14);
    }
}
