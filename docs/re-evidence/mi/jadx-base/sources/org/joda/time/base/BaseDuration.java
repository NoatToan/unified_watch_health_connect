package org.joda.time.base;

import defpackage.bw3;
import defpackage.fk4;
import defpackage.fl9;
import defpackage.hgj;
import defpackage.kgj;
import defpackage.n00;
import defpackage.wq5;
import java.io.Serializable;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDuration extends n00 implements hgj, Serializable {
    private static final long serialVersionUID = 2581698638990L;
    private volatile long iMillis;

    public BaseDuration(long j) {
        this.iMillis = j;
    }

    @Override // defpackage.hgj
    public long getMillis() {
        return this.iMillis;
    }

    public void setMillis(long j) {
        this.iMillis = j;
    }

    public Interval toIntervalFrom(kgj kgjVar) {
        return new Interval(kgjVar, this);
    }

    public Interval toIntervalTo(kgj kgjVar) {
        return new Interval(this, kgjVar);
    }

    public Period toPeriod(PeriodType periodType) {
        return new Period(getMillis(), periodType);
    }

    public Period toPeriodFrom(kgj kgjVar) {
        return new Period(kgjVar, this);
    }

    public Period toPeriodTo(kgj kgjVar) {
        return new Period(this, kgjVar);
    }

    public Period toPeriod(bw3 bw3Var) {
        return new Period(getMillis(), bw3Var);
    }

    public Period toPeriodFrom(kgj kgjVar, PeriodType periodType) {
        return new Period(kgjVar, this, periodType);
    }

    public Period toPeriodTo(kgj kgjVar, PeriodType periodType) {
        return new Period(this, kgjVar, periodType);
    }

    public BaseDuration(long j, long j2) {
        this.iMillis = fl9.l(j2, j);
    }

    public Period toPeriod(PeriodType periodType, bw3 bw3Var) {
        return new Period(getMillis(), periodType, bw3Var);
    }

    public BaseDuration(kgj kgjVar, kgj kgjVar2) {
        if (kgjVar == kgjVar2) {
            this.iMillis = 0L;
        } else {
            this.iMillis = fl9.l(wq5.h(kgjVar2), wq5.h(kgjVar));
        }
    }

    public BaseDuration(Object obj) {
        this.iMillis = fk4.b().a(obj).f(obj);
    }
}
