package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class PreciseDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -5586801265774496376L;
    private final int iRange;
    private final DurationField iRangeField;

    public PreciseDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField, DurationField durationField2) {
        super(dateTimeFieldType, durationField);
        if (!durationField2.isPrecise()) {
            h.s("Range duration field must be precise");
            throw null;
        }
        int unitMillis = (int) (durationField2.getUnitMillis() / getUnitMillis());
        this.iRange = unitMillis;
        if (unitMillis >= 2) {
            this.iRangeField = durationField2;
        } else {
            h.s("The effective range must be at least 2");
            throw null;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j8, int i14) {
        int i15 = get(j8);
        return (getUnitMillis() * ((long) (FieldUtils.getWrappedValue(i15, i14, getMinimumValue(), getMaximumValue()) - i15))) + j8;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j8) {
        return j8 >= 0 ? (int) ((j8 / getUnitMillis()) % ((long) this.iRange)) : (this.iRange - 1) + ((int) (((j8 + 1) / getUnitMillis()) % ((long) this.iRange)));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iRange - 1;
    }

    public int getRange() {
        return this.iRange;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iRangeField;
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        FieldUtils.verifyValueBounds(this, i14, getMinimumValue(), getMaximumValue());
        return (((long) (i14 - get(j8))) * this.iUnitMillis) + j8;
    }
}
