package defpackage;

import com.miui.tsmclient.model.ErrorCode;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z00 implements mgj {
    public void checkInterval(long j, long j2) {
        if (j2 < j) {
            throw new IllegalArgumentException("The end instant must be greater than the start instant");
        }
    }

    public boolean contains(kgj kgjVar) {
        return kgjVar == null ? containsNow() : contains(kgjVar.getMillis());
    }

    public boolean containsNow() {
        return contains(wq5.b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgj)) {
            return false;
        }
        mgj mgjVar = (mgj) obj;
        return getStartMillis() == mgjVar.getStartMillis() && getEndMillis() == mgjVar.getEndMillis() && fl9.a(getChronology(), mgjVar.getChronology());
    }

    @Override // defpackage.mgj
    public DateTime getEnd() {
        return new DateTime(getEndMillis(), getChronology());
    }

    @Override // defpackage.mgj
    public DateTime getStart() {
        return new DateTime(getStartMillis(), getChronology());
    }

    public int hashCode() {
        long startMillis = getStartMillis();
        long endMillis = getEndMillis();
        return ((((ErrorCode.DATA_NOT_READY + ((int) (startMillis ^ (startMillis >>> 32)))) * 31) + ((int) (endMillis ^ (endMillis >>> 32)))) * 31) + getChronology().hashCode();
    }

    public boolean isAfter(kgj kgjVar) {
        return kgjVar == null ? isAfterNow() : isAfter(kgjVar.getMillis());
    }

    public boolean isAfterNow() {
        return isAfter(wq5.b());
    }

    public boolean isBefore(kgj kgjVar) {
        return kgjVar == null ? isBeforeNow() : isBefore(kgjVar.getMillis());
    }

    public boolean isBeforeNow() {
        return isBefore(wq5.b());
    }

    public boolean isEqual(mgj mgjVar) {
        return getStartMillis() == mgjVar.getStartMillis() && getEndMillis() == mgjVar.getEndMillis();
    }

    public boolean overlaps(mgj mgjVar) {
        long startMillis = getStartMillis();
        long endMillis = getEndMillis();
        if (mgjVar != null) {
            return startMillis < mgjVar.getEndMillis() && mgjVar.getStartMillis() < endMillis;
        }
        long jB = wq5.b();
        return startMillis < jB && jB < endMillis;
    }

    public Duration toDuration() {
        long durationMillis = toDurationMillis();
        return durationMillis == 0 ? Duration.ZERO : new Duration(durationMillis);
    }

    @Override // defpackage.mgj
    public long toDurationMillis() {
        return fl9.l(getEndMillis(), getStartMillis());
    }

    public Interval toInterval() {
        return new Interval(getStartMillis(), getEndMillis(), getChronology());
    }

    public MutableInterval toMutableInterval() {
        return new MutableInterval(getStartMillis(), getEndMillis(), getChronology());
    }

    public Period toPeriod() {
        return new Period(getStartMillis(), getEndMillis(), getChronology());
    }

    public String toString() {
        jq5 jq5VarU = sxc.h().u(getChronology());
        StringBuffer stringBuffer = new StringBuffer(48);
        jq5VarU.q(stringBuffer, getStartMillis());
        stringBuffer.append('/');
        jq5VarU.q(stringBuffer, getEndMillis());
        return stringBuffer.toString();
    }

    @Override // defpackage.mgj
    public Period toPeriod(PeriodType periodType) {
        return new Period(getStartMillis(), getEndMillis(), periodType, getChronology());
    }

    public boolean contains(mgj mgjVar) {
        if (mgjVar == null) {
            return containsNow();
        }
        long startMillis = mgjVar.getStartMillis();
        long endMillis = mgjVar.getEndMillis();
        long startMillis2 = getStartMillis();
        long endMillis2 = getEndMillis();
        return startMillis2 <= startMillis && startMillis < endMillis2 && endMillis <= endMillis2;
    }

    public boolean isAfter(mgj mgjVar) {
        long endMillis;
        if (mgjVar == null) {
            endMillis = wq5.b();
        } else {
            endMillis = mgjVar.getEndMillis();
        }
        return getStartMillis() >= endMillis;
    }

    public boolean isBefore(mgj mgjVar) {
        if (mgjVar == null) {
            return isBeforeNow();
        }
        return isBefore(mgjVar.getStartMillis());
    }

    public boolean isBefore(long j) {
        return getEndMillis() <= j;
    }

    public boolean isAfter(long j) {
        return getStartMillis() > j;
    }

    public boolean contains(long j) {
        return j >= getStartMillis() && j < getEndMillis();
    }
}
