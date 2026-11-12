package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class OffsetDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 3145790132623583142L;
    private final int iMax;
    private final int iMin;
    private final int iOffset;

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i14, int i15, int i16) {
        super(dateTimeField, dateTimeFieldType);
        if (i14 == 0) {
            h.s("The offset cannot be zero");
            throw null;
        }
        this.iOffset = i14;
        if (i15 < dateTimeField.getMinimumValue() + i14) {
            this.iMin = dateTimeField.getMinimumValue() + i14;
        } else {
            this.iMin = i15;
        }
        if (i16 > dateTimeField.getMaximumValue() + i14) {
            this.iMax = dateTimeField.getMaximumValue() + i14;
        } else {
            this.iMax = i16;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j8, int i14) {
        long jAdd = super.add(j8, i14);
        FieldUtils.verifyValueBounds(this, get(jAdd), this.iMin, this.iMax);
        return jAdd;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j8, int i14) {
        return set(j8, FieldUtils.getWrappedValue(get(j8), i14, this.iMin, this.iMax));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j8) {
        return super.get(j8) + this.iOffset;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j8) {
        return getWrappedField().getLeapAmount(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMin;
    }

    public int getOffset() {
        return this.iOffset;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j8) {
        return getWrappedField().isLeap(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j8) {
        return getWrappedField().remainder(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j8) {
        return getWrappedField().roundCeiling(j8);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j8) {
        return getWrappedField().roundFloor(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfCeiling(long j8) {
        return getWrappedField().roundHalfCeiling(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfEven(long j8) {
        return getWrappedField().roundHalfEven(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundHalfFloor(long j8) {
        return getWrappedField().roundHalfFloor(j8);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        FieldUtils.verifyValueBounds(this, i14, this.iMin, this.iMax);
        return super.set(j8, i14 - this.iOffset);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j8, long j14) {
        long jAdd = super.add(j8, j14);
        FieldUtils.verifyValueBounds(this, get(jAdd), this.iMin, this.iMax);
        return jAdd;
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i14) {
        this(dateTimeField, dateTimeFieldType, i14, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public OffsetDateTimeField(DateTimeField dateTimeField, int i14) {
        this(dateTimeField, dateTimeField == null ? null : dateTimeField.getType(), i14, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
