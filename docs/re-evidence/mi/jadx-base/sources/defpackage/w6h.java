package defpackage;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class w6h extends xs5 {
    public final int c;
    public final int d;
    public final int e;

    public w6h(gq5 gq5Var, int i) {
        this(gq5Var, gq5Var == null ? null : gq5Var.getType(), i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long add(long j, int i) {
        long jAdd = super.add(j, i);
        fl9.n(this, get(jAdd), this.d, this.e);
        return jAdd;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long addWrapField(long j, int i) {
        return set(j, fl9.c(get(j), i, this.d, this.e));
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int get(long j) {
        return super.get(j) + this.c;
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
        return this.e;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return this.d;
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
        fl9.n(this, i, this.d, this.e);
        return super.set(j, i - this.c);
    }

    public w6h(gq5 gq5Var, DateTimeFieldType dateTimeFieldType, int i) {
        this(gq5Var, dateTimeFieldType, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long add(long j, long j2) {
        long jAdd = super.add(j, j2);
        fl9.n(this, get(jAdd), this.d, this.e);
        return jAdd;
    }

    public w6h(gq5 gq5Var, DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        super(gq5Var, dateTimeFieldType);
        if (i != 0) {
            this.c = i;
            if (i2 < gq5Var.getMinimumValue() + i) {
                this.d = gq5Var.getMinimumValue() + i;
            } else {
                this.d = i2;
            }
            if (i3 > gq5Var.getMaximumValue() + i) {
                this.e = gq5Var.getMaximumValue() + i;
                return;
            } else {
                this.e = i3;
                return;
            }
        }
        throw new IllegalArgumentException("The offset cannot be zero");
    }
}
