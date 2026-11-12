package org.joda.time.chrono;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.PreciseDurationDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
final class BasicDayOfMonthDateTimeField extends PreciseDurationDateTimeField {
    private static final long serialVersionUID = -4677223814028011723L;
    private final BasicChronology iChronology;

    public BasicDayOfMonthDateTimeField(BasicChronology basicChronology, DurationField durationField) {
        super(DateTimeFieldType.dayOfMonth(), durationField);
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.dayOfMonth();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j8) {
        return this.iChronology.getDayOfMonth(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        int size = readablePartial.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (readablePartial.getFieldType(i14) == DateTimeFieldType.monthOfYear()) {
                int i15 = iArr[i14];
                for (int i16 = 0; i16 < size; i16++) {
                    if (readablePartial.getFieldType(i16) == DateTimeFieldType.year()) {
                        return this.iChronology.getDaysInYearMonth(iArr[i16], i15);
                    }
                }
                return this.iChronology.getDaysInMonthMax(i15);
            }
        }
        return getMaximumValue();
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField
    public int getMaximumValueForSet(long j8, int i14) {
        return this.iChronology.getDaysInMonthMaxForSet(j8, i14);
    }

    @Override // org.joda.time.field.PreciseDurationDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.months();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j8) {
        return this.iChronology.isLeapDay(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(long j8) {
        return this.iChronology.getDaysInMonthMax(j8);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        if (readablePartial.isSupported(DateTimeFieldType.monthOfYear())) {
            int i14 = readablePartial.get(DateTimeFieldType.monthOfYear());
            if (readablePartial.isSupported(DateTimeFieldType.year())) {
                return this.iChronology.getDaysInYearMonth(readablePartial.get(DateTimeFieldType.year()), i14);
            }
            return this.iChronology.getDaysInMonthMax(i14);
        }
        return getMaximumValue();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getDaysInMonthMax();
    }
}
