package org.joda.time.field;

import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class PreciseDurationField extends BaseDurationField {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long iUnitMillis;

    public PreciseDurationField(DurationFieldType durationFieldType, long j8) {
        super(durationFieldType);
        this.iUnitMillis = j8;
    }

    @Override // org.joda.time.DurationField
    public long add(long j8, long j14) {
        return FieldUtils.safeAdd(j8, FieldUtils.safeMultiply(j14, this.iUnitMillis));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreciseDurationField) {
            PreciseDurationField preciseDurationField = (PreciseDurationField) obj;
            if (getType() == preciseDurationField.getType() && this.iUnitMillis == preciseDurationField.iUnitMillis) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j8, long j14) {
        return FieldUtils.safeSubtract(j8, j14) / this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j8, long j14) {
        return FieldUtils.safeMultiply(j8, this.iUnitMillis);
    }

    @Override // org.joda.time.DurationField
    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j8, long j14) {
        return j8 / this.iUnitMillis;
    }

    public int hashCode() {
        long j8 = this.iUnitMillis;
        return getType().hashCode() + ((int) (j8 ^ (j8 >>> 32)));
    }

    @Override // org.joda.time.DurationField
    public final boolean isPrecise() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i14, long j8) {
        return ((long) i14) * this.iUnitMillis;
    }

    @Override // org.joda.time.DurationField
    public long add(long j8, int i14) {
        return FieldUtils.safeAdd(j8, ((long) i14) * this.iUnitMillis);
    }
}
