package defpackage;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public class j5i extends k5i {
    public final int d;
    public final t67 e;

    public j5i(DateTimeFieldType dateTimeFieldType, t67 t67Var, t67 t67Var2) {
        super(dateTimeFieldType, t67Var);
        if (!t67Var2.isPrecise()) {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        int unitMillis = (int) (t67Var2.getUnitMillis() / c());
        this.d = unitMillis;
        if (unitMillis < 2) {
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        this.e = t67Var2;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long addWrapField(long j, int i) {
        int i2 = get(j);
        return j + (((long) (fl9.c(i2, i, getMinimumValue(), getMaximumValue()) - i2)) * c());
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return j >= 0 ? (int) ((j / c()) % ((long) this.d)) : (this.d - 1) + ((int) (((j + 1) / c()) % ((long) this.d)));
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.d - 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.e;
    }

    @Override // defpackage.k5i, defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, getMinimumValue(), getMaximumValue());
        return j + (((long) (i - get(j))) * this.f23485b);
    }
}
