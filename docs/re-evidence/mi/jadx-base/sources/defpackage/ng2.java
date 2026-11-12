package defpackage;

import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.a;

/* JADX INFO: loaded from: classes3.dex */
public class ng2 extends b7d {
    public final a d;
    public final int e;
    public final int f;

    public ng2(a aVar, int i) {
        super(DateTimeFieldType.monthOfYear(), aVar.getAverageMillisPerMonth());
        this.d = aVar;
        this.e = aVar.getMaxMonth();
        this.f = i;
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long add(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return j;
        }
        long millisOfDay = this.d.getMillisOfDay(j);
        int year = this.d.getYear(j);
        int monthOfYear = this.d.getMonthOfYear(j, year);
        int i7 = monthOfYear - 1;
        int i8 = i7 + i;
        if (monthOfYear <= 0 || i8 >= 0) {
            i2 = year;
        } else {
            if (Math.signum(this.e + i) == Math.signum(i)) {
                i5 = year - 1;
                i6 = i + this.e;
            } else {
                i5 = year + 1;
                i6 = i - this.e;
            }
            int i9 = i5;
            i8 = i6 + i7;
            i2 = i9;
        }
        if (i8 >= 0) {
            int i10 = this.e;
            i3 = i2 + (i8 / i10);
            i4 = (i8 % i10) + 1;
        } else {
            i3 = i2 + (i8 / this.e);
            int i11 = i3 - 1;
            int iAbs = Math.abs(i8);
            int i12 = this.e;
            int i13 = iAbs % i12;
            if (i13 == 0) {
                i13 = i12;
            }
            i4 = (i12 - i13) + 1;
            if (i4 != 1) {
                i3 = i11;
            }
        }
        int dayOfMonth = this.d.getDayOfMonth(j, year, monthOfYear);
        int daysInYearMonth = this.d.getDaysInYearMonth(i3, i4);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.d.getYearMonthDayMillis(i3, i4, dayOfMonth) + millisOfDay;
    }

    @Override // defpackage.o62, defpackage.gq5
    public long addWrapField(long j, int i) {
        return set(j, fl9.c(get(j), i, 1, this.e));
    }

    @Override // defpackage.o62, defpackage.gq5
    public int get(long j) {
        return this.d.getMonthOfYear(j);
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long getDifferenceAsLong(long j, long j2) {
        if (j < j2) {
            return -getDifference(j2, j);
        }
        int year = this.d.getYear(j);
        int monthOfYear = this.d.getMonthOfYear(j, year);
        int year2 = this.d.getYear(j2);
        int monthOfYear2 = this.d.getMonthOfYear(j2, year2);
        long j3 = ((((long) (year - year2)) * ((long) this.e)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.d.getDayOfMonth(j, year, monthOfYear);
        if (dayOfMonth == this.d.getDaysInYearMonth(year, monthOfYear) && this.d.getDayOfMonth(j2, year2, monthOfYear2) > dayOfMonth) {
            j2 = this.d.dayOfMonth().set(j2, dayOfMonth);
        }
        return j - this.d.getYearMonthMillis(year, monthOfYear) < j2 - this.d.getYearMonthMillis(year2, monthOfYear2) ? j3 - 1 : j3;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getLeapAmount(long j) {
        return isLeap(j) ? 1 : 0;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getLeapDurationField() {
        return this.d.days();
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMaximumValue() {
        return this.e;
    }

    @Override // defpackage.o62, defpackage.gq5
    public int getMinimumValue() {
        return 1;
    }

    @Override // defpackage.o62, defpackage.gq5
    public t67 getRangeDurationField() {
        return this.d.years();
    }

    @Override // defpackage.o62, defpackage.gq5
    public boolean isLeap(long j) {
        int year = this.d.getYear(j);
        return this.d.isLeapYear(year) && this.d.getMonthOfYear(j, year) == this.f;
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
        int year = this.d.getYear(j);
        return this.d.getYearMonthMillis(year, this.d.getMonthOfYear(j, year));
    }

    @Override // defpackage.o62, defpackage.gq5
    public long set(long j, int i) {
        fl9.n(this, i, 1, this.e);
        int year = this.d.getYear(j);
        int dayOfMonth = this.d.getDayOfMonth(j, year);
        int daysInYearMonth = this.d.getDaysInYearMonth(year, i);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.d.getYearMonthDayMillis(year, i, dayOfMonth) + ((long) this.d.getMillisOfDay(j));
    }

    @Override // defpackage.b7d, defpackage.o62, defpackage.gq5
    public long add(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return add(j, i);
        }
        long millisOfDay = this.d.getMillisOfDay(j);
        int year = this.d.getYear(j);
        int monthOfYear = this.d.getMonthOfYear(j, year);
        long j5 = ((long) (monthOfYear - 1)) + j2;
        if (j5 >= 0) {
            int i2 = this.e;
            j3 = ((long) year) + (j5 / ((long) i2));
            j4 = (j5 % ((long) i2)) + 1;
        } else {
            j3 = ((long) year) + (j5 / ((long) this.e));
            long j6 = j3 - 1;
            long jAbs = Math.abs(j5);
            int i3 = this.e;
            int i4 = (int) (jAbs % ((long) i3));
            if (i4 == 0) {
                i4 = i3;
            }
            j4 = (i3 - i4) + 1;
            if (j4 != 1) {
                j3 = j6;
            }
        }
        if (j3 >= this.d.getMinYear() && j3 <= this.d.getMaxYear()) {
            int i5 = (int) j3;
            int i6 = (int) j4;
            int dayOfMonth = this.d.getDayOfMonth(j, year, monthOfYear);
            int daysInYearMonth = this.d.getDaysInYearMonth(i5, i6);
            if (dayOfMonth > daysInYearMonth) {
                dayOfMonth = daysInYearMonth;
            }
            return this.d.getYearMonthDayMillis(i5, i6, dayOfMonth) + millisOfDay;
        }
        throw new IllegalArgumentException("Magnitude of add amount is too large: " + j2);
    }

    @Override // defpackage.o62, defpackage.gq5
    public int[] add(ogj ogjVar, int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return iArr;
        }
        if (ogjVar.size() > 0 && ogjVar.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i == 0) {
            return set(ogjVar, 0, iArr, ((((iArr[0] - 1) + (i2 % 12)) + 12) % 12) + 1);
        }
        if (wq5.n(ogjVar)) {
            int size = ogjVar.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                j = ogjVar.getFieldType(i3).getField(this.d).set(j, iArr[i3]);
            }
            return this.d.get(ogjVar, add(j, i2));
        }
        return super.add(ogjVar, i, iArr, i2);
    }
}
