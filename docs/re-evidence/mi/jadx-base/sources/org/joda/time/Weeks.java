package org.joda.time;

import com.miui.tsmclient.model.mitsm.h;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz;
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
public final class Weeks extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380866L;
    public static final Weeks ZERO = new Weeks(0);
    public static final Weeks ONE = new Weeks(1);
    public static final Weeks TWO = new Weeks(2);
    public static final Weeks THREE = new Weeks(3);
    public static final Weeks MAX_VALUE = new Weeks(Integer.MAX_VALUE);
    public static final Weeks MIN_VALUE = new Weeks(Integer.MIN_VALUE);
    private static final yqh PARSER = txc.a().j(PeriodType.weeks());

    private Weeks(int i) {
        super(i);
    }

    @FromString
    public static Weeks parseWeeks(String str) {
        return str == null ? ZERO : weeks(PARSER.h(str).getWeeks());
    }

    private Object readResolve() {
        return weeks(getValue());
    }

    public static Weeks standardWeeksIn(qgj qgjVar) {
        return weeks(BaseSingleFieldPeriod.standardPeriodIn(qgjVar, 604800000L));
    }

    public static Weeks weeks(int i) {
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
            return i != 3 ? new Weeks(i) : THREE;
        }
        return TWO;
    }

    public static Weeks weeksBetween(kgj kgjVar, kgj kgjVar2) {
        return weeks(BaseSingleFieldPeriod.between(kgjVar, kgjVar2, DurationFieldType.weeks()));
    }

    public static Weeks weeksIn(mgj mgjVar) {
        return mgjVar == null ? ZERO : weeks(BaseSingleFieldPeriod.between(mgjVar.getStart(), mgjVar.getEnd(), DurationFieldType.weeks()));
    }

    public Weeks dividedBy(int i) {
        return i == 1 ? this : weeks(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.weeks();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, defpackage.qgj
    public PeriodType getPeriodType() {
        return PeriodType.weeks();
    }

    public int getWeeks() {
        return getValue();
    }

    public boolean isGreaterThan(Weeks weeks) {
        if (weeks == null) {
            return getValue() > 0;
        }
        return getValue() > weeks.getValue();
    }

    public boolean isLessThan(Weeks weeks) {
        if (weeks == null) {
            return getValue() < 0;
        }
        return getValue() < weeks.getValue();
    }

    public Weeks minus(int i) {
        return plus(fl9.k(i));
    }

    public Weeks multipliedBy(int i) {
        return weeks(fl9.h(getValue(), i));
    }

    public Weeks negated() {
        return weeks(fl9.k(getValue()));
    }

    public Weeks plus(int i) {
        return i == 0 ? this : weeks(fl9.d(getValue(), i));
    }

    public Days toStandardDays() {
        return Days.days(fl9.h(getValue(), 7));
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 604800000);
    }

    public Hours toStandardHours() {
        return Hours.hours(fl9.h(getValue(), 168));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(fl9.h(getValue(), h.C));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(fl9.h(getValue(), BaseSyncBiz.RECORD_MAX_LIFETIME));
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "W";
    }

    public Weeks minus(Weeks weeks) {
        return weeks == null ? this : minus(weeks.getValue());
    }

    public Weeks plus(Weeks weeks) {
        return weeks == null ? this : plus(weeks.getValue());
    }

    public static Weeks weeksBetween(ogj ogjVar, ogj ogjVar2) {
        if ((ogjVar instanceof LocalDate) && (ogjVar2 instanceof LocalDate)) {
            return weeks(wq5.c(ogjVar.getChronology()).weeks().getDifference(((LocalDate) ogjVar2).getLocalMillis(), ((LocalDate) ogjVar).getLocalMillis()));
        }
        return weeks(BaseSingleFieldPeriod.between(ogjVar, ogjVar2, ZERO));
    }
}
