package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    public BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType != null) {
            this.iType = durationFieldType;
        } else {
            h.s("The type must not be null");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        long unitMillis = durationField.getUnitMillis();
        long unitMillis2 = getUnitMillis();
        if (unitMillis2 == unitMillis) {
            return 0;
        }
        return unitMillis2 < unitMillis ? -1 : 1;
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j8, long j14) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j8, j14));
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j8) {
        return FieldUtils.safeMultiply(j8, getUnitMillis());
    }

    @Override // org.joda.time.DurationField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j8) {
        return FieldUtils.safeToInt(getValueAsLong(j8));
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j8) {
        return j8 / getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        return "DurationField[" + getName() + ']';
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i14) {
        return getUnitMillis() * ((long) i14);
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j8, long j14) {
        return FieldUtils.safeToInt(getValueAsLong(j8, j14));
    }
}
