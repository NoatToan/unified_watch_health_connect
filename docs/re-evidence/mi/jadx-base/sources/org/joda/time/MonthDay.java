package org.joda.time;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;
import defpackage.hq5;
import defpackage.j10;
import defpackage.jq5;
import defpackage.lq5;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.wq5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BasePartial;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public final class MonthDay extends BasePartial implements ogj, Serializable {
    public static final int DAY_OF_MONTH = 1;
    public static final int MONTH_OF_YEAR = 0;
    private static final long serialVersionUID = 2954560699050434609L;
    private static final DateTimeFieldType[] FIELD_TYPES = {DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth()};
    private static final jq5 PARSER = new lq5().E(sxc.m().b()).E(hq5.b("--MM-dd").b()).e0();

    public MonthDay() {
    }

    public static MonthDay fromCalendarFields(Calendar calendar) {
        if (calendar != null) {
            return new MonthDay(calendar.get(2) + 1, calendar.get(5));
        }
        throw new IllegalArgumentException("The calendar must not be null");
    }

    public static MonthDay fromDateFields(Date date) {
        if (date != null) {
            return new MonthDay(date.getMonth() + 1, date.getDate());
        }
        throw new IllegalArgumentException("The date must not be null");
    }

    public static MonthDay now(bw3 bw3Var) {
        if (bw3Var != null) {
            return new MonthDay(bw3Var);
        }
        throw new NullPointerException("Chronology must not be null");
    }

    @FromString
    public static MonthDay parse(String str) {
        return parse(str, PARSER);
    }

    private Object readResolve() {
        return !DateTimeZone.UTC.equals(getChronology().getZone()) ? new MonthDay(this, getChronology().withUTC()) : this;
    }

    public Property dayOfMonth() {
        return new Property(this, 1);
    }

    public int getDayOfMonth() {
        return getValue(1);
    }

    @Override // defpackage.i10
    public gq5 getField(int i, bw3 bw3Var) {
        if (i == 0) {
            return bw3Var.monthOfYear();
        }
        if (i == 1) {
            return bw3Var.dayOfMonth();
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
        return getValue(0);
    }

    public MonthDay minus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, -1);
    }

    public MonthDay minusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), fl9.k(i));
    }

    public MonthDay minusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), fl9.k(i));
    }

    public Property monthOfYear() {
        return new Property(this, 0);
    }

    public MonthDay plus(qgj qgjVar) {
        return withPeriodAdded(qgjVar, 1);
    }

    public MonthDay plusDays(int i) {
        return withFieldAdded(DurationFieldType.days(), i);
    }

    public MonthDay plusMonths(int i) {
        return withFieldAdded(DurationFieldType.months(), i);
    }

    public Property property(DateTimeFieldType dateTimeFieldType) {
        return new Property(this, indexOfSupported(dateTimeFieldType));
    }

    @Override // org.joda.time.base.BasePartial, defpackage.ogj
    public int size() {
        return 2;
    }

    public LocalDate toLocalDate(int i) {
        return new LocalDate(i, getMonthOfYear(), getDayOfMonth(), getChronology());
    }

    @ToString
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DateTimeFieldType.monthOfYear());
        arrayList.add(DateTimeFieldType.dayOfMonth());
        return sxc.j(arrayList, true, true).l(this);
    }

    public MonthDay withChronologyRetainFields(bw3 bw3Var) {
        bw3 bw3VarWithUTC = wq5.c(bw3Var).withUTC();
        if (bw3VarWithUTC == getChronology()) {
            return this;
        }
        MonthDay monthDay = new MonthDay(this, bw3VarWithUTC);
        bw3VarWithUTC.validate(monthDay, getValues());
        return monthDay;
    }

    public MonthDay withDayOfMonth(int i) {
        return new MonthDay(this, getChronology().dayOfMonth().set(this, 1, getValues(), i));
    }

    public MonthDay withField(DateTimeFieldType dateTimeFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(dateTimeFieldType);
        if (i == getValue(iIndexOfSupported)) {
            return this;
        }
        return new MonthDay(this, getField(iIndexOfSupported).set(this, iIndexOfSupported, getValues(), i));
    }

    public MonthDay withFieldAdded(DurationFieldType durationFieldType, int i) {
        int iIndexOfSupported = indexOfSupported(durationFieldType);
        if (i == 0) {
            return this;
        }
        return new MonthDay(this, getField(iIndexOfSupported).add(this, iIndexOfSupported, getValues(), i));
    }

    public MonthDay withMonthOfYear(int i) {
        return new MonthDay(this, getChronology().monthOfYear().set(this, 0, getValues(), i));
    }

    public MonthDay withPeriodAdded(qgj qgjVar, int i) {
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
        return new MonthDay(this, values);
    }

    public MonthDay(DateTimeZone dateTimeZone) {
        super(ISOChronology.getInstance(dateTimeZone));
    }

    public static MonthDay parse(String str, jq5 jq5Var) {
        LocalDate localDateG = jq5Var.g(str);
        return new MonthDay(localDateG.getMonthOfYear(), localDateG.getDayOfMonth());
    }

    public static class Property extends j10 implements Serializable {
        private static final long serialVersionUID = 5727734012190224363L;
        private final MonthDay iBase;
        private final int iFieldIndex;

        public Property(MonthDay monthDay, int i) {
            this.iBase = monthDay;
            this.iFieldIndex = i;
        }

        public MonthDay addToCopy(int i) {
            return new MonthDay(this.iBase, getField().add(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public MonthDay addWrapFieldToCopy(int i) {
            return new MonthDay(this.iBase, getField().addWrapField(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        @Override // defpackage.j10
        public int get() {
            return this.iBase.getValue(this.iFieldIndex);
        }

        @Override // defpackage.j10
        public gq5 getField() {
            return this.iBase.getField(this.iFieldIndex);
        }

        public MonthDay getMonthDay() {
            return this.iBase;
        }

        @Override // defpackage.j10
        public ogj getReadablePartial() {
            return this.iBase;
        }

        public MonthDay setCopy(int i) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), i));
        }

        public MonthDay setCopy(String str, Locale locale) {
            return new MonthDay(this.iBase, getField().set(this.iBase, this.iFieldIndex, this.iBase.getValues(), str, locale));
        }

        public MonthDay setCopy(String str) {
            return setCopy(str, null);
        }
    }

    public MonthDay(bw3 bw3Var) {
        super(bw3Var);
    }

    public MonthDay(long j) {
        super(j);
    }

    public static MonthDay now() {
        return new MonthDay();
    }

    public MonthDay(long j, bw3 bw3Var) {
        super(j, bw3Var);
    }

    public static MonthDay now(DateTimeZone dateTimeZone) {
        if (dateTimeZone != null) {
            return new MonthDay(dateTimeZone);
        }
        throw new NullPointerException("Zone must not be null");
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str) {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).l(this);
    }

    public MonthDay(Object obj) {
        super(obj, null, sxc.m());
    }

    public MonthDay(Object obj, bw3 bw3Var) {
        super(obj, wq5.c(bw3Var), sxc.m());
    }

    @Override // org.joda.time.base.BasePartial
    public String toString(String str, Locale locale) throws IllegalArgumentException {
        if (str == null) {
            return toString();
        }
        return hq5.b(str).v(locale).l(this);
    }

    public MonthDay(int i, int i2) {
        this(i, i2, null);
    }

    public MonthDay(int i, int i2, bw3 bw3Var) {
        super(new int[]{i, i2}, bw3Var);
    }

    public MonthDay(MonthDay monthDay, int[] iArr) {
        super(monthDay, iArr);
    }

    public MonthDay(MonthDay monthDay, bw3 bw3Var) {
        super((BasePartial) monthDay, bw3Var);
    }
}
