package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(DurationField durationField, DurationFieldType durationFieldType, int i14) {
        super(durationField, durationFieldType);
        if (i14 == 0 || i14 == 1) {
            h.s("The scalar must not be 0 or 1");
            throw null;
        }
        this.iScalar = i14;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long add(long j8, long j14) {
        return getWrappedField().add(j8, FieldUtils.safeMultiply(j14, this.iScalar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScaledDurationField) {
            ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
            if (getWrappedField().equals(scaledDurationField.getWrappedField()) && getType() == scaledDurationField.getType() && this.iScalar == scaledDurationField.iScalar) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getDifference(long j8, long j14) {
        return getWrappedField().getDifference(j8, j14) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getDifferenceAsLong(long j8, long j14) {
        return getWrappedField().getDifferenceAsLong(j8, j14) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getMillis(long j8) {
        return getWrappedField().getMillis(FieldUtils.safeMultiply(j8, this.iScalar));
    }

    public int getScalar() {
        return this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getUnitMillis() {
        return getWrappedField().getUnitMillis() * ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getValue(long j8) {
        return getWrappedField().getValue(j8) / this.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getValueAsLong(long j8) {
        return getWrappedField().getValueAsLong(j8) / ((long) this.iScalar);
    }

    public int hashCode() {
        long j8 = this.iScalar;
        return getWrappedField().hashCode() + getType().hashCode() + ((int) (j8 ^ (j8 >>> 32)));
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public int getValue(long j8, long j14) {
        return getWrappedField().getValue(j8, j14) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getValueAsLong(long j8, long j14) {
        return getWrappedField().getValueAsLong(j8, j14) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long add(long j8, int i14) {
        return getWrappedField().add(j8, ((long) i14) * ((long) this.iScalar));
    }

    @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
    public long getMillis(int i14) {
        return getWrappedField().getMillis(((long) i14) * ((long) this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getMillis(int i14, long j8) {
        return getWrappedField().getMillis(((long) i14) * ((long) this.iScalar), j8);
    }

    @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
    public long getMillis(long j8, long j14) {
        return getWrappedField().getMillis(FieldUtils.safeMultiply(j8, this.iScalar), j14);
    }
}
