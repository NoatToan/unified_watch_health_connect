package org.joda.time.field;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedDateTimeField extends DateTimeField implements Serializable {
    private static HashMap<DateTimeFieldType, UnsupportedDateTimeField> cCache = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final DurationField iDurationField;
    private final DateTimeFieldType iType;

    private UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        if (dateTimeFieldType == null || durationField == null) {
            h.w();
            throw null;
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = durationField;
    }

    public static synchronized UnsupportedDateTimeField getInstance(DateTimeFieldType dateTimeFieldType, DurationField durationField) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        try {
            HashMap<DateTimeFieldType, UnsupportedDateTimeField> map = cCache;
            unsupportedDateTimeField = null;
            if (map == null) {
                cCache = new HashMap<>(7);
            } else {
                UnsupportedDateTimeField unsupportedDateTimeField2 = map.get(dateTimeFieldType);
                if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.getDurationField() == durationField) {
                    unsupportedDateTimeField = unsupportedDateTimeField2;
                }
            }
            if (unsupportedDateTimeField == null) {
                unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, durationField);
                cCache.put(dateTimeFieldType, unsupportedDateTimeField);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return unsupportedDateTimeField;
    }

    private Object readResolve() {
        return getInstance(this.iType, this.iDurationField);
    }

    private UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j8, int i14) {
        return getDurationField().add(j8, i14);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j8, int i14) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapPartial(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int get(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j8, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j8, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getDifference(long j8, long j14) {
        return getDurationField().getDifference(j8, j14);
    }

    @Override // org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j8, long j14) {
        return getDurationField().getDifferenceAsLong(j8, j14);
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getDurationField() {
        return this.iDurationField;
    }

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue() {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue() {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isSupported() {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long roundFloor(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j8) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i14, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i14, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j8, String str, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j8, String str) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i14, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i14, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i14, int[] iArr, String str, Locale locale) {
        throw unsupported();
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j8, long j14) {
        return getDurationField().add(j8, j14);
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        throw unsupported();
    }
}
