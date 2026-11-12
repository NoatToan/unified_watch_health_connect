package org.joda.time;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.j10;
import defpackage.jq5;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.wq5;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public final class YearMonth extends BasePartial implements ogj, Serializable {
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.year(), DateTimeFieldType.monthOfYear()};
    public static final int MONTH_OF_YEAR = 1;
    public static final int YEAR = 0;
    private static final long serialVersionUID = 797544782896179L;

    public YearMonth() {
    }

    public static YearMonth fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new YearMonth(calendar.get(1), calendar.get(2) + 1);
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static YearMonth fromDateFields(Date date) {
        if (date != null) {
            return new YearMonth(date.getYear() + 1900, date.getMonth() + 1);
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static YearMonth now(bw3 bw3Var) {
        if (bw3Var != null) {
            return new YearMonth(bw3Var);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    @FromString
    public static YearMonth parse(String str) {
        return parse(str, sxc.m());
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new YearMonth(this, getChronology().withUTC()) : this;
    }

    @Override // defpackage.i10
    public gq5 getField(int i, bw3 bw3Var) {
        if (i == 0) {
            return bw3Var.year();
        }
        if (i == 1) {
            return bw3Var.monthOfYear();
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i);
    }

    @Override // defpackage.i10, defpackage.ogj
    public DateTimeFieldType getFieldType(int i) {
        return FIELD_TYPES[i];
    }

    @Override // defpackage.i10
    public DateTimeFieldType[] getFieldTypes() {
        return (DateTimeFieldType[]) FIELD_TYPES.clone();
    }

    public int getMonthOfYear() {
        return getValue(1);
    }

    public int getYear() {
        return getValue(0);
    }

    public YearMonth minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public YearMonth minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), fl9.k(i));
    }

    public YearMonth minusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), fl9.k(i));
    }

    public Property monthOfYear() {
        return new Property(this, 1);
    }

    public YearMonth plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public YearMonth plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public YearMonth plusYears(int i) {
        return withFieldAdded(DurationFieldType.years(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.base.BasePartial, defpackage.ogj
    public int size() {
        return 2;
    }

    public Interval toInterval() {
        return toInterval(null);
    }

    public LocalDate toLocalDate(int i) {
        return new LocalDate(getYear(), getMonthOfYear(), i, getChronology());
    }

    @ToString
    public String toString() {
        return sxc.t().l(this);
    }

    public YearMonth withChronologyRetainFields(bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        if (bw3VarWithUTC == getChronology()) {
            return this;
        }
        YearMonth yearMonth = new YearMonth(this, bw3VarWithUTC);
        bw3VarWithUTC.validate(yearMonth, getValues());
        return yearMonth;
    }

    public YearMonth withField(DateTimeFieldType dateTimeFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(iIndexOfSupported)) {
            return this;
        }
        return new YearMonth(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i));
    }

    public YearMonth withFieldAdded(DurationFieldType durationFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new YearMonth(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i));
    }

    public YearMonth withMonthOfYear(int i) {
        return new YearMonth(this, getChronology().monthOfYear().set(this, 1, getValues(), i));
    }

    public YearMonth withPeriodAdded(qgj qgjVar, int i) {
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
        return new YearMonth(this, values);
    }

    public YearMonth withYear(int i) {
        return new YearMonth(this, getChronology().year().set(this, 0, getValues(), i));
    }

    public Property year() {
        return new Property(this, 0);
    }

    public YearMonth(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public static YearMonth parse(String str, jq5 jq5Var) {
        LocalDate localDateG = jq5Var.g(str);
        return new YearMonth(localDateG.getYear(), localDateG.getMonthOfYear());
    }

    public Interval toInterval(DateTimeZone dateTimeZone) {
        DateTimeZone dateTimeZoneM = wq5.m(dateTimeZone);
        return new Interval(toLocalDate(1).toDateTimeAtStartOfDay(dateTimeZoneM), plusMonths(1).toLocalDate(1).toDateTimeAtStartOfDay(dateTimeZoneM));
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        return str == null ? toString() : hq5.b(str).l(this);
    }

    public static class Property extends j10 implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final YearMonth iBase;
        private final int iFieldIndex;

        public Property(YearMonth yearMonth, int i) {
            this.iBase = yearMonth;
            this.iFieldIndex = i;
        }

        public YearMonth addToCopy(int i) {
            return new YearMonth(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public YearMonth addWrapFieldToCopy(int i) {
            return new YearMonth(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        @Override // defpackage.j10
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // defpackage.j10
        public gq5 getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        @Override // defpackage.j10
        public ogj getReadablePartial() {
            return this.iBase;
        }

        public YearMonth getYearMonth() {
            return this.iBase;
        }

        public YearMonth setCopy(int i) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public YearMonth setCopy(String str, Locale locale) {
            return new YearMonth(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }

        public YearMonth setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public YearMonth(bw3 bw3Var) {
        super(bw3Var);
    }

    public YearMonth(long j) {
        super(j);
    }

    public static YearMonth now() {
        return new YearMonth();
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).v(locale).l(this);
    }

    public YearMonth(long j, bw3 bw3Var) {
        super(j, bw3Var);
    }

    public static YearMonth now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new YearMonth(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    public YearMonth(Object obj) {
        super(obj, null, sxc.m());
    }

    public YearMonth(Object obj, bw3 bw3Var) {
        super(obj, wq5.c(bw3Var), sxc.m());
    }

    public YearMonth(int i, int i2) {
        this(i, i2, null);
    }

    public YearMonth(int i, int i2, bw3 bw3Var) {
        super(new int[]{i, i2}, bw3Var);
    }

    public YearMonth(YearMonth yearMonth, int[] iArr) {
        super(yearMonth, iArr);
    }

    public YearMonth(YearMonth yearMonth, bw3 bw3Var) {
        super((BasePartial) yearMonth, bw3Var);
    }
}
