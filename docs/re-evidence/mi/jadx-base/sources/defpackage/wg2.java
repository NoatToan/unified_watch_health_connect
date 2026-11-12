package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public final class wg2 extends b7d {
    public final a d;

    public wg2(a aVar) {
        super(DateTimeFieldType.weekyear(), aVar.getAverageMillisPerYear());
        this.d = aVar;
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long add(long j, int i) {
        return i == 0 ? j : set(j, get(j) + i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long addWrapField(long j, int i) {
        return add(j, i);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.d.getWeekyear(j);
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long getDifferenceAsLong(long j, long j2) {
        if (j < j2) {
            return -getDifference(j2, j);
        }
        int i = get(j);
        int i2 = get(j2);
        long jRemainder = remainder(j);
        long jRemainder2 = remainder(j2);
        if (jRemainder2 >= 31449600000L && this.d.getWeeksInYear(i) <= 52) {
            jRemainder2 -= 604800000;
        }
        int i3 = i - i2;
        if (jRemainder < jRemainder2) {
            i3--;
        }
        return i3;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getLeapAmount(long j) {
        a aVar = this.d;
        return aVar.getWeeksInYear(aVar.getWeekyear(j)) - 52;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getLeapDurationField() {
        return this.d.weeks();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.d.getMaxYear();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return this.d.getMinYear();
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return null;
    }

    @Override // defpackage.o62, defpackage.gq5
    public boolean isLeap(long j) {
        a aVar = this.d;
        return aVar.getWeeksInYear(aVar.getWeekyear(j)) > 52;
    }

    @Override // defpackage.gq5
    public boolean isLenient() {
        return false;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long remainder(long j) {
        return j - roundFloor(j);
    }

    @Override // defpackage.o62, defpackage.gq5
    public long roundFloor(long j) {
        long jRoundFloor = this.d.weekOfWeekyear().roundFloor(j);
        int weekOfWeekyear = this.d.getWeekOfWeekyear(jRoundFloor);
        return weekOfWeekyear > 1 ? jRoundFloor - (((long) (weekOfWeekyear - 1)) * 604800000) : jRoundFloor;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, Math.abs(i), this.d.getMinYear(), this.d.getMaxYear());
        int i2 = get(j);
        if (i2 == i) {
            return j;
        }
        int dayOfWeek = this.d.getDayOfWeek(j);
        int weeksInYear = this.d.getWeeksInYear(i2);
        int weeksInYear2 = this.d.getWeeksInYear(i);
        if (weeksInYear2 < weeksInYear) {
            weeksInYear = weeksInYear2;
        }
        int weekOfWeekyear = this.d.getWeekOfWeekyear(j);
        if (weekOfWeekyear <= weeksInYear) {
            weeksInYear = weekOfWeekyear;
        }
        long year = this.d.setYear(j, i);
        int i3 = get(year);
        if (i3 < i) {
            year += 604800000;
        } else if (i3 > i) {
            year -= 604800000;
        }
        return this.d.dayOfWeek().set(year + (((long) (weeksInYear - this.d.getWeekOfWeekyear(year))) * 604800000), dayOfWeek);
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long add(long j, long j2) {
        return add(j, fl9.m(j2));
    }
}
