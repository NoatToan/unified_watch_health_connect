package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PreciseDurationDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 5004523158306266035L;
    private final DurationField iUnitField;
    final long iUnitMillis;

    public PreciseDurationDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        super(dateTimeFieldType);
        if (!durationField.isPrecise()) {
            h.s("Unit duration field must be precise");
            throw null;
        }
        long unitMillis = durationField.getUnitMillis();
        this.iUnitMillis = unitMillis;
        if (unitMillis >= 1) {
            this.iUnitField = durationField;
        } else {
            h.s("The unit milliseconds must be at least 1");
            throw null;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iUnitField;
    }

    public int getMaximumValueForSet(long j8, int i14) {
        return getMaximumValue(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    public final long getUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j8) {
        long j14 = this.iUnitMillis;
        return j8 >= 0 ? j8 % j14 : (((j8 + 1) % j14) + j14) - 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j8) {
        long j14 = this.iUnitMillis;
        if (j8 <= 0) {
            return j8 - (j8 % j14);
        }
        long j15 = j8 - 1;
        return (j15 - (j15 % j14)) + j14;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j8) {
        long j14 = this.iUnitMillis;
        if (j8 >= 0) {
            return j8 - (j8 % j14);
        }
        long j15 = j8 + 1;
        return (j15 - (j15 % j14)) - j14;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        FieldUtils.verifyValueBounds(this, i14, getMinimumValue(), getMaximumValueForSet(j8, i14));
        return (((long) (i14 - get(j8))) * this.iUnitMillis) + j8;
    }
}
