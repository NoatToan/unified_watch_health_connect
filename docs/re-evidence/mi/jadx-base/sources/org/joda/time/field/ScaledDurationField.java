package org.joda.time.field;

import defpackage.fl9;
import defpackage.t67;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class ScaledDurationField extends DecoratedDurationField {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int iScalar;

    public ScaledDurationField(t67 t67Var, DurationFieldType durationFieldType, int i) {
        super(t67Var, durationFieldType);
        if (i == 0 || i == 1) {
            throw new IllegalArgumentException("The scalar must not be 0 or 1");
        }
        this.iScalar = i;
    }

    @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
    public long add(long j, int i) {
        return getWrappedField().add(j, ((long) i) * ((long) this.iScalar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaledDurationField)) {
            return false;
        }
        ScaledDurationField scaledDurationField = (ScaledDurationField) obj;
        return getWrappedField().equals(scaledDurationField.getWrappedField()) && getType() == scaledDurationField.getType() && this.iScalar == scaledDurationField.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, defpackage.t67
    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, defpackage.t67
    public long getMillis(int i) {
        return getWrappedField().getMillis(((long) i) * ((long) this.iScalar));
    }

    public int getScalar() {
        return this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
    public long getUnitMillis() {
        return getWrappedField().getUnitMillis() * ((long) this.iScalar);
    }

    @Override // org.joda.time.field.BaseDurationField, defpackage.t67
    public int getValue(long j) {
        return getWrappedField().getValue(j) / this.iScalar;
    }

    @Override // org.joda.time.field.BaseDurationField, defpackage.t67
    public long getValueAsLong(long j) {
        return getWrappedField().getValueAsLong(j) / ((long) this.iScalar);
    }

    public int hashCode() {
        long j = this.iScalar;
        return ((int) (j ^ (j >>> 32))) + getType().hashCode() + getWrappedField().hashCode();
    }

    @Override // org.joda.time.field.BaseDurationField, defpackage.t67
    public int getValue(long j, long j2) {
        return getWrappedField().getValue(j, j2) / this.iScalar;
    }

    @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
    public long getValueAsLong(long j, long j2) {
        return getWrappedField().getValueAsLong(j, j2) / ((long) this.iScalar);
    }

    @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
    public long add(long j, long j2) {
        return getWrappedField().add(j, fl9.i(j2, this.iScalar));
    }

    @Override // org.joda.time.field.BaseDurationField, defpackage.t67
    public long getMillis(long j) {
        return getWrappedField().getMillis(fl9.i(j, this.iScalar));
    }

    @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
    public long getMillis(int i, long j) {
        return getWrappedField().getMillis(((long) i) * ((long) this.iScalar), j);
    }

    @Override // org.joda.time.field.DecoratedDurationField, defpackage.t67
    public long getMillis(long j, long j2) {
        return getWrappedField().getMillis(fl9.i(j, this.iScalar), j2);
    }
}
