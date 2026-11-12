package org.joda.time;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DateTimeField {
    public abstract long add(long j8, int i14);

    public abstract long add(long j8, long j14);

    public abstract int[] add(ReadablePartial readablePartial, int i14, int[] iArr, int i15);

    public abstract long addWrapField(long j8, int i14);

    public abstract int[] addWrapField(ReadablePartial readablePartial, int i14, int[] iArr, int i15);

    public abstract int[] addWrapPartial(ReadablePartial readablePartial, int i14, int[] iArr, int i15);

    public abstract int get(long j8);

    public abstract String getAsShortText(int i14, Locale locale);

    public abstract String getAsShortText(long j8);

    public abstract String getAsShortText(long j8, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, int i14, Locale locale);

    public abstract String getAsShortText(ReadablePartial readablePartial, Locale locale);

    public abstract String getAsText(int i14, Locale locale);

    public abstract String getAsText(long j8);

    public abstract String getAsText(long j8, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, int i14, Locale locale);

    public abstract String getAsText(ReadablePartial readablePartial, Locale locale);

    public abstract int getDifference(long j8, long j14);

    public abstract long getDifferenceAsLong(long j8, long j14);

    public abstract DurationField getDurationField();

    public abstract int getLeapAmount(long j8);

    public abstract DurationField getLeapDurationField();

    public abstract int getMaximumShortTextLength(Locale locale);

    public abstract int getMaximumTextLength(Locale locale);

    public abstract int getMaximumValue();

    public abstract int getMaximumValue(long j8);

    public abstract int getMaximumValue(ReadablePartial readablePartial);

    public abstract int getMaximumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract int getMinimumValue();

    public abstract int getMinimumValue(long j8);

    public abstract int getMinimumValue(ReadablePartial readablePartial);

    public abstract int getMinimumValue(ReadablePartial readablePartial, int[] iArr);

    public abstract String getName();

    public abstract DurationField getRangeDurationField();

    public abstract DateTimeFieldType getType();

    public abstract boolean isLeap(long j8);

    public abstract boolean isLenient();

    public abstract boolean isSupported();

    public abstract long remainder(long j8);

    public abstract long roundCeiling(long j8);

    public abstract long roundFloor(long j8);

    public abstract long roundHalfCeiling(long j8);

    public abstract long roundHalfEven(long j8);

    public abstract long roundHalfFloor(long j8);

    public abstract long set(long j8, int i14);

    public abstract long set(long j8, String str);

    public abstract long set(long j8, String str, Locale locale);

    public abstract int[] set(ReadablePartial readablePartial, int i14, int[] iArr, int i15);

    public abstract int[] set(ReadablePartial readablePartial, int i14, int[] iArr, String str, Locale locale);

    public long setExtended(long j8, int i14) {
        return set(j8, i14);
    }

    public abstract String toString();
}
