package org.joda.time.field;

import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final DurationField iField;

    public DecoratedDurationField(DurationField durationField, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (durationField == null) {
            h.s("The field must not be null");
            throw null;
        }
        if (durationField.isSupported()) {
            this.iField = durationField;
        } else {
            h.s("The field must be supported");
            throw null;
        }
    }

    @Override // org.joda.time.DurationField
    public long add(long j8, int i14) {
        return this.iField.add(j8, i14);
    }

    @Override // org.joda.time.DurationField
    public long getDifferenceAsLong(long j8, long j14) {
        return this.iField.getDifferenceAsLong(j8, j14);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i14, long j8) {
        return this.iField.getMillis(i14, j8);
    }

    @Override // org.joda.time.DurationField
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j8, long j14) {
        return this.iField.getValueAsLong(j8, j14);
    }

    public final DurationField getWrappedField() {
        return this.iField;
    }

    @Override // org.joda.time.DurationField
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // org.joda.time.DurationField
    public long add(long j8, long j14) {
        return this.iField.add(j8, j14);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j8, long j14) {
        return this.iField.getMillis(j8, j14);
    }
}
