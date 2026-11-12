package org.joda.time;

import defpackage.bw3;
import defpackage.fgj;
import defpackage.fl9;
import defpackage.hgj;
import defpackage.kgj;
import defpackage.mgj;
import defpackage.qgj;
import defpackage.txc;
import defpackage.wq5;
import defpackage.yqh;
import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.BasePeriod;

/* JADX INFO: loaded from: classes3.dex */
public class MutablePeriod extends BasePeriod implements fgj, Cloneable, Serializable {
    private static final long serialVersionUID = 3436451121567212165L;

    public MutablePeriod(long j, long j2, bw3 bw3Var) {
        super(j, j2, null, bw3Var);
    }

    @FromString
    public static MutablePeriod parse(String str) {
        return parse(str, txc.a());
    }

    public void add(hgj hgjVar) {
        if (hgjVar != null) {
            add(new Period(hgjVar.getMillis(), getPeriodType()));
        }
    }

    public void addDays(int i) {
        super.addField(DurationFieldType.days(), i);
    }

    public void addHours(int i) {
        super.addField(DurationFieldType.hours(), i);
    }

    public void addMillis(int i) {
        super.addField(DurationFieldType.millis(), i);
    }

    public void addMinutes(int i) {
        super.addField(DurationFieldType.minutes(), i);
    }

    public void addMonths(int i) {
        super.addField(DurationFieldType.months(), i);
    }

    public void addSeconds(int i) {
        super.addField(DurationFieldType.seconds(), i);
    }

    public void addWeeks(int i) {
        super.addField(DurationFieldType.weeks(), i);
    }

    public void addYears(int i) {
        super.addField(DurationFieldType.years(), i);
    }

    @Override // defpackage.fgj
    public void clear() {
        super.setValues(new int[size()]);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutablePeriod copy() {
        return (MutablePeriod) clone();
    }

    public int getDays() {
        return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX);
    }

