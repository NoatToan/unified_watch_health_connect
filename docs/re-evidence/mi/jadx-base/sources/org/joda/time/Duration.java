package org.joda.time;

import defpackage.fl9;
import defpackage.hgj;
import defpackage.kgj;
import java.io.Serializable;
import java.math.RoundingMode;
import org.joda.convert.FromString;
import org.joda.time.base.BaseDuration;

/* JADX INFO: loaded from: classes3.dex */
public final class Duration extends BaseDuration implements hgj, Serializable {
    public static final Duration ZERO = new Duration(0);
    private static final long serialVersionUID = 2471658376918L;

    public Duration(long j) {
        super(j);
    }

    public static Duration millis(long j) {
        return j == 0 ? ZERO : new Duration(j);
    }

    @FromString
    public static Duration parse(String str) {
        return new Duration(str);
    }

    public static Duration standardDays(long j) {
        return j == 0 ? ZERO : new Duration(fl9.i(j, 86400000));
    }

    public static Duration standardHours(long j) {
        return j == 0 ? ZERO : new Duration(fl9.i(j, 3600000));
    }

    public static Duration standardMinutes(long j) {
        return j == 0 ? ZERO : new Duration(fl9.i(j, 60000));
    }

    public static Duration standardSeconds(long j) {
        return j == 0 ? ZERO : new Duration(fl9.i(j, 1000));
    }

    public Duration abs() {
        return getMillis() < 0 ? negated() : this;
    }

    public Duration dividedBy(long j) {
        return j == 1 ? this : new Duration(fl9.f(getMillis(), j));
    }

    public long getStandardDays() {
        return getMillis() / 86400000;
    }

    public long getStandardHours() {
        return getMillis() / 3600000;
    }

    public long getStandardMinutes() {
        return getMillis() / 60000;
    }

    public long getStandardSeconds() {
        return getMillis() / 1000;
    }

    public Duration minus(hgj hgjVar) {
        return hgjVar == null ? this : withDurationAdded(hgjVar.getMillis(), -1);
    }

    public Duration multipliedBy(long j) {
        return j == 1 ? this : new Duration(fl9.j(getMillis(), j));
    }

    public Duration negated() {
        if (getMillis() != Long.MIN_VALUE) {
            return new Duration(-getMillis());
        }
        throw new ArithmeticException("Negation of this duration would overflow");
    }

    public Duration plus(hgj hgjVar) {
        return hgjVar == null ? this : withDurationAdded(hgjVar.getMillis(), 1);
    }

    @Override // defpackage.n00
    public Duration toDuration() {
        return this;
    }

    public Days toStandardDays() {
        return Days.days(fl9.m(getStandardDays()));
    }

    public Hours toStandardHours() {
        return Hours.hours(fl9.m(getStandardHours()));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(fl9.m(getStandardMinutes()));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(fl9.m(getStandardSeconds()));
    }

    public Duration withDurationAdded(hgj hgjVar, int i) {
        return (hgjVar == null || i == 0) ? this : withDurationAdded(hgjVar.getMillis(), i);
    }

    public Duration withMillis(long j) {
        return j == getMillis() ? this : new Duration(j);
    }

    public Duration(long j, long j2) {
        super(j, j2);
    }

    public Duration dividedBy(long j, RoundingMode roundingMode) {
        return j == 1 ? this : new Duration(fl9.g(getMillis(), j, roundingMode));
    }

    public Duration(kgj kgjVar, kgj kgjVar2) {
        super(kgjVar, kgjVar2);
    }

    public Duration minus(long j) {
        return withDurationAdded(j, -1);
    }

    public Duration plus(long j) {
        return withDurationAdded(j, 1);
    }

    public Duration withDurationAdded(long j, int i) {
        if (j == 0 || i == 0) {
            return this;
        }
        return new Duration(fl9.e(getMillis(), fl9.i(j, i)));
    }

    public Duration(Object obj) {
        super(obj);
    }
}
