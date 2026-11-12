package org.joda.time.field;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DividedDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = 8318475124230605365L;
    final int iDivisor;
    final DurationField iDurationField;
    private final int iMax;
    private final int iMin;
    final DurationField iRangeDurationField;

    public DividedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType, int i14) {
        super(dateTimeField, dateTimeFieldType);
        if (i14 < 2) {
            h.s("The divisor must be at least 2");
            throw null;
        }
        DurationField durationField2 = dateTimeField.getDurationField();
        if (durationField2 == null) {
            this.iDurationField = null;
        } else {
            this.iDurationField = new ScaledDurationField(durationField2, dateTimeFieldType.getDurationType(), i14);
        }
        this.iRangeDurationField = durationField;
        this.iDivisor = i14;
        int minimumValue = dateTimeField.getMinimumValue();
        int i15 = minimumValue >= 0 ? minimumValue / i14 : ((minimumValue + 1) / i14) - 1;
        int maximumValue = dateTimeField.getMaximumValue();
        int i16 = maximumValue >= 0 ? maximumValue / i14 : ((maximumValue + 1) / i14) - 1;
        this.iMin = i15;
        this.iMax = i16;
    }

    private int getRemainder(int i14) {
        int i15 = this.iDivisor;
        if (i14 >= 0) {
            return i14 % i15;
        }
        return ((i14 + 1) % i15) + (i15 - 1);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j8, long j14) {
        return getWrappedField().add(j8, j14 * ((long) this.iDivisor));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j8, int i14) {
        return set(j8, FieldUtils.getWrappedValue(get(j8), i14, this.iMin, this.iMax));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j8) {
        int i14 = getWrappedField().get(j8);
        int i15 = this.iDivisor;
        return i14 >= 0 ? i14 / i15 : ((i14 + 1) / i15) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j8, long j14) {
        return getWrappedField().getDifference(j8, j14) / this.iDivisor;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j8, long j14) {
        return getWrappedField().getDifferenceAsLong(j8, j14) / ((long) this.iDivisor);
    }

    public int getDivisor() {
        return this.iDivisor;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iDurationField;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMin;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        return durationField != null ? durationField : super.getRangeDurationField();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j8) {
        return set(j8, get(getWrappedField().remainder(j8)));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j8) {
        DateTimeField wrappedField = getWrappedField();
        return wrappedField.roundFloor(wrappedField.set(j8, get(j8) * this.iDivisor));
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        FieldUtils.verifyValueBounds(this, i14, this.iMin, this.iMax);
        return getWrappedField().set(j8, (i14 * this.iDivisor) + getRemainder(getWrappedField().get(j8)));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j8, int i14) {
        return getWrappedField().add(j8, i14 * this.iDivisor);
    }

    public DividedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType, int i14) {
        this(dateTimeField, dateTimeField.getRangeDurationField(), dateTimeFieldType, i14);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(remainderDateTimeField, (DurationField) null, dateTimeFieldType);
    }

    public DividedDateTimeField(RemainderDateTimeField remainderDateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        super(remainderDateTimeField.getWrappedField(), dateTimeFieldType);
        int i14 = remainderDateTimeField.iDivisor;
        this.iDivisor = i14;
        this.iDurationField = remainderDateTimeField.iRangeField;
        this.iRangeDurationField = durationField;
        DateTimeField wrappedField = getWrappedField();
        int minimumValue = wrappedField.getMinimumValue();
        int i15 = minimumValue >= 0 ? minimumValue / i14 : ((minimumValue + 1) / i14) - 1;
        int maximumValue = wrappedField.getMaximumValue();
        int i16 = maximumValue >= 0 ? maximumValue / i14 : ((maximumValue + 1) / i14) - 1;
        this.iMin = i15;
        this.iMax = i16;
    }
}
