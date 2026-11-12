package org.joda.time.field;

import defpackage.t67;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class DecoratedDurationField extends BaseDurationField {
    private static final long serialVersionUID = 8019982251647420015L;
    private final t67 iField;

    public DecoratedDurationField(t67 t67Var, DurationFieldType durationFieldType) {
        super(durationFieldType);
        if (t67Var == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!t67Var.isSupported()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.iField = t67Var;
    }

    @Override // defpackage.t67
    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    @Override // defpackage.t67
    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    @Override // defpackage.t67
    public long getMillis(int i, long j) {
        return this.iField.getMillis(i, j);
    }

    @Override // defpackage.t67
    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    @Override // defpackage.t67
    public long getValueAsLong(long j, long j2) {
        return this.iField.getValueAsLong(j, j2);
    }

    public final t67 getWrappedField() {
        return this.iField;
    }

    @Override // defpackage.t67
    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    @Override // defpackage.t67
    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    @Override // defpackage.t67
    public long getMillis(long j, long j2) {
        return this.iField.getMillis(j, j2);
    }
}
