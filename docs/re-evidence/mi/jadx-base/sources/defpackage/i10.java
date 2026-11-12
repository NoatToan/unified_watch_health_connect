package defpackage;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i10 implements ogj, Comparable<ogj> {
    @Override // java.lang.Comparable
    public int compareTo(ogj ogjVar) {
        if (this == ogjVar) {
            return 0;
        }
        if (size() != ogjVar.size()) {
            throw new ClassCastException("ReadablePartial objects must have matching field types");
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getFieldType(i) != ogjVar.getFieldType(i)) {
                throw new ClassCastException("ReadablePartial objects must have matching field types");
            }
        }
        int size2 = size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (getValue(i2) > ogjVar.getValue(i2)) {
                return 1;
            }
            if (getValue(i2) < ogjVar.getValue(i2)) {
                return -1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogj)) {
            return false;
        }
        ogj ogjVar = (ogj) obj;
        if (size() != ogjVar.size()) {
            return false;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getValue(i) != ogjVar.getValue(i) || getFieldType(i) != ogjVar.getFieldType(i)) {
                return false;
            }
        }
        return fl9.a(getChronology(), ogjVar.getChronology());
    }

    @Override // defpackage.ogj
    public int get(DateTimeFieldType dateTimeFieldType) {
        return getValue(indexOfSupported(dateTimeFieldType));
    }

    @Override // defpackage.ogj
    public gq5 getField(int i) {
        return getField(i, getChronology());
    }

    public abstract gq5 getField(int i, bw3 bw3Var);

    @Override // defpackage.ogj
    public DateTimeFieldType getFieldType(int i) {
        return getField(i, getChronology()).getType();
    }

    public DateTimeFieldType[] getFieldTypes() {
        int size = size();
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        for (int i = 0; i < size; i++) {
            dateTimeFieldTypeArr[i] = getFieldType(i);
        }
        return dateTimeFieldTypeArr;
    }

    public gq5[] getFields() {
        int size = size();
        gq5[] gq5VarArr = new gq5[size];
        for (int i = 0; i < size; i++) {
            gq5VarArr[i] = getField(i);
        }
        return gq5VarArr;
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
        int value = 157;
        for (int i = 0; i < size; i++) {
            value = (((value * 23) + getValue(i)) * 23) + getFieldType(i).hashCode();
        }
        return value + getChronology().hashCode();
    }

    public int indexOf(DateTimeFieldType dateTimeFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getFieldType(i) == dateTimeFieldType) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfSupported(DateTimeFieldType dateTimeFieldType) {
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new IllegalArgumentException("Field '" + dateTimeFieldType + "' is not supported");
    }

    public boolean isAfter(ogj ogjVar) {
        if (ogjVar != null) {
            return compareTo(ogjVar) > 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isBefore(ogj ogjVar) {
        if (ogjVar != null) {
            return compareTo(ogjVar) < 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    public boolean isEqual(ogj ogjVar) {
        if (ogjVar != null) {
            return compareTo(ogjVar) == 0;
        }
        throw new IllegalArgumentException("Partial cannot be null");
    }

    @Override // defpackage.ogj
    public boolean isSupported(DateTimeFieldType dateTimeFieldType) {
        return indexOf(dateTimeFieldType) != -1;
    }

    public DateTime toDateTime(kgj kgjVar) {
        bw3 bw3VarG = wq5.g(kgjVar);
        return new DateTime(bw3VarG.set(this, wq5.h(kgjVar)), bw3VarG);
    }

    public String toString(jq5 jq5Var) {
        return jq5Var == null ? toString() : jq5Var.l(this);
    }

    public int indexOf(DurationFieldType durationFieldType) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (getFieldType(i).getDurationType() == durationFieldType) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfSupported(DurationFieldType durationFieldType) {
        int iIndexOf = indexOf(durationFieldType);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        throw new IllegalArgumentException("Field '" + durationFieldType + "' is not supported");
    }
}
