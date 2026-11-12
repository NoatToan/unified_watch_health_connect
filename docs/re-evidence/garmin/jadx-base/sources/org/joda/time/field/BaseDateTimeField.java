package org.joda.time.field;

import java.util.Locale;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadablePartial;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDateTimeField extends DateTimeField {
    private final DateTimeFieldType iType;

    public BaseDateTimeField(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            this.iType = dateTimeFieldType;
        } else {
            h.s("The type must not be null");
            throw null;
        }
    }

    @Override // org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        if (i15 == 0) {
            return iArr;
        }
        DateTimeField field = null;
        while (i15 > 0) {
            int maximumValue = getMaximumValue(readablePartial, iArr);
            long j8 = iArr[i14] + i15;
            if (j8 <= maximumValue) {
                iArr[i14] = (int) j8;
                break;
            }
            if (field == null) {
                if (i14 == 0) {
                    h.s("Maximum value exceeded for add");
                    return null;
                }
                field = readablePartial.getField(i14 - 1);
                if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                    h.s("Fields invalid for add");
                    return null;
                }
            }
            i15 -= (maximumValue + 1) - iArr[i14];
            iArr = field.add(readablePartial, i14 - 1, iArr, 1);
            iArr[i14] = getMinimumValue(readablePartial, iArr);
        }
        while (i15 < 0) {
            int minimumValue = getMinimumValue(readablePartial, iArr);
            long j14 = iArr[i14] + i15;
            if (j14 >= minimumValue) {
                iArr[i14] = (int) j14;
                break;
            }
            if (field == null) {
                if (i14 == 0) {
                    h.s("Maximum value exceeded for add");
                    return null;
                }
                field = readablePartial.getField(i14 - 1);
                if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                    h.s("Fields invalid for add");
                    return null;
                }
            }
            i15 -= (minimumValue - 1) - iArr[i14];
            iArr = field.add(readablePartial, i14 - 1, iArr, -1);
            iArr[i14] = getMaximumValue(readablePartial, iArr);
        }
        return set(readablePartial, i14, iArr, iArr[i14]);
    }

    @Override // org.joda.time.DateTimeField
    public long addWrapField(long j8, int i14) {
        return set(j8, FieldUtils.getWrappedValue(get(j8), i14, getMinimumValue(j8), getMaximumValue(j8)));
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapPartial(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        if (i15 == 0) {
            return iArr;
        }
        DateTimeField field = null;
        while (i15 > 0) {
            int maximumValue = getMaximumValue(readablePartial, iArr);
            int i16 = iArr[i14];
            long j8 = i16 + i15;
            if (j8 <= maximumValue) {
                iArr[i14] = (int) j8;
                break;
            }
            if (field == null) {
                if (i14 == 0) {
                    i15 -= (maximumValue + 1) - i16;
                    iArr[i14] = getMinimumValue(readablePartial, iArr);
                } else {
                    field = readablePartial.getField(i14 - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        h.s("Fields invalid for add");
                        return null;
                    }
                }
            }
            i15 -= (maximumValue + 1) - iArr[i14];
            iArr = field.addWrapPartial(readablePartial, i14 - 1, iArr, 1);
            iArr[i14] = getMinimumValue(readablePartial, iArr);
        }
        while (i15 < 0) {
            int minimumValue = getMinimumValue(readablePartial, iArr);
            int i17 = iArr[i14];
            long j14 = i17 + i15;
            if (j14 >= minimumValue) {
                iArr[i14] = (int) j14;
                break;
            }
            if (field == null) {
                if (i14 == 0) {
                    i15 -= (minimumValue - 1) - i17;
                    iArr[i14] = getMaximumValue(readablePartial, iArr);
                } else {
                    field = readablePartial.getField(i14 - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        h.s("Fields invalid for add");
                        return null;
                    }
                }
            }
            i15 -= (minimumValue - 1) - iArr[i14];
            iArr = field.addWrapPartial(readablePartial, i14 - 1, iArr, -1);
            iArr[i14] = getMaximumValue(readablePartial, iArr);
        }
        return set(readablePartial, i14, iArr, iArr[i14]);
    }

    public int convertText(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(getType(), str);
        }
    }

    @Override // org.joda.time.DateTimeField
    public abstract int get(long j8);

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(ReadablePartial readablePartial, Locale locale) {
        return getAsShortText(readablePartial, readablePartial.get(getType()), locale);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(ReadablePartial readablePartial, Locale locale) {
        return getAsText(readablePartial, readablePartial.get(getType()), locale);
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
    public abstract DurationField getDurationField();

    @Override // org.joda.time.DateTimeField
    public int getLeapAmount(long j8) {
        return 0;
    }

    @Override // org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return null;
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumTextLength(Locale locale) {
        int maximumValue = getMaximumValue();
        if (maximumValue >= 0) {
            if (maximumValue < 10) {
                return 1;
            }
            if (maximumValue < 100) {
                return 2;
            }
            if (maximumValue < 1000) {
                return 3;
            }
        }
        return Integer.toString(maximumValue).length();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMaximumValue();

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(long j8) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public abstract int getMinimumValue();

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(long j8) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.DateTimeField
    public final DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLeap(long j8) {
        return false;
    }

    @Override // org.joda.time.DateTimeField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DateTimeField
    public long remainder(long j8) {
        return j8 - roundFloor(j8);
    }

    @Override // org.joda.time.DateTimeField
    public long roundCeiling(long j8) {
        long jRoundFloor = roundFloor(j8);
        return jRoundFloor != j8 ? add(jRoundFloor, 1) : j8;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long roundFloor(long j8);

    @Override // org.joda.time.DateTimeField
    public long roundHalfCeiling(long j8) {
        long jRoundFloor = roundFloor(j8);
        long jRoundCeiling = roundCeiling(j8);
        return jRoundCeiling - j8 <= j8 - jRoundFloor ? jRoundCeiling : jRoundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfEven(long j8) {
        long jRoundFloor = roundFloor(j8);
        long jRoundCeiling = roundCeiling(j8);
        long j14 = j8 - jRoundFloor;
        long j15 = jRoundCeiling - j8;
        return (j14 >= j15 && (j15 < j14 || (get(jRoundCeiling) & 1) == 0)) ? jRoundCeiling : jRoundFloor;
    }

    @Override // org.joda.time.DateTimeField
    public long roundHalfFloor(long j8) {
        long jRoundFloor = roundFloor(j8);
        long jRoundCeiling = roundCeiling(j8);
        return j8 - jRoundFloor <= jRoundCeiling - j8 ? jRoundFloor : jRoundCeiling;
    }

    @Override // org.joda.time.DateTimeField
    public abstract long set(long j8, int i14);

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        FieldUtils.verifyValueBounds(this, i15, getMinimumValue(readablePartial, iArr), getMaximumValue(readablePartial, iArr));
        iArr[i14] = i15;
        while (true) {
            i14++;
            if (i14 >= readablePartial.size()) {
                return iArr;
            }
            DateTimeField field = readablePartial.getField(i14);
            if (iArr[i14] > field.getMaximumValue(readablePartial, iArr)) {
                iArr[i14] = field.getMaximumValue(readablePartial, iArr);
            }
            if (iArr[i14] < field.getMinimumValue(readablePartial, iArr)) {
                iArr[i14] = field.getMinimumValue(readablePartial, iArr);
            }
        }
    }

    @Override // org.joda.time.DateTimeField
    public String toString() {
        return "DateTimeField[" + getName() + ']';
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial) {
        return getMaximumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial) {
        return getMinimumValue();
    }

    @Override // org.joda.time.DateTimeField
    public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMaximumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
        return getMinimumValue(readablePartial);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsShortText(long j8) {
        return getAsShortText(j8, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public final String getAsText(long j8) {
        return getAsText(j8, (Locale) null);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(ReadablePartial readablePartial, int i14, Locale locale) {
        return getAsShortText(i14, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(ReadablePartial readablePartial, int i14, Locale locale) {
        return getAsText(i14, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(long j8, Locale locale) {
        return getAsShortText(get(j8), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(long j8, Locale locale) {
        return getAsText(get(j8), locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsShortText(int i14, Locale locale) {
        return getAsText(i14, locale);
    }

    @Override // org.joda.time.DateTimeField
    public String getAsText(int i14, Locale locale) {
        return Integer.toString(i14);
    }

    @Override // org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        return set(readablePartial, i14, iArr, FieldUtils.getWrappedValue(iArr[i14], i15, getMinimumValue(readablePartial), getMaximumValue(readablePartial)));
    }

    @Override // org.joda.time.DateTimeField
    public long set(long j8, String str, Locale locale) {
        return set(j8, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public final long set(long j8, String str) {
        return set(j8, str, null);
    }

    @Override // org.joda.time.DateTimeField
    public int[] set(ReadablePartial readablePartial, int i14, int[] iArr, String str, Locale locale) {
        return set(readablePartial, i14, iArr, convertText(str, locale));
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j8, long j14) {
        return getDurationField().add(j8, j14);
    }

    @Override // org.joda.time.DateTimeField
    public long add(long j8, int i14) {
        return getDurationField().add(j8, i14);
    }
}
