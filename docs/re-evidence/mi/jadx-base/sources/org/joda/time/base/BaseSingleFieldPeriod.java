package org.joda.time.base;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.kgj;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.t67;
import defpackage.wq5;
import java.io.Serializable;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSingleFieldPeriod implements qgj, Comparable<BaseSingleFieldPeriod>, Serializable {
    private static final long START_1972 = 63072000000L;
    private static final long serialVersionUID = 9386874258972L;
    private volatile int iPeriod;

    public BaseSingleFieldPeriod(int i) {
        this.iPeriod = i;
    }

    public static int between(kgj kgjVar, kgj kgjVar2, DurationFieldType durationFieldType) {
        if (kgjVar == null || kgjVar2 == null) {
            throw new IllegalArgumentException("ReadableInstant objects must not be null");
        }
        return durationFieldType.getField(wq5.g(kgjVar)).getDifference(kgjVar2.getMillis(), kgjVar.getMillis());
    }

    public static int standardPeriodIn(qgj qgjVar, long j) {
        if (qgjVar == null) {
            return 0;
        }
        ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
        long jE = 0;
        for (int i = 0; i < qgjVar.size(); i++) {
            int value = qgjVar.getValue(i);
            if (value != 0) {
                t67 field = qgjVar.getFieldType(i).getField(instanceUTC);
                if (!field.isPrecise()) {
                    throw new IllegalArgumentException("Cannot convert period to duration as " + field.getName() + " is not precise in the period " + qgjVar);
                }
                jE = fl9.e(jE, fl9.i(field.getUnitMillis(), value));
            }
        }
        return fl9.m(jE / j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgj)) {
            return false;
        }
        qgj qgjVar = (qgj) obj;
        return qgjVar.getPeriodType() == getPeriodType() && qgjVar.getValue(0) == getValue();
    }

    @Override // defpackage.qgj
    public int get(DurationFieldType durationFieldType) {
        if (durationFieldType == getFieldType()) {
            return getValue();
        }
        return 0;
    }

    public abstract DurationFieldType getFieldType();

    @Override // defpackage.qgj
    public DurationFieldType getFieldType(int i) {
        if (i == 0) {
            return getFieldType();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // defpackage.qgj
    public abstract PeriodType getPeriodType();

    public int getValue() {
        return this.iPeriod;
    }

    public int hashCode() {
        return ((459 + getValue()) * 27) + getFieldType().hashCode();
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return durationFieldType == getFieldType();
    }

    public void setValue(int i) {
        this.iPeriod = i;
    }

    @Override // defpackage.qgj
    public int size() {
        return 1;
    }

    public MutablePeriod toMutablePeriod() {
        MutablePeriod mutablePeriod = new MutablePeriod();
        mutablePeriod.add(this);
        return mutablePeriod;
    }

    public Period toPeriod() {
        return Period.ZERO.withFields(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        if (baseSingleFieldPeriod.getClass() == getClass()) {
            int value = baseSingleFieldPeriod.getValue();
            int value2 = getValue();
            if (value2 > value) {
                return 1;
            }
            return value2 < value ? -1 : 0;
        }
        throw new ClassCastException(getClass() + " cannot be compared to " + baseSingleFieldPeriod.getClass());
    }

    @Override // defpackage.qgj
    public int getValue(int i) {
        if (i == 0) {
            return getValue();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public static int between(ogj ogjVar, ogj ogjVar2, qgj qgjVar) {
        if (ogjVar != null && ogjVar2 != null) {
            if (ogjVar.size() == ogjVar2.size()) {
                int size = ogjVar.size();
                for (int i = 0; i < size; i++) {
                    if (ogjVar.getFieldType(i) != ogjVar2.getFieldType(i)) {
                        throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                    }
                }
                if (wq5.n(ogjVar)) {
                    bw3 bw3VarWithUTC = wq5.c(ogjVar.getChronology()).withUTC();
                    return bw3VarWithUTC.get(qgjVar, bw3VarWithUTC.set(ogjVar, START_1972), bw3VarWithUTC.set(ogjVar2, START_1972))[0];
                }
                throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
            }
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        throw new IllegalArgumentException("ReadablePartial objects must not be null");
    }
}
