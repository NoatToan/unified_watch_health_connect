package defpackage;

import org.joda.convert.ToString;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k10 implements qgj {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgj)) {
            return false;
        }
        qgj qgjVar = (qgj) obj;
        if (size() != qgjVar.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getValue(i) != qgjVar.getValue(i) || getFieldType(i) != qgjVar.getFieldType(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.qgj
    public int get(DurationFieldType durationFieldType) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf == -1) {
            return 0;
        }
        return getValue(iIndexOf);
    }

    @Override // defpackage.qgj
    public DurationFieldType getFieldType(int i) {
        return getPeriodType().getFieldType(i);
    }

    public DurationFieldType[] getFieldTypes() {
        int size = size();
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[size];
        for (int i = 0; i < size; i++) {
            durationFieldTypeArr[i] = getFieldType(i);
        }
        return durationFieldTypeArr;
    }

    public int[] getValues() {
        int size = size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = getValue(i);
        }
        return iArr;
    }

    public int hashCode() {
        int size = size();
        int value = 17;
        for (int i = 0; i < size; i++) {
            value = (((value * 27) + getValue(i)) * 27) + getFieldType(i).hashCode();
        }
        return value;
    }

    public int indexOf(DurationFieldType durationFieldType) {
        return getPeriodType().indexOf(durationFieldType);
    }

    public boolean isSupported(DurationFieldType durationFieldType) {
        return getPeriodType().isSupported(durationFieldType);
    }

    @Override // defpackage.qgj
    public int size() {
        return getPeriodType().size();
    }

    public MutablePeriod toMutablePeriod() {
        return new MutablePeriod(this);
    }

    public Period toPeriod() {
        return new Period(this);
    }

    public String toString(yqh yqhVar) {
        return yqhVar == null ? toString() : yqhVar.i(this);
    }

    @ToString
    public String toString() {
        return txc.a().i(this);
    }
}
