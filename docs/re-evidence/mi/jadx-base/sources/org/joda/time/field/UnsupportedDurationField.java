package org.joda.time.field;

import defpackage.t67;
import java.io.Serializable;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsupportedDurationField extends t67 implements Serializable {
    private static HashMap<DurationFieldType, UnsupportedDurationField> cCache = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final DurationFieldType iType;

    private UnsupportedDurationField(DurationFieldType durationFieldType) {
        this.iType = durationFieldType;
    }

    public static synchronized UnsupportedDurationField getInstance(DurationFieldType durationFieldType) {
        UnsupportedDurationField unsupportedDurationField;
        try {
            HashMap<DurationFieldType, UnsupportedDurationField> map = cCache;
            if (map == null) {
                cCache = new HashMap<>(7);
                unsupportedDurationField = null;
            } else {
                unsupportedDurationField = map.get(durationFieldType);
            }
            if (unsupportedDurationField == null) {
                unsupportedDurationField = new UnsupportedDurationField(durationFieldType);
                cCache.put(durationFieldType, unsupportedDurationField);
            }
        } catch (Throwable th) {
            throw th;
        }
        return unsupportedDurationField;
    }

    private Object readResolve() {
        return getInstance(this.iType);
    }

    private UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException(this.iType + " field is unsupported");
    }

    @Override // defpackage.t67
    public long add(long j, int i) {
        throw unsupported();
    }

    @Override // java.lang.Comparable
    public int compareTo(t67 t67Var) {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnsupportedDurationField)) {
            return false;
        }
        UnsupportedDurationField unsupportedDurationField = (UnsupportedDurationField) obj;
        if (unsupportedDurationField.getName() == null) {
            return getName() == null;
        }
        return unsupportedDurationField.getName().equals(getName());
    }

    @Override // defpackage.t67
    public int getDifference(long j, long j2) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public long getDifferenceAsLong(long j, long j2) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public long getMillis(int i) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public String getName() {
        return this.iType.getName();
    }

    @Override // defpackage.t67
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // defpackage.t67
    public long getUnitMillis() {
        return 0L;
    }

    @Override // defpackage.t67
    public int getValue(long j) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j) {
        throw unsupported();
    }

    public int hashCode() {
        return getName().hashCode();
    }

    @Override // defpackage.t67
    public boolean isPrecise() {
        return true;
    }

    @Override // defpackage.t67
    public boolean isSupported() {
        return false;
    }

    @Override // defpackage.t67
    public String toString() {
        return "UnsupportedDurationField[" + getName() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // defpackage.t67
    public long add(long j, long j2) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public long getMillis(long j) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public int getValue(long j, long j2) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j, long j2) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public long getMillis(int i, long j) {
        throw unsupported();
    }

    @Override // defpackage.t67
    public long getMillis(long j, long j2) {
        throw unsupported();
    }
}
