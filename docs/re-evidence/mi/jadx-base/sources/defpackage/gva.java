package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public final class gva extends xs5 {
    public final a c;

    public gva(gq5 gq5Var, a aVar) {
        super(gq5Var, DateTimeFieldType.yearOfEra());
        this.c = aVar;
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
        return i <= 0 ? 1 - i : i;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getDifference(long j, long j2) {
        return getWrappedField().getDifference(j, j2);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long getDifferenceAsLong(long j, long j2) {
        return getWrappedField().getDifferenceAsLong(j, j2);
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return getWrappedField().getMaximumValue();
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 1;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.c.eras();
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

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, 1, getMaximumValue());
        if (this.c.getYear(j) <= 0) {
            i = 1 - i;
        }
        return super.set(j, i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long add(long j, long j2) {
        return getWrappedField().add(j, j2);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int[] addWrapField(ogj ogjVar, int i, int[] iArr, int i2) {
        return getWrappedField().addWrapField(ogjVar, i, iArr, i2);
    }
}
