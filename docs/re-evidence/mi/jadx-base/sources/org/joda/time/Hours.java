package org.joda.time;

import com.xiaomi.onetrack.api.c;
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
public final class Hours extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380864L;
    public static final Hours ZERO = new Hours(0);
    public static final Hours ONE = new Hours(1);
    public static final Hours TWO = new Hours(2);
    public static final Hours THREE = new Hours(3);
    public static final Hours FOUR = new Hours(4);
    public static final Hours FIVE = new Hours(5);
    public static final Hours SIX = new Hours(6);
    public static final Hours SEVEN = new Hours(7);
    public static final Hours EIGHT = new Hours(8);
    public static final Hours MAX_VALUE = new Hours(Integer.MAX_VALUE);
    public static final Hours MIN_VALUE = new Hours(Integer.MIN_VALUE);
    private static final yqh PARSER = txc.a().j(PeriodType.hours());

    private Hours(int i) {
        super(i);
    }

    public static Hours hours(int i) {
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
            case 8:
                return EIGHT;
            default:
                return new Hours(i);
        }
    }

    public static Hours hoursBetween(kgj kgjVar, kgj kgjVar2) {
        return hours(BaseSingleFieldPeriod.between(kgjVar, kgjVar2, DurationFieldType.hours()));
    }

    public static Hours hoursIn(mgj mgjVar) {
        return mgjVar == null ? ZERO : hours(BaseSingleFieldPeriod.between(mgjVar.getStart(), mgjVar.getEnd(), DurationFieldType.hours()));
    }

    @FromString
    public static Hours parseHours(String str) {
        return str == null ? ZERO : hours(PARSER.h(str).getHours());
    }

    private Object readResolve() {
        return hours(getValue());
    }

    public static Hours standardHoursIn(qgj qgjVar) {
        return hours(BaseSingleFieldPeriod.standardPeriodIn(qgjVar, 3600000L));
    }

    public Hours dividedBy(int i) {
        return i == 1 ? this : hours(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.hours();
    }

    public int getHours() {
        return getValue();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, defpackage.qgj
    public PeriodType getPeriodType() {
        return PeriodType.hours();
    }

    public boolean isGreaterThan(Hours hours) {
        if (hours == null) {
            return getValue() > 0;
        }
        return getValue() > hours.getValue();
    }

    public boolean isLessThan(Hours hours) {
        if (hours == null) {
            return getValue() < 0;
        }
        return getValue() < hours.getValue();
    }

    public Hours minus(int i) {
        return plus(fl9.k(i));
    }

    public Hours multipliedBy(int i) {
        return hours(fl9.h(getValue(), i));
    }

    public Hours negated() {
        return hours(fl9.k(getValue()));
    }

    public Hours plus(int i) {
        return i == 0 ? this : hours(fl9.d(getValue(), i));
    }

    public Days toStandardDays() {
        return Days.days(getValue() / 24);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 3600000);
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(fl9.h(getValue(), 60));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(fl9.h(getValue(), 3600));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / 168);
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(getValue()) + c.f13756b;
    }

    public Hours minus(Hours hours) {
        return hours == null ? this : minus(hours.getValue());
    }

    public Hours plus(Hours hours) {
        return hours == null ? this : plus(hours.getValue());
    }

    public static Hours hoursBetween(ogj ogjVar, ogj ogjVar2) {
        if ((ogjVar instanceof LocalTime) && (ogjVar2 instanceof LocalTime)) {
            return hours(wq5.c(ogjVar.getChronology()).hours().getDifference(((LocalTime) ogjVar2).getLocalMillis(), ((LocalTime) ogjVar).getLocalMillis()));
        }
        return hours(BaseSingleFieldPeriod.between(ogjVar, ogjVar2, ZERO));
    }
}
