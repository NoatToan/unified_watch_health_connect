package defpackage;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class vik extends xs5 {
    public final int c;
    public final t67 d;
    public final t67 e;

    public vik(gq5 gq5Var, t67 t67Var, DateTimeFieldType dateTimeFieldType, int i) {
        super(gq5Var, dateTimeFieldType);
        if (i < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        this.e = t67Var;
        this.d = gq5Var.getDurationField();
        this.c = i;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long addWrapField(long j, int i) {
        return set(j, fl9.c(get(j), i, 0, this.c - 1));
    }

    public final int b(int i) {
        return i >= 0 ? i / this.c : ((i + 1) / this.c) - 1;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int get(long j) {
        int i = getWrappedField().get(j);
        if (i >= 0) {
            return i % this.c;
        }
        int i2 = this.c;
        return (i2 - 1) + ((i + 1) % i2);
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public t67 getDurationField() {
        return this.d;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.c - 1;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 0;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.e;
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
        fl9.n(this, i, 0, this.c - 1);
        return getWrappedField().set(j, (b(getWrappedField().get(j)) * this.c) + i);
    }

    public vik(k07 k07Var) {
        this(k07Var, k07Var.getType());
    }

    public vik(k07 k07Var, DateTimeFieldType dateTimeFieldType) {
        this(k07Var, k07Var.getWrappedField().getDurationField(), dateTimeFieldType);
    }

    public vik(k07 k07Var, t67 t67Var, DateTimeFieldType dateTimeFieldType) {
        super(k07Var.getWrappedField(), dateTimeFieldType);
        this.c = k07Var.c;
        this.d = t67Var;
        this.e = k07Var.d;
    }
}
