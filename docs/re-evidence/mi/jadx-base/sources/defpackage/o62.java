package defpackage;

import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o62 extends gq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTimeFieldType f28782a;

    public o62(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.f28782a = dateTimeFieldType;
    }

    public int a(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalFieldValueException(getType(), str);
        }
    }

    @Override // defpackage.gq5
    public int[] add(ogj ogjVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        gq5 field = null;
        while (i2 > 0) {
            int maximumValue = getMaximumValue(ogjVar, iArr);
            long j = iArr[i] + i2;
            if (j <= maximumValue) {
                iArr[i] = (int) j;
                break;
            }
            if (field == null) {
                if (i == 0) {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                field = ogjVar.getField(i - 1);
                if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            i2 -= (maximumValue + 1) - iArr[i];
            iArr = field.add(ogjVar, i - 1, iArr, 1);
            iArr[i] = getMinimumValue(ogjVar, iArr);
        }
        while (i2 < 0) {
            int minimumValue = getMinimumValue(ogjVar, iArr);
            long j2 = iArr[i] + i2;
            if (j2 >= minimumValue) {
                iArr[i] = (int) j2;
                break;
            }
            if (field == null) {
                if (i == 0) {
                    throw new IllegalArgumentException("Maximum value exceeded for add");
                }
                field = ogjVar.getField(i - 1);
                if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                    throw new IllegalArgumentException("Fields invalid for add");
                }
            }
            i2 -= (minimumValue - 1) - iArr[i];
            iArr = field.add(ogjVar, i - 1, iArr, -1);
            iArr[i] = getMaximumValue(ogjVar, iArr);
        }
        return set(ogjVar, i, iArr, iArr[i]);
    }

    @Override // defpackage.gq5
    public long addWrapField(long j, int i) {
        return set(j, fl9.c(get(j), i, getMinimumValue(j), getMaximumValue(j)));
    }

    @Override // defpackage.gq5
    public int[] addWrapPartial(ogj ogjVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        gq5 field = null;
        while (i2 > 0) {
            int maximumValue = getMaximumValue(ogjVar, iArr);
            int i3 = iArr[i];
            long j = i3 + i2;
            if (j <= maximumValue) {
                iArr[i] = (int) j;
                break;
            }
            if (field == null) {
                if (i == 0) {
                    i2 -= (maximumValue + 1) - i3;
                    iArr[i] = getMinimumValue(ogjVar, iArr);
                } else {
                    field = ogjVar.getField(i - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            i2 -= (maximumValue + 1) - iArr[i];
            iArr = field.addWrapPartial(ogjVar, i - 1, iArr, 1);
            iArr[i] = getMinimumValue(ogjVar, iArr);
        }
        while (i2 < 0) {
            int minimumValue = getMinimumValue(ogjVar, iArr);
            int i4 = iArr[i];
            long j2 = i4 + i2;
            if (j2 >= minimumValue) {
                iArr[i] = (int) j2;
                break;
            }
            if (field == null) {
                if (i == 0) {
                    i2 -= (minimumValue - 1) - i4;
                    iArr[i] = getMaximumValue(ogjVar, iArr);
                } else {
                    field = ogjVar.getField(i - 1);
                    if (getRangeDurationField().getType() != field.getDurationField().getType()) {
                        throw new IllegalArgumentException("Fields invalid for add");
                    }
                }
            }
            i2 -= (minimumValue - 1) - iArr[i];
            iArr = field.addWrapPartial(ogjVar, i - 1, iArr, -1);
            iArr[i] = getMaximumValue(ogjVar, iArr);
        }
        return set(ogjVar, i, iArr, iArr[i]);
    }

    @Override // defpackage.gq5
    public abstract int get(long j);

    @Override // defpackage.gq5
    public final String getAsShortText(long j) {
        return getAsShortText(j, (Locale) null);
    }

    @Override // defpackage.gq5
    public final String getAsText(long j) {
        return getAsText(j, (Locale) null);
    }

    @Override // defpackage.gq5
    public int getDifference(long j, long j2) {
        return getDurationField().getDifference(j, j2);
    }

    @Override // defpackage.gq5
    public long getDifferenceAsLong(long j, long j2) {
        return getDurationField().getDifferenceAsLong(j, j2);
    }

    @Override // defpackage.gq5
    public abstract t67 getDurationField();

    @Override // defpackage.gq5
    public int getLeapAmount(long j) {
        return 0;
    }

    @Override // defpackage.gq5
    public t67 getLeapDurationField() {
        return null;
    }

    @Override // defpackage.gq5
    public int getMaximumShortTextLength(Locale locale) {
        return getMaximumTextLength(locale);
    }

    @Override // defpackage.gq5
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

    @Override // defpackage.gq5
    public abstract int getMaximumValue();

    @Override // defpackage.gq5
    public int getMaximumValue(long j) {
        return getMaximumValue();
    }

    @Override // defpackage.gq5
    public abstract int getMinimumValue();

    @Override // defpackage.gq5
    public int getMinimumValue(long j) {
        return getMinimumValue();
    }

    @Override // defpackage.gq5
    public final String getName() {
        return this.f28782a.getName();
    }

    @Override // defpackage.gq5
    public abstract t67 getRangeDurationField();

    @Override // defpackage.gq5
    public final DateTimeFieldType getType() {
        return this.f28782a;
    }

    @Override // defpackage.gq5
    public boolean isLeap(long j) {
        return false;
    }

    @Override // defpackage.gq5
    public final boolean isSupported() {
        return true;
    }

    @Override // defpackage.gq5
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // defpackage.gq5
    public long roundCeiling(long j) {
        long jRoundFloor = roundFloor(j);
        return jRoundFloor != j ? add(jRoundFloor, 1) : j;
    }

    @Override // defpackage.gq5
    public abstract long roundFloor(long j);

    @Override // defpackage.gq5
    public long roundHalfCeiling(long j) {
        long jRoundFloor = roundFloor(j);
        long jRoundCeiling = roundCeiling(j);
        return jRoundCeiling - j <= j - jRoundFloor ? jRoundCeiling : jRoundFloor;
    }

    @Override // defpackage.gq5
    public long roundHalfEven(long j) {
        long jRoundFloor = roundFloor(j);
        long jRoundCeiling = roundCeiling(j);
        long j2 = j - jRoundFloor;
        long j3 = jRoundCeiling - j;
        if (j2 < j3) {
            return jRoundFloor;
        }
        return (j3 >= j2 && (get(jRoundCeiling) & 1) != 0) ? jRoundFloor : jRoundCeiling;
    }

    @Override // defpackage.gq5
    public long roundHalfFloor(long j) {
        long jRoundFloor = roundFloor(j);
        long jRoundCeiling = roundCeiling(j);
        return j - jRoundFloor <= jRoundCeiling - j ? jRoundFloor : jRoundCeiling;
    }

    @Override // defpackage.gq5
    public abstract long set(long j, int i);

    @Override // defpackage.gq5
    public final long set(long j, String str) {
        return set(j, str, null);
    }

    @Override // defpackage.gq5
    public String toString() {
        return "DateTimeField[" + getName() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // defpackage.gq5
    public int getMaximumValue(ogj ogjVar) {
        return getMaximumValue();
    }

    @Override // defpackage.gq5
    public int getMinimumValue(ogj ogjVar) {
        return getMinimumValue();
    }

    @Override // defpackage.gq5
    public String getAsShortText(long j, Locale locale) {
        return getAsShortText(get(j), locale);
    }

    @Override // defpackage.gq5
    public String getAsText(long j, Locale locale) {
        return getAsText(get(j), locale);
    }

    @Override // defpackage.gq5
    public int getMaximumValue(ogj ogjVar, int[] iArr) {
        return getMaximumValue(ogjVar);
    }

    @Override // defpackage.gq5
    public int getMinimumValue(ogj ogjVar, int[] iArr) {
        return getMinimumValue(ogjVar);
    }

    @Override // defpackage.gq5
    public int[] set(ogj ogjVar, int i, int[] iArr, int i2) {
        fl9.n(this, i2, getMinimumValue(ogjVar, iArr), getMaximumValue(ogjVar, iArr));
        iArr[i] = i2;
        while (true) {
            i++;
            if (i >= ogjVar.size()) {
                return iArr;
            }
            gq5 field = ogjVar.getField(i);
            if (iArr[i] > field.getMaximumValue(ogjVar, iArr)) {
                iArr[i] = field.getMaximumValue(ogjVar, iArr);
            }
            if (iArr[i] < field.getMinimumValue(ogjVar, iArr)) {
                iArr[i] = field.getMinimumValue(ogjVar, iArr);
            }
        }
    }

    @Override // defpackage.gq5
    public int[] addWrapField(ogj ogjVar, int i, int[] iArr, int i2) {
        return set(ogjVar, i, iArr, fl9.c(iArr[i], i2, getMinimumValue(ogjVar), getMaximumValue(ogjVar)));
    }

    @Override // defpackage.gq5
    public String getAsShortText(ogj ogjVar, int i, Locale locale) {
        return getAsShortText(i, locale);
    }

    @Override // defpackage.gq5
    public String getAsText(ogj ogjVar, int i, Locale locale) {
        return getAsText(i, locale);
    }

    @Override // defpackage.gq5
    public final String getAsShortText(ogj ogjVar, Locale locale) {
        return getAsShortText(ogjVar, ogjVar.get(getType()), locale);
    }

    @Override // defpackage.gq5
    public final String getAsText(ogj ogjVar, Locale locale) {
        return getAsText(ogjVar, ogjVar.get(getType()), locale);
    }

    @Override // defpackage.gq5
    public String getAsShortText(int i, Locale locale) {
        return getAsText(i, locale);
    }

    @Override // defpackage.gq5
    public String getAsText(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.gq5
    public long set(long j, String str, Locale locale) {
        return set(j, a(str, locale));
    }

    @Override // defpackage.gq5
    public int[] set(ogj ogjVar, int i, int[] iArr, String str, Locale locale) {
        return set(ogjVar, i, iArr, a(str, locale));
    }

    @Override // defpackage.gq5
    public long add(long j, int i) {
        return getDurationField().add(j, i);
    }

    @Override // defpackage.gq5
    public long add(long j, long j2) {
        return getDurationField().add(j, j2);
    }
}
