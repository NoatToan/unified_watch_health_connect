package org.joda.time;

import java.io.Serializable;
import java.math.RoundingMode;
import org.apache.commons.lang3.e;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class Duration extends BaseDuration implements ReadableDuration, Serializable {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j8) {
        super(j8);
    }

    public static Duration millis(long j8) {
        return j8 == 0 ? ZERO : new Duration(j8);
    }

    @FromString
    public static Duration parse(String str) {
        return new Duration(str);
    }

    public static Duration standardDays(long j8) {
        return j8 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j8, DateTimeConstants.MILLIS_PER_DAY));
    }

    public static Duration standardHours(long j8) {
        return j8 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j8, DateTimeConstants.MILLIS_PER_HOUR));
    }

    public static Duration standardMinutes(long j8) {
        return j8 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j8, DateTimeConstants.MILLIS_PER_MINUTE));
    }

    public static Duration standardSeconds(long j8) {
        return j8 == 0 ? ZERO : new Duration(FieldUtils.safeMultiply(j8, 1000));
    }

    public Duration abs() {
        return getMillis() < 0 ? negated() : this;
    }

    public Duration dividedBy(long j8) {
        return j8 == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j8));
    }

    public long getStandardDays() {
        return getMillis() / 86400000;
    }

    public long getStandardHours() {
        return getMillis() / 3600000;
    }

    public long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public Duration minus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), -1);
    }

    public Duration multipliedBy(long j8) {
        return j8 == 1 ? this : new Duration(FieldUtils.safeMultiply(getMillis(), j8));
    }

    public Duration negated() {
        if (getMillis() != Long.MIN_VALUE) {
            return new Duration(-getMillis());
        }
        e.u("Negation of this duration would overflow");
        return null;
    }

    public Duration plus(ReadableDuration readableDuration) {
        return readableDuration == null ? this : withDurationAdded(readableDuration.getMillis(), 1);
    }

    @Override // org.joda.time.base.AbstractDuration, org.joda.time.ReadableDuration
    public Duration toDuration() {
        return this;
    }

    public Days toStandardDays() {
        return Days.days(FieldUtils.safeToInt(getStandardDays()));
    }

    public Hours toStandardHours() {
        return Hours.hours(FieldUtils.safeToInt(getStandardHours()));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(FieldUtils.safeToInt(getStandardMinutes()));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(FieldUtils.safeToInt(getStandardSeconds()));
    }

    public Duration withDurationAdded(long j8, int i14) {
        if (j8 == 0 || i14 == 0) {
            return this;
        }
        return new Duration(FieldUtils.safeAdd(getMillis(), FieldUtils.safeMultiply(j8, i14)));
    }

    public Duration withMillis(long j8) {
        return j8 == getMillis() ? this : new Duration(j8);
    }

    public Duration(long j8, long j14) {
        super(j8, j14);
    }

    public Duration(ReadableInstant readableInstant, ReadableInstant readableInstant2) {
        super(readableInstant, readableInstant2);
    }

    public Duration(Object obj) {
        super(obj);
    }

    public Duration minus(long j8) {
        return withDurationAdded(j8, -1);
    }

    public Duration plus(long j8) {
        return withDurationAdded(j8, 1);
    }

    public Duration dividedBy(long j8, RoundingMode roundingMode) {
        return j8 == 1 ? this : new Duration(FieldUtils.safeDivide(getMillis(), j8, roundingMode));
    }

    public Duration withDurationAdded(ReadableDuration readableDuration, int i14) {
        return (readableDuration == null || i14 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i14);
    }
}