    public int getHours() {
        return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX);
    }

    public int getMillis() {
        return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX);
    }

    public int getMinutes() {
        return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX);
    }

    public int getMonths() {
        return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX);
    }

    public int getSeconds() {
        return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX);
    }

    public int getWeeks() {
        return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX);
    }

    public int getYears() {
        return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX);
    }

    @Override // org.joda.time.base.BasePeriod
    public void mergePeriod(qgj qgjVar) {
        super.mergePeriod(qgjVar);
    }

    public void set(DurationFieldType durationFieldType, int i) {
        super.setField(durationFieldType, i);
    }

    @Override // defpackage.fgj
    public void setDays(int i) {
        super.setField(DurationFieldType.days(), i);
    }

    @Override // defpackage.fgj
    public void setHours(int i) {
        super.setField(DurationFieldType.hours(), i);
    }

    @Override // defpackage.fgj
    public void setMillis(int i) {
        super.setField(DurationFieldType.millis(), i);
    }

    @Override // defpackage.fgj
    public void setMinutes(int i) {
        super.setField(DurationFieldType.minutes(), i);
    }

    @Override // defpackage.fgj
    public void setMonths(int i) {
        super.setField(DurationFieldType.months(), i);
    }

    public void setPeriod(hgj hgjVar) {
        setPeriod(hgjVar, (bw3) null);
    }

    @Override // defpackage.fgj
    public void setSeconds(int i) {
        super.setField(DurationFieldType.seconds(), i);
    }

    @Override // org.joda.time.base.BasePeriod, defpackage.fgj
    public void setValue(int i, int i2) {
        super.setValue(i, i2);
    }

    @Override // defpackage.fgj
    public void setWeeks(int i) {
        super.setField(DurationFieldType.weeks(), i);
    }

    @Override // defpackage.fgj
    public void setYears(int i) {
        super.setField(DurationFieldType.years(), i);
    }

    public static MutablePeriod parse(String str, yqh yqhVar) {
        return yqhVar.h(str).toMutablePeriod();
    }

    public MutablePeriod(long j, bw3 bw3Var) {
        super(j, (PeriodType) null, bw3Var);
    }

    public void add(mgj mgjVar) {
        if (mgjVar != null) {
            add(mgjVar.toPeriod(getPeriodType()));
        }
    }

    public void setPeriod(kgj kgjVar, kgj kgjVar2) {
        if (kgjVar == kgjVar2) {
            setPeriod(0L);
        } else {
            setPeriod(wq5.h(kgjVar), wq5.h(kgjVar2), wq5.i(kgjVar, kgjVar2));
        }
    }

    public MutablePeriod(hgj hgjVar, kgj kgjVar) {
        super(hgjVar, kgjVar, (PeriodType) null);
    }

    public void add(DurationFieldType durationFieldType, int i) {
        super.addField(durationFieldType, i);
    }

    public void add(qgj qgjVar) {
        super.addPeriod(qgjVar);
    }

    public MutablePeriod(kgj kgjVar, hgj hgjVar) {
        super(kgjVar, hgjVar, (PeriodType) null);
    }

    public void add(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        setPeriod(fl9.d(getYears(), i), fl9.d(getMonths(), i2), fl9.d(getWeeks(), i3), fl9.d(getDays(), i4), fl9.d(getHours(), i5), fl9.d(getMinutes(), i6), fl9.d(getSeconds(), i7), fl9.d(getMillis(), i8));
    }

    public MutablePeriod(kgj kgjVar, kgj kgjVar2) {
        super(kgjVar, kgjVar2, (PeriodType) null);
    }

    public void setPeriod(mgj mgjVar) {
        if (mgjVar == null) {
            setPeriod(0L);
        } else {
            setPeriod(mgjVar.getStartMillis(), mgjVar.getEndMillis(), wq5.c(mgjVar.getChronology()));
        }
    }

    public MutablePeriod(Object obj, bw3 bw3Var) {
        super(obj, (PeriodType) null, bw3Var);
    }

    public MutablePeriod() {
        super(0L, (PeriodType) null, (bw3) null);
    }

    @Override // org.joda.time.base.BasePeriod, defpackage.fgj
    public void setPeriod(qgj qgjVar) {
        super.setPeriod(qgjVar);
    }

    public MutablePeriod(PeriodType periodType) {
        super(0L, periodType, (bw3) null);
    }

    @Override // org.joda.time.base.BasePeriod
    public void setPeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super.setPeriod(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public MutablePeriod(int i, int i2, int i3, int i4) {
        super(0, 0, 0, 0, i, i2, i3, i4, PeriodType.standard());
    }

    public void setPeriod(long j, long j2) {
        setPeriod(j, j2, null);
    }

    public MutablePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i, i2, i3, i4, i5, i6, i7, i8, PeriodType.standard());
    }

    public void add(long j) {
        add(new Period(j, getPeriodType()));
    }

    public void setPeriod(long j, long j2, bw3 bw3Var) {
        setValues(wq5.c(bw3Var).get(this, j, j2));
    }

    public MutablePeriod(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PeriodType periodType) {
        super(i, i2, i3, i4, i5, i6, i7, i8, periodType);
    }

    public void add(long j, bw3 bw3Var) {
        add(new Period(j, getPeriodType(), bw3Var));
    }

    public MutablePeriod(long j) {
        super(j);
    }

    public void setPeriod(hgj hgjVar, bw3 bw3Var) {
        setPeriod(wq5.f(hgjVar), bw3Var);
    }

    public MutablePeriod(long j, PeriodType periodType) {
        super(j, periodType, (bw3) null);
    }

    public MutablePeriod(long j, PeriodType periodType, bw3 bw3Var) {
        super(j, periodType, bw3Var);
    }

    public void setPeriod(long j) {
        setPeriod(j, (bw3) null);
    }

    public MutablePeriod(long j, long j2) {
        super(j, j2, null, null);
    }

    public void setPeriod(long j, bw3 bw3Var) {
        setValues(wq5.c(bw3Var).get(this, j));
    }

    public MutablePeriod(long j, long j2, PeriodType periodType) {
        super(j, j2, periodType, null);
    }

    public MutablePeriod(long j, long j2, PeriodType periodType, bw3 bw3Var) {
        super(j, j2, periodType, bw3Var);
    }

    public MutablePeriod(kgj kgjVar, kgj kgjVar2, PeriodType periodType) {
        super(kgjVar, kgjVar2, periodType);
    }

    public MutablePeriod(kgj kgjVar, hgj hgjVar, PeriodType periodType) {
        super(kgjVar, hgjVar, periodType);
    }

    public MutablePeriod(hgj hgjVar, kgj kgjVar, PeriodType periodType) {
        super(hgjVar, kgjVar, periodType);
    }

    public MutablePeriod(Object obj) {
        super(obj, (PeriodType) null, (bw3) null);
    }

    public MutablePeriod(Object obj, PeriodType periodType) {
        super(obj, periodType, (bw3) null);
    }

    public MutablePeriod(Object obj, PeriodType periodType, bw3 bw3Var) {
        super(obj, periodType, bw3Var);
    }
}
