package org.joda.time.field;

import defpackage.gq5;
import defpackage.ogj;
import defpackage.t67;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedDateTimeField extends gq5 implements Serializable {
    private static HashMap<DateTimeFieldType, UnsupportedDateTimeField> cCache = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final t67 iDurationField;
    private final DateTimeFieldType iType;

    private UnsupportedDateTimeField(DateTimeFieldType dateTimeFieldType, t67 t67Var) {
        if (dateTimeFieldType == null || t67Var == null) {
            throw new IllegalArgumentException();
        }
        this.iType = dateTimeFieldType;
        this.iDurationField = t67Var;
    }

    public static synchronized UnsupportedDateTimeField getInstance(DateTimeFieldType dateTimeFieldType, t67 t67Var) {
        UnsupportedDateTimeField unsupportedDateTimeField;
        try {
            HashMap<DateTimeFieldType, UnsupportedDateTimeField> map = cCache;
            unsupportedDateTimeField = null;
            if (map == null) {
                cCache = new HashMap<>(7);
            } else {
                UnsupportedDateTimeField unsupportedDateTimeField2 = map.get(dateTimeFieldType);
                if (unsupportedDateTimeField2 == null || unsupportedDateTimeField2.getDurationField() == t67Var) {
                    unsupportedDateTimeField = unsupportedDateTimeField2;
                }
            }
            if (unsupportedDateTimeField == null) {
                unsupportedDateTimeField = new UnsupportedDateTimeField(dateTimeFieldType, t67Var);
                cCache.put(dateTimeFieldType, unsupportedDateTimeField);
            }
        } catch (Throwable th) {
            throw th;
        }
        return unsupportedDateTimeField;
    }

    private Object readResolve() {
        return getInstance(this.iType, this.iDurationField);
    }

    private UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // defpackage.gq5
    public long add(long j, int i) {
        return getDurationField().add(j, i);
    }

    @Override // defpackage.gq5
    public long addWrapField(long j, int i) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int[] addWrapPartial(ogj ogjVar, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int get(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsShortText(long j, Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsText(long j, Locale locale) {
        throw unsupported();
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
    public t67 getDurationField() {
        return this.iDurationField;
    }

    @Override // defpackage.gq5
    public int getLeapAmount(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public t67 getLeapDurationField() {
        return null;
    }

    @Override // defpackage.gq5
    public int getMaximumShortTextLength(Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMaximumTextLength(Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMaximumValue() {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMinimumValue() {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getName() {
        return this.iType.getName();
    }

    @Override // defpackage.gq5
    public t67 getRangeDurationField() {
        return null;
    }

    @Override // defpackage.gq5
    public DateTimeFieldType getType() {
        return this.iType;
    }

    @Override // defpackage.gq5
    public boolean isLeap(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public boolean isLenient() {
        return false;
    }

    @Override // defpackage.gq5
    public boolean isSupported() {
        return false;
    }

    @Override // defpackage.gq5
    public long remainder(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public long roundCeiling(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public long roundFloor(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public long roundHalfCeiling(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public long roundHalfEven(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public long roundHalfFloor(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public long set(long j, int i) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.gq5
    public long add(long j, long j2) {
        return getDurationField().add(j, j2);
    }

    @Override // defpackage.gq5
    public int[] addWrapField(ogj ogjVar, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsShortText(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsText(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMaximumValue(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMinimumValue(long j) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int[] set(ogj ogjVar, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int[] add(ogj ogjVar, int i, int[] iArr, int i2) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsShortText(ogj ogjVar, int i, Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsText(ogj ogjVar, int i, Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMaximumValue(ogj ogjVar) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMinimumValue(ogj ogjVar) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public long set(long j, String str, Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsShortText(ogj ogjVar, Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsText(ogj ogjVar, Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMaximumValue(ogj ogjVar, int[] iArr) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int getMinimumValue(ogj ogjVar, int[] iArr) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public long set(long j, String str) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsShortText(int i, Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public String getAsText(int i, Locale locale) {
        throw unsupported();
    }

    @Override // defpackage.gq5
    public int[] set(ogj ogjVar, int i, int[] iArr, String str, Locale locale) {
        throw unsupported();
    }
}
