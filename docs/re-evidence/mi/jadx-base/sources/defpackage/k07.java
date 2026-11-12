package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.field.ScaledDurationField;

/* JADX INFO: loaded from: classes3.dex */
public class k07 extends xs5 {
    public final int c;
    public final t67 d;
    public final t67 e;
    public final int f;
    public final int g;

    public k07(gq5 gq5Var, DateTimeFieldType dateTimeFieldType, int i) {
        this(gq5Var, gq5Var.getRangeDurationField(), dateTimeFieldType, i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long add(long j, int i) {
        return getWrappedField().add(j, i * this.c);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long addWrapField(long j, int i) {
        return set(j, fl9.c(get(j), i, this.f, this.g));
    }

    public final int b(int i) {
        if (i >= 0) {
            return i % this.c;
        }
        int i2 = this.c;
        return (i2 - 1) + ((i + 1) % i2);
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int get(long j) {
        int i = getWrappedField().get(j);
        return i >= 0 ? i / this.c : ((i + 1) / this.c) - 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2) / this.c;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2) / ((long) this.c);
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public t67 getDurationField() {
        return this.d;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.g;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return this.f;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        t67 t67Var = this.e;
        return t67Var != null ? t67Var : super.getRangeDurationField();
    }

    @Override // defpackage.o62, defpackage.gq5
    public long remainder(long j) {
        return set(j, get(getWrappedField().remainder(j)));
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundFloor(long j) {
        gq5 wrappedField = getWrappedField();
        return wrappedField.roundFloor(wrappedField.set(j, get(j) * this.c));
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, this.f, this.g);
        return getWrappedField().set(j, (i * this.c) + b(getWrappedField().get(j)));
    }

    public k07(gq5 gq5Var, t67 t67Var, DateTimeFieldType dateTimeFieldType, int i) {
        super(gq5Var, dateTimeFieldType);
        if (i < 2) {
            throw new IllegalArgumentException("The divisor must be at least 2");
        }
        t67 durationField = gq5Var.getDurationField();
        if (durationField == null) {
            this.d = null;
        } else {
            this.d = new ScaledDurationField(durationField, dateTimeFieldType.getDurationType(), i);
        }
        this.e = t67Var;
        this.c = i;
        int minimumValue = gq5Var.getMinimumValue();
        int i2 = minimumValue >= 0 ? minimumValue / i : ((minimumValue + 1) / i) - 1;
        int maximumValue = gq5Var.getMaximumValue();
        int i3 = maximumValue >= 0 ? maximumValue / i : ((maximumValue + 1) / i) - 1;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long add(long j, long j2) {
        return getWrappedField().add(j, j2 * ((long) this.c));
    }
}
