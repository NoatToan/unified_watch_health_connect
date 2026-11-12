package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i14) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i14) {
            this.iMinValue = minimumValue - 1;
        } else if (minimumValue == i14) {
            this.iMinValue = i14 + 1;
        } else {
            this.iMinValue = minimumValue;
        }
        this.iSkip = i14;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int get(long j8) {
        int i14 = super.get(j8);
        return i14 <= this.iSkip ? i14 - 1 : i14;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        FieldUtils.verifyValueBounds(this, i14, this.iMinValue, getMaximumValue());
        int i15 = this.iSkip;
        if (i14 <= i15) {
            if (i14 == i15) {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i14), (Number) null, (Number) null);
            }
            i14++;
        }
        return super.set(j8, i14);
    }

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }
}
