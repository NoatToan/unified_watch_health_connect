package org.joda.time;

import am.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.commons.lang3.e;
import org.joda.time.base.AbstractPartial;
import org.joda.time.field.AbstractPartialFieldProperty;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class Partial extends AbstractPartial implements ReadablePartial, Serializable {
    private static final long serialVersionUID = 12324121189002L;
    private final Chronology iChronology;
    private transient DateTimeFormatter[] iFormatter;
    private final DateTimeFieldType[] iTypes;
    private final int[] iValues;

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = chronologyWithUTC;
        if (dateTimeFieldTypeArr == null) {
            h.s("Types array must not be null");
            throw null;
        }
        if (iArr == null) {
            h.s("Values array must not be null");
            throw null;
        }
        if (iArr.length != dateTimeFieldTypeArr.length) {
            h.s("Values array must be the same length as the types array");
            throw null;
        }
        if (dateTimeFieldTypeArr.length == 0) {
            this.iTypes = dateTimeFieldTypeArr;
            this.iValues = iArr;
            return;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < dateTimeFieldTypeArr.length; i15++) {
            if (dateTimeFieldTypeArr[i15] == null) {
                h.s(j.h(i15, "Types array must not contain null: index "));
                throw null;
            }
        }
        DurationField durationField = null;
        while (i14 < dateTimeFieldTypeArr.length) {
            DateTimeFieldType dateTimeFieldType = dateTimeFieldTypeArr[i14];
            DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
            if (i14 > 0) {
                if (!field.isSupported()) {
                    if (durationField.isSupported()) {
                        e.m("Types array must be in order largest-smallest: ", dateTimeFieldTypeArr[i14 - 1].getName(), " < ", dateTimeFieldType.getName());
                        throw null;
                    }
                    e.m("Types array must not contain duplicate unsupported: ", dateTimeFieldTypeArr[i14 - 1].getName(), " and ", dateTimeFieldType.getName());
                    throw null;
                }
                int iCompareTo = durationField.compareTo(field);
                if (iCompareTo < 0) {
                    e.m("Types array must be in order largest-smallest: ", dateTimeFieldTypeArr[i14 - 1].getName(), " < ", dateTimeFieldType.getName());
                    throw null;
                }
                if (iCompareTo != 0) {
                    continue;
                } else if (durationField.equals(field)) {
                    int i16 = i14 - 1;
                    DurationFieldType rangeDurationType = dateTimeFieldTypeArr[i16].getRangeDurationType();
                    DurationFieldType rangeDurationType2 = dateTimeFieldType.getRangeDurationType();
                    if (rangeDurationType == null) {
                        if (rangeDurationType2 == null) {
                            e.m("Types array must not contain duplicate: ", dateTimeFieldTypeArr[i16].getName(), " and ", dateTimeFieldType.getName());
                            throw null;
                        }
                    } else {
                        if (rangeDurationType2 == null) {
                            e.m("Types array must be in order largest-smallest: ", dateTimeFieldTypeArr[i16].getName(), " < ", dateTimeFieldType.getName());
                            throw null;
                        }
                        DurationField field2 = rangeDurationType.getField(this.iChronology);
                        DurationField field3 = rangeDurationType2.getField(this.iChronology);
                        if (field2.compareTo(field3) < 0) {
                            e.m("Types array must be in order largest-smallest: ", dateTimeFieldTypeArr[i16].getName(), " < ", dateTimeFieldType.getName());
                            throw null;
                        }
                        if (field2.compareTo(field3) == 0) {
                            e.m("Types array must not contain duplicate: ", dateTimeFieldTypeArr[i16].getName(), " and ", dateTimeFieldType.getName());
                            throw null;
                        }
                    }
                } else if (durationField.isSupported() && durationField.getType() != DurationFieldType.YEARS_TYPE) {
                    e.m("Types array must be in order largest-smallest, for year-based fields, years is defined as being largest: ", dateTimeFieldTypeArr[i14 - 1].getName(), " < ", dateTimeFieldType.getName());
                    throw null;
                }
            }
            i14++;
            durationField = field;
        }
        this.iTypes = (DateTimeFieldType[]) dateTimeFieldTypeArr.clone();
        chronologyWithUTC.validate(this, iArr);
        this.iValues = (int[]) iArr.clone();
    }

    @Override // org.joda.time.ReadablePartial
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeField getField(int i14, Chronology chronology) {
        return this.iTypes[i14].getField(chronology);
    }

    @Override // org.joda.time.base.AbstractPartial, org.joda.time.ReadablePartial
    public DateTimeFieldType getFieldType(int i14) {
        return this.iTypes[i14];
    }

    @Override // org.joda.time.base.AbstractPartial
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) this.iTypes.clone();
    }

    public DateTimeFormatter getFormatter() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        if (dateTimeFormatterArr == null) {
            if (size() == 0) {
                return null;
            }
            dateTimeFormatterArr = new DateTimeFormatter[2];
            try {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.iTypes));
                dateTimeFormatterArr[0] = ISODateTimeFormat.forFields(arrayList, true, false);
                if (arrayList.size() == 0) {
                    dateTimeFormatterArr[1] = dateTimeFormatterArr[0];
                }
            } catch (IllegalArgumentException unused) {
            }
            this.iFormatter = dateTimeFormatterArr;
        }
        return dateTimeFormatterArr[0];
    }

    @Override // org.joda.time.ReadablePartial
    public int getValue(int i14) {
        return this.iValues[i14];
    }

    @Override // org.joda.time.base.AbstractPartial
    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    public boolean isMatch(ReadableInstant readableInstant) {
        long instantMillis = DateTimeUtils.getInstantMillis(readableInstant);
        Chronology instantChronology = DateTimeUtils.getInstantChronology(readableInstant);
        int i14 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i14 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (dateTimeFieldTypeArr[i14].getField(instantChronology).get(instantMillis) != this.iValues[i14]) {
                return false;
            }
            i14++;
        }
    }

    public Partial minus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, -1);
    }

    public Partial plus(ReadablePeriod readablePeriod) {
        return withPeriodAdded(readablePeriod, 1);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.ReadablePartial
    public int size() {
        return this.iTypes.length;
    }

    @Override // org.joda.time.ReadablePartial
    public String toString() {
        DateTimeFormatter[] dateTimeFormatterArr = this.iFormatter;
        if (dateTimeFormatterArr == null) {
            getFormatter();
            dateTimeFormatterArr = this.iFormatter;
            if (dateTimeFormatterArr == null) {
                return toStringList();
            }
        }
        DateTimeFormatter dateTimeFormatter = dateTimeFormatterArr[1];
        return dateTimeFormatter == null ? toStringList() : dateTimeFormatter.print(this);
    }

    public String toStringList() {
        int size = size();
        StringBuilder sb3 = new StringBuilder(size * 20);
        sb3.append('[');
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 > 0) {
                sb3.append(", ");
            }
            sb3.append(this.iTypes[i14].getName());
            sb3.append('=');
            sb3.append(this.iValues[i14]);
        }
        sb3.append(']');
        return sb3.toString();
    }

    public Partial with(DateTimeFieldType dateTimeFieldType, int i14) {
        int i15;
        int iCompareTo;
        if (dateTimeFieldType == null) {
            h.s("The field type must not be null");
            return null;
        }
        int iIndexOf = indexOf(dateTimeFieldType);
        if (iIndexOf != -1) {
            return i14 == getValue(iIndexOf) ? this : new Partial(this, getField(iIndexOf).set(this, iIndexOf, getValues(), i14));
        }
        int length = this.iTypes.length + 1;
        DateTimeFieldType[] dateTimeFieldTypeArr = new DateTimeFieldType[length];
        int[] iArr = new int[length];
        DurationField field = dateTimeFieldType.getDurationType().getField(this.iChronology);
        if (field.isSupported()) {
            i15 = 0;
            while (true) {
                DateTimeFieldType[] dateTimeFieldTypeArr2 = this.iTypes;
                if (i15 >= dateTimeFieldTypeArr2.length) {
                    break;
                }
                DateTimeFieldType dateTimeFieldType2 = dateTimeFieldTypeArr2[i15];
                DurationField field2 = dateTimeFieldType2.getDurationType().getField(this.iChronology);
                if (field2.isSupported() && ((iCompareTo = field.compareTo(field2)) > 0 || (iCompareTo == 0 && (dateTimeFieldType.getRangeDurationType() == null || (dateTimeFieldType2.getRangeDurationType() != null && dateTimeFieldType.getRangeDurationType().getField(this.iChronology).compareTo(dateTimeFieldType2.getRangeDurationType().getField(this.iChronology)) > 0))))) {
                    break;
                }
                i15++;
            }
        } else {
            i15 = 0;
        }
        System.arraycopy(this.iTypes, 0, dateTimeFieldTypeArr, 0, i15);
        System.arraycopy(this.iValues, 0, iArr, 0, i15);
        dateTimeFieldTypeArr[i15] = dateTimeFieldType;
        iArr[i15] = i14;
        int i16 = i15 + 1;
        int i17 = (length - i15) - 1;
        System.arraycopy(this.iTypes, i15, dateTimeFieldTypeArr, i16, i17);
        System.arraycopy(this.iValues, i15, iArr, i16, i17);
        Partial partial = new Partial(dateTimeFieldTypeArr, iArr, this.iChronology);
        this.iChronology.validate(partial, iArr);
        return partial;
    }

    public Partial withChronologyRetainFields(Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        if (chronologyWithUTC == getChronology()) {
            return this;
        }
        Partial partial = new Partial(chronologyWithUTC, this.iTypes, this.iValues);
        chronologyWithUTC.validate(partial, this.iValues);
        return partial;
    }

    public Partial withField(DateTimeFieldType dateTimeFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i14 == getValue(iIndexOfSupported)) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i14));
    }

    public Partial withFieldAddWrapped(DurationFieldType durationFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i14 == 0) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).addWrapPartial(this, iIndexOfSupported, getValues(), i14));
    }

    public Partial withFieldAdded(DurationFieldType durationFieldType, int i14) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i14 == 0) {
            return this;
        }
        return new Partial(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i14));
    }

    public Partial withPeriodAdded(ReadablePeriod readablePeriod, int i14) {
        if (readablePeriod == null || i14 == 0) {
            return this;
        }
        int[] values = getValues();
        for (int i15 = 0; i15 < readablePeriod.size(); i15++) {
            int iIndexOf = indexOf(readablePeriod.getFieldType(i15));
            if (iIndexOf >= 0) {
                values = getField(iIndexOf).add(this, iIndexOf, values, FieldUtils.safeMultiply(readablePeriod.getValue(i15), i14));
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
        int i14 = iIndexOf + 1;
        System.arraycopy(this.iTypes, i14, dateTimeFieldTypeArr, iIndexOf, size - iIndexOf);
        System.arraycopy(this.iValues, 0, iArr, 0, iIndexOf);
        System.arraycopy(this.iValues, i14, iArr, iIndexOf, size2 - iIndexOf);
        Partial partial = new Partial(this.iChronology, dateTimeFieldTypeArr, iArr);
        this.iChronology.validate(partial, iArr);
        return partial;
    }

    public static class Property extends AbstractPartialFieldProperty implements Serializable {
        private static final long serialVersionUID = 53278362873888L;
        private final int iFieldIndex;
        private final Partial iPartial;

        public Property(Partial partial, int i14) {
            this.iPartial = partial;
            this.iFieldIndex = i14;
        }

        public Partial addToCopy(int i14) {
            return new Partial(this.iPartial, getField().add(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i14));
        }

        public Partial addWrapFieldToCopy(int i14) {
            return new Partial(this.iPartial, getField().addWrapField(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i14));
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public int get() {
            return this.iPartial.getValue(this.iFieldIndex);
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public DateTimeField getField() {
            return this.iPartial.getField(this.iFieldIndex);
        }

        public Partial getPartial() {
            return this.iPartial;
        }

        @Override // org.joda.time.field.AbstractPartialFieldProperty
        public ReadablePartial getReadablePartial() {
            return this.iPartial;
        }

        public Partial setCopy(String str, Locale locale) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), str, locale));
        }

        public Partial withMaximumValue() {
            return setCopy(getMaximumValue());
        }

        public Partial withMinimumValue() {
            return setCopy(getMinimumValue());
        }

        public Partial setCopy(int i14) {
            return new Partial(this.iPartial, getField().set(this.iPartial, this.iFieldIndex, this.iPartial.getValues(), i14));
        }

        public Partial setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).print(this);
    }

    public String toString(String str, Locale locale) {
        if (str == null) {
            return toString();
        }
        return DateTimeFormat.forPattern(str).withLocale(locale).print(this);
    }

    public boolean isMatch(ReadablePartial readablePartial) {
        if (readablePartial == null) {
            h.s("The partial must not be null");
            return false;
        }
        int i14 = 0;
        while (true) {
            DateTimeFieldType[] dateTimeFieldTypeArr = this.iTypes;
            if (i14 >= dateTimeFieldTypeArr.length) {
                return true;
            }
            if (readablePartial.get(dateTimeFieldTypeArr[i14]) != this.iValues[i14]) {
                return false;
            }
            i14++;
        }
    }

    public Partial(Chronology chronology) {
        this.iChronology = DateTimeUtils.getChronology(chronology).withUTC();
        this.iTypes = new DateTimeFieldType[0];
        this.iValues = new int[0];
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i14) {
        this(dateTimeFieldType, i14, (Chronology) null);
    }

    public Partial(DateTimeFieldType dateTimeFieldType, int i14, Chronology chronology) {
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(chronology).withUTC();
        this.iChronology = chronologyWithUTC;
        if (dateTimeFieldType != null) {
            this.iTypes = new DateTimeFieldType[]{dateTimeFieldType};
            int[] iArr = {i14};
            this.iValues = iArr;
            chronologyWithUTC.validate(this, iArr);
            return;
        }
        h.s("The field type must not be null");
        throw null;
    }

    public Partial(DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this(dateTimeFieldTypeArr, iArr, (Chronology) null);
    }

    public Partial() {
        this((Chronology) null);
    }

    public Partial(ReadablePartial readablePartial) {
        if (readablePartial != null) {
            this.iChronology = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
            this.iTypes = new DateTimeFieldType[readablePartial.size()];
            this.iValues = new int[readablePartial.size()];
            for (int i14 = 0; i14 < readablePartial.size(); i14++) {
                this.iTypes[i14] = readablePartial.getFieldType(i14);
                this.iValues[i14] = readablePartial.getValue(i14);
            }
            return;
        }
        h.s("The partial must not be null");
        throw null;
    }

    public Partial(Partial partial, int[] iArr) {
        this.iChronology = partial.iChronology;
        this.iTypes = partial.iTypes;
        this.iValues = iArr;
    }

    public Partial(Chronology chronology, DateTimeFieldType[] dateTimeFieldTypeArr, int[] iArr) {
        this.iChronology = chronology;
        this.iTypes = dateTimeFieldTypeArr;
        this.iValues = iArr;
    }
}
