package org.joda.time;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.i10;
import defpackage.j10;
import defpackage.jq5;
import defpackage.kgj;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.t67;
import defpackage.wq5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Partial extends i10 implements ogj, Serializable {
    private static final long serialVersionUID = 12324121189002L;
    private final bw3 iChronology;
    private transient jq5[] iFormatter;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    public Partial() {
        this((bw3) null);
    }

    @Override // defpackage.ogj
    public bw3 getChronology() {
        return this.iChronology;
    }

    @Override // defpackage.i10
    public gq5 getField(int i, bw3 bw3Var) {
        return this.iTypes[i].getField(bw3Var);
    }

    @Override // defpackage.i10, defpackage.ogj
    public DateTimeFieldType getFieldType(int i) {
        return this.iTypes[i];
    }

    @Override // defpackage.i10
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public jq5 getFormatter() {
        jq5[] jq5VarArr = this.iFormatter;
        if (jq5VarArr == null) {
            if (size() == 0) {
                return null;
            }
            jq5VarArr = new jq5[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                jq5VarArr[0] = sxc.j(arrayList, true, false);
                if (arrayList.size() == 0) {
                    jq5VarArr[1] = jq5VarArr[0];
                }
            } catch (IllegalArgumentException unused) {
            }
            this.iFormatter = jq5VarArr;
        }
        return jq5VarArr[0];
    }

    @Override // defpackage.ogj
    public int getValue(int i) {
        return this.iValues[i];
    }

    @Override // defpackage.i10
    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public boolean isMatch(ogj ogjVar) {
        if (ogjVar == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        int i = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (ogjVar.get(dateTimeFieldTypeArr[i]) != this.iValues[i]) {
                return false;
            }
            i++;
        }
    }

    public Partial minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public Partial plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // defpackage.ogj
    public int size() {
        return this.iTypes.length;
    }

    public String toString() {
        jq5[] jq5VarArr = this.iFormatter;
        if (jq5VarArr == null) {
            getFormatter();
            jq5VarArr = this.iFormatter;
            if (jq5VarArr == null) {
                return toStringList();
            }
        }
        jq5 jq5Var = jq5VarArr[1];
        return jq5Var == null ? toStringList() : jq5Var.l(this);
    }

    public String toStringList() {
        int size = size();
        StringBuilder sb = new StringBuilder(size * 20);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(',');
                sb.append(' ');
            }
            sb.append(this.iTypes[i].getName());
            sb.append('=');
            sb.append(this.iValues[i]);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public Partial with(DateTimeFieldType dateTimeFieldType, int i) {
        int i2;
        int iCompareTo;
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("The field type must not be null");
        }
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf != -1) {
            return i == getValue(iIndexOf) ? this : new Partial(this, getField(iIndexOf).set(this, iIndexOf, getValues(), i));
        }
        int length = this.iTypes.length + 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[length];
        int[] iArr = new int[length];
        t67 field = dateTimeFieldType.getDurationType().getField(this.iChronology);
        if (field.isSupported()) {
            i2 = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                if (i2 >= dateTimeFieldTypeArr2.length) {
                    break;
                }
                DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i2];
                t67 field2 = dateTimeFieldType2.getDurationType().getField(this.iChronology);
                if (field2.isSupported() && ((iCompareTo = field.compareTo(field2)) > 0 || (iCompareTo == 0 && (dateTimeFieldType.getRangeDurationType() == null || (dateTimeFieldType2.getRangeDurationType() != null && dateTimeFieldType.getRangeDurationType().getField(this.iChronology).compareTo(dateTimeFieldType2.getRangeDurationType().getField(this.iChronology)) > 0))))) {
                    break;
                }
                i2++;
            }
        } else {
            i2 = 0;
        }
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i2);
        System.arraycopy(this.iValues, 0, iArr, 0, i2);
        dateTimeFieldTypeArr[i2] = dateTimeFieldType;
        iArr[i2] = i;
        int i3 = i2 + 1;
        int i4 = (length - i2) - 1;
        System.arraycopy(this.iTypes, i2, dateTimeFieldTypeArr, i3, i4);
        System.arraycopy(this.iValues, i2, iArr, i3, i4);
        Partial partial = new Partial(dateTimeFieldTypeArr, iArr, this.iChronology);
        this.iChronology.validate(partial, iArr);
        return partial;
    }

    public Partial withChronologyRetainFields(bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        if (bw3VarWithUTC == getChronology()) {
            return this;
        }
        Partial partial = new Partial(bw3VarWithUTC, this.iTypes, this.iValues);
        bw3VarWithUTC.validate(partial, this.iValues);
        return partial;
    }

    public Partial withField(DateTimeFieldType dateTimeFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(iIndexOfSupported)) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i));
    }

    public Partial withFieldAddWrapped(DurationFieldType durationFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).addWrapPartial(this, iIndexOfSupported, getValues(), i));
    }

    public Partial withFieldAdded(DurationFieldType durationFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i));
    }

    public Partial withPeriodAdded(qgj qgjVar, int i) {
        if (qgjVar == null || i == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i2 = 0; i2 < qgjVar.size(); i2++) {
            int iIndexOf = indexOf(qgjVar.getFieldType(i2));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).add(this, iIndexOf, values, fl9.h(qgjVar.getValue(i2), i));
            }
        }
        return new Partial(this, values);
    }

    public Partial without(DateTimeFieldType dateTimeFieldType) {
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf == -1) {
            return this;
        }
        int size = size() - 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[size];
        int size2 = size() - 1;
        int[] iArr = new int[size2];
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, iIndexOf);
        int i = iIndexOf + 1;
        System.arraycopy(this.iTypes, i, dateTimeFieldTypeArr, iIndexOf, size - iIndexOf);
        System.arraycopy(this.iValues, 0, iArr, 0, iIndexOf);
        System.arraycopy(this.iValues, i, iArr, iIndexOf, size2 - iIndexOf);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.validate(partial, iArr);
        return partial;
    }

    public Partial(bw3 bw3Var) {
        this.iChronology = wq5.c(bw3Var).withUTC();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    public static class Property extends j10 implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        public Property(Partial partial, int i) {
            this.iPartial = partial;
            this.iFieldIndex = i;
        }

        public Partial addToCopy(int i) {
            return new Partial(this.iPartial, getField().add(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public Partial addWrapFieldToCopy(int i) {
            return new Partial(this.iPartial, getField().addWrapField(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        @Override // defpackage.j10
        public int get() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        @Override // defpackage.j10
        public gq5 getField() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        public Partial getPartial() {
            return this.iPartial;
        }

        @Override // defpackage.j10
        public ogj getReadablePartial() {
            return this.iPartial;
        }

        public Partial setCopy(int i) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i));
        }

        public Partial withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public Partial setCopy(String str, Locale locale) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), str, locale));
        }

        public Partial setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i) {
        this(dateTimeFieldType, i, (bw3) null);
    }

    public boolean isMatch(kgj kgjVar) {
        long jH = wq5.h(kgjVar);
        bw3 bw3VarG = wq5.g(kgjVar);
        int i = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i].getField(bw3VarG).get(jH) != this.iValues[i]) {
                return false;
            }
            i++;
        }
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i, bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        this.iChronology = bw3VarWithUTC;
        if (dateTimeFieldType != null) {
            this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
            int[] iArr = {i};
            this.iValues = iArr;
            bw3VarWithUTC.validate(this, iArr);
            return;
        }
        throw new IllegalArgumentException("The field type must not be null");
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).l(this);
    }

    public String toString(String str, Locale locale) {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).v(locale).l(this);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (bw3) null);
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        this.iChronology = bw3VarWithUTC;
        if (dateTimeFieldTypeArr == null) {
            throw new IllegalArgumentException("Types array must not be null");
        }
        if (iArr != null) {
            if (iArr.length == dateTimeFieldTypeArr.length) {
                if (dateTimeFieldTypeArr.length == 0) {
                    this.iTypes = dateTimeFieldTypeArr;
                    this.iValues = iArr;
                    return;
                }
                int i = 0;
                for (int i2 = 0; i2 < dateTimeFieldTypeArr.length; i2++) {
                    if (dateTimeFieldTypeArr[i2] == null) {
                        throw new IllegalArgumentException("Types array must not contain null: index " + i2);
                    }
                }
                t67 t67Var = null;
                while (i < dateTimeFieldTypeArr.length) {
                    DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i];
                    t67 field = dateTimeFieldType.getDurationType().getField(this.iChronology);
                    if (i > 0) {
                        if (!field.isSupported()) {
                            if (t67Var.isSupported()) {
                                throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i - 1].getName() + " < " + dateTimeFieldType.getName());
                            }
                            throw new IllegalArgumentException("Types array must not contain duplicate unsupported: " + dateTimeFieldTypeArr[i - 1].getName() + " and " + dateTimeFieldType.getName());
                        }
                        int iCompareTo = t67Var.compareTo(field);
                        if (iCompareTo < 0) {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i - 1].getName() + " < " + dateTimeFieldType.getName());
                        }
                        if (iCompareTo != 0) {
                            continue;
                        } else if (t67Var.equals(field)) {
                            int i3 = i - 1;
                            DurationFieldType rangeDurationType = dateTimeFieldTypeArr[i3].getRangeDurationType();
                            DurationFieldType rangeDurationType2 = dateTimeFieldType.getRangeDurationType();
                            if (rangeDurationType == null) {
                                if (rangeDurationType2 == null) {
                                    throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldTypeArr[i3].getName() + " and " + dateTimeFieldType.getName());
                                }
                            } else if (rangeDurationType2 != null) {
                                t67 field2 = rangeDurationType.getField(this.iChronology);
                                t67 field3 = rangeDurationType2.getField(this.iChronology);
                                if (field2.compareTo(field3) >= 0) {
                                    if (field2.compareTo(field3) == 0) {
                                        throw new IllegalArgumentException("Types array must not contain duplicate: " + dateTimeFieldTypeArr[i3].getName() + " and " + dateTimeFieldType.getName());
                                    }
                                } else {
                                    throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i3].getName() + " < " + dateTimeFieldType.getName());
                                }
                            } else {
                                throw new IllegalArgumentException("Types array must be in order largest-smallest: " + dateTimeFieldTypeArr[i3].getName() + " < " + dateTimeFieldType.getName());
                            }
                        } else if (t67Var.isSupported() && t67Var.getType() != DurationFieldType.YEARS_TYPE) {
                            throw new IllegalArgumentException("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: " + dateTimeFieldTypeArr[i - 1].getName() + " < " + dateTimeFieldType.getName());
                        }
                    }
                    i++;
                    t67Var = field;
                }
                this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
                bw3VarWithUTC.validate(this, iArr);
                this.iValues = (int[]) iArr.clone();
                return;
            }
            throw new IllegalArgumentException("Values array must be the same length as the types array");
        }
        throw new IllegalArgumentException("Values array must not be null");
    }

    public Partial(ogj ogjVar) {
        if (ogjVar != null) {
            this.iChronology = wq5.c(ogjVar.getChronology()).withUTC();
            this.iTypes = new DateTimeFieldType[ogjVar.size()];
            this.iValues = new int[ogjVar.size()];
            for (int i = 0; i < ogjVar.size(); i++) {
                this.iTypes[i] = ogjVar.getFieldType(i);
                this.iValues[i] = ogjVar.getValue(i);
            }
            return;
        }
        throw new IllegalArgumentException("The partial must not be null");
    }

    public Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    public Partial(bw3 bw3Var, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = bw3Var;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }
}
