package org.joda.time;

import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.fl9;
import defpackage.kgj;
import defpackage.mgj;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.txc;
import defpackage.wq5;
import defpackage.yqh;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;

/* JADX INFO: loaded from: classes3.dex */
public final class Days extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380865L;
    public static final Days ZERO = new Days(0);
    public static final Days ONE = new Days(1);
    public static final Days TWO = new Days(2);
    public static final Days THREE = new Days(3);
    public static final Days FOUR = new Days(4);
    public static final Days FIVE = new Days(5);
    public static final Days SIX = new Days(6);
    public static final Days SEVEN = new Days(7);
    public static final Days MAX_VALUE = new Days(Integer.MAX_VALUE);
    public static final Days MIN_VALUE = new Days(Integer.MIN_VALUE);
    private static final yqh PARSER = txc.a().j(PeriodType.days());

    private Days(int i) {
        super(i);
    }

    public static Days days(int i) {
        if (i == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        switch (i) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            default:
                return new Days(i);
        }
    }

    public static Days daysBetween(kgj kgjVar, kgj kgjVar2) {
        return days(BaseSingleFieldPeriod.between(kgjVar, kgjVar2, DurationFieldType.days()));
    }

    public static Days daysIn(mgj mgjVar) {
        return mgjVar == null ? ZERO : days(BaseSingleFieldPeriod.between(mgjVar.getStart(), mgjVar.getEnd(), DurationFieldType.days()));
    }

    @FromString
    public static Days parseDays(String str) {
        return str == null ? ZERO : days(PARSER.h(str).getDays());
    }

    private Object readResolve() {
        return days(getValue());
    }

    public static Days standardDaysIn(qgj qgjVar) {
        return days(BaseSingleFieldPeriod.standardPeriodIn(qgjVar, 86400000L));
    }

    public Days dividedBy(int i) {
        return i == 1 ? this : days(getValue() / i);
    }

    public int getDays() {
        return getValue();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.days();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, defpackage.qgj
    public PeriodType getPeriodType() {
        return PeriodType.days();
    }

    public boolean isGreaterThan(Days days) {
        if (days == null) {
            return getValue() > 0;
        }
        return getValue() > days.getValue();
    }

    public boolean isLessThan(Days days) {
        if (days == null) {
            return getValue() < 0;
        }
        return getValue() < days.getValue();
    }

    public Days minus(int i) {
        return plus(fl9.k(i));
    }

    public Days multipliedBy(int i) {
        return days(fl9.h(getValue(), i));
    }

    public Days negated() {
        return days(fl9.k(getValue()));
    }

    public Days plus(int i) {
        return i == 0 ? this : days(fl9.d(getValue(), i));
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 86400000);
    }

    public Hours toStandardHours() {
        return Hours.hours(fl9.h(getValue(), 24));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(fl9.h(getValue(), 1440));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(fl9.h(getValue(), RepositoryManager.GAP_A_DAY));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / 7);
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "D";
    }

    public Days minus(Days days) {
        return days == null ? this : minus(days.getValue());
    }

    public Days plus(Days days) {
        return days == null ? this : plus(days.getValue());
    }

    public static Days daysBetween(ogj ogjVar, ogj ogjVar2) {
        if ((ogjVar instanceof LocalDate) && (ogjVar2 instanceof LocalDate)) {
            return days(wq5.c(ogjVar.getChronology()).days().getDifference(((LocalDate) ogjVar2).getLocalMillis(), ((LocalDate) ogjVar).getLocalMillis()));
        }
        return days(BaseSingleFieldPeriod.between(ogjVar, ogjVar2, ZERO));
    }
}
