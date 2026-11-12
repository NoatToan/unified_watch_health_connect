package org.joda.time;

import defpackage.bw3;
import defpackage.egj;
import defpackage.fl9;
import defpackage.hgj;
import defpackage.kgj;
import defpackage.mgj;
import defpackage.qgj;
import defpackage.wq5;
import java.io.Serializable;
import org.joda.time.base.BaseInterval;

/* JADX INFO: loaded from: classes3.dex */
public class MutableInterval extends BaseInterval implements egj, Cloneable, Serializable {
    private static final long serialVersionUID = -5982824024992428470L;

    public MutableInterval() {
        super(0L, 0L, null);
    }

    public static MutableInterval parse(String str) {
        return new MutableInterval(str);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    public MutableInterval copy() {
        return (MutableInterval) clone();
    }

    @Override // defpackage.egj
    public void setChronology(bw3 bw3Var) {
        super.setInterval(getStartMillis(), getEndMillis(), bw3Var);
    }

    public void setDurationAfterStart(long j) {
        setEndMillis(fl9.e(getStartMillis(), j));
    }

    public void setDurationBeforeEnd(long j) {
        setStartMillis(fl9.e(getEndMillis(), -j));
    }

    public void setEnd(kgj kgjVar) {
        super.setInterval(getStartMillis(), wq5.h(kgjVar), getChronology());
    }

    public void setEndMillis(long j) {
        super.setInterval(getStartMillis(), j, getChronology());
    }

    public void setInterval(kgj kgjVar, kgj kgjVar2) {
        if (kgjVar != null || kgjVar2 != null) {
            super.setInterval(wq5.h(kgjVar), wq5.h(kgjVar2), wq5.g(kgjVar));
        } else {
            long jB = wq5.b();
            setInterval(jB, jB);
        }
    }

    public void setPeriodAfterStart(qgj qgjVar) {
        if (qgjVar == null) {
            setEndMillis(getStartMillis());
        } else {
            setEndMillis(getChronology().add(qgjVar, getStartMillis(), 1));
        }
    }

    public void setPeriodBeforeEnd(qgj qgjVar) {
        if (qgjVar == null) {
            setStartMillis(getEndMillis());
        } else {
            setStartMillis(getChronology().add(qgjVar, getEndMillis(), -1));
        }
    }

    public void setStart(kgj kgjVar) {
        super.setInterval(wq5.h(kgjVar), getEndMillis(), getChronology());
    }

    public void setStartMillis(long j) {
        super.setInterval(j, getEndMillis(), getChronology());
    }

    public MutableInterval(long j, long j2) {
        super(j, j2, null);
    }

    public void setDurationAfterStart(hgj hgjVar) {
        setEndMillis(fl9.e(getStartMillis(), wq5.f(hgjVar)));
    }

    public void setDurationBeforeEnd(hgj hgjVar) {
        setStartMillis(fl9.e(getEndMillis(), -wq5.f(hgjVar)));
    }

    public MutableInterval(long j, long j2, bw3 bw3Var) {
        super(j, j2, bw3Var);
    }

    public MutableInterval(kgj kgjVar, kgj kgjVar2) {
        super(kgjVar, kgjVar2);
    }

    public MutableInterval(kgj kgjVar, hgj hgjVar) {
        super(kgjVar, hgjVar);
    }

    public MutableInterval(hgj hgjVar, kgj kgjVar) {
        super(hgjVar, kgjVar);
    }

    public MutableInterval(kgj kgjVar, qgj qgjVar) {
        super(kgjVar, qgjVar);
    }

    public MutableInterval(qgj qgjVar, kgj kgjVar) {
        super(qgjVar, kgjVar);
    }

    @Override // defpackage.egj
    public void setInterval(mgj mgjVar) {
        if (mgjVar != null) {
            super.setInterval(mgjVar.getStartMillis(), mgjVar.getEndMillis(), mgjVar.getChronology());
            return;
        }
        throw new IllegalArgumentException("Interval must not be null");
    }

    public MutableInterval(Object obj) {
        super(obj, (bw3) null);
    }

    public MutableInterval(Object obj, bw3 bw3Var) {
        super(obj, bw3Var);
    }

    @Override // defpackage.egj
    public void setInterval(long j, long j2) {
        super.setInterval(j, j2, getChronology());
    }
}
