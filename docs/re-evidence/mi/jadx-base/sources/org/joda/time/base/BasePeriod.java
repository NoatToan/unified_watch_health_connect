package org.joda.time.base;

import defpackage.bw3;
import defpackage.fgj;
import defpackage.fk4;
import defpackage.fl9;
import defpackage.hgj;
import defpackage.k10;
import defpackage.kgj;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.v82;
import defpackage.vqh;
import defpackage.wq5;
import java.io.Serializable;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePeriod extends k10 implements qgj, Serializable {
    private static final qgj DUMMY_PERIOD = new a();
    private static final long serialVersionUID = -2110953284060001145L;
    private final PeriodType iType;
    private final int[] iValues;

    public static class a extends k10 {
        @Override // defpackage.qgj
        public PeriodType getPeriodType() {
            return PeriodType.time();
        }

        @Override // defpackage.qgj
        public int getValue(int i) {
            return 0;
        }
    }

    public BasePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        this.iType = checkPeriodType(periodType);
        this.iValues = setPeriodInternal(i, i2, i3, i4, i5, i6, i7, i8);
    }

    private void checkAndUpdate(DurationFieldType durationFieldType, int[] iArr, int i) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            iArr[iIndexOf] = i;
        } else {
            if (i == 0) {
                return;
            }
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType.getName() + "'");
        }
    }

    private void setPeriodInternal(qgj qgjVar) {
        int[] iArr = new int[size()];
        int size = qgjVar.size();
        for (int i = 0; i < size; i++) {
            checkAndUpdate(qgjVar.getFieldType(i), iArr, qgjVar.getValue(i));
        }
        setValues(iArr);
    }

    public void addField(DurationFieldType durationFieldType, int i) {
        addFieldInto(this.iValues, durationFieldType, i);
    }

    public void addFieldInto(int[] iArr, DurationFieldType durationFieldType, int i) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            iArr[iIndexOf] = fl9.d(iArr[iIndexOf], i);
            return;
        }
        if (i != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    public void addPeriod(qgj qgjVar) {
        if (qgjVar != null) {
            setValues(addPeriodInto(getValues(), qgjVar));
        }
    }

    public int[] addPeriodInto(int[] iArr, qgj qgjVar) {
        int size = qgjVar.size();
        for (int i = 0; i < size; i++) {
            DurationFieldType fieldType = qgjVar.getFieldType(i);
            int value = qgjVar.getValue(i);
            if (value != 0) {
                int iIndexOf = indexOf(fieldType);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Period does not support field '" + fieldType.getName() + "'");
                }
                iArr[iIndexOf] = fl9.d(getValue(iIndexOf), value);
            }
        }
        return iArr;
    }

    public PeriodType checkPeriodType(PeriodType periodType) {
        return wq5.k(periodType);
    }

    @Override // defpackage.qgj
    public PeriodType getPeriodType() {
        return this.iType;
    }

    @Override // defpackage.qgj
    public int getValue(int i) {
        return this.iValues[i];
    }

    public void mergePeriod(qgj qgjVar) {
        if (qgjVar != null) {
            setValues(mergePeriodInto(getValues(), qgjVar));
        }
    }

    public int[] mergePeriodInto(int[] iArr, qgj qgjVar) {
        int size = qgjVar.size();
        for (int i = 0; i < size; i++) {
            checkAndUpdate(qgjVar.getFieldType(i), iArr, qgjVar.getValue(i));
        }
        return iArr;
    }

    public void setField(DurationFieldType durationFieldType, int i) {
        setFieldInto(this.iValues, durationFieldType, i);
    }

    public void setFieldInto(int[] iArr, DurationFieldType durationFieldType, int i) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            iArr[iIndexOf] = i;
            return;
        }
        if (i != 0 || durationFieldType == null) {
            throw new IllegalArgumentException("Period does not support field '" + durationFieldType + "'");
        }
    }

    public void setPeriod(qgj qgjVar) {
        if (qgjVar == null) {
            setValues(new int[size()]);
        } else {
            setPeriodInternal(qgjVar);
        }
    }

    public void setValue(int i, int i2) {
        this.iValues[i] = i2;
    }

    public void setValues(int[] iArr) {
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    public Duration toDurationFrom(kgj kgjVar) {
        long jH = wq5.h(kgjVar);
        return new Duration(jH, wq5.g(kgjVar).add(this, jH, 1));
    }

    public Duration toDurationTo(kgj kgjVar) {
        long jH = wq5.h(kgjVar);
        return new Duration(wq5.g(kgjVar).add(this, jH, -1), jH);
    }

    public void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        setValues(setPeriodInternal(i, i2, i3, i4, i5, i6, i7, i8));
    }

    public BasePeriod(long j, long j2, PeriodType periodType, bw3 bw3Var) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        bw3 bw3VarC = wq5.c(bw3Var);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = bw3VarC.get(this, j, j2);
    }

    private int[] setPeriodInternal(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr = new int[size()];
        checkAndUpdate(DurationFieldType.years(), iArr, i);
        checkAndUpdate(DurationFieldType.months(), iArr, i2);
        checkAndUpdate(DurationFieldType.weeks(), iArr, i3);
        checkAndUpdate(DurationFieldType.days(), iArr, i4);
        checkAndUpdate(DurationFieldType.hours(), iArr, i5);
        checkAndUpdate(DurationFieldType.minutes(), iArr, i6);
        checkAndUpdate(DurationFieldType.seconds(), iArr, i7);
        checkAndUpdate(DurationFieldType.millis(), iArr, i8);
        return iArr;
    }

    public BasePeriod(kgj kgjVar, kgj kgjVar2, PeriodType periodType) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        if (kgjVar == null && kgjVar2 == null) {
            this.iType = periodTypeCheckPeriodType;
            this.iValues = new int[size()];
            return;
        }
        long jH = wq5.h(kgjVar);
        long jH2 = wq5.h(kgjVar2);
        bw3 bw3VarI = wq5.i(kgjVar, kgjVar2);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = bw3VarI.get(this, jH, jH2);
    }

    public BasePeriod(ogj ogjVar, ogj ogjVar2, PeriodType periodType) {
        if (ogjVar != null && ogjVar2 != null) {
            if ((ogjVar instanceof v82) && (ogjVar2 instanceof v82) && ogjVar.getClass() == ogjVar2.getClass()) {
                PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
                long localMillis = ((v82) ogjVar).getLocalMillis();
                long localMillis2 = ((v82) ogjVar2).getLocalMillis();
                bw3 bw3VarC = wq5.c(ogjVar.getChronology());
                this.iType = periodTypeCheckPeriodType;
                this.iValues = bw3VarC.get(this, localMillis, localMillis2);
                return;
            }
            if (ogjVar.size() == ogjVar2.size()) {
                int size = ogjVar.size();
                for (int i = 0; i < size; i++) {
                    if (ogjVar.getFieldType(i) != ogjVar2.getFieldType(i)) {
                        throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                    }
                }
                if (wq5.n(ogjVar)) {
                    this.iType = checkPeriodType(periodType);
                    bw3 bw3VarWithUTC = wq5.c(ogjVar.getChronology()).withUTC();
                    this.iValues = bw3VarWithUTC.get(this, bw3VarWithUTC.set(ogjVar, 0L), bw3VarWithUTC.set(ogjVar2, 0L));
                    return;
                }
                throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
            }
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        throw new IllegalArgumentException("ReadablePartial objects must not be null");
    }

    public BasePeriod(kgj kgjVar, hgj hgjVar, PeriodType periodType) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        long jH = wq5.h(kgjVar);
        long jE = fl9.e(jH, wq5.f(hgjVar));
        bw3 bw3VarG = wq5.g(kgjVar);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = bw3VarG.get(this, jH, jE);
    }

    public BasePeriod(hgj hgjVar, kgj kgjVar, PeriodType periodType) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        long jF = wq5.f(hgjVar);
        long jH = wq5.h(kgjVar);
        long jL = fl9.l(jH, jF);
        bw3 bw3VarG = wq5.g(kgjVar);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = bw3VarG.get(this, jL, jH);
    }

    public BasePeriod(long j) {
        this.iType = PeriodType.standard();
        int[] iArr = ISOChronology.getInstanceUTC().get(DUMMY_PERIOD, j);
        int[] iArr2 = new int[8];
        this.iValues = iArr2;
        System.arraycopy(iArr, 0, iArr2, 4, 4);
    }

    public BasePeriod(long j, PeriodType periodType, bw3 bw3Var) {
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType);
        bw3 bw3VarC = wq5.c(bw3Var);
        this.iType = periodTypeCheckPeriodType;
        this.iValues = bw3VarC.get(this, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BasePeriod(Object obj, PeriodType periodType, bw3 bw3Var) {
        vqh vqhVarF = fk4.b().f(obj);
        PeriodType periodTypeCheckPeriodType = checkPeriodType(periodType == null ? vqhVarF.g(obj) : periodType);
        this.iType = periodTypeCheckPeriodType;
        if (this instanceof fgj) {
            this.iValues = new int[size()];
            vqhVarF.d((fgj) this, obj, wq5.c(bw3Var));
        } else {
            this.iValues = new MutablePeriod(obj, periodTypeCheckPeriodType, bw3Var).getValues();
        }
    }

    public BasePeriod(int[] iArr, PeriodType periodType) {
        this.iType = periodType;
        this.iValues = iArr;
    }
}
