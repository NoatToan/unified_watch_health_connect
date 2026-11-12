package org.joda.time.base;

import org.joda.convert.ToString;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.ReadablePeriod;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractPeriod implements ReadablePeriod {
    @Override // org.joda.time.ReadablePeriod
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        if (size() != readablePeriod.size()) {
            return false;
        }
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            if (getValue(i14) != readablePeriod.getValue(i14) || getFieldType(i14) != readablePeriod.getFieldType(i14)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.joda.time.ReadablePeriod
    public int get(DurationFieldType durationFieldType) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf == -1) {
            return 0;
        }
        return getValue(iIndexOf);
    }

    @Override // org.joda.time.ReadablePeriod
    public DurationFieldType getFieldType(int i14) {
        return getPeriodType().getFieldType(i14);
    }

    public DurationFieldType[] getFieldTypes() {
        int size = size();
        DurationFieldType[] durationFieldTypeArr = new DurationFieldType[size];
        for (int i14 = 0; i14 < size; i14++) {
            durationFieldTypeArr[i14] = getFieldType(i14);
        }
        return durationFieldTypeArr;
    }

    public int[] getValues() {
        int size = size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = getValue(i14);
        }
        return iArr;
    }

    @Override // org.joda.time.ReadablePeriod
    public int hashCode() {
        int size = size();
        int iHashCode = 17;
        for (int i14 = 0; i14 < size; i14++) {
            iHashCode = getFieldType(i14).hashCode() + ((getValue(i14) + (iHashCode * 27)) * 27);
        }
        return iHashCode;
    }

    public int indexOf(DurationFieldType durationFieldType) {
        return getPeriodType().indexOf(durationFieldType);
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean isSupported(DurationFieldType durationFieldType) {
        return getPeriodType().isSupported(durationFieldType);
    }

    @Override // org.joda.time.ReadablePeriod
    public int size() {
        return getPeriodType().size();
    }

    @Override // org.joda.time.ReadablePeriod
    public MutablePeriod toMutablePeriod() {
        return new MutablePeriod(this);
    }

    @Override // org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return new Period(this);
    }

    public String toString(PeriodFormatter periodFormatter) {
        return periodFormatter == null ? toString() : periodFormatter.print(this);
    }

    @Override // org.joda.time.ReadablePeriod
    @ToString
    public String toString() {
        return ISOPeriodFormat.standard().print(this);
    }
}
