package org.joda.time;

import com.miui.tsmclient.model.mitsm.h;
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
public final class Minutes extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380863L;
    public static final Minutes ZERO = new Minutes(0);
    public static final Minutes ONE = new Minutes(1);
    public static final Minutes TWO = new Minutes(2);
    public static final Minutes THREE = new Minutes(3);
    public static final Minutes MAX_VALUE = new Minutes(Integer.MAX_VALUE);
    public static final Minutes MIN_VALUE = new Minutes(Integer.MIN_VALUE);
    private static final yqh PARSER = txc.a().j(PeriodType.minutes());

    private Minutes(int i) {
        super(i);
    }

    public static Minutes minutes(int i) {
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
            return i != 3 ? new Minutes(i) : THREE;
        }
        return TWO;
    }

    public static Minutes minutesBetween(kgj kgjVar, kgj kgjVar2) {
        return minutes(BaseSingleFieldPeriod.between(kgjVar, kgjVar2, DurationFieldType.minutes()));
    }

    public static Minutes minutesIn(mgj mgjVar) {
        return mgjVar == null ? ZERO : minutes(BaseSingleFieldPeriod.between(mgjVar.getStart(), mgjVar.getEnd(), DurationFieldType.minutes()));
    }

    @FromString
    public static Minutes parseMinutes(String str) {
        return str == null ? ZERO : minutes(PARSER.h(str).getMinutes());
    }

    private Object readResolve() {
        return minutes(getValue());
    }

    public static Minutes standardMinutesIn(qgj qgjVar) {
        return minutes(BaseSingleFieldPeriod.standardPeriodIn(qgjVar, 60000L));
    }

    public Minutes dividedBy(int i) {
        return i == 1 ? this : minutes(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.minutes();
    }

    public int getMinutes() {
        return getValue();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, defpackage.qgj
    public PeriodType getPeriodType() {
        return PeriodType.minutes();
    }

    public boolean isGreaterThan(Minutes minutes) {
        if (minutes == null) {
            return getValue() > 0;
        }
        return getValue() > minutes.getValue();
    }

    public boolean isLessThan(Minutes minutes) {
        if (minutes == null) {
            return getValue() < 0;
        }
        return getValue() < minutes.getValue();
    }

    public Minutes minus(int i) {
        return plus(fl9.k(i));
    }

    public Minutes multipliedBy(int i) {
        return minutes(fl9.h(getValue(), i));
    }

    public Minutes negated() {
        return minutes(fl9.k(getValue()));
    }

    public Minutes plus(int i) {
        return i == 0 ? this : minutes(fl9.d(getValue(), i));
    }

    public Days toStandardDays() {
        return Days.days(getValue() / 1440);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 60000);
    }

    public Hours toStandardHours() {
        return Hours.hours(getValue() / 60);
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(fl9.h(getValue(), 60));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / h.C);
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(getValue()) + "M";
    }

    public Minutes minus(Minutes minutes) {
        return minutes == null ? this : minus(minutes.getValue());
    }

    public Minutes plus(Minutes minutes) {
        return minutes == null ? this : plus(minutes.getValue());
    }

    public static Minutes minutesBetween(ogj ogjVar, ogj ogjVar2) {
        if ((ogjVar instanceof LocalTime) && (ogjVar2 instanceof LocalTime)) {
            return minutes(wq5.c(ogjVar.getChronology()).minutes().getDifference(((LocalTime) ogjVar2).getLocalMillis(), ((LocalTime) ogjVar).getLocalMillis()));
        }
        return minutes(BaseSingleFieldPeriod.between(ogjVar, ogjVar2, ZERO));
    }
}
