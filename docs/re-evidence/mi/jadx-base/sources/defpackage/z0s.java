package defpackage;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public final class z0s extends xs5 {
    public z0s(gq5 gq5Var, DateTimeFieldType dateTimeFieldType) {
        super(gq5Var, dateTimeFieldType);
        if (gq5Var.getMinimumValue() != 0) {
            throw new IllegalArgumentException("Wrapped field's minumum value must be zero");
        }
    }

    @Override // defpackage.o62, defpackage.gq5
    public long add(long j, int i) {
        return getWrappedField().add(j, i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long addWrapField(long j, int i) {
        return getWrappedField().addWrapField(j, i);
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int get(long j) {
        int i = getWrappedField().get(j);
        return i == 0 ? getMaximumValue() : i;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getLeapAmount(long j) {
        return getWrappedField().getLeapAmount(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return getWrappedField().getMaximumValue() + 1;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public boolean isLeap(long j) {
        return getWrappedField().isLeap(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long remainder(long j) {
        return getWrappedField().remainder(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundCeiling(long j) {
        return getWrappedField().roundCeiling(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundFloor(long j) {
        return getWrappedField().roundFloor(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfCeiling(long j) {
        return getWrappedField().roundHalfCeiling(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfEven(long j) {
        return getWrappedField().roundHalfEven(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundHalfFloor(long j) {
        return getWrappedField().roundHalfFloor(j);
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        int maximumValue = getMaximumValue();
        fl9.n(this, i, 1, maximumValue);
        if (i == maximumValue) {
            i = 0;
        }
        return getWrappedField().set(j, i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long add(long j, long j2) {
        return getWrappedField().add(j, j2);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int[] addWrapField(ogj ogjVar, int i, int[] iArr, int i2) {
        return getWrappedField().addWrapField(ogjVar, i, iArr, i2);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(long j) {
        return getWrappedField().getMaximumValue(j) + 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue(long j) {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(ogj ogjVar) {
        return getWrappedField().getMaximumValue(ogjVar) + 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue(ogj ogjVar) {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(ogj ogjVar, int[] iArr) {
        return getWrappedField().getMaximumValue(ogjVar, iArr) + 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue(ogj ogjVar, int[] iArr) {
        return 1;
    }
}
