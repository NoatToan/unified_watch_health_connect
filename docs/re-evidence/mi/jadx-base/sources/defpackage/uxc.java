package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.GregorianChronology;

/* JADX INFO: loaded from: classes3.dex */
public class uxc extends xs5 {
    public static final gq5 c = new uxc();

    public uxc() {
        super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra());
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
        return i < 0 ? -i : i;
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
        return 0;
    }

    @Override // defpackage.xs5, defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return GregorianChronology.getInstanceUTC().eras();
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
        fl9.n(this, i, 0, getMaximumValue());
        if (getWrappedField().get(j) < 0) {
            i = -i;
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
