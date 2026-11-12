package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DelegatedDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -5576443481242007829L;
    private final DurationField iField;
    private final DurationFieldType iType;

    public DelegatedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        if (durationField == null) {
            h.s("The field must not be null");
            throw null;
        }
        this.iField = durationField;
        this.iType = durationFieldType == null ? durationField.getType() : durationFieldType;
    }

    @Override // org.joda.time.DurationField
    public long add(long j8, int i14) {
        return this.iField.add(j8, i14);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DelegatedDurationField) {
            return this.iField.equals(((DelegatedDurationField) obj).iField);
        }
        return false;
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j8, long j14) {
        return this.iField.getDifference(j8, j14);
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j8, long j14) {
        return this.iField.getDifferenceAsLong(j8, j14);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i14) {
        return this.iField.getMillis(i14);
    }

    @Override // org.joda.time.DurationField
    public String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j8) {
        return this.iField.getValue(j8);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j8) {
        return this.iField.getValueAsLong(j8);
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    public int hashCode() {
        return this.iField.hashCode() ^ this.iType.hashCode();
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // org.joda.time.DurationField
    public boolean isSupported() {
        return this.iField.isSupported();
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        if (this.iType == null) {
            return this.iField.toString();
        }
        return "DurationField[" + this.iType + ']';
    }

    @Override // org.joda.time.DurationField
    public long add(long j8, long j14) {
        return this.iField.add(j8, j14);
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        return this.iField.compareTo(durationField);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j8) {
        return this.iField.getMillis(j8);
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j8, long j14) {
        return this.iField.getValue(j8, j14);
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j8, long j14) {
        return this.iField.getValueAsLong(j8, j14);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i14, long j8) {
        return this.iField.getMillis(i14, j8);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j8, long j14) {
        return this.iField.getMillis(j8, j14);
    }

    public DelegatedDurationField(DurationField durationField) {
        this(durationField, null);
    }
}
