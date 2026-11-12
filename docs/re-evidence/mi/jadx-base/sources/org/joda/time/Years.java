package org.joda.time;

import defpackage.fl9;
import defpackage.kgj;
import defpackage.mgj;
import defpackage.ogj;
import defpackage.txc;
import defpackage.wq5;
import defpackage.yqh;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;

/* JADX INFO: loaded from: classes3.dex */
public final class Years extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380868L;
    public static final Years ZERO = new Years(0);
    public static final Years ONE = new Years(1);
    public static final Years TWO = new Years(2);
    public static final Years THREE = new Years(3);
    public static final Years MAX_VALUE = new Years(Integer.MAX_VALUE);
    public static final Years MIN_VALUE = new Years(Integer.MIN_VALUE);
    private static final yqh PARSER = txc.a().j(PeriodType.years());

    private Years(int i) {
        super(i);
    }

    @FromString
    public static Years parseYears(String str) {
        return str == null ? ZERO : years(PARSER.h(str).getYears());
    }

    private Object readResolve() {
        return years(getValue());
    }

    public static Years years(int i) {
        if (i == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return ONE;
        }
        if (i != 2) {
            return i != 3 ? new Years(i) : THREE;
        }
        return TWO;
    }

    public static Years yearsBetween(kgj kgjVar, kgj kgjVar2) {
        return years(BaseSingleFieldPeriod.between(kgjVar, kgjVar2, DurationFieldType.years()));
    }

    public static Years yearsIn(mgj mgjVar) {
        return mgjVar == null ? ZERO : years(BaseSingleFieldPeriod.between(mgjVar.getStart(), mgjVar.getEnd(), DurationFieldType.years()));
    }

    public Years dividedBy(int i) {
        return i == 1 ? this : years(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.years();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, defpackage.qgj
    public PeriodType getPeriodType() {
        return PeriodType.years();
    }

    public int getYears() {
        return getValue();
    }

    public boolean isGreaterThan(Years years) {
        if (years == null) {
            return getValue() > 0;
        }
        return getValue() > years.getValue();
    }

    public boolean isLessThan(Years years) {
        if (years == null) {
            return getValue() < 0;
        }
        return getValue() < years.getValue();
    }

    public Years minus(int i) {
        return plus(fl9.k(i));
    }

    public Years multipliedBy(int i) {
        return years(fl9.h(getValue(), i));
    }

    public Years negated() {
        return years(fl9.k(getValue()));
    }

    public Years plus(int i) {
        return i == 0 ? this : years(fl9.d(getValue(), i));
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "Y";
    }

    public Years minus(Years years) {
        return years == null ? this : minus(years.getValue());
    }

    public Years plus(Years years) {
        return years == null ? this : plus(years.getValue());
    }

    public static Years yearsBetween(ogj ogjVar, ogj ogjVar2) {
        if ((ogjVar instanceof LocalDate) && (ogjVar2 instanceof LocalDate)) {
            return years(wq5.c(ogjVar.getChronology()).years().getDifference(((LocalDate) ogjVar2).getLocalMillis(), ((LocalDate) ogjVar).getLocalMillis()));
        }
        return years(BaseSingleFieldPeriod.between(ogjVar, ogjVar2, ZERO));
    }
}
