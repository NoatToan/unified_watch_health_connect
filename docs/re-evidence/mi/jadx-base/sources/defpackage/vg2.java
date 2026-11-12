package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public final class vg2 extends k5i {
    public final a d;

    public vg2(a aVar, t67 t67Var) {
        super(DateTimeFieldType.weekOfWeekyear(), t67Var);
        this.d = aVar;
    }

    @Override // defpackage.k5i
    public int b(long j, int i) {
        if (i > 52) {
            return getMaximumValue(j);
        }
        return 52;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.d.getWeekOfWeekyear(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return 53;
    }

    @Override // defpackage.k5i, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.d.weekyears();
    }

    @Override // defpackage.k5i, defpackage.o62, defpackage.gq5
    public long remainder(long j) {
        return super.remainder(j + 259200000);
    }

    @Override // defpackage.k5i, defpackage.o62, defpackage.gq5
    public long roundCeiling(long j) {
        return super.roundCeiling(j + 259200000) - 259200000;
    }

    @Override // defpackage.k5i, defpackage.o62, defpackage.gq5
    public long roundFloor(long j) {
        return super.roundFloor(j + 259200000) - 259200000;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(long j) {
        return this.d.getWeeksInYear(this.d.getWeekyear(j));
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(ogj ogjVar) {
        if (!ogjVar.isSupported(DateTimeFieldType.weekyear())) {
            return 53;
        }
        return this.d.getWeeksInYear(ogjVar.get(DateTimeFieldType.weekyear()));
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(ogj ogjVar, int[] iArr) {
        int size = ogjVar.size();
        for (int i = 0; i < size; i++) {
            if (ogjVar.getFieldType(i) == DateTimeFieldType.weekyear()) {
                return this.d.getWeeksInYear(iArr[i]);
            }
        }
        return 53;
    }
}
