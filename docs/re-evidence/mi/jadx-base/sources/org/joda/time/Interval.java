package org.joda.time;

import defpackage.bw3;
import defpackage.hgj;
import defpackage.jq5;
import defpackage.kgj;
import defpackage.mgj;
import defpackage.qgj;
import defpackage.sxc;
import defpackage.txc;
import defpackage.wq5;
import defpackage.yqh;
import java.io.Serializable;
import org.joda.time.base.BaseInterval;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public final class Interval extends BaseInterval implements mgj, Serializable {
    private static final long serialVersionUID = 4922451897541386752L;

    public Interval(long j, long j2) {
        super(j, j2, null);
    }

    public static Interval parse(String str) {
        return new Interval(str);
    }

    public static Interval parseWithOffset(String str) {
        DateTime dateTimeF;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Format requires a '/' separator: " + str);
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (strSubstring.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() <= 0) {
            throw new IllegalArgumentException("Format invalid: " + str);
        }
        jq5 jq5VarW = sxc.i().w();
        yqh yqhVarA = txc.a();
        char cCharAt = strSubstring.charAt(0);
        Period periodH = null;
        if (cCharAt == 'P' || cCharAt == 'p') {
            periodH = yqhVarA.j(PeriodType.standard()).h(strSubstring);
            dateTimeF = null;
        } else {
            dateTimeF = jq5VarW.f(strSubstring);
        }
        char cCharAt2 = strSubstring2.charAt(0);
        if (cCharAt2 != 'P' && cCharAt2 != 'p') {
            DateTime dateTimeF2 = jq5VarW.f(strSubstring2);
            return periodH != null ? new Interval(periodH, dateTimeF2) : new Interval(dateTimeF, dateTimeF2);
        }
        if (periodH == null) {
            return new Interval(dateTimeF, yqhVarA.j(PeriodType.standard()).h(strSubstring2));
        }
        throw new IllegalArgumentException("Interval composed of two durations: " + str);
    }

    public boolean abuts(mgj mgjVar) {
        if (mgjVar != null) {
            return mgjVar.getEndMillis() == getStartMillis() || getEndMillis() == mgjVar.getStartMillis();
        }
        long jB = wq5.b();
        return getStartMillis() == jB || getEndMillis() == jB;
    }

    public Interval gap(mgj mgjVar) {
        mgj mgjVarL = wq5.l(mgjVar);
        long startMillis = mgjVarL.getStartMillis();
        long endMillis = mgjVarL.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        if (startMillis2 > endMillis) {
            return new Interval(endMillis, startMillis2, getChronology());
        }
        if (startMillis > endMillis2) {
            return new Interval(endMillis2, startMillis, getChronology());
        }
        return null;
    }

    public Interval overlap(mgj mgjVar) {
        mgj mgjVarL = wq5.l(mgjVar);
        if (overlaps(mgjVarL)) {
            return new Interval(Math.max(getStartMillis(), mgjVarL.getStartMillis()), Math.min(getEndMillis(), mgjVarL.getEndMillis()), getChronology());
        }
        return null;
    }

    @Override // defpackage.z00
    public Interval toInterval() {
        return this;
    }

    public Interval withChronology(bw3 bw3Var) {
        return getChronology() == bw3Var ? this : new Interval(getStartMillis(), getEndMillis(), bw3Var);
    }

    public Interval withDurationAfterStart(hgj hgjVar) {
        long jF = wq5.f(hgjVar);
        if (jF == toDurationMillis()) {
            return this;
        }
        bw3 chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(startMillis, jF, 1), chronology);
    }

    public Interval withDurationBeforeEnd(hgj hgjVar) {
        long jF = wq5.f(hgjVar);
        if (jF == toDurationMillis()) {
            return this;
        }
        bw3 chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(endMillis, jF, -1), endMillis, chronology);
    }

    public Interval withEnd(kgj kgjVar) {
        return withEndMillis(wq5.h(kgjVar));
    }

    public Interval withEndMillis(long j) {
        return j == getEndMillis() ? this : new Interval(getStartMillis(), j, getChronology());
    }

    public Interval withPeriodAfterStart(qgj qgjVar) {
        if (qgjVar == null) {
            return withDurationAfterStart(null);
        }
        bw3 chronology = getChronology();
        long startMillis = getStartMillis();
        return new Interval(startMillis, chronology.add(qgjVar, startMillis, 1), chronology);
    }

    public Interval withPeriodBeforeEnd(qgj qgjVar) {
        if (qgjVar == null) {
            return withDurationBeforeEnd(null);
        }
        bw3 chronology = getChronology();
        long endMillis = getEndMillis();
        return new Interval(chronology.add(qgjVar, endMillis, -1), endMillis, chronology);
    }

    public Interval withStart(kgj kgjVar) {
        return withStartMillis(wq5.h(kgjVar));
    }

    public Interval withStartMillis(long j) {
        return j == getStartMillis() ? this : new Interval(j, getEndMillis(), getChronology());
    }

    public Interval(long j, long j2, DateTimeZone dateTimeZone) {
        super(j, j2, ISOChronology.getInstance(dateTimeZone));
    }

    public Interval(long j, long j2, bw3 bw3Var) {
        super(j, j2, bw3Var);
    }

    public Interval(kgj kgjVar, kgj kgjVar2) {
        super(kgjVar, kgjVar2);
    }

    public Interval(kgj kgjVar, hgj hgjVar) {
        super(kgjVar, hgjVar);
    }

    public Interval(hgj hgjVar, kgj kgjVar) {
        super(hgjVar, kgjVar);
    }

    public Interval(kgj kgjVar, qgj qgjVar) {
        super(kgjVar, qgjVar);
    }

    public Interval(qgj qgjVar, kgj kgjVar) {
        super(qgjVar, kgjVar);
    }

    public Interval(Object obj) {
        super(obj, (bw3) null);
    }

    public Interval(Object obj, bw3 bw3Var) {
        super(obj, bw3Var);
    }
}
