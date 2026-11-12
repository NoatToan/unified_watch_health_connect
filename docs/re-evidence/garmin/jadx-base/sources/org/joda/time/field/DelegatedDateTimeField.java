package org.joda.time.field;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DelegatedDateTimeField extends DateTimeField implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    private final DateTimeField iField;
    private final DurationField iRangeDurationField;
    private final DateTimeFieldType iType;

    public DelegatedDateTimeField(DateTimeField dateTimeField, DurationField durationField, DateTimeFieldType dateTimeFieldType) {
        if (dateTimeField == null) {
            h.s("The field must not be null");
            throw null;
        }
        this.iField = dateTimeField;
        this.iRangeDurationField = durationField;
        this.iType = dateTimeFieldType == null ? dateTimeField.getType() : dateTimeFieldType;
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j8, int i14) {
        return this.iField.add(j8, i14);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j8, int i14) {
        return this.iField.addWrapField(j8, i14);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapPartial(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        return this.iField.addWrapPartial(readablePartial, i14, iArr, i15);
    }

    @Override // org.joda.time.DateTimeField
    public int get(long j8) {
        return this.iField.get(j8);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j8, Locale locale) {
        return this.iField.getAsShortText(j8, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j8, Locale locale) {
        return this.iField.getAsText(j8, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j8, long j14) {
        return this.iField.getDifference(j8, j14);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j8, long j14) {
        return this.iField.getDifferenceAsLong(j8, j14);
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iField.getDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j8) {
        return this.iField.getLeapAmount(j8);
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iField.getLeapDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return this.iField.getMaximumShortTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        return this.iField.getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iField.getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iField.getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        DurationField durationField = this.iRangeDurationField;
        return durationField != null ? durationField : this.iField.getRangeDurationField();
    }

    @Override // org.joda.time.DateTimeField
    public DateTimeFieldType getType() {
        return this.iType;
    }

    public final DateTimeField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j8) {
        return this.iField.isLeap(j8);
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return this.iField.isLenient();
    }

    @Override // org.joda.time.DateTimeField
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j8) {
        return this.iField.remainder(j8);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j8) {
        return this.iField.roundCeiling(j8);
    }

    @Override // org.joda.time.DateTimeField
    public long roundFloor(long j8) {
        return this.iField.roundFloor(j8);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j8) {
        return this.iField.roundHalfCeiling(j8);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j8) {
        return this.iField.roundHalfEven(j8);
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j8) {
        return this.iField.roundHalfFloor(j8);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i14, int[] iArr, String str, Locale locale) {
        return this.iField.set(readablePartial, i14, iArr, str, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j8, long j14) {
        return this.iField.add(j8, j14);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        return this.iField.addWrapField(readablePartial, i14, iArr, i15);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j8) {
        return this.iField.getAsShortText(j8);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j8) {
        return this.iField.getAsText(j8);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j8) {
        return this.iField.getMaximumValue(j8);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j8) {
        return this.iField.getMinimumValue(j8);
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        return this.iField.add(readablePartial, i14, iArr, i15);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i14, Locale locale) {
        return this.iField.getAsShortText(readablePartial, i14, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i14, Locale locale) {
        return this.iField.getAsText(readablePartial, i14, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return this.iField.getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return this.iField.getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return this.iField.getAsShortText(readablePartial, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, Locale locale) {
        return this.iField.getAsText(readablePartial, locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return this.iField.getMaximumValue(readablePartial, iArr);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return this.iField.getMinimumValue(readablePartial, iArr);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i14, Locale locale) {
        return this.iField.getAsShortText(i14, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i14, Locale locale) {
        return this.iField.getAsText(i14, locale);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j8, String str, Locale locale) {
        return this.iField.set(j8, str, locale);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j8, String str) {
        return this.iField.set(j8, str);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        return this.iField.set(readablePartial, i14, iArr, i15);
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        return this.iField.set(j8, i14);
    }

    public DelegatedDateTimeField(DateTimeField dateTimeField, DateTimeFieldType dateTimeFieldType) {
        this(dateTimeField, null, dateTimeFieldType);
    }

    public DelegatedDateTimeField(DateTimeField dateTimeField) {
        this(dateTimeField, null);
    }
}
