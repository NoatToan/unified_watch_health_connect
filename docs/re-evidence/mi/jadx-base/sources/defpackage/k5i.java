package defpackage;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k5i extends o62 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23485b;
    public final t67 c;

    public k5i(DateTimeFieldType dateTimeFieldType, t67 t67Var) {
        super(dateTimeFieldType);
        if (!t67Var.isPrecise()) {
            throw new IllegalArgumentException("Unit duration field must be precise");
        }
        long unitMillis = t67Var.getUnitMillis();
        this.f23485b = unitMillis;
        if (unitMillis < 1) {
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        this.c = t67Var;
    }

    public int b(long j, int i) {
        return getMaximumValue(j);
    }

    public final long c() {
        return this.f23485b;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getDurationField() {
        return this.c;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 0;
    }

    @Override // defpackage.gq5
    public boolean isLenient() {
        return false;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long remainder(long j) {
        if (j >= 0) {
            return j % this.f23485b;
        }
        long j2 = this.f23485b;
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundCeiling(long j) {
        if (j <= 0) {
            return j - (j % this.f23485b);
        }
        long j2 = j - 1;
        long j3 = this.f23485b;
        return (j2 - (j2 % j3)) + j3;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundFloor(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.f23485b;
        } else {
            long j3 = j + 1;
            j2 = this.f23485b;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, getMinimumValue(), b(j, i));
        return j + (((long) (i - get(j))) * this.f23485b);
    }
}
