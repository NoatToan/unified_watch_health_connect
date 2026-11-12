package org.joda.time;

import com.xiaomi.fitness.repo.RepositoryManager;
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
public final class Seconds extends BaseSingleFieldPeriod {
    private static final long serialVersionUID = 87525275727380862L;
    public static final Seconds ZERO = new Seconds(0);
    public static final Seconds ONE = new Seconds(1);
    public static final Seconds TWO = new Seconds(2);
    public static final Seconds THREE = new Seconds(3);
    public static final Seconds MAX_VALUE = new Seconds(Integer.MAX_VALUE);
    public static final Seconds MIN_VALUE = new Seconds(Integer.MIN_VALUE);
    private static final yqh PARSER = txc.a().j(PeriodType.seconds());

    private Seconds(int i) {
        super(i);
    }

    @FromString
    public static Seconds parseSeconds(String str) {
        return str == null ? ZERO : seconds(PARSER.h(str).getSeconds());
    }

    private Object readResolve() {
        return seconds(getValue());
    }

    public static Seconds seconds(int i) {
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
            return i != 3 ? new Seconds(i) : THREE;
        }
        return TWO;
    }

    public static Seconds secondsBetween(kgj kgjVar, kgj kgjVar2) {
        return seconds(BaseSingleFieldPeriod.between(kgjVar, kgjVar2, DurationFieldType.seconds()));
    }

    public static Seconds secondsIn(mgj mgjVar) {
        return mgjVar == null ? ZERO : seconds(BaseSingleFieldPeriod.between(mgjVar.getStart(), mgjVar.getEnd(), DurationFieldType.seconds()));
    }

    public static Seconds standardSecondsIn(qgj qgjVar) {
        return seconds(BaseSingleFieldPeriod.standardPeriodIn(qgjVar, 1000L));
    }

    public Seconds dividedBy(int i) {
        return i == 1 ? this : seconds(getValue() / i);
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod
    public DurationFieldType getFieldType() {
        return DurationFieldType.seconds();
    }

    @Override // org.joda.time.base.BaseSingleFieldPeriod, defpackage.qgj
    public PeriodType getPeriodType() {
        return PeriodType.seconds();
    }

    public int getSeconds() {
        return getValue();
    }

    public boolean isGreaterThan(Seconds seconds) {
        if (seconds == null) {
            return getValue() > 0;
        }
        return getValue() > seconds.getValue();
    }

    public boolean isLessThan(Seconds seconds) {
        if (seconds == null) {
            return getValue() < 0;
        }
        return getValue() < seconds.getValue();
    }

    public Seconds minus(int i) {
        return plus(fl9.k(i));
    }

    public Seconds multipliedBy(int i) {
        return seconds(fl9.h(getValue(), i));
    }

    public Seconds negated() {
        return seconds(fl9.k(getValue()));
    }

    public Seconds plus(int i) {
        return i == 0 ? this : seconds(fl9.d(getValue(), i));
    }

    public Days toStandardDays() {
        return Days.days(getValue() / RepositoryManager.GAP_A_DAY);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 1000);
    }

    public Hours toStandardHours() {
        return Hours.hours(getValue() / 3600);
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(getValue() / 60);
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / BaseSyncBiz.RECORD_MAX_LIFETIME);
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(getValue()) + "S";
    }

    public Seconds minus(Seconds seconds) {
        return seconds == null ? this : minus(seconds.getValue());
    }

    public Seconds plus(Seconds seconds) {
        return seconds == null ? this : plus(seconds.getValue());
    }

    public static Seconds secondsBetween(ogj ogjVar, ogj ogjVar2) {
        if ((ogjVar instanceof LocalTime) && (ogjVar2 instanceof LocalTime)) {
            return seconds(wq5.c(ogjVar.getChronology()).seconds().getDifference(((LocalTime) ogjVar2).getLocalMillis(), ((LocalTime) ogjVar).getLocalMillis()));
        }
        return seconds(BaseSingleFieldPeriod.between(ogjVar, ogjVar2, ZERO));
    }
}
