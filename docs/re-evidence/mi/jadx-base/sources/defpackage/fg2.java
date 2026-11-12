package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public final class fg2 extends k5i {
    public final a d;

    public fg2(a aVar, t67 t67Var) {
        super(DateTimeFieldType.dayOfYear(), t67Var);
        this.d = aVar;
    }

    @Override // defpackage.k5i
    public int b(long j, int i) {
        int daysInYearMax = this.d.getDaysInYearMax() - 1;
        return (i > daysInYearMax || i < 1) ? getMaximumValue(j) : daysInYearMax;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.d.getDayOfYear(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.d.getDaysInYearMax();
    }

    @Override // defpackage.k5i, defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.d.years();
    }

    @Override // defpackage.o62, defpackage.gq5
    public boolean isLeap(long j) {
        return this.d.isLeapDay(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(long j) {
        return this.d.getDaysInYear(this.d.getYear(j));
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(ogj ogjVar) {
        if (ogjVar.isSupported(DateTimeFieldType.year())) {
            return this.d.getDaysInYear(ogjVar.get(DateTimeFieldType.year()));
        }
        return this.d.getDaysInYearMax();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue(ogj ogjVar, int[] iArr) {
        int size = ogjVar.size();
        for (int i = 0; i < size; i++) {
            if (ogjVar.getFieldType(i) == DateTimeFieldType.year()) {
                return this.d.getDaysInYear(iArr[i]);
            }
        }
        return this.d.getDaysInYearMax();
    }
}
