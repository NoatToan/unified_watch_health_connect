package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public final class eg2 extends k5i {
    public final a d;

    public eg2(a aVar, t67 t67Var) {
        super(DateTimeFieldType.dayOfMonth(), t67Var);
        this.d = aVar;
    }

    @Override // defpackage.k5i
    public int b(long j, int i) {
        return this.d.getDaysInMonthMaxForSet(j, i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.d.getDayOfMonth(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.d.getDaysInMonthMax();
    }

    @Override // defpackage.k5i, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.d.months();
    }

    @Override // defpackage.o62, defpackage.gq5
    public boolean isLeap(long j) {
        return this.d.isLeapDay(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(long j) {
        return this.d.getDaysInMonthMax(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(ogj ogjVar) {
        if (ogjVar.isSupported(DateTimeFieldType.monthOfYear())) {
            int i = ogjVar.get(DateTimeFieldType.monthOfYear());
            if (ogjVar.isSupported(DateTimeFieldType.year())) {
                return this.d.getDaysInYearMonth(ogjVar.get(DateTimeFieldType.year()), i);
            }
            return this.d.getDaysInMonthMax(i);
        }
        return getMaximumValue();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(ogj ogjVar, int[] iArr) {
        int size = ogjVar.size();
        for (int i = 0; i < size; i++) {
            if (ogjVar.getFieldType(i) == DateTimeFieldType.monthOfYear()) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < size; i3++) {
                    if (ogjVar.getFieldType(i3) == DateTimeFieldType.year()) {
                        return this.d.getDaysInYearMonth(iArr[i3], i2);
                    }
                }
                return this.d.getDaysInMonthMax(i2);
            }
        }
        return getMaximumValue();
    }
}
